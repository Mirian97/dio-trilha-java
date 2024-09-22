package dio.design_patterns_spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.design_patterns_spring.model.Address;
import dio.design_patterns_spring.model.Customer;
import dio.design_patterns_spring.repository.AddressRepository;
import dio.design_patterns_spring.repository.CustomerRepository;
import dio.design_patterns_spring.service.CustomerService;
import dio.design_patterns_spring.service.ViaCepService;

/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    // Singleton: Injetar os componentes do Spring com @Autowired.
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private ViaCepService viaCepService;

    // Strategy: Implementar os métodos definidos na interface.
	// Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

    @Override
    public Iterable<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer getById(Long id) {
        return customerRepository.findById(id).get();
    }

    @Override
    public void create(Customer customer) {
        saveCustomerWithCep(customer);
    }

    @Override
    public void update(Long id, Customer customer) {
        Customer customerToUpdate = customerRepository.findById(id).get();
        if(customerToUpdate != null){
            saveCustomerWithCep(customerToUpdate);
        }
    }

    @Override
    public void delete(Long id) {
        customerRepository.deleteById(id);
    }

    private void saveCustomerWithCep(Customer customer) {
		// Verificar se o Endereco do Cliente já existe (pelo CEP).
		String cep = customer.getEndereco().getCep();
		Address endereco = addressRepository.findById(cep).orElseGet(() -> {
			// Caso não exista, integrar com o ViaCEP e persistir o retorno.
			Address newAddress = viaCepService.searchCep(cep);
			addressRepository.save(newAddress);
			return newAddress;
		});
		customer.setEndereco(endereco);
		// Inserir Cliente, vinculando o Endereco (novo ou existente).
		customerRepository.save(customer);
	}
}
