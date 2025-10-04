//7. Escriba una clase que represente un número complejo. Los objetos de esta clase deben poder su parte real y su parte imaginaria, su módulo, sus coordenadas polares, y debe ser capaz de realizar operaciones básicas con otro número complejo.
//
//        a) Escriba un programa que utilice la clase anterior y que reciba dos números complejos e informe el resultado de sumarlos, restarlos ymultiplicarlos
//
//b) Modifique la clase del ejercicio anterior de modo de incorporar los siguientesmétodos
//
//• cantidadRaices(), informa la cantidad de raíces del polinomio
//
//• raizCompleja(), devuelve una raíz compleja
public class PolinomioGrado2 {
    private double a, b, c;
    // Constructor
    public PolinomioGrado2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    // Evalúa el polinomio en un valor x
    public double evalua(double x) {
        return a * x * x + b * x + c;
    }
    // Devuelve las raíces como String

    public String mostrarRaices() {
        double d = b * b - 4 * a * c;  // discriminante
        double denom = 2 * a;
        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / denom;
            double r2 = (-b - Math.sqrt(d)) / denom;
            return "Raíces reales distintas: r1 = " + r1 + " , r2 = " + r2;
        } else if (d == 0) {
            double r = -b / denom;
            return "Raíces reales iguales: r = " + r;
        } else {
            double real = -b / denom;
            double imag = Math.sqrt(-d) / denom;
            return "Raíces complejas: r1 = " + real + " + " + imag + "i , r2 = " + real + " - " + imag + "i";
        }

    }

}
