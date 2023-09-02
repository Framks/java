
public class RunnerAP1Q1 {

    public static void main(final String[] args) {

        DiscenteTurma d1 = new DiscenteTurma("123", "Fulana");
        d1.setNota(0, 10.0);
        d1.setNota(1, 9.0);
        d1.setNota(2, 8.0);
        d1.setFaltas(16);
        System.out.println("esperado = APROV, atual = " + d1.getResultado());

        DiscenteTurma d2 = new DiscenteTurma("456", "Fulano");
        d2.setNota(0, 5.0);
        d2.setNota(1, 5.0);
        d2.setNota(2, 4.9);
        d2.setFaltas(0);
        System.out.println("esperado = REPM, atual = " + d2.getResultado());

        DiscenteTurma d3 = new DiscenteTurma("789", "Beltrana");
        d3.setNota(0, 5.0);
        d3.setNota(0, 7.0);
        d3.setNota(0, 6.0);
        d3.setFaltas(17);
        System.out.println("esperado = REPF, atual = " + d3.getResultado());

        DiscenteTurma d4 = new DiscenteTurma("012", "Beltrano");
        d4.setNota(0, 3.0);
        d4.setNota(1, 3.0);
        d4.setNota(2, 3.0);
        d4.setFaltas(20);
        System.out.println("esperado = REPF, atual = " + d4.getResultado());

    }
}