public class OficinaCorreos{
	private Envio[][] casillero;

	public OficinaCorreos(int filas, int columnas){
		if(filas < 2) filas = 2;
		if(columnas < 2) columnas = 2;
		casillero = new Envio[filas][columnas];
	}
	public boolean almacena(Envio env){
		boolean almacenado = false;
		for(int i = 0; i < casillero.length; i++){
			for(int j = 0; j < casillero[0].length; j++){
				if(casillero[i][j] == null){
					casillero[i][j] = env;
					almacenado = true;
				}
			}
		}
		return almacenado;
	}
	public double facturado(){
		double importe = 0;
		for(int i = 0; i < casillero.length; i++){
			for(int j = 0; j < casillero[0].length; j++){
				if(casillero[i][j] == null){
					importe = importe + casillero[i][j].calculaImporte();
				}
			}
		}
		return importe;
	}
	public int westerns(){
		int envios = 0;
		for(int i = 0; i < casillero.length; i++){
			for(int j = 0; j < casillero[0].length; j++){
				if(casillero[i][j] != null && casillero[i][j] instanceof Western){
					envios++;
				}
			}
		}
		return envios;
	}
	public int paquetes(){
		int envios = 0;
		for(int i = 0; i < casillero.length; i++){
			for(int j = 0; j < casillero[0].length; j++){
				if(casillero[i][j] != null && casillero[i][j] instanceof Paquete){
					envios++;
				}
			}
		}
		return envios;
	}
}