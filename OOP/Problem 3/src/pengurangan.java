public class pengurangan extends Kalkulator{
    int a;
    int b;

    public pengurangan(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int Pengurangan() {
        int pengurangan = a - b;
        super.Pengurangan();
        return a-b;
    }
}
