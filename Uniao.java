public class Uniao {
    public static void Unir(int[] conjuntoA, int[] conjuntoB, int[] conjuntoR){
        int indice = 0;
        for (int i = 0; i<=conjuntoA.length-1;i++){
            conjuntoR[indice]=conjuntoA[i];
            // System.out.println("item "+indice);
            indice++;
        }
        for (int itemB : conjuntoB){
            boolean repetido = false;
            for (int item : conjuntoA){
                if (item == itemB){
                    repetido = true;
                }
            }
            if (repetido == false){
                conjuntoR[indice]=itemB;
                // System.out.println("item "+indice);
                indice++;
            }
        }
    }

    public static int repetidos(int[] conjuntoA,int[] conjuntoB){
        int contador = 0 ;
        for (int itemA : conjuntoA){
            for (int itemB : conjuntoB){
                if (itemA == itemB){
                    contador++;
                }
            }
        }
        // System.out.println("contador: "+contador);
        return contador;
    }


}
