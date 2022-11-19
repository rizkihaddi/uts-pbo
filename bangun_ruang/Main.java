package bangun_ruang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.println("--------- MENGHITUNG VOLUME BANGUN RUANG ----------");
                System.out.println("1. KERUCUT");
                System.out.println("2. BALOK");
                System.out.println("3. prisma");
                System.out.println("4. tabung");
                System.out.println("5. bola");
                System.out.println("6. keluar");

                System.out.print("PILIH : ");
                int pilih = input.nextInt();

                if (pilih == 1) {
                    System.out.println("\nMENGHITUNG VOLUME DAN LUAS KERUCUT");
                    System.out.print("\nMasukan jari-jari : ");
                    double jari2 = input.nextDouble();

                    System.out.print("Masukan tinggi : ");
                    double tinggi = input.nextDouble();

                    System.out.print("Masukan panjang garis : ");
                    double pg = input.nextDouble();

                    Kerucut k1 = new Kerucut();
                    k1.setJari2(jari2);
                    k1.setTinggi(tinggi);
                    System.out.println("\nLUASNYA ADALAH : " + k1.getLuas());
                    System.out.println("VOLUMENYA ADALAH : " + k1.getVolume());
                } else if (pilih == 2) {
                    System.out.println("\nmenghitung volume balok".toUpperCase());
                    System.out.print("\nMasukan Panjang : ");
                    int Panjang = input.nextInt();

                    System.out.print("Masukan Lebar : ");
                    int Lebar = input.nextInt();

                    System.out.print("Masukan Tinggi : ");
                    int Tinggi = input.nextInt();

                    Balok b1 = new Balok();
                    b1.setPanjang(Panjang);
                    b1.setLebar(Lebar);
                    b1.setTinggi(Tinggi);
                    System.out.println("\nLUAS ADALAH : " + b1.getLuas());
                    System.out.println("VOLUMENYA ADALAH : " + b1.getVolume());
                } else if (pilih == 3) {
                    System.out.print("Luas volue prisma");

                    System.out.print("Masukan tinggi :");
                    Double tinggip = input.nextDouble();

                    System.out.print("Masukan alas :");
                    double alasp = input.nextDouble();

                    System.out.print("Masukan keliling : ");
                    double kelilingp = input.nextDouble();

                    Prisma p1 = new Prisma();
                    p1.setAlasPrisma(alasp);
                    p1.setTinggi(tinggip);
                    p1.setkeliling(kelilingp);
                    System.out.println("luas nya adalah : " + p1.getLuas());
                    System.out.println("volume nya adalah : " + p1.getVolume());
                    break;
                } else if (pilih == 4) {
                    System.out.println("\nmenghitung tabung luas volume ".toUpperCase());
                    System.out.print("\nMasukan jari-jari : ");
                    int jari2p = input.nextInt();

                    System.out.print("Masukan Tinggi : ");
                    int Tinggi = input.nextInt();

                    Tabung t1 = new Tabung();

                    t1.setJari2(jari2p);
                    t1.setTinggi(Tinggi);
                    System.out.println("\nLUAS ADALAH : " + t1.getLuas());
                    System.out.println("VOLUMENYA ADALAH : " + t1.getVolume());
                } else if (pilih == 5) {
                    System.out.println("\nmenghitung bola".toUpperCase());
                    System.out.print("\nMasukan jari-jari : ");
                    int jari2p = input.nextInt();

                    Bola bola1 = new Bola();

                    bola1.setJari2(jari2p);
                    System.out.println("\nLUAS ADALAH : " + bola1.getLuas());
                    System.out.println("VOLUMENYA ADALAH : " + bola1.getVolume());
                } else if (pilih != 6) {
                    break;
                } else {
                    System.out.println("\nangka yg anda masukan salah\n".toUpperCase());
                }
            }
        }
    }
}
