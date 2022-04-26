package conteo.numeros;

import java.util.Scanner;

public class ConteoNumeros {

    static Scanner input = new Scanner(System.in);
    static int a = 0;
    static int b = 0;
    static int acum = 0;

    static void Lectura() {
        System.out.println("Bienvenid@ al programa que cuenta de un numero a otro ");
        System.out.print("Ingrese el primer numero : ");
        a = input.nextInt();
        System.out.print("Ingrese el segundo numero : ");
        b = input.nextInt();
    }

    static void Proceso() {
        Lectura();
        if (a == b) {
            System.out.println("Los numeros son iguales");
        }
        if (a >= b) {
            while (a >= b) {
                System.out.println(a);
                a--;
                acum += 1;
            }
        } else {
            while (a <= b) {
                System.out.println(a);
                a++;
                acum += 1;
            }
        }
        System.out.println("Se contaron " + acum + " numeros");
        System.out.println("Proceso Terminado");
    }

    public static void main(String[] args) {
        Proceso();
    }
}
