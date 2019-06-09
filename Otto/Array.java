public class Array{
	private int[] vector;

	public Array(int cant){
		if(cant < 0) cant = 0;
		vector = new int[cant];
	}
	public void modifica(int pos, int valor) throws RangoNoValido{
		if(pos < 0 || pos >= vector.length) throw new RangoNoValido(pos);
		else{ vector[pos] = valor; }
	}
	public int consulta(int pos){
		if(pos < 0 || pos >= vector.length) throw new RangoNoValido(pos);
		else{ return vector[pos]; }
	}
}