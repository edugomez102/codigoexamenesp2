public class Envio{
	protected String destinatario;
	protected String remitente;

	public Envio(String dest, String remi){
		destinatario = dest;
		remitente = remi;
	}

	public abstract double calculaImporte();
}