import java.io.*;
import java.util.ArrayList;

public class Leitor {
    private String texto;
    
    // Construtor que inicia com um arquivo
    public Leitor(String arquivo) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo)));
        this.texto = br.readLine();
    }

    public String getTexto(){
        return texto;
    }

    public Integer quantidadeVezes(String palavra){
        // retorna quantas vezes uma palavra esta no texto

        return 0;
    }

    public ArrayList<String> palavrasRepetidas(){
        // retorna um ArrayList<String> de "palavra numero de repetição"
        ArrayList<String> result = new ArrayList<String>();
        result.add("teste");
        return result;
    }
}