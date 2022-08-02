package repasopoo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona [] lasPersonas=new Persona[2];
		
		lasPersonas[0]= new Empleado2("Luis", 50000, 2009,02,25);
		lasPersonas[1]= new Alumno("Ana","Ingenieria de Software");
		
		for(Persona p: lasPersonas) {
			
			System.out.println(p.dameNombre()+", "+p.dameDescripcion());
		}
		
		
	}

}

abstract class Persona{
	
	public Persona(String nom) {
		
		nombre=nom;
	}
	
	public String dameNombre() {
		
		return nombre;
	}
	
	public abstract String dameDescripcion();
		
	
	private String nombre;
	
}


class Empleado2 extends Persona{
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom);
		sueldo=sue;
		GregorianCalendar calendario= new GregorianCalendar(agno, mes -1, dia);
		altacontrato=calendario.getTime();
		Id=IdSiguiente;
		++IdSiguiente;
	}
	
	public String dameDescripcion() {
		
		return "Este empleado tiene un Id= "+Id+" con un sueldo= "+sueldo;
	}
	
	public double dameSueldo() {
		
		return sueldo;
		
	}
	
	public Date dameFechaContrato() {
		
		return altacontrato;
		
	}
	
	public void subeSueldo(double porcentaje) {
		
		double aumento= sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	private double sueldo;
	private Date altacontrato;
	private  int Id;
	private static int IdSiguiente=1;
	
}

class Alumno extends Persona {
	
	public Alumno(String nom, String car) {
		
		super(nom);
		
		carrera=car;
		
	}
	
	public String dameDescripcion() {
		
		return "Este alumno esta estudiando la carrera de "+carrera;
	}
	
	private String carrera;
	
}