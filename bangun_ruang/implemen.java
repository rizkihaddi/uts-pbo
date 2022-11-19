package bangun_ruang;

public abstract class implemen implements bangunRuang {
    protected double jari2;
    protected double Tinggi;
    protected int Panjang;
    protected int Lebar;

    @Override
    public abstract void setPanjang(int Panjang);

    public int getPanjang() {
        return Panjang;
    }

    @Override
    public abstract void setLebar(int Lebar);

    public int getLebar() {
        return Lebar;
    }

    @Override
    public abstract void setJari2(double jari2);

    public double getJari2() {
        return jari2;
    }

    @Override
    public abstract void setTinggi(double Tinggi);

    public double getTinggi() {
        return Tinggi;
    }

    @Override
    public abstract double getVolume();
}
