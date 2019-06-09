public class Subclase extends Superclase{
	public Subclase(int i){
		super(i);
	}
	public boolean inserta(int i, int j){
		boolean hecho = false;
		if(i>=0 && i<array.length && j > 0){
			array[i] = j;
			hecho = true;
		}
		return hecho;
	}
	public boolean borra(int i){
		boolean hecho = false;
		if(i>=0 && i<array.length && array[i] > 0){
			array[i] = 0;
			hecho = true;
		}
		return hecho;
	}
}