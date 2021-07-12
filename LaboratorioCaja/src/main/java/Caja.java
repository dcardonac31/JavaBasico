public class Caja {
    int ancho;
    int alto;
    int profundo;
    
    public Caja()
    {
        System.out.println("Constructor vacio");
    }
    
    public Caja(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    int calcularVolumen(){
        int volumen = 0;
        volumen = this.ancho * this.alto * this.profundo;
        return volumen;
    }
}
