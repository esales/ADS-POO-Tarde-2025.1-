package exercicio;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite seu primeiro nome: ");
        String nome = scanner.next();
        
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scanner.next();
        
        String nomeCompleto = nome + " " + sobrenome;
        
        System.out.println("Nome completo: " + nomeCompleto);
        
        scanner.close();
    }
}