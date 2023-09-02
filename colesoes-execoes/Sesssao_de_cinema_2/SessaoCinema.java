import java.util.HashMap;
import java.util.Map;

import java.util.ArrayList;
public class SessaoCinema {
    String data;
    String horario;
    String filme;
    HashMap<String, Cliente> reservas;
    ArrayList<String> assentosValidos;

    public SessaoCinema(String data, String horario, String filme) {
        this.data = data;
        this.horario = horario;
        this.filme = filme;
        this.reservas = new HashMap<String, Cliente>();
        this.assentosValidos = new ArrayList<String>();
        for (char i = 'A'; i < 'L'; i++) {
            for (int j =0; j<= 19; j++){
                String number;
                if(j<10){
                    number = "0"+String.valueOf(j);
                }else{
                    number = String.valueOf(j);
                }
                if(i == 'A' && (j > 4 && j < 16)){
                    this.assentosValidos.add(String.valueOf(i) + number);
                }else if(i== 'K' && !(j > 4 && j < 16)){
                    this.assentosValidos.add(String.valueOf(i) + number);
                }else if(i < 'K' && i > 'A'){
                    this.assentosValidos.add(String.valueOf(i) + number);
                }
            }
        }
        this.assentosValidos.add("L02");
        this.assentosValidos.add("L03");
        this.assentosValidos.add("L04");
    }

    public Boolean reservar(String assento, Cliente c){
        if(!assentosValidos.contains(assento)){
            return false;
        }
        if(!reservas.containsKey(assento)){ // assento tem reserva?
            if(reservas.containsValue(c)){
                return false;
            }
            reservas.put(assento, c);
            return true;
        }
        return false;
    }

    public void cancelarReserva(String cpf) {
        for(Map.Entry<String,Cliente> cliente : reservas.entrySet()){
            if(cliente.getValue().getCpf().equals(cpf)){
                String assento = cliente.getKey();
                reservas.remove(assento);
                getMapaReservas();
                return;
            }
        }
    }

    public String getAssentosValidos() {
        String retorno = "";
        for(String assentoReservado: this.assentosValidos){ 
            retorno += assentoReservado + "\n";
        }
        return retorno;
    }


    public String getMapaReservas() {
        String retorno = "";
        for(Map.Entry<String,Cliente> assentoReservado: reservas.entrySet()) {
            retorno += assentoReservado.getKey() + " => " + assentoReservado.getValue().getCpf()+ "\n";
        }
        return retorno;
    }
}
