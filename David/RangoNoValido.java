public class RangoNoValido extends Exception{
	public RangoNoValido(int i){
		super(Integer.toString(i));
	}
}