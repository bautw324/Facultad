public class NaipeEspañol {

    private String nombre;
    private final String palo;
    private final int numero;

    public NaipeEspañol(String p,int n){
        numero=n;
        palo=p;
    }

    public int getNumero(){
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    public String getNombre(){
        return nombre;
    }

    public boolean igualPalo(NaipeEspañol n){
        return (n.getPalo().equals(palo));
    }

    public boolean mismoValor(NaipeEspañol n){
        return (n.getNumero() == numero);
    }

    public NaipeEspañol mayorValor(NaipeEspañol n){
        int valorMax = Math.max(n.getNumero(),numero);
        if (valorMax==numero){
            return this;
        } else{
            return n;
        }
    }

    public void asignarNombre(){
        switch (getNumero()){
            case 1:
                nombre = "As" + " de " + getPalo() + "[" + getNumero() + "]";
                break;
            case 2:
                nombre = "Dos" + " de " + getPalo() + "[" + getNumero() + "]";
                break;
            case 3:
                nombre = "Tres" + " de " + getPalo() + "[" + getNumero() + "]";
                break;
            case 4:
                nombre = "Cuatro" + " de " + getPalo() + "[" + getNumero() + "]";
                break;
            case 5:
                nombre = "Cinco" + " de " + getPalo() + "[" + getNumero() + "]";
                break;
            case 6:
                nombre = "Seis" + " de " + getPalo() + "[" + getNumero() + "]";
                break;
            case 7:
                nombre = "Siete" + " de " + getPalo() + "[" + getNumero() + "]";
                break;
            case 10:
                nombre = "Sota" + " de " + getPalo() + "[" + getNumero() + "]";
                break;
            case 11:
                nombre = "Caballo" + " de " + getPalo() + "[" + getNumero() + "]";
                break;
            case 12:
                nombre = "Rey" + " de " + getPalo() + "[" + getNumero() + "]";
                break;
        }
    }


}