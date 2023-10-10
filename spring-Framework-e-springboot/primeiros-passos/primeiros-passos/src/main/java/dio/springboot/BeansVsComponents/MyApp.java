package dio.springboot.BeansVsComponents;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.google.gson.Gson;

public class MyApp{
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
