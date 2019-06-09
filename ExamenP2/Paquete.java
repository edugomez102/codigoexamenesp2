public class Paquete extends Envio{
	private int alto;
	private  int ancho;
	private int largo;
	private double peso;

	public Envio(int al,int anc,int larg,double pe){
		if(pe<100){
			pe=100;
		}
		peso = pe;
		if(al<3){
			al = 3;
		}
		alto = al;
		if(anc<3){
			anc = 3;
		}
		ancho = anc;
		if(larg<3){
			larg = 3
		}
		largo = 3;
	}

	public double calculaImporte(){
		return peso/(alto+ancho+largo);
	}

}