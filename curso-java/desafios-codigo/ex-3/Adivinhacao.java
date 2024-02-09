import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(10);
        int numeroTentativas = 0;
        int numeroEscolhido = 0;

        while (numeroTentativas != 5) {
            System.out.println("Escolha um número entre 0 á 10");
            numeroEscolhido = scanner.nextInt();

            if (numeroEscolhido == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número com " + numeroTentativas + " tentativas!");
                break;
            }
            else {
                System.out.println("Você errou! Tente novamente");
                numeroTentativas++;
            }

            if (numeroTentativas == 5) {
                System.out.println("Você não conseguiu acertar o número com 5 tentativas! O número era: " + numeroAleatorio);
            }
        }



    }
}
