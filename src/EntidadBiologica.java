

public abstract class EntidadBiologica {
    protected double Nt0;          // Cantidad inicial (población o nutrientes)
    protected double coeficienteK; // Coeficiente de crecimiento o decrecimiento

    public EntidadBiologica(double Nt0, double coeficienteK) {
        this.Nt0 = Nt0;
        this.coeficienteK = coeficienteK;
    }

    // Fórmula común: Nt = Nt0 * e^(k * t)
    public double calcularValorEnTiempo(double t) {
        return Nt0 * Math.exp(coeficienteK * t);
    }

    // Método abstracto que cada subclase debe implementar
    public abstract double calcularEnTiempo(double t);

    // Getters y Setters
    public double getNt0() { return Nt0; }
    public void setNt0(double Nt0) { this.Nt0 = Nt0; }
    public double getCoeficienteK() { return coeficienteK; }
    public void setCoeficienteK(double coeficienteK) { this.coeficienteK = coeficienteK; }
}