public class AsEspadas {
    public static void main(String[] args) {
        while (true) {
            NaipeEspañol naipe = RevisaTruco.generarCarta();
            if (naipe.getNombre().equals("Ancho de espada[1]")) {
                System.out.println("Se encontró el " + naipe.getNombre());
                break;
            }
        }
    }
}
