// Bautista Genovese - 49.790.865
public class Test {
    public static void main(String[] args) {
        NaipeEspañol naipe1 = RevisaTruco.generarCarta();
        NaipeEspañol naipe2 = RevisaTruco.generarCarta();
        NaipeEspañol naipe3 = RevisaTruco.generarCarta();
        System.out.println(naipe1.getNombre());
        System.out.println(naipe2.getNombre());
        System.out.println(naipe3.getNombre());
        System.out.println("pene");

        int envido = RevisaTruco.calcularEnvido(naipe1,naipe2,naipe3);
        System.out.println("Envido: " + envido);
        boolean flor = RevisaTruco.esFlor(naipe1,naipe2,naipe3);
        System.out.println("Es flor?: " + flor);
        System.out.println("Mayor: " + RevisaTruco.mayorTruco(naipe1,naipe2,naipe3).getNombre());

        while (true){
            NaipeEspañol naipe = RevisaTruco.generarCarta();
            if (naipe.getNombre().equals("As de espada[1]")){
                System.out.println("Se encontró el " + naipe.getNombre());
                break;
            }
        }
    }
}
