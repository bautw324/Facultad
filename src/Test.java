// Bautista Genovese - 49.790.865
public class Test {
    public static void main(String[] args) {
        NaipeIngles naipe1 = RevisaPoker.generarCarta();
        NaipeIngles naipe2 = RevisaPoker.generarCarta();
        NaipeIngles naipe3 = RevisaPoker.generarCarta();

        System.out.println(naipe1.getNombre());
        System.out.println(naipe2.getNombre());
        System.out.println(naipe3.getNombre());
    }
}
