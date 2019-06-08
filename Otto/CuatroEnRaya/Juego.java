public class Juego{
	public static void main(String[] args) {
		CuatroEnRaya cuatro = new CuatroEnRaya(8,6);
		Ficha ficha1 = new Ficha(" amarillo ");
		Ficha ficha2 = new Ficha(" amarillo ");
		Ficha ficha3 = new Ficha(" amarillo ");
		Ficha ficha4 = new Ficha(" amarillo ");
		try{
			cuatro.ponFicha(ficha1,0);
			cuatro.ponFicha(ficha2,0);
			cuatro.ponFicha(ficha3,0);
			cuatro.ponFicha(ficha4,0);
		}
		catch(PartidaGanada e){
			System.out.println(e);
		}
	}
}