
public class Grafite {
    private float calibre;
    private String dureza;
    private Integer size;
    
    public Grafite(float calibre, String dureza, Integer size){
        this.calibre = calibre;
        this.dureza = dureza;
        this.size = size;
    }
    
    public String getDureza() {
        return dureza;
    }
    
    public float getCalibre() {
        return calibre;
    }

    public void setSize(Integer size){
        this.size = size;
    }
    
    public Integer getSize() {
        return size;
    }
    
    @Override
    public String toString(){
        return "["+calibre+":"+dureza+":"+size+"]";
    }
}
