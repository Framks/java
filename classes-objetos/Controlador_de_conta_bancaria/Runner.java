package Controlador_de_conta_bancaria;
/*
public class Runner {

    public static void main(final String[] args) {

        ControladorContas controlador = new ControladorContas();

        controlador.cadastrarNovaConta(1111, 100.0);
        controlador.cadastrarNovaConta(2222, 200.0);
        controlador.cadastrarNovaConta(3333, 300.0);
        controlador.cadastrarNovaConta(4444, 400.0);
        controlador.cadastrarNovaConta(5555, 500.0);
        controlador.cadastrarNovaConta(6666, 600.0);

        if (controlador.cadastrarNovaConta(6666, 600.0) == true) {
            System.out.println("01 ERRO - permitiu cadastrar codigo duplicado");
        } else {
            System.out.println("01 OK - nao permitiu cadastrar com codigo duplicado");
        }

        if (controlador.realizarSaque(4444, 500.0) == true) {
            System.out.println("02 OK");
        } else {
            System.out.println("02 ERRO - saque deveria ser autorizado");
        }

        if (controlador.realizarDeposito(3333, 50.0) == true) {
            System.out.println("03 OK");
        } else {
            System.out.println("03 ERRO - deposito deveria ser autorizado");
        }

        if (controlador.realizarSaque(7777, 500.0) == true) {
            System.out.println("04 ERRO - saque autorizado para conta nao existente");
        } else {
            System.out.println("04 OK - saque nao autorizado");
        }

        if (controlador.realizarTransferencia(1111, 2222, 40.0) == true) {
            System.out.println("05 OK");
        } else {
            System.out.println("05 ERRO - transferencia deveria ser autorizada");
        }

        // checando se os saldo estao corretos
        System.out.println("06 esperado 160.0, atual = " + controlador.emitirSaldo(1111));
        System.out.println("07 esperado 340.0, atual = " + controlador.emitirSaldo(2222));
        System.out.println("08 esperado 450.0, atual = " + controlador.emitirSaldo(3333));
        System.out.println("09 esperado 0.0, atual = " + controlador.emitirSaldo(4444));
        System.out.println("10 esperado 600.0, atual = " + controlador.emitirSaldo(5555));
        System.out.println("11 esperado 700.0, atual = " + controlador.emitirSaldo(6666));
        System.out.println("12 esperado -1.0, atual = " + controlador.emitirSaldo(9999));

    }
}
*/

public class Runner {

    public static void main(final String[] args) {

        ControladorContas controlador = new ControladorContas();

        controlador.cadastrarConta("1111",100.0);
        controlador.cadastrarConta("2222",200.0);
        controlador.cadastrarConta("3333",300.0);
        controlador.cadastrarConta("4444",400.0);
        controlador.cadastrarConta("5555",500.0);
        controlador.cadastrarConta("6666",600.0);

        if (controlador.cadastrarConta("6666",600.0) == true){
          System.out.println("01 ERRO - permitiu cadastrar codigo duplicado");
        } else {
          System.out.println("01 OK - nao permitiu cadastrar com codigo duplicado");
        }

        if (controlador.realizarSaque("4444",500.0) == true){
          System.out.println("02 OK");
        } else {
          System.out.println("02 ERRO - saque deveria ser autorizado");
        }

        if (controlador.realizarDeposito("3333",50.0) == true){
          System.out.println("03 OK");
        } else {
          System.out.println("03 ERRO - deposito deveria ser autorizado");
        }

        if (controlador.realizarSaque("7777",500.0) == true){
          System.out.println("04 ERRO - saque autorizado para conta nao existente");
        } else {
          System.out.println("04 OK - saque nao autorizado");
        }

        if (controlador.realizarTransferencia("1111","2222",40.0) == true){
          System.out.println("05 OK");
        } else {
          System.out.println("05 ERRO - transferencia deveria ser autorizada");
        }

        // checando se os saldo estao corretos
        System.out.println("06 esperado 160.0, atual = " + controlador.emitirSaldo("1111"));
        System.out.println("07 esperado 340.0, atual = " + controlador.emitirSaldo("2222"));
        System.out.println("08 esperado 450.0, atual = " + controlador.emitirSaldo("3333"));
        System.out.println("09 esperado 0.0, atual = " + controlador.emitirSaldo("4444"));
        System.out.println("10 esperado 600.0, atual = " + controlador.emitirSaldo("5555"));
        System.out.println("11 esperado 700.0, atual = " + controlador.emitirSaldo("6666"));
        System.out.println("12 esperado -1.0, atual = " + controlador.emitirSaldo("9999"));

    }
}