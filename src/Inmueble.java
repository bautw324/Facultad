public class Inmueble {
    private double valorFiscal;
    private double superficie;
    private String catastro;

    public Inmueble(double v, double s, String c) {
        this.valorFiscal = v;
        this.superficie = s;
        this.catastro = c;
    }

    public double getValorFiscal() { return this.valorFiscal; }
    public void setValorFiscal(double valorFiscal) { this.valorFiscal = valorFiscal; }

    public double getSuperficie() { return this.superficie; }
    public void setSuperficie(double superficie) { this.superficie = superficie; }

    public String getCatastro() { return this.catastro; }
    public void setCatastro(String catastro) { this.catastro = catastro; }
}
