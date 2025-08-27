package logicaExercicios;

import java.util.Scanner;

public class IfSimples {
    public static void main(String[] args) {
        System.out.println("digite um numero");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        if (numero >= 1) {
            System.out.println("numero positivo");

        } else {
            System.out.println("numero negativos");
        }


    }
}
