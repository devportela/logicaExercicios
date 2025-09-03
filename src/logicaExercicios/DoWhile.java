package logicaExercicios;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respUser = 0;

        do{
            System.out.println("digite um numero:");
            respUser = sc.nextInt();

        }while(respUser  > 0);
        sc.close();
        System.out.println("saindo do codigo.....");



       




    }
    
}
