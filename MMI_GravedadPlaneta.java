public class MMI_GravedadPlaneta {
    private int id;
    private String nombre;
    private double gravedadPlaneta;

    // Constructor por defecto
    public MMI_GravedadPlaneta() {
    }

    // Constructor con todos los argumentos
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

    // Método toString
    @Override
    public String toString() {
        return "MMI_GravedadPlaneta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", gravedadPlaneta=" + gravedadPlaneta +
                '}';
    }
}
