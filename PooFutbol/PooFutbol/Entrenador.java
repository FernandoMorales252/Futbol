package PooFutbol;

public class Entrenador extends Persona {
    private String idFederacion;
    

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    

    @Override
    public void concentrarse() {
        System.out.println("El entrenador se está concentrando.");
    }

    @Override 
    public void viajar() {
        System.out.println("El entrenador está viajando.");
    }

    public void dirigirEquipo() {
        System.out.println("El entrenador está dirigiendo el equipo.");
    }

    public void dirigirEntrenamiento() {
        System.out.println("El entrenador está dirigiendo el entrenamiento.");
    }


    public String getIdFederacion() {
        return idFederacion;
    }


    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

   

}
