
public class Uso_Juego {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		verJuegos();
	
	

		
		

	}
}

	class Juego {
		
		public void verJuegos() {
			
			Juego[] misjuegos = new Juego[100];
			
			
			misjuegos[0] = new Juego("Minecraft",100, true);
			misjuegos[1] = new Juego("Fortnite",50, true);
			misjuegos[2] = new Juego("Ratchet & Clank",200, false);
			
			
			for (int i = 0; i < misjuegos.length; i++) {
				if(misjuegos[i] != null) {
				System.out.println(misjuegos[i].dameNombre() + " tiene un record de " 
			+ misjuegos[i].dameRecord() + " puntos" + " y " + misjuegos[i].configuraMulti());
				}
			}
			
		}
		
		public String configuraMulti() {
			if(multijugador == true) {
				return " es multijugador";
			}else {
				return " no es multijugador";
			}
			
		}
		
		public Juego(String nom, int rec, boolean multi){
			
			nombre = nom;
			
			record = rec;
			
			multijugador = multi;
			
		}
		
		
		public String dameNombre() { // GETTER
			return nombre;
		}
		
		public int dameRecord() {  // GETTER
			return record;
		}
		
		public boolean dameMulti() {
			return multijugador;
		}
		
		private String nombre;
		private int record;
		private boolean multijugador;
	
  }
	


