public class pembagian extends Kalkulator {
    int a;
    int b;

    public pembagian(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int Pembagian() {
        int Pembagian = a/b;
        super.Pembagian();
        return a/b;
    }
}
