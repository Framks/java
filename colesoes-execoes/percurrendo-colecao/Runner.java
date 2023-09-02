import java.util.List;
import java.util.ArrayList;

public class Runner {

    public static void main(final String[] args) {

        List<Conta> contas = new ArrayList<Conta>();

        contas.add(new ContaCorrente("1111",100.0));
        contas.add(new ContaPoupanca("2222",200.0)); 
        contas.add(new ContaCorrente("3333",300.0));
        contas.add(new ContaPoupanca("4444",400.0)); 
        contas.add(new ContaCorrente("5555",500.0));
        contas.add(new ContaPoupanca("6666",600.0)); 

        // sua solução começa aqui ...
        int saldo_contacorrente = 0;
        int saldo_contapoupanca = 0;
        int quant = 0;
        for (Conta c : contas) {
            if(c instanceof ContaCorrente){
                saldo_contacorrente += c.emitirSaldo();
            }
            else if(c instanceof ContaPoupanca){
                saldo_contapoupanca += c.emitirSaldo();
                quant++;
            }
        }
        System.out.println("saldo conta corrente: " + saldo_contacorrente);
        System.out.println("saldo Medio conta poupanca: " + saldo_contapoupanca/quant);
    }
}