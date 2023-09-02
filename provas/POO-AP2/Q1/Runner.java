public class Runner {
    public static void main(String[] args) {

        /**
         * GerenciamentoFolha
         * addFuncionarioClt(nome, cpf, salario);
         * addFuncionariopj(nome, cpf, cnpj, salario);
         * extrato() : Double
         * valorTotal() : Double
         * totalValerefeicao() : Double
         * totalAuxilioSaude() : Double
         * totalBeneficios() : Double
         */

        GerenciamentoFolha gerenciamentoFolha = new GerenciamentoFolha();
        gerenciamentoFolha.addFuncionariopj("Francisco", "111.111.111-11", "01.123.123/0001-21", 2020.50);
        gerenciamentoFolha.addFuncionarioClt("Francisco", "111.111.111-11", 2020.50);
        gerenciamentoFolha.addFuncionarioClt("chico", "221.122.121-11", 0.50);
        gerenciamentoFolha.addFuncionariopj("chica", "654.987.321.65", "01.123.123/1001-21", 10.50);
        System.out.println(gerenciamentoFolha.extrato());
        System.out.println("valor total de beneficios: " + gerenciamentoFolha.totalBeneficios());
        System.out.println("valor total da folha" + gerenciamentoFolha.valorTotal());
        System.out.println("valor total de refeições: " + gerenciamentoFolha.totalValerefeicao());
        System.out.println("valor total de auxilio de saude: " + gerenciamentoFolha.totalAuxilioSaude());

    }
}