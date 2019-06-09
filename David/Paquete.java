public class Paquete extends Envio{
	private int alto;
	private  int ancho;
	private int largo;
	private double peso;

	public Paquete(int al,int anc,int larg,double pe){
		super(Envio.destinatario,Envio.remitente);
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
			larg = 3;
		}
		largo = 3;
	}

	public Override double calculaImporte(){
		return peso/(alto+ancho+largo);
	}
	public void toStrang(){
		super.toStrang();
		System.out.println("ALTO: " + alto + "\n");
		System.out.println("ANCHO: " + ancho + "\n");
		System.out.println("LARGO: " + largo + "\n");
		System.out.println("PESO: " + peso + "\n");
	}
}