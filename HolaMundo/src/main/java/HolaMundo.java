/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class HolaMundo {

    public static void main(String[] args) {
        
        var nombre = "Karla";
        var apellido = "Esparza";
        
        System.out.println(nombre + " " + apellido);
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b\b" + nombre);
        System.out.println("Retorno de carro: \r" + nombre);
        System.out.println("Retorno de carro:"+ System.lineSeparator() + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla doble: \"" + nombre + "\"");  
        
        System.out.println("saludos");
        System.out.print("adios");
        System.out.println("nos vemos");
        
    }
}
