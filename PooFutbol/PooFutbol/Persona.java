package PooFutbol;
public abstract class Persona {
 private int id;
    private String nombre;
    private String apellidos;
    private int edad;  
    
    public Persona(int id, String nombre, String apellidos, int edad, int dorsal) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Persona(int id2, String nombre2, String apellidos2, int edad2) {
        //TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void viajar() {
        System.out.println("La persona está viajando.");
    }

    public abstract void concentrarse(); 

}
