public class Superclase{
	protected double[] array;
	public Superclase(int i){
		array = new double[i];
	}
	public boolean inserta(int i, double j){
		boolean hecho = false;
		if(i>= 0 && i < array.length && j != 0){
			array[i] = j;
			hecho = true;
		}
		return hecho;
	}
	public boolean borra(int i){
		boolean hecho = false;
		if(i>=0 && i<array.length && array[i]!=0){
			array[i] = 0;
			hecho = true;
		}
		return hecho;
	}
	public void muestra(){
		for(int i = 0; i < array.length-1; i++){
			System.out.print(array[i]+" ");
		}
		System.out.println(array[array.length-1]);
	}
}