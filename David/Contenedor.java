public class Contenedor{
	private int []contenido;

	public Contenedor(int n){
		if(n>0){
			contenido = new int[n];
		}else{
			contenido = new int[5];
		}
	}

	public int agrega(int n){
		int contador = 0;
		if(n>0){
		if(n>=contenido.lenght){
			for(int i=0;i<contenido.lenght;i++){
				if(contenido[i]==0){
				contenido[i]=1;
				contador++;
			}
			}
		}else{
			for(int i=0;i<contenido.lenght;i++){
				if(contenido[i]==0 && n!=0){
					contenido[i]==1;
					contador++;
					n--;
				}
			}

			}
		}
		return contador;
	}


	public int extrae(int n){
		int contador = 0;
		if(n>0){
			if(n>=contenido.lenght){
				for(int i=0;i<contenido.lenght;i++){
					contenido[i]=0;
					contador = contenido.lenght;
				}
			}else{
				for(int i=0;i<contenido.lenght;i++){
				if(contenido[i]==1 && n!=0){
					contenido[i]==0;
					contador++;
					n--;
				}
			}
			}
		}
		return contador;
	}

	public void estado(){
		for(int i=0;i<contenido.lenght;i++){
			if(contenido[i]==0){
				System.out.print("- ");
			}else{
				System.out.print("| ");
			}
		}
	}
	