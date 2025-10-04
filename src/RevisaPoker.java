import java.util.Random;
public class RevisaPoker {

    public static NaipeIngles generarCarta(){
        Random generador = new Random();
        int numero = generador.nextInt(14);
        NaipeIngles naipe = new NaipeIngles(asignarPalo(),numero);
        naipe.asignarNombre();
        return naipe;
    }

    public static String asignarPalo(){
        Random generador = new Random();
        int numero = generador.nextInt(5) + 1;
        return switch (numero) {
            case 1 -> "corazones";
            case 2 -> "diamantes";
            case 3 -> "tréboles";
            case 4 -> "picas";
            case 5 -> "Joker";
            default -> "";
        };
    }

    private static boolean esJoker(NaipeIngles n){
        return (n.getPalo().equals("Joker"));
    }

//    public static boolean esEscalera(NaipeIngles n1, NaipeIngles n2, NaipeIngles n3){
//
//        int menor = n1.getNumero();
//        if (n2.getNumero() < menor) menor = n2.getNumero();
//        if (n3.getNumero() < menor) menor = n3.getNumero();
//
//        int mayor = n1.getNumero();
//        if (n2.getNumero() > mayor) mayor = n2.getNumero();
//        if (n3.getNumero() > mayor) mayor = n3.getNumero();
//
//        if (esJoker(n1) || esJoker(n2) || esJoker(n3)) return true;
//
//    }


}
