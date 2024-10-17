public class Jugador {
    String nombre, pais;
    int edad;

    public Jugador() {
        nombre = "Joel";
        pais = "Ecuador";
        edad = 20;
    }

    public Jugador(String nombre, String pais, int edad) {
        this.nombre = nombre;
        this.pais = pais;
        this.edad = edad;
    }

    public void patear(){
        System.out.println("El jugador " + nombre + " de " + pais + " de " + edad + " años de edad, patea");
    }
    public void correr(){
        System.out.println("El jugador " + nombre + " de " + pais + " de " + edad + " años de edad, corre");
    }
    public void saltar(int s){
        int saltos = 2 + s;
        System.out.println("El jugador " + nombre + " de " + pais + " de " + edad + " años de edad, salta " + saltos);
    }

}
