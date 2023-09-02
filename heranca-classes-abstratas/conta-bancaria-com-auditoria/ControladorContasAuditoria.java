public class ControladorContasAuditoria extends ControladorContas{

    @Override
    public Boolean realizarDeposito(String codigo, Double valor) {
        if (super.realizarDeposito(codigo, valor)) {
            System.out.println("Foi depositado: "+valor+ "na conta : "+codigo);
            return true;
        }
        System.out.println("não foi posivel depositar na conta: "+codigo);
        return false;
    }

    @Override
    public Boolean realizarSaque(String codigo, Double valor) {
        if (super.realizarSaque(codigo, valor)) {
            System.out.println("foi realizado um saque de: "+valor+". da conta: "+codigo);
            return true;
        }
        System.out.println("não foi posivel realizar o saque na conta: "+codigo);
        return false;
    }

    @Override
    public Boolean realizarTransferencia(String contaOrigem, String contaDestino, Double valor) {
        if (super.realizarTransferencia(contaOrigem, contaDestino, valor)) {
            System.out.println("foi realizado uma transferencia da conta: "+contaOrigem+" para a "+contaDestino+" no valor de "+valor);
            return true;
        }
        System.out.println("não foi posivel realizar a transferencia entre as contas "+contaOrigem+" e "+contaDestino);
        return false;
    }
}