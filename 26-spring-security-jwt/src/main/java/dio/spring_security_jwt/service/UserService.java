package dio.spring_security_jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import dio.spring_security_jwt.model.User;
import dio.spring_security_jwt.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder encoder;

    public void createUser(User user){
        String password = user.getPassword();
        //criptografando antes de salvar no banco
        user.setPassword(encoder.encode(password));
        repository.save(user);
    } 
}
