import java.util.*;
public class multiploEspecifico {
    public static void main (String[] args){
        Scanner dato = new Scanner(System.in);
        System.out.println("ingrese un numero ");
        int numeropedido = dato.nextInt();

        // para determinar si es multiplo de 2,3,7,9
        // es true si es multiplo
        boolean multiplo2 = (numeropedido % 2 ==0);
        boolean multiplo3 = (numeropedido % 3 ==0);
        boolean multiplo7 = (numeropedido % 7 ==0);
        boolean multiplo9 = (numeropedido % 9 ==0);

        // para mostrar que el numero pedido es multiplo de alguno de ellos

        if (multiplo7) System.out.println(numeropedido + " es multiplo de 7");else System.out.println(numeropedido + " no es multiplo de 7") ;
        if (multiplo3) System.out.println(numeropedido + " es multiplo de 3");else System.out.println(numeropedido + " no es multiplo de 3");
        if (multiplo9) System.out.println(numeropedido + " es multiplo de 9");else System.out.println(numeropedido + " no es multiplo de 9");
        if (multiplo2) System.out.println(numeropedido + " es multiplo de 2");else System.out.println(numeropedido + " no es multiplo de 2");

        // para el swtich necesito un contador que me diga cuantos multiplos cumplio el numero x

        int cantidad = 0;
        if (multiplo2) cantidad++;
        if (multiplo3) cantidad++;
        if (multiplo7) cantidad++;
        if (multiplo9) cantidad++;

        switch (cantidad){
            case 0:
                System.out.println(" ningun es multiplo del numero " + numeropedido);
                break;
            case 1:
                System.out.println(" uno es multiplo del numero " + numeropedido);
                break;
            case 4:
                System.out.println(" todos son multiplo del numero " + numeropedido);
                break;
            default:
                System.out.println(" 2 o 3 son multiplos del numero " + numeropedido);

        }
        dato.close();
    }
}