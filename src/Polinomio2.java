/*Crear una clase para guardar los datos de un polinomio de grado 2 en la forma ax2+bx+c
a) Crear atributos reales para los tres coeficientes
b) Crear los siguientes métodos:
• constructor: pone el valor de a, b y c que se pasan como parámetros
• evalua: calcula el valor del polinomio para el valor x que se pasa como parámetro
• normaliza: modifica los coeficientes dividiendo a cada uno por el coeficiente a
• raicesSonReales(): retorna un boolean que indica si las raíces son reales o no.
• raizRealMayor() y raizRealMenor(), devuelven las raíces reales del polinomio
• mostrarRaices: muestra en pantalla las dos raíces indicando si son reales o
imaginarias */

public class Polinomio2 {
    private double a;
    private double b;
    private double c;

    public Polinomio2(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a){this.a=a;}
    public void setB(double b){this.b=b;}
    public void setC(double c){this.c=c;}

    public double evalua(double x){
        return a*Math.pow(x, 2) + b*x + c; 
    }

    public void normaliza(){
        if (a != 0) {
            b = b/a;
            c = c/a;
            a = 1;
        }
    }

    public boolean raicesSonReales(){
        return Math.pow(b, 2) - 4*a*c >= 0 ;
    }

    public double raizRealMayor(){
        if (raicesSonReales()) {
            double r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
            double r2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
            return Math.max(r1, r2);
        }
        return Double.NaN;
    }

    public double raizRealMenor(){
        if (raicesSonReales()) {
            double r1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
            double r2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
            return Math.min(r1, r2);
        }
        return Double.NaN;
    }

    public void mostrarRaices(){
        if (raicesSonReales()) {
            System.out.println("Raiz real mayor: " + raizRealMayor());
            System.out.println("Raiz real menor: " + raizRealMenor());
        } else {
            double parteReal = -b / (2*a);
            double parteImaginaria = Math.sqrt(- (Math.pow(b, 2) - 4*a*c)) / (2*a);
            System.out.println("Raices imaginarias:");
            System.out.println("Raiz 1: " + parteReal + " + " + parteImaginaria + "i");
            System.out.println("Raiz 2: " + parteReal + " - " + parteImaginaria + "i");
        }
    }

    public void mostrarPolinomio(){
        System.out.println(a+"x^2" + " + " + b +"x" + " + "+ c);
    }
}

