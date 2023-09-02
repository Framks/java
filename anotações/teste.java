import java.util.Scanner;

class Scaner {
    static public void main(String[] args) {
        /*
         * Scanner input = new Scanner(System.in);// cria um objeto que vai ser o input
         * System.out.print("Digite um número: ");
         * int va = input.nextInt(); // input do tipo int
         * System.out.print("Digite outro número: ");
         * double i = input.nextDouble();
         * double resul = (double)i+va; // conversão de tipos
         * System.out.println(i+" + "+va+" = "+resul);
         * final double TI = 3.14; // assim que se cria uma constante
         * System.out.print("digite o valor do raio: ");
         * double raio = input.nextDouble();
         * double are_circ = (raio*raio)*TI;
         * System.out.print("a area do circulo é: "+are_circ);
         */

        /* trabalhando com horario */
        /*
         * long totalmilisegundos = System.currentTimeMillis()-10800000; // aqui se tem
         * o horario em milesigundos
         * 
         * long totalsegundos = totalmilisegundos/1000; // aqui se transforma em
         * segundos
         * long segundoatual = totalsegundos%60;
         * 
         * long totalminutos = totalsegundos / 60; // aqui nos temos os minutos
         * Long menutosatual = totalminutos % 60;
         * 
         * long totalhora = totalminutos / 60; // aqui nos temos as horas
         * long horaatual = totalhora % 24;
         * 
         * System.out.print(horaatual+":"+menutosatual+":"+segundoatual);
         */

        try (Scanner testar = new Scanner(System.in)) {
            System.out.print("Digite seu primeiro nome: ");
            String nome = testar.next();
            System.out.print("digita sua idade: ");
            int idade = testar.nextInt();
            if (idade < 10) {
                System.out.println("idade não é valida");
            } else if (idade < 18) {
                System.out.println(nome + " você não é adulto");
            } else {
                System.out.println(nome + " você tem a maior idade penal");
            }
        }
    }
}