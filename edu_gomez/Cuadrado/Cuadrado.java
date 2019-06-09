public class Cuadrado{

	protected double lado;

	public Cuadrado(double num){
		lado = 1.5;
		if(num > 0){
			lado = num;
		}
	}
	public double perimetro(){
		double res = 0;
		res = lado*4;
		return res;
	}
	public double area(){
		double res = 0;
		res = lado*lado;
		return res;
	}
	//////////
	public void impCuadrado(){
		System.out.println(lado);
	}

}