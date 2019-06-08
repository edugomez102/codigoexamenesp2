import java.io.*;
import java.util.ArrayList;

public class Aplicacion{
	public static void main(String[] args){
		FileReader lector = null;
		BufferedReader br = null;
		String leida = null;
		String[] sep = null;
		Empleado emp = null;

		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		try{
			lector = new FileReader(args[0]);
			br = new BufferedReader(lector);

			do{
				leida = br.readLine();
				if(leida!=null){
					sep = leida.split("&");
					String cad1= null;
					String cad2= null;
					int num1=0;
					double num2=0;
					if(sep[0]!=null){
						cad1 = sep[0];
					}
					if(sep[1]!=null){
						num1 = Integer.parseInt(sep[1]);
					}
					if(sep[2]!=null){
						cad2 = sep[2];
					}
					if(sep[3]!=null){
						num2 = Integer.parseInt( sep[3]);
					}
					emp = new Empleado(cad1,cad2,num1,num2);
					empleados.add(emp);
				}
			}while(leida!=null);
			System.out.println("Empleados totales: "+empleados.size());
			for(int i=0 ; i<empleados.size() ; i++){
				empleados.get(i).imprime();
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}	
}