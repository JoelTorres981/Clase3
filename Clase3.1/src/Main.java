public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();

        jugador1.patear();
        jugador1.correr();

        Jugador jugador2 = new Jugador("Pepe","Argentina",18);

        jugador2.patear();
        jugador2.correr();
        jugador2.saltar(8);

    }
}