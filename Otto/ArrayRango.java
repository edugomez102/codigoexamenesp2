public class ArrayRango extends Array{
	private int inicial;
	private int end;

	public Array(int cant){
		if(cant < 0) cant = 0;
		vector = new int[cant];
	}
}