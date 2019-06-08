public class PartidaGanada extends Exception{
	public PartidaGanada(){ }
	public PartidaGanada(Ficha ficha){
		super(ficha.getColor());
	}
}