public class ProduitFactoryB extends ProduitFactory {
    protected Produit createProduit() {
        return new ProduitB();
    }
}
