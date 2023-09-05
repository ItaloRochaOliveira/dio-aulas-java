package edu.Pilares.garagem;

public class Carro extends Veiculo{
    public void ligar(){
        conferirCombustível();
		conferirCambio();
        System.out.println("ligando...");
		
	}
	private void conferirCombustível(){
        System.out.println("Conferindo combustivel...");
    }
	private void conferirCambio(){
        System.out.println("Confer cambio...");
    }
}
