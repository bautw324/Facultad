import java.util.Arrays;
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

    public static boolean esEscalera3(NaipeIngles n1, NaipeIngles n2, NaipeIngles n3){
        int[] cartas = {n1.getNumero(), n2.getNumero(), n3.getNumero()};
        Arrays.sort(cartas);
        return (cartas[1]==cartas[0]+1 && cartas[2] == cartas[1]+1);
    }

    private static boolean esTrio(NaipeIngles n1, NaipeIngles n2, NaipeIngles n3){
        return (n1.mismoValor(n2) && n2.mismoValor(n3));
    }

    public static void evaluarMano5(NaipeIngles n1, NaipeIngles n2, NaipeIngles n3, NaipeIngles n4, NaipeIngles n5){
        int[] numeros = {n1.getNumero(), n2.getNumero(), n3.getNumero(), n4.getNumero(), n5.getNumero()};
        String[] palos = {n1.getPalo(), n2.getPalo(), n3.getPalo(), n4.getPalo(), n5.getPalo()};
        Arrays.sort(numeros);

        boolean esEscalera = (numeros[1] == numeros[0]+1 && numeros[2] == numeros[1]+1 &&
                numeros[3] == numeros[2]+1 && numeros[4] == numeros[3]+1);

        boolean mismoPalo = palos[0].equals(palos[1]) && palos[1].equals(palos[2]) &&
                palos[2].equals(palos[3]) && palos[3].equals(palos[4]);

        if (esEscalera) {
            if (mismoPalo) {
                System.out.println("Las cartas son una escalera real");
            } else {
                System.out.println("Las cartas son una escalera");
            }
            return;
        }

        if ((numeros[0] == numeros[1] && numeros[1] == numeros[2] && numeros[2] == numeros[3]) ||
                (numeros[1] == numeros[2] && numeros[2] == numeros[3] && numeros[3] == numeros[4])) {
            System.out.println("Las cartas conforman un póker");
            return;
        }

        boolean esFull =
                (numeros[0] == numeros[1] && numeros[1] == numeros[2] && numeros[3] == numeros[4]) ||  // AAABB
                (numeros[0] == numeros[1] && numeros[2] == numeros[3] && numeros[3] == numeros[4]);  // AABBB

        if (esFull) {
            System.out.println("Las cartas conforman un full");
            return;
        }

        System.out.println("No es ninguna combinación especial");
    }
}