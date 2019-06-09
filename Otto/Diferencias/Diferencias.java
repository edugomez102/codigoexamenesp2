import java.util.*;
import java.io.*;

public class Diferencias{
	public static void main(String[] args){
		FileReader fichero1 = null, fichero2 = null;
		BufferedReader lectura1 = null, lectura2 = null;
		String linea1 = new String(), linea2 = new String();
		try{
			fichero1 = new FileReader(args[0]);
			fichero2 = new FileReader(args[1]);
			lectura1 = new BufferedReader(fichero1);
			lectura2 = new BufferedReader(fichero2);
			while(linea1 != null && linea2 != null){
				linea1 = lectura1.readLine();
				linea2 = lectura2.readLine();
				if(linea1 != null && linea2 != null)
					if(!linea1.equals(linea2)) System.out.println("< " + linea1 + "\n> " + linea2);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			try{
				if(lectura1 != null) lectura1.close();
				if(lectura2 != null) lectura2.close();
				if(fichero1 != null) fichero1.close();
				if(fichero2 != null) fichero2.close();
			}
			catch(Exception e){System.out.println(e);}
		}
	}
}