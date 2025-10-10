public class InmuebleUrbano extends Inmueble {
    private double superficieConstruida;
    private double frente;
    private double fondo;

    public InmuebleUrbano(double v, String cat, double f, double fo) {
        super(v, f * fo, cat);
        this.superficieConstruida = 0;
        this.frente = f;
        this.fondo = fo;
    }

    public double getSuperficieConstruida() { return this.superficieConstruida; }
    public double getFrente() { return this.frente; }
    public double getFondo() { return this.fondo; }

    public double getImpuesto() {
        return 1000 * (this.frente / this.fondo) * this.getValorFiscal();
    }
}
