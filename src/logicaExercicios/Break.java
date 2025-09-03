package logicaExercicios;

import java.util.Scanner;

public class Break {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    while (true) {
        System.out.print("Digite um número (7 para parar): ");
        int num = sc.nextInt();

        if (num == 7) {
            System.out.println("Número 7 digitado,saindo do sistema..... ");
            break;
        }

        System.out.println("Você digitou: " + num);
    }


}    
}
