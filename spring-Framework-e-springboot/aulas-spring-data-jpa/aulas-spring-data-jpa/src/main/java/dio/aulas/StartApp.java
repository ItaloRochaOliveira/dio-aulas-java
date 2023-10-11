package dio.aulas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aulas.model.User;
import dio.aulas.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner{
    @Autowired
    private UserRepository repository;

    @Autowired
    private User user;
    
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
        user.setName("name");
        user.setUserName("userName");
        user.setPassword("Pass2221");

        repository.save(user);

        for(User user: repository.findAll()){
            System.out.println(user);
        }
    }
    
}
