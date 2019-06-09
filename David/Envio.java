public abstract class Envio{
	protected static String destinatario;
	protected static String remitente;

	public Envio(String dest, String remi){
		destinatario = dest;
		remitente = remi;
	}

	public abstract double calculaImporte();

	public void toStrang(){
		System.out.println("DEST: " + destinatario + "\n");
		System.out.println("REM: " + remitente + "\n");
	}
}

