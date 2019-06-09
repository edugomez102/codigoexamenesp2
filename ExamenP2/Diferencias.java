public class Diferencias{

	FileReader fr1 = null;
	FileReader fr2 = null;
	BufferedReader br1 = null;
	BufferedReader br2 = null; 

	private static void main(String []args){
		if(args.lenght>=2){
			try{
				fr1 = new FileReader(args[0]);
				fr2 = new FileReader(args[1]);
				br1 = new BufferedReader(fr1);
				br2 = new BufferedReader(fr2);
				String aux1 = null;
				String aux2 = null;
				do{
					aux1 = br1.readLine();
					aux2 = br2.readLine();
					if(args[2].equals("-i")){
						if(aux1.equalsIgnoreCase(aux2)){

						}else{
							System.out.println("< "+aux1);
							System.out.println("> "+aux2);
						}
					}else{
						if(aux1.equals(aux2)){

						}else{
							System.out.println("< "+aux1);
							System.out.println("> "+aux2);
						}
					}
				}while(true &&(aux1!=null && aux2!=null))

			}catch(IOException e){
				e.printStackMessage();
			}

			finally{
				try{
				if(fr1!=null && br1 !=null){
					br1.close();
					fr1.close();
				}
				if(fr2!=null && br2 !=null){
					br2.close();
					fr2.close();
				}
			}catch(IOException e){
				e.printStackMessage();
			}
			}
		}
	}
}
