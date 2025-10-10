public class InmuebleRural extends Inmueble {
    private double superficieCultivada;

    public InmuebleRural(double v, double s, String c) {
        super(v, s, c);
        this.superficieCultivada = 0;
    }

    public void setSuperficieCultivada(double sc) { this.superficieCultivada = sc; }
    public double getSuperficieCultivada() { return this.superficieCultivada; }

    public double getImpuesto(double k, double p) {
        return (this.getSuperficie() + (k - 1) * this.getSuperficieCultivada()) * p / 100;
    }
}
