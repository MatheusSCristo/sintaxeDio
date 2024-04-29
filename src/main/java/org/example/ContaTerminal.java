package org.example;

import org.example.domain.Cliente;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        int number = sc.nextInt();
        System.out.println("Por favor, digite a Agência !");
        String agency = sc.next();
        System.out.println("Por favor, digite o nome do cliente !");
        String name = sc.next();
        System.out.println("Por favor, digite o saldo da conta !");
        Double balance = sc.nextDouble();
        sc.close();
        Cliente cliente = new Cliente(name, agency, number, balance);
        System.out.println("Olá " + cliente.getName() +
                ", obrigado por criar uma conta em nosso banco, sua agência é " +
                cliente.getAgency() +
                ",conta " + cliente.getNumber() + " e seu saldo " + cliente.getBalance() + " já está disponível para saque!");

    }
}