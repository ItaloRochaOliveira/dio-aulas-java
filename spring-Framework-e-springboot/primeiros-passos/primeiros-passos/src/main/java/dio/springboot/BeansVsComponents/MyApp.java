package dio.springboot.BeansVsComponents;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.google.gson.Gson;

@SpringBootApplication
public class MyApp{
    public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
	}

    @Bean
    public CommandLineRunner run(ConversorJson conversor) throws Exception {
        return args -> {
            String json = "{\"cep\"}";
            ViaCepResponse response = conversor.converter(json);
            System.out.println("A resposta: " + response);
        };
    }

    @Bean
    public Gson gson(){
        return new Gson();
    }
}
