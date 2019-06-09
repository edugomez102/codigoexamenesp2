public class Array{
	private int []vector;
	public Array(int x){
		if(x<0){
			x = 0;
		}
		vector = new int[x];
	}

	public void modifica (int pos,int valor) throws RangoNoValido{
		if(pos>=0 && pos<vector.length){
			vector[pos] = valor;
		}else{
			throw new RangoNoValido(pos);
		}
	}

	public int consulta(int pos)throws RangoNoValido{
		if(pos>=0 && pos<vector.length){
			return vector[pos];
		}else{
			throw new RangoNoValido(pos);
		}
	}
}