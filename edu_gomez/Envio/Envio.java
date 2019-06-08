public class Envio{
	protected static String destinatario;
	protected static String remitente;

	public Envio(String dest, String remi){
		destinatario = dest;
		remitente = remi;
	}
	public double calculaImporte(){
		double res;
		if(this instanceof Paquete){
			res = ((Paquete)this).calculaImporte();
		}
		else{
			res = ((Western)this).calculaImporte();
		}
		return res;
	}
}