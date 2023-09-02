
public class RunnerAP1Q2 {

	public static void main(final String[] args) {

        Inventario i1 = new Inventario();

        BemMovel b1 = new BemMovel("123","Computador", 1200.00);
        BemMovel b2 = new BemMovel("456","Impressora", 700.00);
        BemMovel b3 = new BemMovel("789","Mesa de escritorio", 600.00);
        BemMovel b4 = new BemMovel("123","Scanner", 300.00);

        i1.adicionar(b1);
        i1.adicionar(b2);
        i1.adicionar(b3);
        if(i1.adicionar(b4)){
            System.out.println("erro - ja existe bem com mesmo identificador");
        }

        System.out.println("esperado = 2500.0, retornado = " + i1.getTotalBens());
        System.out.println("esperado = Impressora, retornado = " + i1.getDescricaoDoBem("456"));
        System.out.println("esperado = 600.0, retornado = " + i1.getValorDoBem("789"));
        System.out.println("esperado = nao existe, retornado = " + i1.getDescricaoDoBem("444"));

    }
}