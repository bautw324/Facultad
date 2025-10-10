public class NaipeEspañol extends Naipe{

    public NaipeEspañol(String p, int n) {
        super(p, n);
    }

    public void asignarNombre(){
        switch (getNumero()){
            case 1:
                this.setNombre("[1] Ancho de ");
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
                this.setNombre("[5] Cinco de " );
                break;
            case 6:
                this.setNombre("[6] Seis de ");
                break;
            case 7:
                this.setNombre("[7] Siete de ");
                break;
            case 10:
                this.setNombre("[10] Sota de ");
                break;
            case 11:
                this.setNombre("[11] Caballo de ");
                break;
            case 12:
                this.setNombre("[12] Rey de ");
                break;
        }
        this.setNombre(this.getNombre() + getPalo());


    }

}