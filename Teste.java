public class Teste{
    public static void main(String[] args){
    int[] conjuntoA = {11, 4, 16, 7}, conjuntoB = {17, 4, 16, 11, 10, 7}, conjuntoR;
    int repetidos = Uniao.repetidos(conjuntoA, conjuntoB);
    conjuntoR = new int[conjuntoA.length+conjuntoB.length-repetidos];


    imprimir(conjuntoA);
    imprimir(conjuntoB);

    Uniao.Unir(conjuntoA, conjuntoB, conjuntoR);

    imprimir(conjuntoR);
    }
    public static void imprimir(int[] lista){
        for (int i =0; i<lista.length;i++){
            System.out.print(lista[i]+" ");
        }
        System.out.println("");
    }
}
