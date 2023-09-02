//import java.util.*;
import java.util.ArrayList;
import java.util.List;

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

    //private Conta[] contas;
    private List<Conta> contas;
    //rivate Integer cursor;
  
    public ControladorContas() {
      //this.contas = new ContaCorrente[20];
      //this.cursor = 0;
      this.contas = new ArrayList<Conta>();
    }
  
    public Boolean cadastrarContaCorrente(String codigo, Double saldoInicial) {
        if (buscarConta(codigo) == null) {
          this.contas.add(new ContaCorrente(codigo, saldoInicial));
          //this.cursor++;
          return true;
        }
        return false;
      }
      public Boolean cadastrarContaPoupanca(String codigo, Double saldoInicial) {
        if (buscarConta(codigo) == null) {
          this.contas.add(new ContaPoupanca(codigo, saldoInicial));
          //this.cursor++;
          return true;
        }
        return false;
      }
    public Boolean realizarSaque(String codigo, Double valor) {
      Conta contaOrigem = buscarConta(codigo);
      if (contaOrigem != null) {
        return contaOrigem.sacar(valor); // retorno o resultado do saque
      }
      return false;
    }
  
    public Boolean realizarDeposito(String codigo, Double valor) {
      Conta contaDestino = buscarConta(codigo);
      if (contaDestino != null) {
        contaDestino.depositar(valor);
        return true;
      }
      return false;
    }
  
    public Boolean realizarTransferencia(String codigoOrigem, String codigoDestino, Double valor) {
      Conta contaOrigem = buscarConta(codigoOrigem);
      Conta contaDestino = buscarConta(codigoDestino);
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
      Conta contaDestino = buscarConta(codigo);
      if (contaDestino != null) {
          return contaDestino.emitirSaldo();
      }
      return -1.0;
    }
  
    private Conta buscarConta(String codigoBuscado) {
      Conta contaAchada = null;
      /*for (int i = 0; i < this.cursor; i++) {
        if (this.contas[i].getCodigo() == codigoBuscado) {
          contaAchada = this.contas[i];
          break;
        }
      }*/
      for(Conta c : this.contas){
        if(c.getCodigo().equals(codigoBuscado)){
          contaAchada = c;
          break;
        }
      }
      return contaAchada;
    }
  }