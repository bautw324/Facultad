

// Clase que representa una población de microorganismos
public class PoblacionMicroorganismo extends EntidadBiologica {
    private double masaPromedio;
    private FormaMicroorganismo forma;
    private double densidad;
    private double turbiedad;

    public PoblacionMicroorganismo(
            double Nt0,
            double coeficienteK,
            double masaPromedio,
            FormaMicroorganismo forma,
            double densidad,
            double turbiedad
    ) {
        super(Nt0, coeficienteK);
        this.masaPromedio = masaPromedio;
        this.forma = forma;
        this.densidad = densidad;
        this.turbiedad = turbiedad;
    }

    // Implementación del método abstracto
    @Override
    public double calcularEnTiempo(double t) {
        return calcularValorEnTiempo(t); // crecimiento poblacional
    }

    // Getters y Setters
    public double getMasaPromedio() {
        return masaPromedio;
    }
    public void setMasaPromedio(double masaPromedio) {
        this.masaPromedio = masaPromedio;
    }
    public FormaMicroorganismo getForma() {
        return forma;
    }
    public void setForma(FormaMicroorganismo forma) {
        this.forma = forma;
    }
    public double getDensidad() {
        return densidad;
    }
    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }
    public double getTurbiedad() {
        return turbiedad;
    }
    public void setTurbiedad(double turbiedad) {
        this.turbiedad = turbiedad;
    }
    @Override
    public String toString() {
        return "Población de microorganismos {" +
                "masaPromedio=" + masaPromedio +
                ", forma=" + forma +
                ", densidad=" + densidad +
                ", turbiedad=" + turbiedad +
                ", Nt0=" + Nt0 +
                ", coeficienteK=" + coeficienteK +
                '}';
    }
}