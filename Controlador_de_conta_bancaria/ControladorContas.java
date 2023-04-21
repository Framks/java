package Controlador_de_conta_bancaria;

public class ControladorContas {
    ContaComExtrato[] contas;

    public Boolean cadastrarNovaConta(Integer codigoConta, Double saldoInicial) {

        ContaComExtrato novo = new ContaComExtrato(codigoConta, saldoInicial);
        if (contas == null) {
            contas = new ContaComExtrato[1];
            contas[0] = novo;
            return true;
        } else {
            for (int i = 0; i < contas.length; i++) {
                if (contas[i].getCodigo() == codigoConta) {
                    return false;
                }
            }
            ContaComExtrato[] listaDeContas = new ContaComExtrato[contas.length + 1];
            for (int i = 0; i < contas.length; i++) {
                listaDeContas[i] = contas[i];
            }
            listaDeContas[contas.length] = novo;
            contas = listaDeContas;
            return true;
        }

    }

    public Boolean realizarSaque(Integer codigoConta, Double valor) {
        if (codigoConta > 0 && valor > 0) {
            ContaComExtrato conta = buscarConta(codigoConta);
            if (conta != null) {
                return conta.sacar(valor);
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    public Boolean realizarDeposito(Integer codigoConta, Double valor) {
        if (codigoConta > 0 && valor > 0) {
            ContaComExtrato conta = buscarConta(codigoConta);
            if (conta != null) {
                conta.depositar(valor);
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    public Boolean realizarTransferencia(Integer contaOrigem, Integer contaDestino, Double valor) {
        if (contaDestino > 0 && contaOrigem > 0 && valor > 0) {
            ContaComExtrato origem = buscarConta(contaOrigem), destino = buscarConta(contaDestino);
            if (origem == null || destino == null) {
                return false;
            } else {
                if (realizarSaque(origem.getCodigo(), valor) && realizarDeposito(destino.getCodigo(), valor)) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }

    public Double emitirSaldo(Integer codigo) {
        if (codigo > 0) {
            ContaComExtrato conta = buscarConta(codigo);
            if (conta != null) {
                return conta.emitirSaldo();
            } else {
                return -1.0;
            }
        } else {
            return 0.0;
        }

    }

    private ContaComExtrato buscarConta(Integer codigo) {
        for (int i = 0; i < contas.length; i++) {
            if (contas[i].getCodigo() == codigo) {
                return contas[i];
            }
        }
        return null;
    }
}