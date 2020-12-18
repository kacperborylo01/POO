package Contraseñas;

import java.util.Random;

public class Password {
    private int longitud;
    private String contrasena;
    public Password() {
        contrasena="AAAaa11111"; // Borrar luego despues de pruebas
        longitud = 11;
    }
    public Password(int longitud) {
        this.longitud = longitud;
        contrasena = "";
        generarPassword(); // Hay que modificarlo

    }
    
    public boolean esFuerte( String contrasena) {
    	String letraMin = "abcdefghijklmnñopqrstuvwxyz";
    	String letraMay = letraMin.toUpperCase();
    	String numeros = "1234567890";
    	String posi = letraMin + letraMay + numeros;
    	
    	int contmin=0,contmay=0,contnum=0;
    	
    	for (int i = 0; i < contrasena.length(); i++) {
    		
			if(contrasena.substring(i, i+1).equalsIgnoreCase(letraMin)) {
				contmin++;
			}else if(contrasena.substring(i, i+1).equalsIgnoreCase(letraMay)) {
				contmay++;
			}else {
				contnum++;
			}
		}
    	
    	
    	return false;
    }
    
    public void generarPassword() {
    	String letraMin = "abcdefghijklmnñopqrstuvwxyz";
    	String letraMay = letraMin.toUpperCase();
    	String numeros = "1234567890";
    	String posi = letraMin + letraMay + numeros;
    	Random r = new Random();
    	int aleatorio = 0;
    	
    	for (int i = 0; i < longitud; i++) {
    		aleatorio = r.nextInt(posi.length());
			contrasena += posi.substring(aleatorio, aleatorio + 1);
		}
    	
    	
    	
    }
	
    public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String getContrasena() {
		return contrasena;
	}
	
    
    
    
  
}



