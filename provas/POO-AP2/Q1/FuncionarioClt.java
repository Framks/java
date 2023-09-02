public class FuncionarioClt extends Funcionario{
    private Double valeRefeicao;
    
    FuncionarioClt(String nomeCompleto,  String cpf,Double salario){
        super(nomeCompleto,  cpf, salario);
        this.valeRefeicao = ((salario*6)/100);
    }

    public Double getValeRefeicao() {
        return valeRefeicao;
    }

    public String extrato(){
        return super.extrato() + this.valeRefeicao;
    }


}
