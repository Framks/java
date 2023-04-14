public class Runner {

    public static void main(final String[] args) {

        CartaoRU meuCartao = new CartaoRU("001", "123456", false);
        System.out.println("Saldo = " + meuCartao.emitirSaldo()); // 0.00

        Boolean resultado = meuCartao.fazerRefeicao();
        if (resultado) {
            System.out.println("Refeição liberada. Saldo restante = " + meuCartao.emitirSaldo());
        } else {
            System.out.println("Refeição recusada. Saldo atual = " + meuCartao.emitirSaldo());
        }

        meuCartao.recarregar(2.00);
        resultado = meuCartao.fazerRefeicao();
        if (resultado) {
            System.out.println("Refeição liberada. Saldo restante = " + meuCartao.emitirSaldo());
        } else {
            System.out.println("Refeição recusada. Saldo atual = " + meuCartao.emitirSaldo());
        }

        resultado = meuCartao.fazerRefeicao(); // apenas 0.90 de saldo
        if (resultado) {
            System.out.println("Refeição liberada. Saldo restante = " + meuCartao.emitirSaldo());
        } else {
            System.out.println("Refeição recusada. Saldo atual = " + meuCartao.emitirSaldo());
        }

        CartaoRU meuCartao2 = new CartaoRU("002", "654321", true);
        System.out.println("Saldo = " + meuCartao.emitirSaldo()); // 0.00

        resultado = meuCartao2.fazerRefeicao();
        if (resultado) {
            System.out.println("Refeição liberada. Saldo atual = " + meuCartao2.emitirSaldo());
        } else {
            System.out.println("Refeição recusada. Saldo atual = " + meuCartao2.emitirSaldo());
        }

        meuCartao2.alterarIsencao(false);
        resultado = meuCartao2.fazerRefeicao();
        if (resultado) {
            System.out.println("Refeição liberada. Saldo atual = " + meuCartao2.emitirSaldo());
        } else {
            System.out.println("Refeição recusada. Saldo atual = " + meuCartao2.emitirSaldo());
        }

    }
}