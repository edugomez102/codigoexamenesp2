public class Uso{
	public static void main(String[] args){
		Array a1 = new ArrayRango(-1,7);		
		try{
			a1.modifica(1,-2);
		}
		catch(RangoNoValido e){
			System.out.println(e.getClass().getName()+" "+e.getMessage());
		}try{
			a1.modifica(6,10);
		}
		catch(RangoNoValido e){
			System.out.println(e.getClass().getName()+" "+e.getMessage());
		}try{
			a1.modifica(-1,7);
		}
		catch(RangoNoValido e){
			System.out.println(e.getClass().getName()+" "+e.getMessage());
		}try{
			a1.modifica(8,1);
		}
		catch(RangoNoValido e){
			System.out.println(e.getClass().getName()+" "+e.getMessage());
		}


		try{
			System.out.println(a1.consulta(6));
		}
		catch(RangoNoValido e){
			System.out.println(e.getClass().getName()+" "+e.getMessage());
		}try{
			System.out.println(a1.consulta(1));
		}
		catch(RangoNoValido e){
			System.out.println(e.getClass().getName()+" "+e.getMessage());
		}try{
			System.out.println(a1.consulta(-1));
		}
		catch(RangoNoValido e){
			System.out.println(e.getClass().getName()+" "+e.getMessage());
		}try{
			System.out.println(a1.consulta(-2));
		}
		catch(RangoNoValido e){
			System.out.println(e.getClass().getName()+" "+e.getMessage());
		}
	}
}