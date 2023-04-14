public class Runner {

    public static void main(final String[] args) {

        ContaComExtrato minhaConta = new ContaComExtrato(1001, 200.0);
        System.out.println("saldo esperado = 300, atual = " + minhaConta.emitirSaldo());

        minhaConta.sacar(250.0);
        System.out.println("saldo esperado = 50, atual = " + minhaConta.emitirSaldo());

        if (minhaConta.sacar(51.0)) {
            System.out.println("erro = Saque autorizado");
        } else {
            System.out.println("esperado = Saque nao autorizado");
        }

        minhaConta.depositar(500.0);
        System.out.println("saldo esperado = 550, atual = " + minhaConta.emitirSaldo());

        if (minhaConta.sacar(150.0)) {
            System.out.println("esperado = Saque autorizado");
        } else {
            System.out.println("erro = Saque nao autorizado");
        }

        minhaConta.alterarLimite(50.0);
        System.out.println("saldo esperado = 350, atual = " + minhaConta.emitirSaldo());

        if (minhaConta.sacar(400.50)) {
            System.out.println("erro = Saque autorizado");
        } else {
            System.out.println("esperado = Saque nao autorizado");
        }

        minhaConta.depositar(50.0);
        System.out.println("saldo esperado = 400, atual = " + minhaConta.emitirSaldo());

        Double[] extrato = minhaConta.emitirExtrato();
        if (!extrato[0].equals(200.0)) {
            System.out.println("erro - linha 0 do extrato deveria ser 200.0 ao inves de " + extrato[0]);
        }
        if (!extrato[1].equals(-250.0)) {
            System.out.println("erro - linha 1 do extrato deveria ser -250.0 ao inves de " + extrato[1]);
        }
        if (!extrato[2].equals(500.0)) {
            System.out.println("erro - linha 2 do extrato deveria ser 500.0 ao inves de " + extrato[2]);
        }
        if (!extrato[3].equals(-150.0)) {
            System.out.println("erro - linha 3 do extrato deveria ser -150.0 ao inves de " + extrato[3]);
        }
        if (!extrato[4].equals(50.0)) {
            System.out.println("erro - linha 4 do extrato deveria ser 50.0 ao inves de " + extrato[4]);
        }

    }
}