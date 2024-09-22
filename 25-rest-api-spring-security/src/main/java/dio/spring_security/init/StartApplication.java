package dio.spring_security.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import dio.spring_security.model.User;
import dio.spring_security.repository.UserRepository;

@Component
public class StartApplication implements CommandLineRunner {
    @Autowired
    private UserRepository repository;

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        User user = repository.findByUsername("admin");
        if(user==null){
            user = new User();
            user.setName("ADMIN");
            user.setUsername("admin");
            user.setPassword("master123");
            user.getRoles().add("MANAGERS");
            repository.save(user);
        }
        User user2 = repository.findByUsername("user");
        if(user2 ==null){
            user2 = new User();
            user2.setName("USER");
            user2.setUsername("user");
            user2.setPassword("user123");
            user2.getRoles().add("USERS");
            repository.save(user2);
        }
    }
}
