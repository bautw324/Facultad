import java.util.Random;
public class RevisaTruco {
    public static NaipeEspañol generarCarta(){
        Random generador = new Random();
        int numero = generador.nextInt(12) + 1;
        while (numero==8 || numero==9){
            numero = generador.nextInt(12) + 1;
        }
        NaipeEspañol naipe = new NaipeEspañol(asignarPalo(),numero);
        naipe.asignarNombre();
        return naipe;
    }

    public static String asignarPalo(){
        Random generador = new Random();
        int numero = generador.nextInt(4) + 1;
        switch (numero){
            case 1:
                return "espada";
            case 2:
                return "bastos";
            case 3:
                return "oro";
            case 4:
                return "copas";
        }
        return "";
    }

    public static int calcularEnvido(NaipeEspañol n1,NaipeEspañol n2,NaipeEspañol n3){
        int envido = 0;
        if (n1.igualPalo(n2)){

            if (n1.getNumero() <= 7) envido+=n1.getNumero();
            if (n2.getNumero() <= 7) envido+=n2.getNumero();
            if (n2.igualPalo(n3) && n3.getNumero() <= 7) envido+=n3.getNumero(); // caso de que los tres sean iguales
            if (envido!=0) envido += 20;

        } else if (n1.igualPalo(n3)){
            if (n1.getNumero() <= 7) envido+=n1.getNumero();
            if (n3.getNumero() <= 7) envido+=n3.getNumero();
            if (envido!=0) envido += 20;
        } else if(n2.igualPalo(n3)){
            if (n2.getNumero() <= 7) envido+=n2.getNumero();
            if (n3.getNumero() <= 7) envido+=n3.getNumero();
            if (envido!=0) envido += 20;
        } else {
            if (n1.getNumero() <= 7) {
                envido = n1.getNumero();
            }
            if (n2.getNumero() <= 7 && n2.getNumero() > envido) {
                envido = n2.getNumero();
            }
            if (n3.getNumero() <= 7 && n3.getNumero() > envido) {
                envido = n3.getNumero();
            }
        }
        return envido;
    }

    public static boolean esFlor (NaipeEspañol n1,NaipeEspañol n2,NaipeEspañol n3){
        return (n1.igualPalo(n2) && n2.igualPalo(n3));
    }

    public static int valorTruco(NaipeEspañol n) {
        int numero = n.getNumero();
        String palo = n.getPalo();

        if (numero == 1 && palo.equals("espada")) return 15;  // as de espadas
        if (numero == 1 && palo.equals("bastos")) return 14;  // as de bastos
        if (numero == 7 && palo.equals("espada")) return 13;  // siete de espadas
        if (numero == 7 && palo.equals("oro")) return 12;     // siete de oro
        if (numero == 3) return 11;
        if (numero == 2) return 10;
        if (numero == 1) return 9;                            // ases de copas y oro
        if (numero == 12) return 8;
        if (numero == 11) return 7;
        if (numero == 10) return 6;
        if (numero == 7) return 5;                            // bastos y copas
        if (numero == 6) return 4;
        if (numero == 5) return 3;
        if (numero == 4) return 2;

        return 1; // por si acaso
    }

    public static NaipeEspañol mayorTruco(NaipeEspañol n1,NaipeEspañol n2,NaipeEspañol n3){
        NaipeEspañol mayor = n1;
        if (valorTruco(n2) > valorTruco(mayor)) mayor = n2;
        if (valorTruco(n3) > valorTruco(mayor)) mayor = n3;
        return mayor;
    }


}
