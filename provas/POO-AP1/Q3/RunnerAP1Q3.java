
public class RunnerAP1Q3 {

	public static void main(final String[] args) {

        MaquinaVenda m1 = new MaquinaVenda();

        m1.adicionarEstoque("xilito", 10, 5.59);
        m1.adicionarEstoque("biscoito", 2, 4.35);
        m1.adicionarEstoque("chiclete", 2, 2.69);
        m1.adicionarEstoque("sequilho", 7, 4.50);
        m1.adicionarEstoque("chiclete", 13, 2.99);

        System.out.println("esperado = 5.59, retornado = " + m1.getPreco("xilito"));
        System.out.println("esperado = 4.35, retornado = " + m1.getPreco("biscoito"));
        System.out.println("esperado = 2.99, retornado = " + m1.getPreco("chiclete"));
        System.out.println("esperado = 4.50, retornado = " + m1.getPreco("sequilho"));

        if(!m1.vender("xilito")){
            System.out.println("erro - produto com estoque");
        }
        m1.vender("xilito");
        m1.vender("xilito");
        m1.vender("xilito");
        System.out.println("esperado = 6, retornado = " + m1.getEstoque("xilito"));

        System.out.println("esperado = 15, retornado = " + m1.getEstoque("chiclete"));

        m1.vender("biscoito");
        m1.vender("biscoito");
        if (m1.vender("biscoito")){
            System.out.println("erro - produto sem estoque");
        }


    }
}