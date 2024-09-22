package dio.design_patterns_spring.service;

import dio.design_patterns_spring.model.Customer;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 */
public interface CustomerService {
    Iterable<Customer> getAll();

	Customer getById(Long id);

	void create(Customer customer);

	void update(Long id, Customer customer);

	void delete(Long id);
}
