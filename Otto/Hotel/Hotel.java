public class Hotel{
	private Habitacion[] estancias;
	private int reformas;

	public Hotel(int est, int cam){
		if(est < 3) est = 3;
		estancias = new Habitacion[est];
		for(int i = 0; i < est; i++){
			estancias[i] = new Habitacion(cam, false);
		}
		reformas = 0;
	}
	public boolean aloja(int est){
		boolean alojado = false;
		est--;
		if(est >= 0 && est < estancias.length)
			alojado = estancias[est].entra();
		return alojado;
	}
	public boolean desaloja(int est){
		boolean desalojado = false;
		est--;
		if(est >= 0 && est < estancias.length)
			desalojado = estancias[est].sale();
		return desalojado;
	}
	public boolean reforma(int est){
		boolean reformada = false;
		est--;
		if(est >= 0 && est < estancias.length){
			if(!(estancias[est] instanceof Suite)){
				estancias[est] = new Suite();
				reformada = true;
				reformas++;
			}
		}
		return reformada;
	}
	public int getReformas(){ return reformas; }
	public int getHabitaciones(){ return estancias.length - reformas; }
}