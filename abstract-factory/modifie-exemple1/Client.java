public class Client {
    public static void main(String[] args) {
        IProduitFactory produitFactory1 = new ProduitFactory1();
        IProduitFactory produitFactory2 = new ProduitFactory2();

        ProduitA produitA = null;
        ProduitB produitB = null;
        ProduitD produitD = null;

        System.out.println("Utilisation de la premiere fabrique");
        produitA = produitFactory1.getProduitA();
        produitB = produitFactory1.getProduitB();
        produitD = produitFactory1.getProduitD();
        produitA.methodeA();
        produitB.methodeB();
        produitD.methodeD();

        System.out.println("Utilisation de la seconde fabrique");
        produitA = produitFactory2.getProduitA();
        produitB = produitFactory2.getProduitB();
        produitD = produitFactory2.getProduitD();
        produitA.methodeA();
        produitB.methodeB();
        produitD.methodeD();
    }
}
