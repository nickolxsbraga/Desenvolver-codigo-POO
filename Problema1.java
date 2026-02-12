package problema1;

import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {
                                int convidados, cadeirasAdc;

                                Scanner entrada = new Scanner(System.in);

            System.out.println("\nOlá, seja bem-vindo ao sistema!\n");
            System.out.println("Quantos convidados terão no seu evento?:");
            convidados = entrada.nextInt();

                    if (convidados > 0 && convidados <= 150) {
             System.out.println("Use o auditório Alfa!");
        }           else if (convidados > 150 && convidados <= 220) {
            cadeirasAdc = convidados - 150;
            System.out.println("Use o auditório Alfa e inclua mais " + cadeirasAdc + " cadeiras!");
        }           else if (convidados > 220 && convidados <= 350) {
            System.out.println("Use o auditório Beta!");
        }           else {
            System.out.println("\nNúmero de convidados inválido.");
        }

           System.out.println("\nFim do programa.\n");
    }
}
