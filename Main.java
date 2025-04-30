/**
 * Clase principal que contiene el método main para ejecutar el programa.
 * Instancia objetos de tipo Persona y MMI_GravedadPlaneta, y realiza cálculos de IMC y peso en diferentes planetas.
 * 
 * @author MMI
 * @version 1.0
 */
public class Main {

    /**
     * Método principal que ejecuta el programa.
     * 
     * @param args Los argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        // Instancias de personas
        Persona_MMI pers1 = new Persona_MMI(1, "Papa", 85, 1.75, 22);
        Persona_MMI pers2 = new Persona_MMI(2, "Pepe", 75, 1.80, 25);

        // Instancias de planetas
        MMI_GravedadPlaneta plan1 = new MMI_GravedadPlaneta(1, "Tierra", 9.81);
        MMI_GravedadPlaneta plan2 = new MMI_GravedadPlaneta(2, "Marte", 3.72);
        MMI_GravedadPlaneta plan3 = new MMI_GravedadPlaneta(3, "Jupiter", 24.79);

        // Cálculo de IMC
        calcularIMC(pers1);
        calcularIMC(pers2);

        // Cálculo de peso en planetas
        calcularPeso(pers1, plan1);
        calcularPeso(pers1, plan2);
        calcularPeso(pers1, plan3);

        calcularPeso(pers2, plan1);
        calcularPeso(pers2, plan2);
        calcularPeso(pers2, plan3);

        // Mostrar información
        mostrarInformacion(pers1, plan1, plan2, plan3);
        mostrarInformacion(pers2, plan1, plan2, plan3);
    }

    /**
     * Método que calcula el IMC de una persona.
     * 
     * @param p La persona para la que se va a calcular el IMC.
     * @return El IMC de la persona.
     */
    public static void calcularIMC(Persona_MMI p) {
        double masa = p.getMasa();
        double altura = p.getAltura();
        double imc = masa / (altura * altura);
        System.out.println("El IMC de la persona " + p.getNombre() + " es " + imc);
    }

    /**
     * Método que calcula el peso de una persona en un planeta.
     * 
     * @param p La persona cuya masa se utilizará para calcular el peso.
     * @param g El planeta en el que se calculará el peso.
     */
    public static void calcularPeso(Persona_MMI p, MMI_GravedadPlaneta g) {
        double peso = p.getMasa() * g.getGravedadPlaneta();
        System.out.println("Peso de " + p.getNombre() + " en " + g.getNombre() + " es " + peso);
    }

    /**
     * Método que muestra la información de la persona y los planetas.
     * 
     * @param p  La persona de la que se va a mostrar la información.
     * @param g1 El primer planeta.
     * @param g2 El segundo planeta.
     * @param g3 El tercer planeta.
     */
    public static void mostrarInformacion(Persona_MMI p, MMI_GravedadPlaneta g1, MMI_GravedadPlaneta g2, MMI_GravedadPlaneta g3) {
        System.out.println(p);
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
    }
}
