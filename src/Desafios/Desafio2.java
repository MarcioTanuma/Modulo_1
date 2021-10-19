package Desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int x = 0;
        int k=0;
        int fatorial[] = new int[10];
        fatorial[0] = 1;

        System.out.println("Digite um numero: ");
        n=input.nextInt();

        for (int i = 1; i <= 9; i++) {
            fatorial[i] = i*fatorial[i-1];

        }

        for (int i = 1; i<=9; i++) {
            if (fatorial[i]>n) {
                k = i-1;
                break;
            }
        }

        for (int i = k; i >= 0; i--) {
            x += (n/fatorial[i]);
            n = n%fatorial[i];
        }

        System.out.println("A resposta é: "+x);


    }

}
