public class Funcionariopj extends Funcionario{
    private String cnpj;

    Funcionariopj(String nomeCompleto,  String cpf, String cnpj, Double salario){
        super(nomeCompleto, cpf, salario);
        this.cnpj = cnpj;
    }

    public String extrato(){
        return super.extrato();
    }

    public String getCnpj(){
        return cnpj;
    }
}