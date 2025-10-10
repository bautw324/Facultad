
public class Main {
    public static void main(String[] args) {
        // Crear una población de microorganismos
        PoblacionMicroorganismos poblacion = new PoblacionMicroorganismos(
                1000, 0.2, 0.005, FormaMicroorganismo.BACILO, 1.1, 0.8
        );

        // Crear nutrientes
        Nutrientes nutrientes = new Nutrientes(5000, -0.1);

        double tiempo = 5.0;

        System.out.println(poblacion);
        System.out.println("Tamaño en t=" + tiempo + ": " + poblacion.calcularEnTiempo(tiempo));

        System.out.println(nutrientes);
        System.out.println("Cantidad en t=" + tiempo + ": " + nutrientes.calcularEnTiempo(tiempo));
    }
}
