public class Ficha {
	private String color ;
	public Ficha (){
	color = null ;
	}
	public Ficha (String c){
	if ((c!= null )&&(( c. equalsIgnoreCase (" rojo "))||( c. equalsIgnoreCase (" amarillo "))) )
		color = new String (c);
	else color = new String (" rojo ");
	}
	public String getColor (){ return color ;}
}