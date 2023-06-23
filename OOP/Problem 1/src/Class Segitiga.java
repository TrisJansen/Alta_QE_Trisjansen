public class Segitiga {
    int alas;
    int sisi1;
    int sisi2;
    int tinggi;

    public Segitiga(int alas, int sisi1, int sisi2, int tinggi) {
        this.alas = alas;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.tinggi = tinggi;
    }

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void luasSegitiga() {
        int luasSegitiga = (alas * tinggi) / 2;
        System.out.println("Luas Segitiga adalah :" + luasSegitiga);
    }
    public void kelilingSegitiga(){
        int kelilingSegitiga = (alas*tinggi);
        System.out.println("Keliling Segitiga Adalah :"+ kelilingSegitiga);

    }
}
