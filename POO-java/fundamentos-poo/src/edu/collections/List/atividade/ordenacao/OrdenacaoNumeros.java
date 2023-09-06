package edu.collections.List.atividade.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    private List<Integer> numero;

    public OrdenacaoNumeros(){
        this.numero = new ArrayList<>();
    }

    public List<Integer> getNumero() {
        return numero;
    }

    public void adicionarNumero(int num){
        numero.add(num);
    }

    public void ordenarAscendente(){
        if(!numero.isEmpty()){
            List<Integer> numerosOrdenados = new ArrayList<>(numero);

            Collections.sort(numerosOrdenados);

            System.out.println("Numeros ordenados: " + numerosOrdenados);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void ordenarDescendente(){
        if(!numero.isEmpty()){
            List<Integer> numerosOrdenados = new ArrayList<>(numero);

            numerosOrdenados.sort(Collections.reverseOrder());

            System.out.println("Numeros ordenados: " + numerosOrdenados);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    
    public void exibirNumeros() {
        if (!numero.isEmpty()) {
          System.out.println(this.numero);
        } else {
          System.out.println("A lista está vazia!");
        }
      }
    
      public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
    
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);
    
        numeros.exibirNumeros();
    
        numeros.ordenarAscendente();
    
        numeros.exibirNumeros();
    
        numeros.ordenarDescendente();
    
        numeros.exibirNumeros();
      }
}
