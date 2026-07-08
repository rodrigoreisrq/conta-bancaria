package ExerciciosProprios.src.src.test;

import ExerciciosProprios.src.src.domain.ContaBancaria;
import ExerciciosProprios.src.src.menu.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Rodrigo");
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        while(true){
            menu.mostrar();
            int opcao = input.nextInt();
            switch(opcao){
                case 1:
                    conta.exibirSaldo();
                    break;
                case 2:
                    System.out.println("Digite o valor do saque: ");
                    double saque = input.nextDouble();
                    conta.sacar(saque);
                    break;
                case 3:
                    System.out.println("Digite o valor do depósito: ");
                    double deposito = input.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 0:
                    System.out.println("Fechando app...");
                    break;
            }
        if(opcao == 0){
            break;
        }
        }

    }
}
