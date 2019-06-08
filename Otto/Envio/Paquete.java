public class Paquete extends Envio{
	private int alto, ancho, largo;
	private double peso;

	public Paquete(int al, int an, int la, double pe, String des, String remt){
		super(des, remt);
		if(al <3) al = 3;
		if(an < 3) an = 3;
		if(la < 3) la = 3;
		if(pe < 100) pe = 100;
		alto = al;
		ancho = an;
		largo = la;
		peso = pe;
	}
	public double calculaImporte(){
		double importe;
		importe = peso/(alto+ancho+largo);
		return importe;
	}
}