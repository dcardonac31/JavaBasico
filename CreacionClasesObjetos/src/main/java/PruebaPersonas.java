
public class PruebaPersonas {

    public static void main(String[] args) {
        //Creación de objeto tipo persona
        Persona persona1;
        
        //Instancioando (creado) in ubjeto de la clase persona
        persona1 = new Persona();
        
        //Accedemos al objeto persona y llamamos e metodo desplegarNombres
        persona1.desplegarNombres();
        
        //Modificamos los valores de los atributos del objeto Persona
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        
        //Volvemos a imprimir los valores
        System.out.println("");
        persona1.desplegarNombres();
        
        //Creación de un segundo objeto de tipo persona
        Persona persona2 = new Persona();
        persona2.nombre = "David";
        persona2.apellido = "Cardona";
        persona2.desplegarNombres();
    }
}
