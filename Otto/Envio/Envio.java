public abstract class Envio{
	protected String destinatario;
	protected String remitente;

	public Envio(String dest, String rem){
		destinatario = dest;
		remitente = rem;
	}
	public abstract double calculaImporte();
}