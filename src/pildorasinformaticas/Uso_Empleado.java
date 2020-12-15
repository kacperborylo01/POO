package pildorasinformaticas;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleado empleado1 = new Empleado("Paco Gómez", 85000, 2010,05,13);
		Empleado empleado2 = new Empleado("Ana López", 95000, 2010,8,03);
		Empleado empleado3 = new Empleado("Maria Martín", 105000,2002,03,15);
		
		empleado1.aumentaSueldo(5);
		
		empleado2.aumentaSueldo(5);
		
		empleado3.aumentaSueldo(5);
		
		System.out.println("Nombre :" + empleado1.dameNombre() + " Sueldo : " 
		+ empleado1.dameSueldo() + " Fecha de Alta: " + empleado1.dameFechaContrato());
		
		System.out.println("Nombre :" + empleado2.dameNombre() + " Sueldo : " 
		+ empleado2.dameSueldo() + " Fecha de Alta: " + empleado2.dameFechaContrato());
		
		System.out.println("Nombre :" + empleado3.dameNombre() + " Sueldo : " 
		+ empleado3.dameSueldo() + " Fecha de Alta: " + empleado3.dameFechaContrato());
		 */
		
		Empleado[] misEmpleados = new Empleado[3];
		
		misEmpleados[0] = new Empleado ("Paco Gómez", 85000,1990,12,17);
		
		misEmpleados[1] = new Empleado ("Ana López", 95000, 1995, 06, 02);
		
		misEmpleados[2] = new Empleado ("Maria Martín" , 105000, 2002, 03, 15);
		
		/*for (int i = 0; i < misEmpleados.length; i++) {
			
			misEmpleados[i].aumentaSueldo(5);
		
			
		}*/
		
		for(Empleado e: misEmpleados) {
			
			e.aumentaSueldo(5);
			
		}
		
		for (int i = 0; i < misEmpleados.length; i++) {
			
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() +
					" Sueldo: " + misEmpleados[i].dameSueldo() 
			+ " Fecha de Alta: " + misEmpleados[i].dameFechaContrato());
			
			
		}
		
	}

}

class Empleado{

	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		nombre = nom;
		
		sueldo = sue;
		
		GregorianCalendar calendario= new GregorianCalendar(agno, mes-1,dia);
		
		altaContrato = calendario.getTime();
		
	}
	
	
	
	public String dameNombre() { //GETTER
		return nombre;
	}
	
	
	
	public double dameSueldo() { //GETTER
		return sueldo;
	}
	
	public Date dameFechaContrato() { //GETTER
		return altaContrato;
	}
	
	public void aumentaSueldo(double porcentaje) { //SETTER
		
		double aumento = sueldo * porcentaje/100;
		sueldo += aumento;
		
	}
	
	private String nombre;
	
	private double sueldo;
	
	private Date altaContrato;
}
