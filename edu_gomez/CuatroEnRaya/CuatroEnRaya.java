//incompleto
public class CuatroEnRaya{

    private Ficha[][] tablero;

    public CuatroEnRaya(int fil, int col){
        int fila = 8;
        int colum = 6;
        if(fil > 0){
            fila = fil;
        }
        if(col > 0){
            colum = col;
        }
        tablero = new Ficha[fila][colum];
    }
    public void iniciaTablero(){
        for(int i=0 ; i<tablero.length ; i++){
            for(int j=0 ; j<tablero[i].length ; i++){
                if(tablero[i][j] != null){
                    tablero[i][j] = null;
                }
            }
        }
    }
    public void impTablero(){
        for(int i=0 ; i<tablero.length ; i++){
            for(int j=0 ; j<tablero[i].length ; j++){
                if(tablero[i][j]==null){
                    System.out.print("0 ");
                }
                else if(tablero[i][j].getColor().equals("rojo")){
                    System.out.print("r ");
                }
                else if(tablero[i][j].getColor().equals("amarillo")){
                    System.out.print("a ");
                }
            }
            System.out.println();
        }
    }
    public boolean comprobar(String cad){
        boolean res = false;
        int contFila = 0;
        int contColu = 0;
        for(int i=0 ; i<tablero.length ; i++){
            for(int j=0 ; j<tablero[i].length ; j++){
                if(tablero[i][j]!=null && tablero[i][j].getColor().equals(cad)){
                    contFila++;
                }
                if(tablero[j][i]!=null && tablero[j][i].getColor().equals(cad)){
                    contColu++;
                } 
            }
            if(contFila!=4){
                contFila=0;
            }
            // if(contColu!=4){
            //     contColu=0;
            // }
        }
        if(contFila==4 || contColu==4){
            res = true;
        }
        return res;
    }

    public boolean ponFicha(Ficha f, int col) throws PartidaGanada{
        boolean res = false;
        if(f !=null && f.getColor() != null &&
            col >= 0 && col < tablero[0].length){
            for(int i=tablero.length-1 ; i >= 0 ; i--){
                if(tablero[i][col] == null){
                    tablero[i][col] = f;
                    res = true;
                    break;
                }
            }
            if(comprobar("rojo") || comprobar("amarillo")){
                throw new PartidaGanada(f);
            }
        }
        return res;
    }


}

