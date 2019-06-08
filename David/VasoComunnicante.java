public class VasoComunicante{
	Contenedor []contenedores;

	public VasoComunicante(int nCont,int capa){
		if(n<2){
			contenedores = new Contenedor[2];
		}else{
			contenedores = new Contenedor[nCont];
		}
		for(int i=0;i<contenedores.lenght;i++){
			contenedores[i] = new Contenedor(capa);
		}
	}

	public int agrega(int n){
		int contador =  0;
		if(n>=contenedores.lenght){
			int repartir = 0;
			repartir = n/contederos.lenght;
			for(int i=0;i<contenedores.lenght;i++){
				int x = contenedores[i].agrega(repartir);
				contador = contador + x;
			}
		}
		return contador;
	}
}