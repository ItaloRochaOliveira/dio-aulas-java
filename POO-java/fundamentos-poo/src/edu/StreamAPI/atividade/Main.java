package edu.StreamAPI.atividade;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        desafio1(numeros);

        desafio2(numeros);

        desafio3(numeros);

        desafio4(numeros);
    }

    //Desafio 1 - Mostre a lista na ordem numérica:
    public static void desafio1(List<Integer> numeros){
        List<Integer> numOrd = numeros.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        System.out.println(numOrd);
    }

    //Desafio 2 - Imprima a soma dos números pares da lista:
    public static void desafio2(List<Integer> numeros){
        Predicate<Integer> numerosParesPredicate = numero -> numero % 2 == 0;

        BinaryOperator<Integer> soma = (num1, num2) -> num1 + num2;

        int numerosOrdenados = numeros.stream().filter(numerosParesPredicate).reduce(0, soma);

        System.out.println(numerosOrdenados);
    }


    //Desafio 3 - Verifique se todos os números da lista são positivos:
    public static void desafio3(List<Integer> numeros){
        Predicate<Integer> positivos = numero -> numero > 0;

        boolean numerosPositivos = numeros.stream().allMatch(positivos);

        System.out.println(numerosPositivos ? "Todos os numeros são positivos" : "Nem todos os números são positivos");
    }

    //Desafio 4 - Remova todos os valores ímpares:
    public static void desafio4(List<Integer> numeros){
        Predicate<Integer> numerosImparesPredicate = numero -> numero % 2 == 1;

        List<Integer> numerosImpares = numeros.stream().filter(numerosImparesPredicate).toList();

        System.out.println(numerosImpares);
    }

    //Desafio 5 - Calcule a média dos números maiores que 5:
    public static void desafio5(List<Integer> numeros){
        // Predicate<Integer> numerosMaioresCincoPredicate = numero -> numero >= 5;

        // BinaryOperator<Integer> mediaBinary = (num1, num2) -> num1 + num2;  

        // List<Integer> numerosMaioresCinco = numeros.stream().filter(numerosMaioresCincoPredicate).toList();

        // Optional<Integer> soma = numeros.stream().filter(numerosMaioresCincoPredicate).reduce(mediaBinary);

        // int media = soma / numerosMaioresCinco.size();

        // System.out.println(media);
    }
}
