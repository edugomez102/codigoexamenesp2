//incompleto
public class PartidaGanada extends Exception{
	public PartidaGanada(){
		super();
	}
	public PartidaGanada(Ficha f){
		super(f.getColor());
		// color de la ficha
	}
}