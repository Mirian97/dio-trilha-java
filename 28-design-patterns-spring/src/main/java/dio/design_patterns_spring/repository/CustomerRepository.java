package dio.design_patterns_spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dio.design_patterns_spring.model.Customer;

/**
 * CustomerRepository
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    
}