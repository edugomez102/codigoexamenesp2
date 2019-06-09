public class Habitacion{
	private int ocupantes;
	private int camas;
	private boolean aseo;

	public Habitacion(int cam, boolean as){
		if(cam < 1) cam = 1;
		ocupantes = 0;
		camas = cam;
		aseo = as;
	}
	public boolean entra(){
		boolean entrado = false;
		if(ocupantes < camas){
			ocupantes++; 
			entrado = true;
		}
		return entrado;
	}
	public boolean sale(){
		boolean salido = false;
		if(ocupantes > 0){ 
			ocupantes--;
			salido = true;
		}
		return salido;
	}
}