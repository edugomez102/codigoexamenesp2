//incompleto
public class Juego{
	public static void main(String[] args){
		CuatroEnRaya cnr = new CuatroEnRaya(5,5);
		try{
			cnr.impTablero();
			System.out.println();

			// cnr.ponFicha(new Ficha("rojo"),1);
			// cnr.ponFicha(new Ficha("rojo"),1);
			// cnr.ponFicha(new Ficha("rojo"),1);
			cnr.ponFicha(new Ficha("rojo"),1);
			cnr.ponFicha(new Ficha("rojo"),2);
			cnr.ponFicha(new Ficha("rojo"),3);
			cnr.ponFicha(new Ficha("rojo"),4);

			cnr.impTablero();


		}
		catch(PartidaGanada e){
			e.printStackTrace();
			cnr.impTablero();
		}
	}
}
