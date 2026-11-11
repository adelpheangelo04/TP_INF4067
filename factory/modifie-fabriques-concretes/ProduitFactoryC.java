public class ProduitFactoryC extends ProduitFactory {
    protected Produit createProduit() {
        return new ProduitC();
    }
}
