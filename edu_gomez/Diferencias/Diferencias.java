//incompleto
import java.io.*;

public class Diferencias{

	public static void main(String[] args){
		boolean hayi = false;
		String mensaje0=null;
		String mensaje1=null;
		FileReader lector0 = null;
		BufferedReader br0 = null;
		FileReader lector1 = null;
		BufferedReader br1 = null;
		try{
			if(args.length >= 2){
				lector0 = new FileReader(args[0]);
				br0 = new BufferedReader(lector0);
				lector1 = new FileReader(args[1]);
				br1 = new BufferedReader(lector1);
				if(args.length == 3 && args[2].equals("-i")){
					hayi = true;
				}
				do{
					mensaje0 = br0.readLine();
					mensaje1 = br1.readLine();
					if(mensaje0!= null && mensaje1!= null && hayi==false &&
						!mensaje0.equalsIgnoreCase(mensaje1)){
						System.out.println("< "+mensaje0);
						System.out.println("> "+mensaje1);
					}
					else if(mensaje0!= null && mensaje1!= null && hayi==true &&
						!mensaje0.equals(mensaje1)){
						System.out.println("< "+mensaje0);
						System.out.println("> "+mensaje1);
					}
					else if(mensaje0==null && mensaje1!=null){
						System.out.println("> "+mensaje1);
					}
					else if(mensaje0!=null && mensaje1==null){
						System.out.println("< "+mensaje0);
					}
				}while(mensaje0 != null || mensaje1 != null);
			}
			else{
				System.out.println("NO HAY DOS FICHEROS");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				if(lector0!=null && lector1!=null && br0!=null && br1!=null){
					lector0.close();
					lector1.close();
					br0.close();
					br1.close();		
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
