package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        System.out.println("Digite a quanto ele sera elevado: ");
        int fat = sc.nextInt();

        sc.close();
        
        int result = Fatoracao.fatoracao(num, fat);
        System.out.println("Resultado da fatoracao: " + result);
    }
}