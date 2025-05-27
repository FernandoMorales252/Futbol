package PooFutbol;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de cada clase
        Futbolista futbolista = new Futbolista(1, "Lionel", "Messi", 34, 10, "Delantero");
        Entrenador entrenador = new Entrenador(2, "Pep", "Guardiola", 50, "12345");
        Masajista masajista = new Masajista(3, "Juan", "Pérez", 40, "Fisioterapia", 15);

        // Llamar a los métodos de cada instancia
        futbolista.concentrarse();
        futbolista.jugarPartido();
        futbolista.entrenar();
        System.out.println("Dorsal: " + futbolista.getDorsal());
        System.out.println("Demarcación: " + futbolista.getDemarcacion());
        System.out.println("nombre: " + futbolista.getNombre());

        entrenador.concentrarse();
        entrenador.viajar();
        entrenador.dirigirEquipo();
        entrenador.dirigirEntrenamiento();
        System.out.println("ID Federación: " + entrenador.getIdFederacion());
        System.out.println("nombre: " + entrenador.getNombre());
        
        masajista.concentrarse();
        masajista.viajar();
        masajista.darMasaje();
        System.out.println("nombre: " + masajista.getNombre());
        
    }

}
