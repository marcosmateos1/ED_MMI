public class Main {

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

    public static void calcularIMC(Persona_MMI p) {
        double masa = p.getMasa();
        double altura = p.getAltura();
        double imc = masa / (altura * altura);
        System.out.println("El IMC de la persona " + p.getNombre() + " es " + imc);
    }

    public static void calcularPeso(Persona_MMI p, MMI_GravedadPlaneta g) {
        double peso = p.getMasa() * g.getGravedadPlaneta();
        System.out.println("Peso de " + p.getNombre() + " en " + g.getNombre() + " es " + peso);
    }

    public static void mostrarInformacion(Persona_MMI p, MMI_GravedadPlaneta g1, MMI_GravedadPlaneta g2, MMI_GravedadPlaneta g3) {
        System.out.println(p);
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
    }
}
