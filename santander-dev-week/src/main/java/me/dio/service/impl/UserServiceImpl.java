package me.dio.service.impl;

import me.dio.domain.model.User;
import me.dio.domain.repository.UserRepository;
import me.dio.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    // injecao de dependencia por construtor
    private final UserRepository userRepository;

    // boa pratica vs @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
//        if (userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
//            throw  new IllegalArgumentException("This User ID already exists");
            throw new IllegalArgumentException("This Account number already exists");
        }

        return userRepository.save(userToCreate);
    }
}
