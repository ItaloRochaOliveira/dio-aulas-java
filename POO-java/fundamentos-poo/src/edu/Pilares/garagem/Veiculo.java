package edu.Pilares.garagem;

public abstract class Veiculo{
	String chassi;

	public String getChassi(){
		return this.chassi;
	}

	public void setChassi(String chassi){
		this.chassi = chassi;
	}

	public abstract void ligar();
}