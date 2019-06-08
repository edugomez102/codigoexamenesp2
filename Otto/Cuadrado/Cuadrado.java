public class Cuadrado{
	protected double lado;
	public Cuadrado(double medida){
		if(medida <= 0)
			medida = 1.5;
		lado = 1.5;
	}
	public double perimetro(){
		return lado*4;
	}
	public double area(){
		return lado*lado;
	}
}