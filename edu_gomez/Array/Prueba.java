public class Prueba{
	public static void main(String[] args) {
		ArrayRango ar = new ArrayRango(3,6);
		try{
			// ar.modifica(0,1);

			ar.modifica(1,1);
			ar.modifica(2,1);
			ar.modifica(3,1);
			ar.modifica(4,1);
			// ar.modifica(5,1);

			System.out.println(ar.consulta(1));
			System.out.println(ar.consulta(2));
			System.out.println(ar.consulta(3));
			System.out.println(ar.consulta(4));
			System.out.println(ar.consulta(5));
			System.out.println(ar.consulta(6));
		}
		catch(RangoNoValido e){
			System.out.println(e.getClass().getName()+" "+e.getMessage());
		}

	}
}