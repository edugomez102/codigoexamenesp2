public class Uso{
	public static void main(String[]args){
		Array vectorcito;
		vectorcito = new ArrayRango(-1,7);
		try{
			vectorcito.modifica(1,-2);
		}catch(RangoNoValido e){
			System.out.println(e);
		}
		try{
			vectorcito.modifica(6,10);
		}catch(RangoNoValido e){
			System.out.println(e);
		}
		try{
			vectorcito.modifica(-1,7);
		}catch(RangoNoValido e){
			System.out.println(e);
		}
		try{
			vectorcito.modifica(8,1);
		}catch(RangoNoValido e){
			System.out.println(e);
		}

		try{
				System.out.println(vectorcito.consulta(6));
		}catch(RangoNoValido e){
			System.out.println(e);
		}
		try{
				System.out.println(vectorcito.consulta(1));
		}catch(RangoNoValido e){
			System.out.println(e);
		}
		try{
			System.out.println(vectorcito.consulta(-1));
		}catch(RangoNoValido e){
			System.out.println(e);
		}
		try{
			System.out.println(vectorcito.consulta(2));
		}catch(RangoNoValido e){
			System.out.println(e);
		}

	}
}