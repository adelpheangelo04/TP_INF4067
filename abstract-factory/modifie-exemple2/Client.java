public class Client {
    public static void main(String[] args) {
        AbstractFactory essence = new FactoryEssence();
        AbstractFactory electrique = new FactoryElectrique();

        Automobile auto = null;
        Scooter scooter = null;
        Camion camion = null;

        System.out.println("Fabrique essence");
        auto = essence.ConstruireAutomobile();
        scooter = essence.ConstruireScooter();
        camion = essence.ConstruireCamion();
        auto.methodeAutomobile();
        scooter.methodeScooter();
        camion.methodeCamion();

        System.out.println("Fabrique electrique");
        auto = electrique.ConstruireAutomobile();
        scooter = electrique.ConstruireScooter();
        camion = electrique.ConstruireCamion();
        auto.methodeAutomobile();
        scooter.methodeScooter();
        camion.methodeCamion();
    }
}
