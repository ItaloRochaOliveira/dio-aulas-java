package dio.springboot.SingletonVsPrototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaDeMensagem {
    @Autowired
    private Remetente noreply;

    @Autowired
    private Remetente financeiro;

    public void enviarConfirmCadastro(){
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado");
    }

    public void enviarMsgBoasVindas(){
        financeiro.setEmail("email@email.com");
        System.out.println(financeiro);
        System.out.println("Boas vindas.");
    }
}
