package dio.springboot.SingletonVsPrototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    @Scope("prototype")
    public Remetente remetente(){
        System.out.println("Criando um obj remetente");
        Remetente remetente = new Remetente();
        remetente.setEmail("email");
        remetente.setEmail("nome");
        return remetente;
    }
}
