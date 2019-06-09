public class Western extends Envio{
	private String mensaje;
	private double cantidad;

	public Western(String mens,double cant){
		if(cant<50){
			cant = 50;
		}
		cantidad = 50;
		mensaje = mens;
	}

	public double calculaImporte(){
		return cantidad*0.03;
	}
}