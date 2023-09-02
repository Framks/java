package venda_simples;

public class Runner {

        public static void main(final String[] args) {

                ItemDeVenda item1 = new ItemDeVenda("101010", "Suco de uva", 2.0, "UN", 3.99);
                System.out.println("esperado = 7.98, atual = " + item1.getValorTotal());
                System.out.println("esperado = \n"
                                + "101010 Suco de uva 2.0 UN 3.99 7.98\n"
                                + "atual = \n" + item1.imprimir());

                ItemDeVenda item2 = new ItemDeVenda("100100", "Banana prata", 0.900, "KG", 5.79);
                System.out.println("esperado = 9.18, atual = " + item2.getValorTotal());
                System.out.println("esperado = \n"
                                + "100100 Banana prata 0.9 KG 5.79 5.211\n"
                                + "atual = " + item2.imprimir());

                Venda v1 = new Venda("0000123");
                System.out.println("esperado = 0.0, atual = " + v1.getValorTotal());
                v1.adicionarItem("101010", "Suco de uva", 2.0, "UN", 3.99);
                v1.adicionarItem("100100", "Banana prata", 0.900, "KG", 5.79);
                v1.adicionarItem("111000", "Cream Cracker", 1.0, "PC", 6.95);
                System.out.println("esperado = 20.141, atual = " + v1.getValorTotal()); // os valores ta diferente
                // System.out.print("\n" + v1.imprimir() + "\n"); só olhar o problema
                System.out.println("esperado = \n"
                                + "101010 Suco de uva 2.0 UN 3.99 7.98\n"
                                + "100100 Banana prata 0.9 KG 5.79 5.211\n"
                                + "111100 Cream Cracker 1.0 PC 6.95 6.95\n"
                                + "Valor total 20.141\n"
                                + "Nota fiscal 0000123\n"
                                + "atual = " + v1.imprimir());

                Venda v2 = new Venda("0000456");
                // nao deve aceitar nenhum das inclusoes abaixo
                v2.adicionarItem("", "Suco de uva", 2.0, "UN", 3.99);
                v2.adicionarItem("100100", "", 0.900, "KG", 5.79);
                v2.adicionarItem("111100", "Cream Cracker", 0.0, "PC", 6.95);
                v2.adicionarItem("011011", "Detergente", 2.0, "UN", -1.0);
                v2.adicionarItem("011011", "Detergente", 2.0, "", 4.59);
                System.out.println("esperado = 0.0, atual = " + v2.getValorTotal());

        }
}