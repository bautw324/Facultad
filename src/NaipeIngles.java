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
                this.setNombre("[A] As de ");
                break;
            case 2:
                this.setNombre("[2] Dos de ");
                break;
            case 3:
                this.setNombre("[3] Tres de ");
                break;
            case 4:
                this.setNombre("[4] Cuatro de ");
                break;
            case 5:
                this.setNombre("[5] Cinco de ");
                break;
            case 6:
                this.setNombre("[6] Seis de ");
                break;
            case 7:
                this.setNombre("[7] Siete de ");
                break;
            case 8:
                this.setNombre("[8] Ocho de ");
                break;
            case 9:
                this.setNombre("[9] Nueve de ");
                break;
            case 10:
                this.setNombre("[10] Diez de ");
                break;
            case 11:
                this.setNombre("[J] Sota de ");
                break;
            case 12:
                this.setNombre("[Q] Reina de ");
                break;
            case 13:
                this.setNombre("[K] Rey de ");
                break;
        }
        this.setNombre(getNombre() + getPalo());
    }
}
