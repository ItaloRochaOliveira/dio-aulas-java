package edu.Italo.anatomiaDasClasses;

public class Aula3 {
     //declarando métodos - retorno nome Paramentro(s){}
    public static void main(String [] args){
        String primeiroNome = "Italo";
        String segundoNome = "Rocha";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto (
        String primeiroNome, String segundoNome){
            return primeiroNome.concat(" ").concat(segundoNome);
        }
}
