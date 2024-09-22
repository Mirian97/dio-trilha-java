package dio.design_patterns_spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dio.design_patterns_spring.model.Address;

/**
 * AddressRepository
 */
@Repository
public interface AddressRepository extends CrudRepository<Address, String> {

    
}