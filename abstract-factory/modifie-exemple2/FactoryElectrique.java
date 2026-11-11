public class FactoryElectrique extends AbstractFactory {
    public Automobile ConstruireAutomobile() {
        return new AutomobileElectrique();
    }
    public Scooter ConstruireScooter() {
        return new ScooterElectrique();
    }
    public Camion ConstruireCamion() {
        return new CamionElectrique();
    }
}
