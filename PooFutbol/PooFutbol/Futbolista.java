package PooFutbol;

public class Futbolista extends Persona {
private String demarcacion;
private int dorsal;



public Futbolista(int id, String nombre, String apellidos, int edad,int dorsal, String demarcacion) {
    super(id, nombre, apellidos, edad , dorsal);
    this.demarcacion = demarcacion;
    this.dorsal = dorsal;
}

@Override
public void concentrarse() {
    System.out.println("El futbolista se está concentrando.");
}

public void Viajar() {
    System.out.println("El futbolista está viajando.");
  
}
public void jugarPartido() {
    System.out.println("El futbolista  está jugando un partido.");
}

public void entrenar() {
    System.out.println("El futbolista esta entrenando.");
}

public int getDorsal() {
    return dorsal;
}

public void setDorsal(int dorsal) {
    this.dorsal = dorsal;
}

public String getDemarcacion() {
    return demarcacion;
}

public void setDemarcacion(String demarcacion) {
    this.demarcacion = demarcacion;
}
}