public class Empleado{

	private String nombre;
	private int edad;
	private String nif;
	private double sueldo;

	public Empleado(String cad1, String cad2, int num1, double num2){
		nombre = "John Doe";
		nif = "indocumentado";
		edad = 29;
		sueldo = 1000;
		if(cad1!=null){nombre=cad1;}
		if(cad2!=null){nif=cad2;}
		if(num1>16 && num1<70){edad=num1;}
		if(num2>0){sueldo=num2;}
	}
	public void imprime(){
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Nif: "+nif);
		System.out.println("Sueldo: "+sueldo);
	}
}