public class AsEspadas {
    public static void generar() {
        while (true) {
            NaipeEspañol naipe = RevisaTruco.generarCarta();
            System.out.println("Se generó: "+ naipe.getNombre());
            if (naipe.getNombre().equals("Ancho de espada[1]")) {
                System.out.println("Se encontró el " + naipe.getNombre());
                break;
            }
        }
    }
}