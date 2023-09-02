import java.util.ArrayList;

public class GerenciamentoFolha {
    private ArrayList<Funcionario> funcionarios;

    GerenciamentoFolha() {
        this.funcionarios = new ArrayList<>();
    }
    // criar um  funcionario pj
    public void addFuncionariopj(String nome, String cpf, String cnpj, Double salario) {
        this.funcionarios.add(new Funcionariopj(nome, cpf, cnpj, salario));
    }

    // criar um  funcionario clt
    public void addFuncionarioClt(String nome, String cpf, Double salario) {
        if(salario < 1320){
            salario = 1320.0;
        }
        this.funcionarios.add(new FuncionarioClt(nome, cpf, salario));
    }

    // gera um extrato com todos os funcionarios
    public String extrato(){
        String result = "";
        for (Funcionario funcionario : funcionarios) {
            result += funcionario.extrato() + "\n";
        }
        return result;
    }

    // retorna apenas o valor total da folha de pagamento
    public Double valorTotal(){
        Double result = 0.0;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof FuncionarioClt) {
                FuncionarioClt funcionarioClt = (FuncionarioClt) funcionario;
                result += funcionarioClt.getSalario() + funcionarioClt.getAuxilioSaude() + funcionarioClt.getValeRefeicao();
            }else{
                result += funcionario.getSalario() + funcionario.getAuxilioSaude();
            }
        }
        return result;
    }

    // retorna apenas o valor total do vale refeicao
    public Double totalValerefeicao(){
        Double result = 0.0;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof FuncionarioClt) {
                FuncionarioClt funcionarioClt = (FuncionarioClt) funcionario;
                result += funcionarioClt.getValeRefeicao();
            }
        }
        return result;
    }

    // retorna apenas o valor total do vale saude 
    public Double totalAuxilioSaude(){
        Double result = 0.0;
        for (Funcionario funcionario : funcionarios) {
            result += funcionario.getAuxilioSaude();
        }
        return result;
    }

    // retorna o valor total de beneficios pagos
    public Double totalBeneficios(){
        Double result = 0.0;
        result = totalValerefeicao() + totalAuxilioSaude();
        return result;
    }
}