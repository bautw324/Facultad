public class NaipeEspañol extends Naipe{

    public NaipeEspañol(String p, int n) {
        super(p, n);
    }

    public void asignarNombre(){
        switch (getNumero()){
            case 1:
                this.setNombre("Ancho" + " de " + getPalo() + "[" + getNumero() + "]");
                break;
            case 2:
                this.setNombre("Dos" + " de " + getPalo() + "[" + getNumero() + "]");
                break;
            case 3:
                this.setNombre("Tres" + " de " + getPalo() + "[" + getNumero() + "]");
                break;
            case 4:
                this.setNombre("Cuatro" + " de " + getPalo() + "[" + getNumero() + "]");
                break;
            case 5:
                this.setNombre("Cinco" + " de " + getPalo() + "[" + getNumero() + "]");
                break;
            case 6:
                this.setNombre("Seis" + " de " + getPalo() + "[" + getNumero() + "]");
                break;
            case 7:
                this.setNombre("Siete" + " de " + getPalo() + "[" + getNumero() + "]");
                break;
            case 10:
                this.setNombre("Sota" + " de " + getPalo() + "[" + getNumero() + "]");
                break;
            case 11:
                this.setNombre("Caballo" + " de " + getPalo() + "[" + getNumero() + "]");
                break;
            case 12:
                this.setNombre("Rey" + " de " + getPalo() + "[" + getNumero() + "]");
                break;
        }
    }


}