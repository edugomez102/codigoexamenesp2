public class OficinaCorres{
	private Envio [][] casillero;
	public OficinaCorres(int f,int c){
		if(f<2){
			f=2;
		}
		if(c<2){
			c=2;
		}
		casillero = new Envio[f][c];
	}

	public boolean almacena(Envio env){
		for(int i=0;i<casillero.length;i++){
			for(int j=0;j<casillero[i].length;j++){
				if(casillero[i][j]==null){
					casillero[i][j] = env;
					return true;
				}
			}
		}
		return false;
	}

	public double facturado(){
		double res = 0;
		for(int i=0;i<casillero.length;i++){
			for(int j=0;j<casillero[i].length;j++){
				res = res +casillero[i][j].calculaImporte();
			}
		}
		return res;
	}

	public int westerns(){
		int res = 0;
		for(int i=0;i<casillero.length;i++){
			for(int j=0;j<casillero[i].length;j++){
				if(casillero[i][j] instanceof Western){
					res++;
				}
			}
		}
		return res;
	}	

	public int paquetes(){
		int res = 0;
		for(int i=0;i<casillero.length;i++){
			for(int j=0;j<casillero[i].length;j++){
				if(casillero[i][j] instanceof Paquete){
					res++;
				}
			}
		}
		return res;
	}

}