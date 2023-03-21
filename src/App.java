import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] numeroUmAoDez = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int i = 0;

        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = ler.nextInt();

        System.out.println("Tabela de multiplicação de " + numero);
        while (i < numeroUmAoDez.length) {
            System.out.println(numero + " x " + numeroUmAoDez[i] + " = " + (numeroUmAoDez[i] * numero));
            i++;
        }
    }
}