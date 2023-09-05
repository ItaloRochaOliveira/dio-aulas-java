package edu.Pilares.fabrica;

import edu.Pilares.fabrica.copiadora.Copiadora;
import edu.Pilares.fabrica.impressoras.Impressora;
import edu.Pilares.fabrica.scanners.Digitalizadora;

public class EqupamentoMultiFuncional implements Copiadora, Impressora, Digitalizadora{
    public void copiar(){}
	public void digitalizar(){}
	public void imprimir(){}
}
