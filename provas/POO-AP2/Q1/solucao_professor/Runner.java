public class Runner {
    public void main(String[] args) {
        FolhaSalarial folha = new FolhaSalarial();
        // cadastrar funcionarios
        folha.cadastrarFuncionarioCLT("Joao","123456789",1320.0);
        folha.cadastrarFuncionariopj("Maria","987654321", "321.152/0001-00",2000.0);
        folha.cadastrarFuncionarioCLT("Pedro","987654321",200.0);
        folha.cadastrarFuncionariopj("Pietro","987774321","321.152/0001-00" ,1318.90);
        
        System.out.println("esperado 2500.0, obtido:"+folha.getSalarioTotal("Maria"));
        
        System.out.println("esperado 1899.2, obtido:"+folha.getSalarioTotal("Joao"));

        System.out.println("esperado: \n"
                            + "Joao, 123456789, 1320.0, 79.20, 500.00\n"
                            + "Maria, 987654321, 2000.0, 0.0,  500.00\n"
                            + "Pietro, 987774321, 200.0, 0.0,  500.00\n"
                            + folha.getExtratoGeral());
        
        System.out.println("esperado: " + folha.getValorTotal());
        
        System.out.println("esperado: 1579,2 obtido:" + folha.getValorBeneficioTotal());
    }
}
