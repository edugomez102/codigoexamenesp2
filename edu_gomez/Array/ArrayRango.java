public class ArrayRango extends Array{

	private int ini;
	private int fin;

	public ArrayRango(int i, int f){
		super(f-i+1);
		ini = i;
		fin = f;
	}
}