package dio.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.app.model.User;
import dio.app.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository repository;
    
    @GetMapping()
    public List<User> getUsers(){
        return repository.listAll();
    }

    @GetMapping("/{id}")
    public User getOneUser(@PathVariable("id") Integer id){
       return repository.finById(id);
    }

    @PostMapping()
    public void createUser(@RequestBody User user){
        repository.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id){
        repository.remove(id);
    }
}
