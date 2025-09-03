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
                int respostaSubCategoria1 = sc.nextInt();
                switch (resposta) {
                    case 1:
                        System.out.println("calcular soma");
                        break;

                    case 2:
                        System.out.println("calcular divisão");
                        break;

                }
                break;

            case 2:
                System.out.println("categoria selecionada : ciencias");
                System.out.println("selecione a sub categoria abaixo:");
                int respostaSubCategoria2 = sc.nextInt();
                switch (respostaSubCategoria2) {
                    case 1:
                        System.out.println("ver plantas");
                        break;

                    case 2:
                        System.out.println("ver experimentos");
                        break;
                }
                break;x''


        }
        break;


    }


}

