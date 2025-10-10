

public class Nutrientes extends EntidadBiologica {

    public Nutrientes(double Nt0, double coeficienteK) {
        super(Nt0, coeficienteK);
    }

    @Override
    public double calcularEnTiempo(double t) {
        return calcularValorEnTiempo(t);
    }

    @Override
    public String toString() {
        return "Nutrientes {" +
                "cantidadInicial=" + Nt0 +
                ", coeficienteK=" + coeficienteK +
                '}';
    }
}
