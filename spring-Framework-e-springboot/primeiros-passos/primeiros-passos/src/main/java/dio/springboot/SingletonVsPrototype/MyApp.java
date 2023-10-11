package dio.springboot.SingletonVsPrototype;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
	}

    @Bean
    public CommandLineRunner run(SistemaDeMensagem sistema) throws Exception{
        return args -> {
            sistema.enviarConfirmCadastro();
            sistema.enviarMsgBoasVindas();
        };
    }
}