package tarea8;

import java.util.Scanner;

/**
 *
 * @author carli
 */
public class Tarea8 {

    public static void main(String[] args) {
        Integer[][] array = {{3, 2, 3, 1}, {5, 9, 6, 19}};
        Operaciones.amosar(array);
        System.out.println("Elemento minimo: " + Operaciones.elementoMinimo(array));
        System.out.println("Elemento maximo: " + Operaciones.elementoMaximo(array));

        System.out.print("Introduce el elemento a buscar:");
        Scanner sc = new Scanner(System.in);
        Integer elementoBuscar = sc.nextInt();
        Operaciones.buscarObxecto(array, elementoBuscar);

        
        System.out.print("Introduce el valor del objeto a borrar: ");
        elementoBuscar = sc.nextInt();
        Operaciones.borrarObxecto(array, elementoBuscar);

        Operaciones.amosar(array);
    }

}
