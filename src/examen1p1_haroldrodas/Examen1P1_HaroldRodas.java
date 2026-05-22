package examen1p1_haroldrodas;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Examen1P1_HaroldRodas {

    static Scanner sc = new Scanner(System.in);

    public static int combinatorio(int n, int r) {

        int x = n - r;
        int nume = (factorial(n));
        int denom = (factorial(r)) * (factorial(x));
        int ecuacion = nume / denom;
        return ecuacion;
    }

    public static int factorial(int num) {
        int fact = 1;
        for (int i = num; i != 1; i--) {
            fact *= i;
        }
        return fact;
    }

    public static void loContiene(String palUno, String palDos) {
        int temp = 0;
        for (int i = 0; i >= palUno.length(); i++) {
            char y = palUno.charAt(i);
            char x = palDos.charAt(0);

            for (int j = 1; x == y; j++) {
                if (palUno.charAt(i + 1) == palDos.charAt(j)) {
                    
                }
            }
        }
        if (temp == palDos.length()) {
            System.out.println("La cadena: " + palUno + "Si Contiene la cadena: " + palDos);
        } else {
            System.out.println("La cadena: " + palUno + "NO Contiene la cadena: " + palDos);
        }
    }
    
    public static void figura(int num) {
        for (int i = 0; i != num; i++ ) {
            for (int j = 0; j != i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Contains sin Contains");
        System.out.println("2. La venganza del triangulo");
        System.out.println("3. Figuras, Figuras y mas Figuras");
        System.out.println("4. Salir");
        int opc = sc.nextInt();

        while (opc != 4) {
            switch (opc) {
                case 1:
                    System.out.println("Opcion 1 - Contains sin Contains");
                    System.out.println("Ingrese la primera cadena: ");
                    String primeraCadena = sc.next();
                    System.out.println("Ingrese la segunda cadena: ");
                    String segundaCadena = sc.next();
                    while (primeraCadena.length() < segundaCadena.length()) {
                        System.out.println("La segunda cadena no puede ser mayor que la primera");
                        System.out.println("Ingrese la primera cadena: ");
                        primeraCadena = sc.next();
                        System.out.println("Ingrese la segunda cadena: ");
                        segundaCadena = sc.next();
                    }
                    loContiene(primeraCadena, segundaCadena);
                    break;
                case 2:
                    System.out.println("Opcion 2 - La venganza del triangulo");
                    System.out.println("Ingrese n: ");
                    int n = sc.nextInt();
                    System.out.println("Ingrese r: ");
                    int r = sc.nextInt();
                    while (n < 0 || r < 0 || n < r) {
                        System.out.println("N tiene que ser mayor o igual a 0 y a R: ");
                        n = sc.nextInt();
                        System.out.println("R tiene que ser mayor o igual a 0: ");
                        r = sc.nextInt();
                    }
                    System.out.println("El Combinatorio C(" + n + "," + r + ")" + " es: " + (combinatorio(n, r)));
                    break;
                case 3:
                    System.out.println("Opcion 3 - Figuras, Figuras y mas Figuras");
                    System.out.println("Ingrese un numero par entre 12 y 20: ");
                    int num = sc.nextInt();
                    while ((num % 2 != 0) || num < 12 || num > 20) {
                        System.out.println("Tamano invalido intente de nuevo ");
                        num = sc.nextInt();
                    }
                    figura(num);
                    break;
                default:
                    System.out.println("Opcion no valida!");
                    break;

            }
            System.out.println("Menu");
            System.out.println("1. Contains sin Contains");
            System.out.println("2. La venganza del triangulo");
            System.out.println("3. Figuras, Figuras y mas Figuras");
            System.out.println("4. Salir");
            opc = sc.nextInt();
        }
        System.out.println("Saliendo del programa.");

    }

}
