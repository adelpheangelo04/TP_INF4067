public class FactoryEssence extends AbstractFactory {
    public Automobile ConstruireAutomobile() {
        return new AutomobileEssence();
    }
    public Scooter ConstruireScooter() {
        return new ScooterEssence();
    }
    public Camion ConstruireCamion() {
        return new CamionEssence();
    }
}
