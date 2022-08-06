package c.repasopoo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Empleados empleado1= new Empleados("Nico");
		Empleados empleado2= new Empleados("Badbunny");
		Empleados empleado3= new Empleados("Sam");
		Empleados empleado4= new Empleados("Mari");
		
		
		empleado1.cambiaSeccion("RRHH");
		empleado4.cambiaSeccion("Makeup");
		
		System.out.println(empleado1.devuelveDatos());
		
		System.out.println(empleado2.devuelveDatos());
		
		System.out.println(empleado3.devuelveDatos());
		
		System.out.println(empleado4.devuelveDatos());
		
		
	}

}

class Empleados{
	
	
	public Empleados (String nom) {
		
		nombre=nom;
		
		seccion="Administracion";
		
		id=IdSiguiente;
		
		IdSiguiente++;
	}
	
	public void cambiaSeccion(String seccion) {
		
		this.seccion=seccion;
		
	}
	
	public String devuelveDatos() {
		
		return "El nombre es "+nombre+", el id = "+id+" y la seccion es "+seccion;
	}
	
	private final String nombre;
	
	private String seccion;
	
	private int id;
	
	public static int IdSiguiente=1;
	
	
	
}