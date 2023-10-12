package dio.web.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UserRepository;

@RestController
public class UsuarioController {
    @Autowired(required = false)
    private UserRepository repository;
    @GetMapping("/users")
    public List<Usuario> getUsers(){
        System.out.println("Funionou");
        return repository.findAll();
    }
    @GetMapping("/users/{username}")
    public Usuario getOne(@PathVariable("username") String usename){
        return repository.findByUsername(usename);
    }
    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
    @PostMapping("/users")
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
    @PutMapping("/users")
    public void putUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
}
