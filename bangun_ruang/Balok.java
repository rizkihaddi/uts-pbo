package bangun_ruang;

public class Balok extends implemen {
    private int Panjang;
    private int Lebar;
    private int Tinggi;

    public Balok() {
        setPanjang(1);
        setLebar(1);
        setTinggi(1);
    }

    public Balok(int Panjang, int Lebar, int Tinggi) {
        setPanjang(Panjang);
        setLebar(Lebar);
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
        return Panjang * Lebar * Tinggi;
    }

    @Override
    public double getLuas() {
        return 2 * (Panjang * Lebar + Lebar * Tinggi + Panjang * Tinggi);
    }

    @Override
    public void setJari2(double jari2) {
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
