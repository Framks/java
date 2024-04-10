
public class Pencil {

    private float calibre;
    private Grafite grafite;
    
    public Pencil(float calibre){
        this.calibre = calibre;
        this.grafite = new Grafite(0.5F,"4B",0);
    }

    public Boolean grafiteIsEmpty(){
        return this.grafite.getSize() == 0;
    }

    public Grafite getGrafite(){
        return this.grafite;
    }

    public void setGrafite(Grafite grafite){
        this.grafite = grafite;
    }

    public float getCalibre(){
        return this.calibre;
    }

    @Override
    public String toString(){
        return "calibre: "+calibre+", grafite: "+ ((this.grafite.getSize()>0)?this.grafite.toString():"null");
    }
}
