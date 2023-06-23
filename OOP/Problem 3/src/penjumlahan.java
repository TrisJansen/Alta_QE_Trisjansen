public class penjumlahan extends Kalkulator {
    int a;
    int b;

    public penjumlahan(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int Penjumlahan() {
        int Penjumlahan = a+b;
        super.Penjumlahan();
        return a+b;
    }
}

