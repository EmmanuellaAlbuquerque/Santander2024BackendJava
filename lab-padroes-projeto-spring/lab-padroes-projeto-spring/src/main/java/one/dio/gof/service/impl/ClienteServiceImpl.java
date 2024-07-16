package one.dio.gof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.dio.gof.model.Cliente;
import one.dio.gof.model.ClienteRepository;
import one.dio.gof.model.Endereco;
import one.dio.gof.model.EnderecoRepository;
import one.dio.gof.service.ClienteService;
import one.dio.gof.service.ViaCepService;

/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 *
 * @author manu
 */
@Service
public class ClienteServiceImpl implements ClienteService {

    // TODO Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    // TODO Strategy: Implementar os métodos definidos na interface.

    // TODO Facade: Abstrair integrações com subsistemas, provendo uma interface simples.


    @Override
    public Iterable<Cliente> buscarTodos() {

        // FIXME Buscar todos os Clientes.
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {

        // FIXME Buscar Cliente por ID.
        Optional<Cliente> cliente = clienteRepository.findById(id);

        return cliente.get();

        // FIXME Regra caso o cliente não exista.
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        // FIXME Buscar Cliente por ID, caso exista:
        Optional<Cliente> clienteDb = clienteRepository.findById(id);

        if (clienteDb.isPresent()) {
            cliente.setId(id);
            // FIXME Verificar se o Endereco do Cliente já existe (pelo CEP).
            // FIXME Caso não exista, integrar com o ViaCEP e persistir o retorno.
            // FIXME Alterar Cliente, vinculando o Endereco (novo ou existente).
            salvarClienteComCep(cliente);
        }

        // TODO Bussiness Exception - Cliente não existe
    }

    private void salvarClienteComCep(Cliente cliente) { // DRY

        // FIXME Verificar se o Endereco do Cliente já existe (pelo CEP).
        String cep = cliente.getEndereco().getCep();

        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {

            // FIXME Caso não exista, integrar com o ViaCEP e persistir o retorno.
            Endereco novoEndereco = viaCepService.consultarCep(cep); // Facade
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });

        cliente.setEndereco(endereco);

        // FIXME Inserir Cliente, vinculando o Endereco (novo ou existente).
        clienteRepository.save(cliente);
    }

    @Override
    public void deletar(Long id) {

        // FIXME Deletar Cliente por ID.
        clienteRepository.deleteById(id);
    }
}