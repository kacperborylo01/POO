package pildorasinformaticas;

import java.util.Scanner;

public class Errores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		int opc = 0;
		
		do {
			System.out.println("1- Dime un numero");
			System.out.println("2- Dime un numero");
			System.out.println("Dime un numero");
			try {
				
				opc = leer.nextInt();
			}catch (Exception e) {
				System.out.println("Error al leer, tienes que escribir un numero");
				leer.reset();
			}
			opc = leer.nextInt();
		} while (opc < 1 || opc > 2);

	}

}
