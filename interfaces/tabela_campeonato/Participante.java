public class Participante implements Comparable<Participante> {
    String nome;
    Integer vitorias;
    Integer empates;
    Integer derrotas;
    Integer golsAFavor;
    Integer golsContra;
    
    public Participante(String nome){
        this.nome = nome;
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
        this.golsAFavor = 0;
        this.golsContra = 0;
    }

    public void addVitorias(Integer v){
        this.vitorias += v;
    }

    public void addEmpates(Integer e){
        this.empates += e;
    }

    public void addDerrotas(Integer d){
        this.derrotas += d;
    }

    public void addGolsAFavor(Integer g){
        this.golsAFavor += g;
    }

    public void addGolsContra(Integer g){
        this.golsContra += g;
    }

    public String getResumo(){
        return this.nome+", "+this.vitorias+", "+this.empates+", "+this.derrotas+", "+this.golsAFavor+", "+this.golsContra;
    }

    public int compareTo(Participante othes){
        if(this.vitorias > othes.vitorias){
            return -1;
        }else if(this.vitorias < othes.vitorias){
            return 1;
        }else{
            if(this.derrotas > othes.derrotas){
                return 1;
            }else if(this.derrotas < othes.derrotas){
                return -1;
            }else{
                if(this.golsAFavor > othes.golsAFavor){
                    return -1;
                }else if(this.golsAFavor < othes.golsAFavor){
                    return 1;
                }else{
                    if(this.golsContra < othes.golsContra){
                        return -1;
                    }else if(this.golsContra > othes.golsContra){
                        return 1;
                    }else{
                        return 0;
                    }
                }
            }
        }
    }

    
}
