public class Array{
	private int[] vector;

	public Array(int n){
		int max = 0;
		if(n>0){
			max = n;
		}
		vector = new int[max];
	}
	public void modifica(int n1, int n2) throws RangoNoValido{
		if(n1 < vector.length && n1 > 0){
			vector[n1] = n2;
		}
		else{
			throw new RangoNoValido(n1);
		}
	}
	public int consulta(int n1) throws RangoNoValido{
		int res = 0;
		if(n1 < vector.length && n1 > 0){
			res = vector[n1];
		}
		else{
			throw new RangoNoValido(n1);
		}
		return res;
	}
}