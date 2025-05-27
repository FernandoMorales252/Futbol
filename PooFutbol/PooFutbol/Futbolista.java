package PooFutbol;

public class Futbolista extends Persona {
private String demarcacion;

public Futbolista(int id, String nombre, String apellidos, int edad, String demarcacion) {
    super(id, nombre, apellidos, edad);
    this.demarcacion = demarcacion;
}

@Override
public void concentrarse() {
    System.out.println("El futbolista " + getNombre() + " " + getApellidos() + " se está concentrando.");
}

public void jugarPartido() {
    System.out.println("El futbolista " + getNombre() + " " + getApellidos() + " está jugando un partido.");
}

public String getDemarcacion() {
    return demarcacion;
}

public void setDemarcacion(String demarcacion) {
    this.demarcacion = demarcacion;
}
}