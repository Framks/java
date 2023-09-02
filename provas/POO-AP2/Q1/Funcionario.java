abstract class Funcionario{
    private String nomeCompleto;
    private Double salario;
    private Double auxilioSaude;
    private String cpf;

    Funcionario(String nomeCompleto,  String cpf, Double salario){
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.salario = salario;
        this.auxilioSaude = 500.0;
    }

    public Double getAuxilioSaude(){
        return auxilioSaude;
    }

    public Double getSalario(){
        return salario;
    }

    public String getCpf(){
        return cpf;
    }

    public String getNomeCompleto(){
        return nomeCompleto;
    }

    public String extrato(){
        String result = "";
        result += "CPF: " + this.cpf + " ";
        result += "Salario: " + this.salario + " ";
        result += "Beneficios: " + this.auxilioSaude + " ";
        return result;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }
}
