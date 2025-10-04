public class NaipeEspañol extends Naipe{

    public NaipeEspañol(String p, int n) {
        super(p, n);
    }

    public void asignarNombre(){
        switch (getNumero()){
            case 1:
                this.setNombre("Ancho" + " de " + getPalo() + " [1]");
                break;
            case 2:
                this.setNombre("Dos" + " de " + getPalo() + " [2]");
                break;
            case 3:
                this.setNombre("Tres" + " de " + getPalo() + " [3]");
                break;
            case 4:
                this.setNombre("Cuatro" + " de " + getPalo() + " [4]");
                break;
            case 5:
                this.setNombre("Cinco" + " de " + getPalo() + " [5]");
                break;
            case 6:
                this.setNombre("Seis" + " de " + getPalo() + " [6]");
                break;
            case 7:
                this.setNombre("Siete" + " de " + getPalo() + " [7]");
                break;
            case 10:
                this.setNombre("Sota" + " de " + getPalo() + " [10]");
                break;
            case 11:
                this.setNombre("Caballo" + " de " + getPalo() + " [11]");
                break;
            case 12:
                this.setNombre("Rey" + " de " + getPalo() + " [12]");
                break;
        }
    }


}