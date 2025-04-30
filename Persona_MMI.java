/**
 * Clase que representa una persona con atributos como id, nombre, masa, altura y edad.
 * Permite obtener y modificar estos atributos mediante los métodos getters y setters.
 * Además, incluye un método toString para representar la persona como una cadena de texto.
 * 
 * @author MMI
 * @version 1.0
 */
public class Persona_MMI {
    private int id;
    private String nombre;
    private double masa;
    private double altura;
    private int edad;

    /**
     * Constructor con todos los parámetros.
     * 
     * @param id     El ID de la persona.
     * @param nombre El nombre de la persona.
     * @param masa   La masa de la persona en kilogramos.
     * @param altura La altura de la persona en metros.
     * @param edad   La edad de la persona en años.
     */
    public Persona_MMI(int id, String nombre, double masa, double altura, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.masa = masa;
        this.altura = altura;
        this.edad = edad;
    }

    // Getters y setters

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMasa() {
        return masa;
    }

    public double getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Método que retorna la representación en cadena de la persona.
     * 
     * @return Una cadena que representa los atributos de la persona.
     */
    @Override
    public String toString() {
        return "Persona_MMI [id=" + id + ", nombre=" + nombre + ", masa=" + masa + ", altura=" + altura + ", edad=" + edad + "]";
    }
}
