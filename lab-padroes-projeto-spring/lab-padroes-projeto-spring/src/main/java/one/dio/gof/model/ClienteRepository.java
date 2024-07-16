package one.dio.gof.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// CrudRepository - Strategy
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}