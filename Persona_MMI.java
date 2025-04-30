public class Persona_MMI {
    private int id;
    public Persona_MMI(int id, int nombre, double masa, double altura, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.masa = masa;
        this.altura = altura;
        this.edad = edad;
    }
    private int nombre;
    public int getId() {
        return id;
    }
    public int getNombre() {
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
    private double masa;
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(int nombre) {
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
    private double altura;
    @Override
    public String toString() {
        return "Persona_MMI [id=" + id + ", nombre=" + nombre + ", masa=" + masa + ", altura=" + altura + ", edad="
                + edad + "]";
    }
    private int edad;

    // Aquí se generarán los constructores, getters, setters y toString
}
