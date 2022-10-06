package com.mycompany.practicaprogramada;

import javax.swing.JOptionPane;

public class Leccion3 {

    public static void clase03() {
        // 1 Ejercicio
        /*int tiempovuelta, tiempopits, porcentajepits;
        int promediovuelta = 0;
        int promediopits = 0;

        for (int i = 1; i <= 10; i++) {
            String tiempovueltaLec = JOptionPane.showInputDialog("Ingrese el tiempo de la vuelta en segundos:");
            tiempovuelta = Integer.parseInt(tiempovueltaLec);
            String tiempopitsLec = JOptionPane.showInputDialog("Ingrese en pits de cada vuelta en segundos:");
            tiempopits = Integer.parseInt(tiempopitsLec);
            promediovuelta = promediovuelta + tiempovuelta;
            promediopits = promediopits + tiempopits;
        }

        promediovuelta = promediovuelta / 10;
        promediopits = promediopits / 10;

        System.out.println("El tiempo promedio de tiempo en vueltas es de: " + promediovuelta + " segundos");
        System.out.println("El tiempo promedio de tiempo en pits es: " + promediopits + " segundos");
        System.out.println("El porcentaje de tiempo que se pasa en los pits es de: " + promediopits / promediovuelta * 100 + " %");*/
        
        // Ejercicio 2
        int grupo1 = 0, grupo2 = 0, grupo3 = 0, grupo4 = 0, grupo5 = 0;
        int promedio = 0;
        int cantidadEstudiantes;
        String cantidadEstudiantesLec = JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes");
        cantidadEstudiantes = Integer.parseInt(cantidadEstudiantesLec);
        for (int k = 1; k <= cantidadEstudiantes; k++) {
            String alturaLectura = JOptionPane.showInputDialog("Ingrese la altura del estudiante en centimetros");
            int altura = Integer.parseInt(alturaLectura);
            promedio = promedio+altura;
            if (altura < 100) {
                grupo1 = grupo1 + 1;
            } else if (altura >= 100) {
                grupo2 = grupo2 + 1;
            } else if (altura >= 121) {
                grupo3 = grupo3 + 1;
            } else if (altura >= 131) {
                grupo4 = grupo4 + 1;
            } else if (altura > 141) {
                grupo5 = grupo5 + 1;
            }
        }
        System.out.println("La cantidad de estudiantes menores que 100 cm son: " + grupo1);
        System.out.println("La cantidad de estudiantes entre 100 y 120cm son: " + grupo2);
        System.out.println("La cantidad de estudiantes entre 121 y 130cm son: " + grupo3);
        System.out.println("La cantidad de estudiantes entre 131 y 140cm son: " + grupo4);
        System.out.println("La cantidad de estudiantes mayores de 140cm son: " + grupo5);
        System.out.println("El promedio de las alturas es de: "+promedio/cantidadEstudiantes+"cm");

    }
}
