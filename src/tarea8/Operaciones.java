package tarea8;

/**
 *
 * @author ivansteuerberg
 */
public class Operaciones {
    
    public static void amosar(Integer[][]array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");    
            }
    
        }
    System.out.println("");
    }

    public static Integer elementoMinimo(Integer[][]array){
        
     int minimo = array[0][0];
     
     for(int i = 0;i<array.length;i++){
        int elMinFila = array[i][0];
        for(int j= 1;j<array[i].length;j++){
            if(array[i][j]<elMinFila)
                elMinFila= array[i][j];
                
        }
        
        if(elMinFila<minimo)
            minimo = elMinFila;      
    }
    return minimo; 
        
    }
    
    
    public static Integer elementoMaximo(Integer[][]array){
        
        int maximo = array[0][0];
        
         for(int i = 0;i<array.length;i++){
        int elemMaxFila = array[i][0];
        for(int j= 1;j<array[i].length;j++){
            if(array[i][j]>elemMaxFila)
                elemMaxFila= array[i][j];
                
        }
        
        if(elemMaxFila>maximo);
            maximo = elemMaxFila;      
    }
    return maximo; 
        
        
    }
    
    
    public static void buscarObxecto(Integer[][] array, Integer valor) {
        loop: {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j]!= null) {
                        if (array[i][j].equals(valor)) {
                            System.out.println("Fila: " + i + "\nPosición: " + j);
                            break loop;
                        }
                    }
                }
            }
            System.out.println("-1");
        }
    }
    
   
    
    public static void borrarObxecto(Integer[][]array,Integer valor) {
        int contar=0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (contar==1)
                        break;
                    if (array[i][j] != null) {
                        if (array[i][j].equals(valor)) {
                            array[i][j] = null;
                            System.out.println("Atopado "+valor);
                            contar=1;
                        }
                    }
                }
            }
            if (contar==0)
            System.out.println("null");
        }
    }
    
    

