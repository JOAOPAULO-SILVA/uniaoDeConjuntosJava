public class Uniao {
    public void Unir(int[] conjuntoA, int[] conjuntoB, int[] conjuntoR){
        int indice = 0;
        for (int i = 0; i<conjuntoA.length-1;i++){
            conjuntoR[indice]=conjuntoA[i];
            indice++;
        }
        for (int i = 0; i<conjuntoB.length-1;i++){
            conjuntoR[indice]=conjuntoA[i];
            indice++;
        }
    }
}
