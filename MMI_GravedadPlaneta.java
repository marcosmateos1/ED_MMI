/**
 * Clase que representa un planeta con atributos como id, nombre y gravedad.
 * Permite calcular el peso de una persona en dicho planeta usando la gravedad del planeta.
 * 
 * @author MMI
 * @version 1.0
 */
public class MMI_GravedadPlaneta {
    private int id;
    private String nombre;
    private double gravedadPlaneta;

    /**
     * Constructor por defecto.
     */
    public MMI_GravedadPlaneta() {
    }

    /**
     * Constructor con todos los argumentos.
     * 
     * @param id             El ID del planeta.
     * @param nombre         El nombre del planeta.
     * @param gravedadPlaneta La gravedad del planeta en metros por segundo cuadrado.
     */
    public MMI_GravedadPlaneta(int id, String nombre, double gravedadPlaneta) {
        this.id = id;
        this.nombre = nombre;
        this.gravedadPlaneta = gravedadPlaneta;
    }

    // Getters y setters

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

    public double getGravedadPlaneta() {
        return gravedadPlaneta;
    }

    public void setGravedadPlaneta(double gravedadPlaneta) {
        this.gravedadPlaneta = gravedadPlaneta;
    }

    /**
     * Método que calcula el peso de una persona en el planeta.
     * 
     * @param persona La persona cuya masa se utilizará para calcular el peso.
     * @return El peso de la persona en el planeta (en kilogramos).
     */
    public double calcularPeso(Persona_MMI persona) {
        return persona.getMasa() * this.gravedadPlaneta;
    }

    /**
     * Método que retorna la representación en cadena del planeta.
     * 
     * @return Una cadena que representa los atributos del planeta.
     */
    @Override
    public String toString() {
        return "MMI_GravedadPlaneta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", gravedadPlaneta=" + gravedadPlaneta +
                '}';
    }
}
