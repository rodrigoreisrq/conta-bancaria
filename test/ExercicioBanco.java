package ExerciciosProprios.src.src.test;

import ExerciciosProprios.src.src.domain.ContaBancaria;
import ExerciciosProprios.src.src.menu.Menu;

import java.util.Scanner;

public class ExercicioBanco {
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
            }
        }
//

    }
}
