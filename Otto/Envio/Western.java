public class Western extends Envio{
	private String mensaje;
	private double cantidad;

	public Western(String men, double can, String des, String remt){
		super(des, remt);
		if(can < 50) can = 50;
		cantidad = can;
		mensaje = men;
	}
	public double calculaImporte(){
		double importe;
		importe = cantidad * 0.03;
		return importe;
	}
}