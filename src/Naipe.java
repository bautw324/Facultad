public class Naipe {
    private final String palo;
    private final int numero;
    private String nombre;

    public Naipe(String p, int n) {
        this.palo = p;
        this.numero = n;
    }

    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setNombre(String n){
        this.nombre = n;
    }

    public String getNombre(){
        return nombre;
    }

    public boolean mismoValor(Naipe n){
        return (n.getNumero() == numero);
    }

    public Naipe mayorValor(Naipe n){
        int valorMax = Math.max(n.getNumero(),numero);
        if (valorMax==numero){
            return this;
        } else{
            return n;
        }
    }

    public boolean igualPalo(Naipe n){
        return (n.getPalo().equals(palo));
    }


}
