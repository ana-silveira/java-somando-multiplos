/*
Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.
Entrada: Deverá ser composta pelo valor A na primeira linha, seguido do valor N na segunda.
Saída: Deverá retornar o valor da soma de todos os múltiplos A até o seu limite N.
 */


import java.util.Scanner;

public class SomandoMultiplos  {
    public static void main(String[] args) {
        int A, N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        int soma = 0;
        int num = A;

        for ( int i = 0; A + i <= N; i++) {
            if (num % A == 0) soma += num ;
            num++;
        }
        System.out.println(soma);
    }
}