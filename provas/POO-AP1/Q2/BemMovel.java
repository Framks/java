public class BemMovel {
    private String id;
    private String desc;
    private Double valor;

    public BemMovel(String id, String desc, Double valor) {
        this.desc = desc;
        this.id = id;
        this.valor = valor;
    }

    public String getId() {
        return this.id;
    }

    public String getDesc() {
        return this.desc;
    }

    public Double getValor() {
        return this.valor;
    }
}
