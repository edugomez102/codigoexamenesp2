public class Habitacion{
	private int ocupantes;
	private int camas;
	private boolean aseo;
	private int max_ocu;

	public Habitacion(int n,boolean wc){
		if(n<1){
			n=1;
		}
		ocupantes = 0;
		camas = n;
		aseo = wc;
	}

	public boolean entra(){
		if(ocupantes<camas){
			ocupantes++;
			return true;
		}else{
			return false;
		}
	}

	public boolean sale(){
		if(ocupantes>camas){
			ocupantes--;
			return true;
		}else{
			return false;
		}
	}

	public void setCamas(int cam){
		camas = cam;
	}

	public int getCamas(){
		return camas;
	}

	public void setAseo(boolean as){
		aseo = as;
	}

	public boolean getAseo(){
		return aseo;
	}


}
