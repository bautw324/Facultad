public class TestPolinomio {
    public static void main(String[] args) {
        Polinomio2 polinomio = new Polinomio2(6, 2, 5);
        System.out.println("Polinomio: ");
        polinomio.mostrarPolinomio();

        System.out.println("Evaluando polinomio en x=2: " + polinomio.evalua(2));

        System.out.println("¿Las raíces son reales? " + polinomio.raicesSonReales());

        System.out.println("Raíz real mayor: " + polinomio.raizRealMayor());
        System.out.println("Raíz real menor: " + polinomio.raizRealMenor());

        System.out.println("Mostrando raíces:");
        polinomio.mostrarRaices();

        System.out.println("\nNormalizando polinomio...");
        polinomio.normaliza();
        System.out.println("Polinomio normalizado: ");
        polinomio.mostrarPolinomio();

        System.out.println("Evaluando polinomio normalizado en x=2: " + polinomio.evalua(2));
        System.out.println("Coeficientes normalizados:");
        polinomio.mostrarRaices();
    }
}
