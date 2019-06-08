public class Hotel{
	private Habitacion []estancias;
	public Hotel(int n_est,int n_camas){
		if(n_est<3){
			n_est=3;
		}
		estancias = new Habitacion[n_est];
		for(int i=0;i<estancias.length;i++){
			estancias[i].setCamas(n_camas);
			estancias[i].setAseo(false);
		}
	}
	public boolean aloja(int i_estancia){
		if(estancias[i_estancia-1]==null){
			estancias[i_estancia-1].entra();
			return true;
		}
		return false;
	}

	public boolean desaloja(int i_estancia){
		if(estancias[i_estancia-1]!=null){
			estancias[i_estancia-1].sale();
			return true;
		}
		return false;
	}

	public boolean reforma(int i_estancia){
		if(i_estancia>0){
		if(estancias[i_estancia-1]!=null){
			if(estancias[i_estancia-1].getCamas==2 && estancias[i_estancia-1].getAseo==true){
				Suite x = new Suite(estancias[i_estancia-1].getCamas,estancias[i_estancia-1].getAseo);
				estancias[i_estancia-1] = x;
				return true;
			}
		}
	}
		return false;
	}

	public int getReformas(){
		int contador = 0;
		for(int i=0;i<estancias.length;i++){
			if(estancias[i].instanceof(Suite)){
				contador++;
			}
		}
		return contador;
	}

	public int getHabitaciones(){
		int contador = 0;
		for(int i=0;i<estancias.length;i++){
			if(estancias[i].instanceof(Habitacion)){
				contador++;
			}
		}
		return contador;
	}

}