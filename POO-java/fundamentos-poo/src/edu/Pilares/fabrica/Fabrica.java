package edu.Pilares.fabrica;

import edu.Pilares.fabrica.copiadora.Copiadora;
import edu.Pilares.fabrica.impressoras.Deskjet;
import edu.Pilares.fabrica.impressoras.Impressora;
import edu.Pilares.fabrica.scanners.Digitalizadora;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new Deskjet();
		EqupamentoMultiFuncional em = new EqupamentoMultiFuncional();
		Impressora impressora2 = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;

		em.imprimir();
		em.digitalizar();
		em.copiar();

		impressora.imprimir();
		impressora2.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
    }
}
