package one.JUnit;

import java.time.LocalDate;

public class Pessoa{
    private String nome;

    private LocalDate nascimento;

    public Pessoa(String nome, LocalDate nascimento){
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public int getIdade(){
        return LocalDate.now() - this.nascimento;
    }
}