package bangun_ruang;

public class Prisma extends implemen {

    private double alas;
    private double Tinggi;
    private double keliling;

    /**
     * 
     */
    public Prisma() {
        setAlasPrisma(1);
        setTinggi(1);
        setkeliling(1);
    }

    public Prisma(double alas, double Tinggi, double keliling) {
        setAlasPrisma(alas);
        setkeliling(keliling);
        setTinggi(Tinggi);
    }

    @Override
    public void setTinggi(double Tinggi) {
        this.Tinggi = Tinggi < 0 ? 1 : Tinggi;
    }

    @Override
    public double getVolume() {
        return alas * Tinggi;
    }

    @Override
    public void setPanjang(int Panjang) {
    }

    @Override
    public void setLebar(int Lebar) {
    }

    @Override
    public double getLuas() {
        return (2 * alas) + (keliling * Tinggi);
    }

    @Override
    public double getS() {
        return 0;
    }

    @Override
    public void setAlasPrisma(double alas) {
        this.alas = alas < 0 ? 1 : alas;

    }

    @Override
    public double setkeliling(double keliling) {
        return 0;
    }

    @Override
    public void setS(double s) {

    }

    @Override
    public void setJari2(double jari2) {

    }

}
