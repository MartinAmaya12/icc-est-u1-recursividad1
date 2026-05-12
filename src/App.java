public class App {
    public static void main(String[] args) throws Exception {
        Ejercicios ejer = new Ejercicios();
        System.out.println("Ejercicio 1 = ");
        int rest1 = ejer.sumaConsecutivos(5);

        System.out.println(rest1);
        System.out.println("Ejercicio 2= ");
        int rest2 = ejer.sumaConsecutivosPasos(5);
        System.out.println(rest2);

        System.out.println("Ejercicio 3 = ");
        int rest3 = ejer.getPotencia(2, 5);
        System.out.println(rest3);

        System.out.println("Ejercicio 4 = ");
        int rest4 = ejer.sumaDigitos(456);
        System.out.println(rest4);
    }
}
