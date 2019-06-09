public class MainCuadrado{
	public static void main(String[] args){
		Cuadrado c = new Cuadrado(7);
		Rectangulo r = new Rectangulo(2,4);
		c.impCuadrado();
		System.out.println("area:"+c.area());
		System.out.println("peri:"+c.perimetro());
		System.out.println();
		r.impRectangulo();
		System.out.println("area:"+r.area());
		System.out.println("peri:"+r.perimetro());


	}
}