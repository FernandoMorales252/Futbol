package PooFutbol;

public class Masajista extends Persona {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista " + getNombre() + " " + getApellidos() + " se está concentrando.");
    }

    @Override
    public void viajar() {
        System.out.println("El masajista " + getNombre() + " " + getApellidos() + " está viajando.");
    }

    public void darMasaje() {
        System.out.println("El masajista " + getNombre() + " " + getApellidos() + " está dando un masaje.");
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

}
