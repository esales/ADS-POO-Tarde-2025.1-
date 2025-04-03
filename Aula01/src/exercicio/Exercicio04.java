package exercicio;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o raio da circunferência: ");
        double raio = scanner.nextDouble();
        
        double area = Math.PI * Math.pow(raio, 2);
//        double area = 3.14 * raio * raio;
        
        System.out.println("A área da circunferência é: " + area);
    }
}




