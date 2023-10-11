package dio.aulas;

import java.util.List;

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
        List<User> users = repository.filtrarPorNome("name");

        for (User u : users) {
            System.out.println(u);
        }
    }

    private void insertUser(){
        // TODO Auto-generated method stub
        user.setName("name");
        user.setUserName("userName");
        user.setPassword("Pass2221");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
    
}
