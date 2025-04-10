package exercicio;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a altura do objeto: ");
        double altura = scanner.nextDouble();
        
        System.out.print("Digite a largura do objeto: ");
        double largura = scanner.nextDouble();
        
        System.out.print("Digite o comprimento do objeto: ");
        double comprimento = scanner.nextDouble();
        
        double volume = altura * largura * comprimento;
        
        System.out.println("O volume do objeto é: " + volume);
        
        scanner.close();
    }
}