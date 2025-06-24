public class Teste{
    public static void main(String[] args){
    int[] conjuntoA = {11, 13, 45, 7}, conjuntoB = {24, 4, 16, 81, 10, 12}, conjuntoR;
    Uniao teste = new Uniao();
    conjuntoR = new int[10];
    System.out.println(conjuntoA);
    System.out.println(conjuntoB);
    teste.Unir(conjuntoA, conjuntoB, conjuntoR);
    System.out.println(conjuntoR);
    }
}
