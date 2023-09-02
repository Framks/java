import java.util.*;
public class Contato {
    public String nome;
    public Map<String, String> numeros;

    /**
     *  Contato(String nome)
     *  addNumero(String identificador, String numero) : void
     *  imprimir() : String
     */

    // contato ele inicializa com um nome e pode ter varios numeros
    public Contato(String nome) {
        this.nome = nome;
        this.numeros = new HashMap<>();
    }

    // adiciona um numero com identificador para o contato
    public void addNumero(String identificador, String numero) {
        if(numeros.containsValue(numero) || numeros.containsKey(identificador)){
            throw new IllegalArgumentException("identificador ou numero ja existe");
        }else{
            this.numeros.put(identificador, numero);
        }
    }

    public String imprimir(){
        String result = this.nome + "\n";
        for (Map.Entry<String, String> entry : numeros.entrySet()){
            result += "  " +entry.getKey() + " - " + entry.getValue() + "\n";
        }
        return result;
    }
}