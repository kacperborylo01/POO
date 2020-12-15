
public class Uso_Juego {
	
	public static int pintaMenu() {
		// Guardar un nuevo juego
		// Poner puntuación a un juego
		// Ver todos los juegos
		return 0;
	}
	
	public static void verTodoslosJuegos(Juego vJuegos[]) {
		
	}
	
	public static void guardarJuego(Juego vJuegos[]) {
		
		//Pedir los datos del Juego con try - catch

		//Buscar posición libre en el vector
		for (int i = 0; i < vJuegos.length; i++) {
			if(vJuegos[i] == null) {
				vJuegos[i] = new Juego("GTA", 35, false);
			}
		}
		
	}
	
	public static void ponerPuntuacionJuego(Juego cJuegos[]) {
		
	}

	public static void main(String[] args) {
		
		
		Juego vJuegos[] = new Juego[100];
		
		Juego juego1 = new Juego("CyberPunk");
		Juego juego2 = new Juego("Los Sims");
		Juego juego3 = new Juego("FIFA");
		
		vJuegos[0] = juego1;
		vJuegos[1] = juego2;
		vJuegos[2] = juego3;
		vJuegos[3] = new Juego ("Tetris");
		
		vJuegos[2].setMultijugador(true);
		vJuegos[2].ponerRecord(100);
		
		
		for (int i = 0; i < vJuegos.length; i++) {
			if (vJuegos[i] != null && vJuegos[i].isMultijugador() == false) {
				System.out.println(vJuegos[i].toString());
				}
			
		}
		
		

	}

}
