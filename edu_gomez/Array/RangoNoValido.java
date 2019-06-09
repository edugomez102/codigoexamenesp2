public class RangoNoValido extends Exception{
	
	public RangoNoValido(int n){
		super(Integer.toString(n));
	}
}