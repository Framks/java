public class CartaoRU {
    String idCartao;
    String siapeDiscente;
    Boolean isencao;
    Double saldo;

    // construct
    //
    public CartaoRU(String id, String sia, Boolean isen) {
        setIdCartao(id);
        setIsencao(isen);
        setSiapeDiscente(sia);
        setSaldo(0.00);
    }

    // methods
    //
    public void recarregar(Double valor) {
        if (valor > 0) {
            Double valor_atual = getSaldo();
            valor_atual = (valor_atual + valor);
            setSaldo(valor_atual);
        }
    }

    public Boolean fazerRefeicao() {
        if (getIsencao()) {
            return true;
        } else if (getSaldo() >= 1.1) {
            setSaldo((getSaldo() - 1.1));
            return true;
        } else {
            return false;
        }
    }

    public Double emitirSaldo() {
        return getSaldo();
    }

    public void alterarIsencao(Boolean isencao) {
        setIsencao(isencao);
    }

    // gets
    //
    public String getIdCartao() {
        return idCartao;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Boolean getIsencao() {
        return isencao;
    }

    public String getSiapeDiscente() {
        return siapeDiscente;
    }

    // sets
    //
    public void setIdCartao(String idCartao) {
        this.idCartao = idCartao;
    }

    public void setIsencao(Boolean isencao) {
        this.isencao = isencao;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setSiapeDiscente(String siapeDiscente) {
        this.siapeDiscente = siapeDiscente;
    }
}