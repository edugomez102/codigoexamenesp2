public class Paquete extends Envio{
	private int alto;
	private int ancho;
	private int largo;
	private double peso;

	public Paquete(int alto, int ancho, int largo, double peso){
		super(Envio.destinatario, Envio.remitente);
		this.alto = 3;
		this.ancho = 3;
		this.largo = 3;
		this.peso = 100;
		if(alto > 3)
			this.alto = alto;
		if(ancho > 3)
			this.ancho = ancho;
		if(largo > 3)
			this.largo = largo;
		if(peso > 100)
			this.peso = peso;
	}
	public double calculaImporte(){
		double res = 0;
		res = peso/(alto+ancho+largo);
		return res;
	}
}