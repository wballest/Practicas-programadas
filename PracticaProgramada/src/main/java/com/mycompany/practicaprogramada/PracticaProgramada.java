package com.mycompany.practicaprogramada;

import javax.swing.JOptionPane;

public class PracticaProgramada {

    public static void main(String[] args) {
        int mes;
        String meslectura;
        int edad;
        String edadlectura;

        meslectura = JOptionPane.showInputDialog("Ingrese el mes");
        mes = Integer.parseInt(meslectura);

        // Ejercicio 1
        switch (mes) {
            case 1:
                System.out.println("Este mes es enero");
                System.out.println("Primer Cuatrimestre");
                break;
            case 2:
                System.out.println("Este mes es febrero");
                System.out.println("Primer Cuatrimestre");
                break;

            case 3:
                System.out.println("Este mes es marzo");
                System.out.println("Primer Cuatrimestre");
                break;

            case 4:
                System.out.println("Este mes es abril");
                System.out.println("Primer Cuatrimestre");
                break;

            case 5:
                System.out.println("Este mes es mayo");
                System.out.println("Segundo Cuatrimestre");
                break;

            case 6:
                System.out.println("Este mes es junio");
                System.out.println("Segundo Cuatrimestre");
                break;

            case 7:
                System.out.println("Este mes es julio");
                System.out.println("Segundo Cuatrimestre");
                break;

            case 8:
                System.out.println("Este mes es agosto");
                System.out.println("Segundo Cuatrimestre");
                break;
            case 9:
                System.out.println("Este mes es septiembre");
                System.out.println("Tercer Cuatrimestre");
                break;

            case 10:
                System.out.println("Este mes es octubre");
                System.out.println("Tercer Cuatrimestre");
                break;

            case 11:
                System.out.println("Este mes es noviembre");
                System.out.println("Tercer Cuatrimestre");
                break;

            case 12:
                System.out.println("Este mes es diciembre");
                System.out.println("Tercer Cuatrimestre");
                break;

        }

        //Ejercicio2
        edadlectura = JOptionPane.showInputDialog("Ingrese su edad");
        edad = Integer.parseInt(edadlectura);

        if (edad >= 0) {
            if (edad <= 5) {
                System.out.println("Es un bebe");
                if (edad >= 6) {
                    if (edad <= 11) {
                        System.out.println("Es un infante");
                    }
                }
            }
        } else if (edad >= 6) {
            if (edad <= 11) {
                System.out.println("Es un infante");
            }
        } else if (edad >= 12) {
            if (edad <= 18) {
                System.out.println("Es un adolescente");
            }
        } else if (edad >= 19) {
            if (edad <= 30) {
                System.out.println("Es joven");
            }
        } else if (edad >= 31) {
            if (edad <= 59) {
                System.out.println("Es un adulto");
            }

        } else if (edad >= 31) {
            if (edad <= 59) {
                System.out.println("Es un adulto");
            }
        } else {
            System.out.println("Es una persona mayor");
        }

    }
}
