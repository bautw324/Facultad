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

    private static boolean esTrio(NaipeIngles n1, NaipeIngles n2, NaipeIngles n3){
        return (n1.mismoValor(n2) && n2.mismoValor(n3));
    }

}
