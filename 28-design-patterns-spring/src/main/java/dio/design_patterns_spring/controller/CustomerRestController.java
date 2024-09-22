package dio.design_patterns_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.design_patterns_spring.model.Customer;
import dio.design_patterns_spring.service.CustomerService;

/**
 * Esse {@link RestController} representa nossa <b>Facade</b>, pois abstrai toda
 * a complexidade de integrações (Banco de Dados H2 e API do ViaCEP) em uma
 * interface simples e coesa (API REST).
 */
@RestController
@RequestMapping("customer")
public class CustomerRestController {
    @Autowired
	private CustomerService customerService;

	@GetMapping
	public ResponseEntity<Iterable<Customer>> getAll() {
		return ResponseEntity.ok(customerService.getAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Customer> getById(@PathVariable Long id) {
		return ResponseEntity.ok(customerService.getById(id));
	}

	@PostMapping
	public ResponseEntity<Customer> create(@RequestBody Customer cliente) {
		customerService.create(cliente);
		return ResponseEntity.ok(cliente);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Customer> update(@PathVariable Long id, @RequestBody Customer cliente) {
		customerService.update(id, cliente);
		return ResponseEntity.ok(cliente);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		customerService.delete(id);
		return ResponseEntity.ok().build();
	}
}
