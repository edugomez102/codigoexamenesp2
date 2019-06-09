public class Rectangulo extends Cuadrado{
	private double lado;

	public Rectangulo(double n1, double n2){
		super(n1);
		lado = n1+1;
		if(n2>n1){
			lado = n2;
		}
	}
	public double perimetro(){
		double res = 0;
		res = lado*2 + super.lado*2;
		return res;
	}
	public double area(){
		double res = 0;
		res = lado * super.lado;
		return res;
	}

	//////
	public void impRectangulo(){
		System.out.println(lado);
		System.out.println(super.lado);
	}
}