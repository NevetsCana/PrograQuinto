/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabancario;

import java.util.Scanner;

/**
 *
 * @author SERVER_PC
 */
public class SistemaBancario {

// declaramos las variables globales de todo el sistema. 
    static String[][] cuenta = new String[5][5];
    static double[][] saldos = new double[5][2];
    static String[][] transacciones = new String[5][2];

    public static void main(String[] args) {
        int opcion = 0;
        Scanner leer = new Scanner(System.in);
        while (opcion != 7) {
//            for (int i = 0; i < 50; i++) {
//                System.out.println("");
//            }
            System.out.println("1.Crearcuenta.");
            System.out.println("2.Transacciónbancariasinpemovil.");
            System.out.println("3.Depositobancarioalacuenta.");
            System.out.println("4.Vertransacciones.");
            System.out.println("5.Ver cuentas");
            System.out.println("6.Versaldo,porcedula.");
            System.out.println("7.Salir.");
            System.out.println("digite una opcion");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    crearCuenta();
                    break;
                case 2:
                    transaccion();
                    break;
                case 3:
                    deposito();
                    break;
                case 4:
                    verTransacciones();
                    break;
                case 5:
                    verCuentas();
                    break;
                case 6:
                    verSaldo();

                    break;

            }
        }

    }

    private static void crearCuenta() {
        int indice = 0;

        for (int i = 0; i < cuenta.length; i++) {
            if (cuenta[i][0] != null) {
                indice++;
            }
            
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite cedula");
        cuenta[indice][0] = sc.nextLine();
        System.out.println("Digite nombre");
        cuenta[indice][1] = sc.nextLine();
        System.out.println("Digite apellido");
        cuenta[indice ][2] = sc.nextLine();
        System.out.println("Digite telefono");
        cuenta[indice][3] = sc.nextLine();
        System.out.println("Digite moneda");
        cuenta[indice ][4] = sc.nextLine();
        
    }

    private static void transaccion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void deposito() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void verTransacciones() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void verCuentas() {
        for (int i = 0; i < cuenta.length; i++) {
            for (int j = 0; j < cuenta.length; j++) {
                System.out.print(cuenta[i][j]+"\t\t");
            }
            System.out.println("");
        }
    }

    private static void verSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
