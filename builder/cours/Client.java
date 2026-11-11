public class Client {
    public static void main(String[] args) {
        Directeur directeur = new Directeur();

        // construire pizza reine
        System.out.println("......................Pizza Reine Fabriquee.................");
        directeur.construirePizzaReine().print();

        // construire pizza piquante
        System.out.println("......................Pizza Piquante Fabriquee.................");
        directeur.construirePizzaPiquante().print();
    }
}
