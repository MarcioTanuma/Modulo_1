package Desafios;

import java.util.Scanner;
public class Desafio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quociente, resto, resposta;
        int C,A;
        System.out.println("Digite a quantidade maxima da cabine: ");
        C=in.nextInt();
        System.out.println("Digite a quantidade de alunos: ");
        A=in.nextInt();
        quociente=A/(C-1);
        resto=A%(C-1);
        resposta=quociente;
        if (resto>0)
            resposta=resposta+1;
        System.out.println(resposta);
    }
}