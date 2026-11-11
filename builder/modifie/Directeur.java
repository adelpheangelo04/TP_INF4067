public class Directeur {
    // construire pizza piquante
    public Pizza construirePizzaPiquante() {
        MonteurPizza pizzap = new MonteurPizzaPiquante();
        return pizzap.getPizza();
    }

    // construire pizza reine
    public Pizza construirePizzaReine() {
        MonteurPizza pizzaReine = new MonteurPizzaReine();
        return pizzaReine.getPizza();
    }

    // construire pizza vegetarienne (produit D)
    public Pizza construirePizzaVegetarienne() {
        MonteurPizza pizzaVeg = new MonteurPizzaVegetarienne();
        return pizzaVeg.getPizza();
    }
}
