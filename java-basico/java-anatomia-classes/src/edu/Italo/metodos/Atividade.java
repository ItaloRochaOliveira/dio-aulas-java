package edu.Italo.metodos;

public class Atividade {

    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal da TV " + smartTv.canal);
        System.out.println("Volume da TV " + smartTv.volume);

        smartTv.ligarOuDesligar();
        System.out.println("Novo Status -> A TV está ligada? " + smartTv.ligada);

        smartTv.ligarOuDesligar();
        System.out.println("Novo Status -> A TV está ligada? " + smartTv.ligada);


        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Volume da TV " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo Status -> Volume da TV " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Novo status -> Canal da TV " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println("Novo status -> Canal da TV " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Novo status -> Canal da TV " + smartTv.canal);


    }

   
}
