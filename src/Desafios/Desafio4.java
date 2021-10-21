package Desafios;

import java.util.Scanner;

public class Desafio4 {

    public static int mdc(int a, int b){
        if(b==0) {
            return a;
        }else {
            return mdc(b, a%b);
        }
    }

    public static int mmc(int a, int b){
        return (a*b)/mdc(a, b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int cont=-1, aux, a, n, l, pos=-1, b, k=0;

        System.out.println("Digite a população: ");

        n=input.nextInt();

        System.out.println("Digite o limite: ");
        l= input.nextInt();

        System.out.println("Digite o valor de B: ");
        b= input.nextInt();

        k=b;

        for (int i=1; i< n; i++){
            System.out.println("Digite o valor de A: ");
            a=input.nextInt();
            k= mmc(k, a);
        }

        for (int i=1; i<=l;i++){
            aux=mmc(i,k);

            if (aux>cont && aux<=l){
                cont = aux;
                        pos = i;
            }
        }


        System.out.println(pos);



    }

}
