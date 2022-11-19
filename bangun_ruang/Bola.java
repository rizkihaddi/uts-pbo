package bangun_ruang;

public class Bola extends implemen {
    private double jari2;

    public Bola() {
        setJari2(1);
    }

    public Bola(int jari2) {
        setJari2(jari2);
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
        return ((4 * 3.14 * Math.pow(jari2, 3)) / 3);
    }

    @Override
    public double getLuas() {
        return 4 * 3.14 * Math.pow(jari2, 2);
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
