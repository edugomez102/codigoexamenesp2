public class Rectangulo extends Cuadrado{
	private double lado;
	public Rectangulo(double base, double altura){
		super(altura);
		if(base <= altura)
			base = altura + 1;
		lado = base;
	}
	public double perimetro(){
		return super.lado * 2 + lado * 2;
	}
	public double area(){
		return super.lado * lado;
	}
}