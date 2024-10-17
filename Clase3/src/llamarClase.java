public class llamarClase {
    public static void main(String[] args) {
        Vehiculos auto1 = new Vehiculos("Toyota", 2024, "Negro");
        Vehiculos auto2 = new Vehiculos("Chevrolet", 2012,"Plateado");
        Vehiculos auto3 = new Vehiculos("Ferrari");
        Vehiculos auto4 = new Vehiculos("Fiat","negro","PBC2145",2024,10000);
        Vehiculos auto5 = new Vehiculos();

        // 3 valores
        auto1.imprimir();
        auto2.imprimir();
        auto3.imprimir();

        // un solo valor
        auto3.imp_mod();

        // todos los valores
        auto4.imprimir5();

        // imprimir datos quemados
        auto5.imprimir();
    }
}