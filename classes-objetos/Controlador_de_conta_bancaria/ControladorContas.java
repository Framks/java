package Controlador_de_conta_bancaria;
/*
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
*/

public class ControladorContas {

    private ContaComExtrato[] contas;
    private Integer cursor;
  
    public ControladorContas() {
      this.contas = new ContaComExtrato[20];
      this.cursor = 0;
    }
  
    public Boolean cadastrarConta(String codigo, Double saldoInicial) {
      if (buscarConta(codigo) == null) {
        this.contas[cursor] = new ContaComExtrato(codigo, saldoInicial);
        this.cursor++;
        return true;
      }
      return false;
    }
  
    public Boolean realizarSaque(String codigo, Double valor) {
      ContaComExtrato contaOrigem = buscarConta(codigo);
      if (contaOrigem != null) {
        return contaOrigem.sacar(valor); // retorno o resultado do saque
      }
      return false;
    }
  
    public Boolean realizarDeposito(String codigo, Double valor) {
      ContaComExtrato contaDestino = buscarConta(codigo);
      if (contaDestino != null) {
        contaDestino.depositar(valor);
        return true;
      }
      return false;
    }
  
    public Boolean realizarTransferencia(String codigoOrigem, String codigoDestino, Double valor) {
      ContaComExtrato contaOrigem = buscarConta(codigoOrigem);
      ContaComExtrato contaDestino = buscarConta(codigoDestino);
      // verifica se ambas contas foram achadas
      if (contaOrigem != null && contaDestino != null) {
        //verifica se saque deu certo
        if(contaOrigem.sacar(valor)){
          //se saque deu certo, entao deposita no destino
          contaDestino.depositar(valor);
          return true;
        } else {
          return false;
        }
      }
      return false;
    }
  
    public Double emitirSaldo(String codigo) {
      ContaComExtrato contaDestino = buscarConta(codigo);
      if (contaDestino != null) {
          return contaDestino.emitirSaldo();
      }
      return -1.0;
    }
  
    private ContaComExtrato buscarConta(String codigoBuscado) {
      ContaComExtrato contaAchada = null;
      for (int i = 0; i < this.cursor; i++) {
        if (this.contas[i].getCodigo() == codigoBuscado) {
          contaAchada = this.contas[i];
          break;
        }
      }
      return contaAchada;
    }
  }