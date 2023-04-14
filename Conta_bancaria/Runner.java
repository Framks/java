
public class Runner {

    public static void main(final String[] args) {

        Conta minhaConta = new Conta(1001, 200.0);
        System.out.println(minhaConta.emitirSaldo()); // Conta{numero=1001, saldo=200.0, limite=100.0}

        minhaConta.sacar(200);
        System.out.println(minhaConta.emitirSaldo()); // Conta{numero=1001, saldo=0.0, limite=100.0}

        if (minhaConta.sacar(101.0)) {
            System.out.println("Saque autorizado"); // Saldo suficiente
        } else {
            System.out.println("Saque não autorizado"); // Saldo insuficiente
        }

        minhaConta.depositar(500.0);
        System.out.println(minhaConta.emitirSaldo()); // Conta{numero=1001, saldo=500.0, limite=100.0}

        if (minhaConta.sacar(150.0)) {
            System.out.println("Saque autorizado"); // Saldo suficiente Conta{numero=1001, saldo=350.0, limite=100.0}
        } else {
            System.out.println("Saque não autorizado"); // Saldo insuficiente
        }

        minhaConta.alterarLimite(50.0);
        System.out.println(minhaConta.emitirSaldo()); // Conta{numero=1001, saldo=350.0, limite=50.0}

        if (minhaConta.sacar(400.50)) {
            System.out.println("Saque autorizado"); // Saldo suficiente
        } else {
            System.out.println("Saque não autorizado"); // Saldo insuficiente Conta{numero=1001, saldo=350.0,
                                                        // limite=50.0}
        }

        minhaConta.depositar(50);
        System.out.println(minhaConta.emitirSaldo()); // Conta{numero=1001, saldo=400.0, limite=50.0}

    }
}