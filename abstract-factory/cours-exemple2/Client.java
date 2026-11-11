public class Client {
    public static void main(String[] args) {
        AbstractFactory essence = new FactoryEssence();
        AbstractFactory electrique = new FactoryElectrique();

        Automobile auto = null;
        Scooter scooter = null;

        System.out.println("Fabrique essence");
        auto = essence.ConstruireAutomobile();
        scooter = essence.ConstruireScooter();
        auto.methodeAutomobile();
        scooter.methodeScooter();

        System.out.println("Fabrique electrique");
        auto = electrique.ConstruireAutomobile();
        scooter = electrique.ConstruireScooter();
        auto.methodeAutomobile();
        scooter.methodeScooter();
    }
}
