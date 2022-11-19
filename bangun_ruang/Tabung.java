package bangun_ruang;

public class Tabung extends implemen {
    private double jari2;
    private int Tinggi;

    public Tabung() {
        setJari2(1);
        setTinggi(1);
    }

    public Tabung(int jari2, int Tinggi) {
        setJari2(jari2);
        setTinggi(Tinggi);
    }

    @Override
    public void setTinggi(double Tinggi) {
        this.Tinggi = (int) (Tinggi < 0 ? 1 : Tinggi);
    }

    @Override
    public void setPanjang(int Panjang) {
        this.Panjang = Panjang < 0 ? 1 : Panjang;
    }

    @Override
    public void setLebar(int Lebar) {
        this.Lebar = Lebar < 0 ? 1 : Lebar;
    }

    @Override
    public double getVolume() {
        return (3.14 * jari2 * jari2) * Tinggi;
    }

    @Override
    public double getLuas() {
        return 2 * (3.14 * jari2 * jari2) + (2 * 3.14 * jari2 * Tinggi);
    }

    @Override
    public void setJari2(double jari2) {
        this.jari2 = jari2 < 0 ? 1 : jari2;
    }

    @Override
    public double getS() {
        return 0;
    }

    @Override
    public void setS(double s) {

    }

    @Override
    public void setAlasPrisma(double alas) {

    }

    @Override
    public double setkeliling(double keliling) {
        return 0;
    }
}
