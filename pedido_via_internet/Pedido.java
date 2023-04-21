package pedido_via_internet;

public class Pedido {
    ItemDePedido[] items;
    String numeroPedido;
    String cidade;
    String estado;

    public Pedido(String numeroPedido, String cidade, String estado) {
        this.numeroPedido = numeroPedido;
        this.cidade = cidade;
        this.estado = estado;
    }

    String adicionarItem(String codigo, String descricao, Integer quantidade, Double peso, Double valorUnitario) {
        if (quantidade > 0 && valorUnitario > 0 && peso > 0 && codigo != "" && descricao != "") {
            ItemDePedido novo = new ItemDePedido(codigo, descricao, quantidade, peso, valorUnitario);
            if (items == null) {
                items = new ItemDePedido[1];
                items[0] = novo;
            } else {
                ItemDePedido[] lista = new ItemDePedido[items.length + 1];
                for (int i = 0; i < items.length; i++) {
                    lista[i] = items[i];
                }
                lista[items.length] = novo;
                items = lista;
            }
            return "valido";
        } else {

            return "Invalido";
        }
    }

    Double getValorTotal() {
        if (items == null) {
            return 0.0;
        } else {
            Double preco = 0.0;
            for (int i = 0; i < items.length; i++) {
                preco += items[i].getValorTotal();
            }
            return preco;
        }
    }

    Double getValorFrete() {
        if (items == null) {
            return 0.0;
        } else {
            Double peso_total = 0.0, frete = 0.0;
            for (int i = 0; i < items.length; i++) {
                peso_total += items[i].getPesoTotal();
            }
            if (getValorTotal() < 1000) {

                switch (estado) {
                    case "PA":
                    case "TO":
                    case "AM":
                    case "AC":
                    case "RO":
                    case "RR":
                    case "AP":
                    case "MA":
                    case "CE":
                    case "PE":
                    case "RN":
                    case "SE":
                    case "AL":
                    case "BA":
                    case "PB":
                    case "PI":
                        frete = peso_total * 20;
                        break;
                    case "MT":
                    case "MS":
                    case "GO":
                    case "SP":
                    case "MG":
                    case "ES":
                    case "RJ":
                        frete = peso_total * 25;
                        break;
                    case "SC":
                    case "PR":
                    case "RS":
                        frete = peso_total * 30;
                        break;
                }
                return frete;
            } else {

                return 0.0;
            }
        }
    }
}
