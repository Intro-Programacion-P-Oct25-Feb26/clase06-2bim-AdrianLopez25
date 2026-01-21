/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class Ejercicio1 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int valor1 = ingresarValor();
        int valor2 = ingresarValor();
        int suma = obtenerSuma(valor1, valor2);
        imprimir(valor1, valor2, suma);
    }

    public static int ingresarValor() {
        int valor = 0;
        boolean bandera = true;

        while (bandera) {
            try {
                System.out.print("Ingresar el valor: ");
                valor = entrada.nextInt();
                
                bandera = false; 
                if (valor % 2 == 0) {
                    bandera = false; 
                } else {
                    System.out.println("El numero debe ser par");
                }

            } catch (Exception e) {

                System.out.printf("Lo sentimos hay un error del tipo:"
                        + " %s\nIntente de nuevo.\n", e);
                entrada.nextLine(); 
            }
        }
        return valor;
    }

    public static void imprimir(int a, int b, int c) {

        System.out.printf("Se han ingresado los valores %d y %d. "
                + "El resultado al sumar es: %d\n", a, b, c);
    }

    public static int obtenerSuma(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

} 