public class Aplicacion{
	public static void agrega(Superclase obj, int[] val){
		for(int i = 0; i< val.length;i++){
			System.out.println("inserta en "+i+" -> "+obj.inserta(i,val[i]));
		}
	}
	public static void elimina(Superclase obj, int[] val){
		for(int i = 0; i< val.length;i++){
			System.out.println("elimina "+i+" -> "+obj.borra(i));
		}
	}
	public static void main(String[] args){
		Superclase obj1=new Superclase(4);
		Superclase obj2 = new Subclase(6);
		int[] valores = {2,-2,6,-6,1,-1};
		agrega(obj1,valores);
		agrega(obj2,valores);
		obj1.muestra();
		obj2.muestra();
		elimina(obj1,valores);
		elimina(obj2,valores);
		obj1.muestra();
		obj2.muestra();
	}
}