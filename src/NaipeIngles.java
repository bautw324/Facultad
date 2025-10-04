public class NaipeIngles extends Naipe{
    public NaipeIngles(String p, int n) {
        super(p, n);
    }

    public void asignarNombre(){
        switch (getNumero()){
            case 0:
                this.setNombre("Joker");
                break;
            case 1:
                this.setNombre("As de " + getPalo() + " [A]");
                break;
            case 2:
                this.setNombre("Dos de " + getPalo() + " [2]");
                break;
            case 3:
                this.setNombre("Tres de " + getPalo() + " [3]");
                break;
            case 4:
                this.setNombre("Cuatro de " + getPalo() + " [4]");
                break;
            case 5:
                this.setNombre("Cinco de " + getPalo() + " [5]");
                break;
            case 6:
                this.setNombre("Seis de " + getPalo() + " [6]");
                break;
            case 7:
                this.setNombre("Siete de " + getPalo() + " [7]");
                break;
            case 8:
                this.setNombre("Ocho de " + getPalo() + " [8]");
                break;
            case 9:
                this.setNombre("Nueve de " + getPalo() + " [9]");
                break;
            case 10:
                this.setNombre("Diez de " + getPalo() + " [10]");
                break;
            case 11:
                this.setNombre("Sota de " + getPalo() + " [J]");
                break;
            case 12:
                this.setNombre("Reina de " + getPalo() + " [Q]");
                break;
            case 13:
                this.setNombre("Rey de " + getPalo() + " [K]");
                break;
        }
    }
}
