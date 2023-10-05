package one.JUnit.exceptions;

public class TranferenciaEntreContas {
    public void transfere(Conta ContaOrigem, Conta contaDestino, int valor){
        if(valor <= 0 ){
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
    }
}

