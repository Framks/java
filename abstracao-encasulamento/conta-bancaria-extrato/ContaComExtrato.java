
/*
public class ContaComExtrato {
    public int codigo;
    public double saldo;
    public double limite;
    public Double[] extrato;

    // construct
    //
    public ContaComExtrato(int numero, double saldo) {
        setSaldo(saldo);
        setCodigo(numero);
        setLimite(100.0);
        Double[] extrato = new Double[1];
        extrato[0] = saldo;
        setExtrato(extrato);
    }

    // methods
    //
    public void alterarLimite(double novolimite) {
        setLimite(novolimite);
    }

    public Double emitirSaldo() {
        return getSaldo() + getLimite();
    }

    public void depositar(double valor) {
        if (valor > 0) {
            int n = getExtrato().length;
            Double[] extrato = new Double[n + 1];
            for (int i = 0; i < n; i++) {
                extrato[i] = getExtrato()[i];
            }
            extrato[n] = valor;
            setExtrato(extrato);
            setSaldo((getSaldo() + valor));
        }
    }

    public boolean sacar(double valor) {
        if ((valor <= (getSaldo() + getLimite())) && (valor > 0)) {
            int n = getExtrato().length;
            Double[] extrato = new Double[n + 1];
            for (int i = 0; i < n; i++) {
                extrato[i] = getExtrato()[i];
            }
            extrato[n] = valor * -1;
            setExtrato(extrato);
            setSaldo((getSaldo() - valor));
            return true;
        } else {
            return false;
        }
    }

    public Double[] emitirExtrato() {
        return getExtrato();
    }

    // gets
    //
    public Double[] getExtrato() {
        return extrato;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    // sets
    //
    public void setExtrato(Double[] extrato) {
        this.extrato = extrato;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
*/

public class ContaComExtrato {

    Double saldo;
    Double limite;
    Double[] extrato;
    Integer cursor; // guarda a primeira posicao livre
    String codigo;
  
    public ContaComExtrato(String codigo, Double saldoInicial) {
      this.extrato = new Double[20];
      this.cursor = 0;
      this.codigo = codigo;
      this.saldo = 0.0;
      this.depositar(saldoInicial);
      this.limite = 100.0;
    }
  
    public void depositar(Double valor) {
      this.extrato[this.cursor] = valor; // registrar deposito na posicao livre
      this.cursor++; // avancao para proxima posicao livre
      this.saldo += valor; // alterar saldo
    }
  
    public Boolean sacar(Double valor) {
      if (valor <= (saldo + limite)) {
        this.extrato[this.cursor] = -valor;
        this.cursor++;
        this.saldo -= valor;
        return true;
      }
      return false;
    }
  
    public void alterarLimite(Double novoLimite) {
      this.limite = novoLimite;
    }
  
    public Double[] emitirExtrato() {
      return this.extrato;
    }
  
    public Double emitirSaldo() {
      return this.saldo + this.limite;
    }
  
    public String getCodigo(){
      return this.codigo;
    }
  }