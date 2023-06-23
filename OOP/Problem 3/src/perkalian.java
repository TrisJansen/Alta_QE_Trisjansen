public class perkalian extends Kalkulator {
    int a;
    int b;

    public perkalian(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int Perkalian() {
        int Perkalian = a*b;
        super.Perkalian();
        return a*b;
    }
}
