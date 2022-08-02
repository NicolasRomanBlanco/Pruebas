package repasopoo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Empleado empleado1= new Empleado("Nico", 18000, 2022, 6, 9);
		Empleado empleado2= new Empleado("Sara", 40000, 2012, 2, 6);
		Empleado empleado3= new Empleado("Max", 25000, 2003, 1, 8);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(7);
		empleado3.subeSueldo(9);
		
		System.out.println("Nombre: "+empleado1.dameNombre()+" Sueldo: "+empleado1.dameSueldo()+" Dame fecha de alta: "+empleado1.dameFechaContrato());
		System.out.println("Nombre: "+empleado2.dameNombre()+" Sueldo: "+empleado2.dameSueldo()+" Dame fecha de alta: "+empleado2.dameFechaContrato());
		System.out.println("Nombre: "+empleado3.dameNombre()+" Sueldo: "+empleado3.dameSueldo()+" Dame fecha de alta: "+empleado3.dameFechaContrato());*/
		
		Jefatura jefe_RRHH=new Jefatura("Jose",250000, 1992, 5,2);
		
		jefe_RRHH.estableceIncentivo(700);
		
		
		
		Empleado[] misEmpleados= new Empleado[6];
		
		misEmpleados[0]= new Empleado("Nico", 18000, 2022, 6, 9);
		misEmpleados[1]= new Empleado("Sara", 40000, 2012, 2, 6);
		misEmpleados[2]= new Empleado("Max", 25000, 2003, 1, 8);
		misEmpleados[3]= new Empleado("Maria");
		misEmpleados[4]= jefe_RRHH; //Polimorfismo, Principio de sustitucion
		misEmpleados[5]= new Jefatura("Samira", 95000, 1999, 4 ,29); //es lo mismo (funciona ya que un jefe ES UN empleado)
		
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5]; //Casting de objetos
		
		jefa_Finanzas.estableceIncentivo(55000);
		
		//Jefatura jefe_Finanzas=(Jefatura) misEmpleados[1]; Casting de objetos  mal usado ya que un empleado no siempre es un jefe y en este caso no lo es
		
		/*for (int i =0; i<3; i++) {
			
			misEmpleados[i].subeSueldo(5);
		}*/
		
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar mas dias de vacaciones a los empleados"));
		
		System.out.println("El jefe "+jefa_Finanzas.dameNombre()+" tiene un bonus de: "+jefa_Finanzas.establece_bonus(500));
		
		System.out.println(misEmpleados[3].dameNombre()+" tiene un bonus de: "+misEmpleados[3].establece_bonus(200));
		
		
		/* Empleado director_general= new Jefatura("Sandra", 85000, 2012,04,12);
		
		Comparable ejemplo= new Empleado ("Elisabeth", 60000, 2011, 02,23);
		
		
		/*
		if( director_general instanceof Empleado) {
			
			System.out.println("Es de tipo Jefatura");
			
		}
		
		if( ejemplo instanceof Comparable) {
			
			System.out.println("Es de tipo Comparable");
			
		}
		*/
		
		//ordena el array necesita interfaz comparable que necesita compareTo
		Arrays.sort(misEmpleados);
		
		for(Empleado e: misEmpleados) {
			
			e.subeSueldo(5);
		}
		
		
		/*for(int i=0;i<3;i++) {
			
			System.out.println("Nombre: "+misEmpleados[i].dameNombre()+" Sueldo: "+misEmpleados[i].dameSueldo()+" Dame fecha de alta: "+misEmpleados[i].dameFechaContrato());
		}*/
		
		for(Empleado e: misEmpleados) {
			
			System.out.println("Nombre: "+e.dameNombre()+" Sueldo: "+e.dameSueldo()+" Dame fecha de alta: "+e.dameFechaContrato());
			//enlazado dinamico, sabe que dameSueldo utilizar, en caso de un empledo o en caso de un jefe
		}
		
		
	}

}

class Empleado implements Comparable, Trabajadores{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario= new GregorianCalendar(agno, mes -1, dia);
		altacontrato=calendario.getTime();
	}
	
	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base + gratificacion;
	}
	
	public Empleado(String nom) {
		
		this(nom,30000,2000,01,01);//Llama al otro construcotr para pasarle los parametros
		
	}
	
	
	public String dameNombre() {
		
		return nombre;
		
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
	
	public int compareTo(Object  miObj) {
		
		Empleado otroEmpleado = (Empleado) miObj;
		
		if (this.sueldo<otroEmpleado.sueldo) {
			
			return -1;
		}
		
		if (this.sueldo>otroEmpleado.sueldo) {
			
			return 1;
		}
		
		return 0;
				
		
		
		
	}
	
	private String nombre;
	private double sueldo;
	private Date altacontrato;
	
}

 class Jefatura extends Empleado implements Jefes{
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
	
		super( nom, sue, agno, mes, dia);
		
	}
	
	public String tomar_decisiones(String decision) {
		
		return "Un miembro de la direccion ha tomado la decision de: "+decision;
	}
	
	public double establece_bonus(double gratificacion) {
		
		double prima=2000;
		
		return Trabajadores.bonus_base+gratificacion+prima;
		
	}
	
	public void estableceIncentivo(double b) {
		
		incentivo=b;
	}
	
	public double dameSueldo() {
		
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe+incentivo;
	}
	
	private double incentivo;
	
		
}

class Director extends Jefatura{
	
	public Director(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
		
	}
	
}
