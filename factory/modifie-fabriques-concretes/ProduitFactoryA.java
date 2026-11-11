public class ProduitFactoryA extends ProduitFactory {
    protected Produit createProduit() {
        return new ProduitA();
    }
}
