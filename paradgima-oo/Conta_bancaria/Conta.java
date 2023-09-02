public class Conta {
    public int codigo;
    public double saldo;
    public double limite;

    // construct
    //
    public Conta(int numero, double saldo) {
        setSaldo(saldo);
        setCodigo(numero);
        setLimite(100.0);
    }

    // methods
    //
    public void alterarLimite(double novolimite) {
        setLimite(novolimite);
    }

    public Double emitirSaldo() {
        return getSaldo();
    }

    public void depositar(double valor) {
        if (valor > 0) {
            setSaldo((getSaldo() + valor));
        }
    }

    public boolean sacar(double valor) {
        if ((valor <= (getSaldo() + getLimite())) && (valor > 0)) {
            setSaldo((getSaldo() - valor));
            return true;
        } else {
            return false;
        }
    }

    // gets
    //
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
