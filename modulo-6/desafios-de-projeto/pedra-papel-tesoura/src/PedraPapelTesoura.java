import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int jogadaJogador = leitor.nextInt();
        int jogadaInimigo = leitor.nextInt();

        if (jogadaJogador == 1 && jogadaInimigo == 1 || jogadaJogador == 2 && jogadaInimigo == 2
            || jogadaJogador == 3 && jogadaInimigo == 3) {
            System.out.println("Empatou");
        } else if (jogadaJogador == 1 && jogadaInimigo == 2
            || jogadaJogador == 2 && jogadaInimigo == 3) {
            System.out.println("Perdeu");
        } else
            System.out.println("Ganhou");
    }
}