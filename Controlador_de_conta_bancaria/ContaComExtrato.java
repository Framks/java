package Controlador_de_conta_bancaria;

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
