public class TestSingleton {
    public static void main(String[] args) {
        int som = Singleton.getInstance().Somme(2, 5);
        System.out.println("la somme est: " + som);

        int diff = Singleton.getInstance().difference(5, 2);
        System.out.println("la difference est: " + diff);

        // une instance est deja en cours
        Singleton s1 = Singleton.getInstance(8, 3);
        s1.affiche();

        Singleton s2 = Singleton.getInstance(16, 19);
        s2.affiche();

        System.out.println("meme instance ? " + (s1 == s2));
    }
}
