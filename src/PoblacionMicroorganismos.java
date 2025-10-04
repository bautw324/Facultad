//11.Para desarrollar un programa de simulación biológica es necesario definir una clase PoblacionMicroorganismos, cuyas instancias son capaces de mantener la información referida a una población de microorganismos (incluyendo la cantidad de miembros en un tiempo t). Otra clase debe encargarse de la evolución de los nutrientes que esos organismos necesitan. Tanto el cálculo del tamaño de la población como el de la cantidad de nutrientes a lo largo del tiempo utilizan una fórmula similar del tipo N t=N e donde Nt es el tamaño kt (o la cantidad) en el momento t y k es un coeficiente específico. Los microorganismos poseen características que los diferencian entre sí (masa promedio,forma -con los valores coco,bacilo, espirilo, vibrion, otra-) y que no se aplican a los nutrientes;cada población de microorganismos también tiene características propias (densidad, turbiedad del medio).
//
//a) Bosqueje las clases PoblacionMicroorganismos yNutrientes.
//b) Explique cómo implementaría la herencia para que todas las clases creadas de modo de reflejar la utilización
//de la misma fórmula para el crecimiento poblacional y la cantidad de nutrientes.
a)
public enum FormaMicroorganismo {
    COCO, BACILO, ESPIRILO, VIBRION, OTRA
}
// b) Clase abstracta
public abstract class EntidadBiologica {
    protected double Nt0;          // Cantidad inicial (población o nutrientes)
    protected double coeficienteK; // Coeficiente de crecimiento o decrecimiento

    public EntidadBiologica(double Nt0, double coeficienteK) {
        this.Nt0 = Nt0;
        this.coeficienteK = coeficienteK;
    }
    /**
     * Calcula el valor de la entidad en un tiempo t según la fórmula:
     * Nt = Nt0 * e^(k * t)
     */
    public double calcularValorEnTiempo(double t) {
        return Nt0 * Math.exp(coeficienteK * t);
    }
    // Getters y Setters
    public double getNt0() {
        return Nt0;
    }
    public void setNt0(double Nt0) {
        this.Nt0 = Nt0;
    }
    public double getCoeficienteK() {
        return coeficienteK;
    }
    public void setCoeficienteK(double coeficienteK) {
        this.coeficienteK = coeficienteK;
    }
    // Método abstracto
    public abstract double calcularEnTiempo(double t);
}
// Clase que representa una población de microorganismos
public class PoblacionMicroorganismos extends EntidadBiologica {
    private double masaPromedio;
    private FormaMicroorganismo forma;
    private double densidad;
    private double turbiedad;

    public PoblacionMicroorganismos(
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
// Clase que representa los nutrientes del medio
public class Nutrientes extends EntidadBiologica {

    public Nutrientes(double Nt0, double coeficienteK) {
        super(Nt0, coeficienteK);
    }
    // Implementación del método abstracto
    @Override
    public double calcularEnTiempo(double t) {
        return calcularValorEnTiempo(t); // evolución de nutrientes
    }
    @Override
    public String toString() {
        return "Nutrientes {" +
                "cantidadInicial=" + Nt0 +
                ", coeficienteK=" + coeficienteK +
                '}';
    }
}
