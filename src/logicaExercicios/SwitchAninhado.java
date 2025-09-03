package logicaExercicios;

import java.util.Scanner;

public class SwitchAninhado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU COM OPÇÔES");
        System.out.println("ESCREVA A OPÇÂO ABAIXO:");
        int resposta = sc.nextInt();
        switch (resposta) {
            case 1:
                System.out.println("categoria selecionada : matematica:");
                System.out.println("selecione a subcategoria abaixo: ");
                int respostaSubCategoria = sc.nextInt();
                switch (resposta) {
                    case 1:
                        System.out.println("calcular soma");
                        break;

                    case 2:
                        System.out.println("calcular divisão");
                        break;

                }


        }


    }


}

