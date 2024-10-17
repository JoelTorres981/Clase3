public class Vehiculos {
    String modelo, color, placa;
    int anio;
    double precio;

    //  Constructor 5
    public Vehiculos(String modelo, String color, String placa, int anio, double precio) {
        this.modelo = modelo;
        this.color = color;
        this.placa = placa;
        this.anio = anio;
        this.precio = precio;
    }

    //  Constructor 3
    public Vehiculos(String modelo, int anio, String color){
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }

    //  Constructor modelo
    public Vehiculos(String modelo) {
        this.modelo = modelo;
    }

    //  Constructor valores quemados
    public Vehiculos(){
        modelo = "Nissan";
        anio = 2023;
        color = "Rojo";
    }

    public void imprimir(){
        System.out.println("El modelo es " + modelo + ".\nEl anio del vehiculo es " + anio + ".\nEl color del vehiculo es " + color + ".\n");
    }

    public void imp_mod(){
        System.out.println("El modelo del vehiculo es " + modelo + "\n");
    }

    public void imprimir5(){
        System.out.println("El modelo es " + modelo + ".\nEl anio del vehiculo es " + anio + ".\nEl color del vehiculo es " + color + ".\nEl precio del vehiculo es " + precio + ".\nLa placa del vehiculo es " + placa + "\n");
    }
}