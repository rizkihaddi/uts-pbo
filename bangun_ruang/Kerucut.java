package bangun_ruang;

public class Kerucut extends implemen {

    private double jari2;
    private double Tinggi;
    private double s;

    public Kerucut() {
        setJari2(1);
        setTinggi(1);
    }

    public Kerucut(double jari2, double Tinggi) {
        setJari2(jari2);
        setTinggi(Tinggi);
    }

    @Override
    public void setJari2(double jari2) {
        this.jari2 = jari2 < 0 ? 1 : jari2;
    }

    @Override
    public void setTinggi(double Tinggi) {
        this.Tinggi = Tinggi < 0 ? 1 : jari2;
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * (3.14 * jari2 * jari2) * Tinggi;
    }

    @Override
    public void setPanjang(int Panjang) {
    }

    @Override
    public void setLebar(int Lebar) {
    }

    @Override
    public double getLuas() {
        return 3.14 * jari2 * (jari2 + s);
    }

    @Override
    public double getS() {
        return 0;
    }

    @Override
    public void setS(double s) {
        this.s = s < 0 ? 1 : s;

    }

    @Override
    public void setAlasPrisma(double alas) {
        // TODO Auto-generated method stub

    }

    @Override
    public double setkeliling(double keliling) {
        // TODO Auto-generated method stub
        return 0;
    }

}
