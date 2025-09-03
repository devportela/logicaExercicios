package logicaExercicios;
public class Continue{
    public static void main(String[] args) {
        int contadorMultiplos = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                contadorMultiplos++;
                if (contadorMultiplos <= 3) {
            
                    continue;
                }
            }
            System.out.println(i);
        }
    }
}