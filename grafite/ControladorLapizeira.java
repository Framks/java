import java.util.Objects;

public class ControladorLapizeira {

    private Pencil pencil;

    public ControladorLapizeira(Pencil p){
        this.pencil = p;
    }
    
    public void setPincel(Pencil p){
        this.pencil= p;
    }

    public void insertGrafite(Grafite grafite){
        if(pencil.grafiteIsEmpty()){
            if(grafite.getCalibre() == pencil.getCalibre()){
                pencil.setGrafite(grafite);
            }else{
                System.out.println("fail: calibre incompativel");
            }
        }else{
            System.out.println("fail: ja existe grafite");
        }
    }

    //Grafite HB: 1mm por folha.
    //Grafite 2B: 2mm por folha.
    //Grafite 4B: 4mm por folha.
    //Grafite 6B: 6mm por folha.
    public void write(){
        if(pencil.grafiteIsEmpty() ){
            System.out.println("fail: nao existe grafite");
        }else if(pencil.getGrafite().getSize() <= 10){
            System.out.println("fail: tamanho insuficiente");
        }else{
            String tipo = pencil.getGrafite().getDureza();
            int subtrai;
            if (tipo.equals("HB")) {
                subtrai = 1;
            }else if(tipo.equals("2B")){
                subtrai = 2;
            }else if(tipo.equals("4B")){
                subtrai = 4;
            }else if(tipo.equals("6B")){
                subtrai = 6;
            }else{
                subtrai = 0;
            }
            if((pencil.getGrafite().getSize() - subtrai) < 10){
                System.out.println("fail: folha incompleta");
                pencil.getGrafite().setSize(10);
            }else{
                pencil.getGrafite().setSize(pencil.getGrafite().getSize() - subtrai);
            }
        }
    }

    public Grafite removeGrafite(){
        if (pencil.grafiteIsEmpty()) {
            return null;
        }
        Grafite minimo = pencil.getGrafite();
        pencil.setGrafite(new Grafite(0.0F, "4H", 0));
        return minimo;
    }

    public String showPencil(){
        return this.pencil.toString();
    }
}