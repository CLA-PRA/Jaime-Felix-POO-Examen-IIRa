package miPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );

        System.out.println("Cuenta");
        System.out.println("======");
        System.out.println();

        // Solicitar los datos de la cuenta (titular y saldo)
        System.out.print("Proporcione el titular de la cuenta:");
        System.out.print("Proporcione el saldo inicial de la cuenta:");

        // Crear el objeto Cuenta
        Cuenta c = new Cuenta(titular, saldo);

        // Solicitar la cantidad a ingresar y cantidad a retirar
        System.out.print("Proporcione la cantidad a ingresar:");

        System.out.print("Proporcione la cantidad a retirar:");

        System.out.println();
        
        // Mostrar los datos de la cuenta
        System.out.println( c );

        entrada.close();
    }
}