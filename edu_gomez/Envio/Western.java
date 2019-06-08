public class Western{
	private String mensaje;
	private double cantidad;

	public Western(String cad, double cant){
		mensaje = "";
		cantidad = 50;
		if(cad != null && !cad.isEmpty()){
			mensaje = cad;
		}
		if(cant > 50){
			cantidad = cant;
		}
	}
	public double calculaImporte(){
		double res;
		res = cantidad*0.03;
		return res;
	}
}
