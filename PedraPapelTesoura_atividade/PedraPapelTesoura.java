import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {

    static final int PEDRA = 0;
    static final int PAPEL = 1;
    static final int TESOURA = 2;

    static public void main(String[] args) {
        System.out.println("Vamos jogar Pedra, Papel, Tesoura!");
        int jogadaUsuario = recebeJogadaUsuario();
        int jogadaCpu = geraJogadaCpu();
        int resultado = executaJogada(jogadaUsuario, jogadaCpu);
        exibeResultado(jogadaUsuario, jogadaCpu, resultado);
    }

    static public int recebeJogadaUsuario() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }

    static public int geraJogadaCpu() {
        Random rnd = new Random();
        long semente = System.currentTimeMillis();
        rnd.setSeed(semente);
        return rnd.nextInt(3); // retorna aleatorio entre 0 e 2
    }

    static public int executaJogada(int jogadaUsuario, int jogadaCpu) {
        int result;
        if (jogadaUsuario == jogadaCpu) {
            result = 0;
        } else if (((jogadaUsuario == TESOURA) && (jogadaCpu == PAPEL)) ||
                ((jogadaUsuario == PAPEL) && (jogadaCpu == PEDRA)) ||
                ((jogadaUsuario == PEDRA) && (jogadaCpu == TESOURA))) {
            result = 1;
        } else {
            result = 2;
        }
        return result;
    }

    static public void exibeResultado(int jogadaUsuario, int jogadaCpu, int resultado) {
        if (resultado != 0) {
            System.out.print("You: ");
            switch (jogadaUsuario) {
                case 0:
                    System.out.print("pedra");
                    break;
                case 1:
                    System.out.print("papel");
                    break;
                case 2:
                    System.out.print("tesoura");
                    break;
            }
            System.out.print(" X ");
            switch (jogadaCpu) {
                case 0:
                    System.out.print("pedra");
                    break;
                case 1:
                    System.out.print("papel");
                    break;
                case 2:
                    System.out.print("tesoura");
                    break;
            }
            System.out.println(" Cpu");
            System.out.print("Win: ");
            switch (resultado) {
                case 1:
                    System.out.print("YOU");
                    break;
                case 2:
                    System.out.print("CPU");
                    break;
            }
        } else {
            System.out.println("Empate");
        }
    }
}