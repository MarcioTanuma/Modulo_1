package Desafios;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota: ");
        int nota = input.nextInt();

        System.out.println("Digite a media: ");
        int media = input.nextInt();

        int mediaEsqecida = (2*media - nota);

        System.out.println(mediaEsqecida);
    }
}
