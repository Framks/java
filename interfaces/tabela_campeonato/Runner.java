import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Runner {

    public static void main(final String[] args) {

        List<Participante> participantes = new ArrayList<Participante>();

        Participante d = ( new Participante("Daniel"));
        d.addVitorias(10);
        d.addEmpates(5);
        d.addDerrotas(2);
        d.addGolsAFavor(10);
        d.addGolsContra(5);

        Participante j = new Participante("João");
        j.addVitorias(8);
        j.addEmpates(6);
        j.addDerrotas(1);
        j.addGolsAFavor(8);
        j.addGolsContra(9);

        Participante p = new Participante("Pedro");
        p.addVitorias(8);
        p.addEmpates(3);
        p.addDerrotas(1);
        p.addGolsAFavor(6);
        p.addGolsContra(2);

        participantes.add(p);
        participantes.add(j);
        participantes.add(d);

        for(Participante aux : participantes){
            System.out.println(aux.getResumo());
        }
        
        //... inclusao de valores
        
        Collections.sort(participantes);

        for (Participante participante : participantes) {
            System.out.println(participante.getResumo());
        }
       
        // imprimir todas as linhas dos participantes

    }
}