public class CuatroEnRaya{
	private Ficha[][] tablero;
	public CuatroEnRaya(int filas, int columnas){
		if(filas <= 0 || columnas <= 0){
			filas = 8;
			columnas = 6;
		}
		tablero = new Ficha[filas][columnas];
	}
	public void iniciaTablero(){
		for(int i = 0; i < tablero.length; i++){
			for(int j = 0; j < tablero[i].length; j++){
				tablero[i][j] = null;
			}
		}
	}
	public boolean ponFicha(Ficha ficha, int columna) throws PartidaGanada{
		boolean colocada = false;
		int pos = -1, contador = 0;
		if((ficha.getColor()!=null)&&(columna >= 0 && columna < tablero[0].length)){
			for(int i = 0; i < tablero.length; i++){
				if(tablero[i][columna] == null){
					tablero[i][columna] = ficha;
					pos = i;
					colocada = true;
					break;
				}
			}
			if(colocada){
				for(int i = pos-3; i < pos+3; i++){
					if(i >= 0 && i < tablero.length){
						if(tablero[i][columna] != null && tablero[i][columna] != ficha){
							if(tablero[i][columna].getColor().equals(ficha.getColor()))
								contador++;
							else
								contador = 0;
						}
					}
					if(contador == 3)
						throw new PartidaGanada(ficha);
				}
				for(int i = columna-3; i < columna+3; i++){
					if(i >= 0 && i < tablero[0].length){
						if(tablero[pos][i] != null && tablero[pos][i] != ficha){
							if(tablero[pos][i].getColor().equals(ficha.getColor()))
								contador++;
							else
								contador = 0;
						}
					}
					if(contador == 3){
						throw new PartidaGanada(ficha);
					}
				}
			}
		}
		return colocada;
	}
	public void muestra(){
		for(int i = 0; i < tablero.length; i++){
				for(int j = 0; j < tablero[0].length; j++){
					if(tablero[i][j] == null)
						System.out.print(" blanco ");
					else System.out.print(tablero[i][j].getColor());
				}
				System.out.print("\n");
		}
	}
}