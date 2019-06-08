public class Program{
	public static void main(String[] args) {
		double cuad = 2.0, rect = 3.0;
		Cuadrado cuadrado = new Cuadrado(cuad);
		Rectangulo rectangulo = new Rectangulo(rect, cuad);
		System.out.println(cuadrado.perimetro() + " :PERIMETRO\nAREA: " + cuadrado.area());
		System.out.println(rectangulo.perimetro() + " :PERIMETRO\nAREA: " + rectangulo.area());
	}
}