public class ProduitFactoryD extends ProduitFactory {
    protected Produit createProduit() {
        return new ProduitD();
    }
}
