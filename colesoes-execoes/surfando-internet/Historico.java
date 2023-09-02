import java.util.ArrayList;
import java.util.List;

public class Historico {
    private List<String> next = new ArrayList<>();
    private List<String> last = new ArrayList<>();
    String urlAtual = null;

    public void visitar(String url){
        last.add(0,this.urlAtual);
        next.clear();
        this.urlAtual = url;
    }

    public String voltar(){
        if(!last.isEmpty()){ 
            next.add(0,this.urlAtual);
            this.urlAtual = last.remove(0);
            return this.urlAtual;
        }
        return null;
    }

    public String avancar(){
        if(!next.isEmpty()){
            last.add(0,this.urlAtual);
            this.urlAtual = next.remove(0);
            return this.urlAtual;
        }
        return null;
    }

}
