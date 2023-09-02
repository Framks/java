public class ContaPoupanca extends Conta{
     

    public ContaPoupanca(String codigo, Double saldo) {
        super(codigo, saldo);
    }

    @Override
    public Double emitirSaldo() {
        return super.saldo;
    }
    
    @Override
    public void alterarLimite( Double novoLimite) {
                
    }

    @Override
    public Boolean sacar(Double valor) {
        if(valor <= super.saldo){
            super.extrato[super.cursor] = -valor;
            super.cursor++;
            super.saldo -= valor;
            return true;
        }
        return false;
    }

}

/*
 *  . sacar vai ter que ser auterado por conta do limite que para conta poupanaça não existe
 *  . auterarLimite não vai ser necessario pois não ira ter limite
 *  . emitir saldo tera que ser auterado pois não existe limite 
 *   
 */