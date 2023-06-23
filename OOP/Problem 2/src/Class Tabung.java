public class Tabung {
    double jari_jari;
    double tinggi;

    public Tabung(double jari_jari, double tinggi) {
        this.jari_jari = jari_jari;
        this.tinggi = tinggi;
    }

    public void volTabung(){
        double volTabung= tinggi*jari_jari*jari_jari*22/7;
        System.out.println("Valume Tabung Adalah :"+ volTabung);
    }
}
