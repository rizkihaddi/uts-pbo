package bangun_ruang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                System.out.println("--------- Menghitung Bangun Ruang ----------");
                System.out.println("1. Kerucut");
                System.out.println("2. Balok");
                System.out.println("3. Tabung");
                System.out.println("4. Keluar");
                System.out.println("\n---------------------------------------------");
                System.out.print("Pilih Menu : ");

                int pilih = input.nextInt();

                if (pilih == 1) {
                    System.out.println("\n ---------- Menghitung Volume dan Luas Kerucut -------------");
                    System.out.print("\nMasukan jari-jari : ");
                    double jari2 = input.nextDouble();

                    System.out.print("Masukan tinggi : ");
                    double tinggi = input.nextDouble();

                    Kerucut k1 = new Kerucut();
                    k1.setJari2(jari2);
                    k1.setTinggi(tinggi);
                    System.out.println("\n Luasnya adalah : " + k1.getLuas());
                    System.out.println("Volumenya : " + k1.getVolume());
                } else if (pilih == 2) {
                    System.out.println("\nMenghitung luas & volume balok -".toUpperCase());
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
                    System.out.println("\nLuasnya ialah : " + b1.getLuas());
                    System.out.println("Volumenya : " + b1.getVolume());
                } else if (pilih == 3) {
                    System.out.println("\nMenghitung tabung luas volume ".toUpperCase());
                    System.out.print("\nMasukan jari-jari : ");
                    int jari2p = input.nextInt();

                    System.out.print("Masukan Tinggi : ");
                    int Tinggi = input.nextInt();

                    Tabung t1 = new Tabung();

                    t1.setJari2(jari2p);
                    t1.setTinggi(Tinggi);
                    System.out.println("\n Luasnya ialah : " + t1.getLuas());
                    System.out.println("Volume-nya : " + t1.getVolume());
                } else if (pilih == 4) {
                    break;
                } else {
                    System.out.println("\nAngka yg anda masukan salah!".toUpperCase());
                }
            }
        }
    }
}
