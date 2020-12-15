package pildorasinformaticas;

import javax.swing.*;

public class Uso_Coche {

	public static void main(String[] args) {
	
		Coche micoche = new Coche();
		
		micoche.estableceColor(JOptionPane.showInputDialog("Introduce color"));
		
		System.out.println(micoche.dimeDatos());
		
		
		System.out.println(micoche.dimeColor());
		
		micoche.configura_asientos(JOptionPane.showInputDialog("¿Tiene aientos de cuero?"));
		
		System.out.println(micoche.dime_asientos());
		
		micoche.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		
		System.out.println(micoche.dime_climatizador());
		
		System.out.println(micoche.dime_peso_coche());
		
		System.out.println("El precio final del coche es: " + micoche.dime_precio());
	}

}
