package Colecciones;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Di un dia de la semana 0-6");
        int dia=leer.nextInt();
        System.out.println(DiaDeLaSemana(dia));





    }

    public static String DiaDeLaSemana(int dia) {
        String diaEscrito="";
        switch (dia) {
        case 0:
            diaEscrito="Hoy es Domingo";
            break;
        case 1:
            diaEscrito="Hoy es Lunes";
            break;
        case 2:
            diaEscrito="Hoy es Martes";
            break;
        case 3:
            diaEscrito="Hoy es Miercoles";
            break;
        case 4:
            diaEscrito="Hoy es Jueves";
            break;
        case 5:
            diaEscrito="Hoy es Viernes";
            break;
        case 6:
            diaEscrito="Hoy es Sabado";
            break;
        default:
            diaEscrito="El dia escrito no es un dia valido";

        }



        return diaEscrito;
    }

}