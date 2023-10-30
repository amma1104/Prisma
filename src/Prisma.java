import java.util.Scanner;
/**
 * Program untuk menghitung luas alas dan volume prisma
 */
public class Prisma {

    /**
     * Deklarasi variabel
     */
    private double panjangAlas;
    private double tinggiAlas;
    private double tinggiPrisma;

    /**
     * Konstruktor
     *
     * @param panjangAlas Panjang alas prisma
     * @param tinggiAlas Tinggi alas prisma
     * @param tinggiPrisma Tinggi prisma
     */
    public Prisma(double panjangAlas, double tinggiAlas, double tinggiPrisma) {
        this.panjangAlas = panjangAlas;
        this.tinggiAlas = tinggiAlas;
        this.tinggiPrisma = tinggiPrisma;
    }

    /**
     * Metode untuk menghitung luas alas prisma
     *
     * @return Luas alas prisma
     */
    public double hitungLuasAlas() {
        return (panjangAlas * tinggiAlas) / 2;
    }

    /**
     * Metode untuk menghitung volume prisma
     *
     * @return Volume prisma
     */
    public double hitungVolume() {
        return hitungLuasAlas() * tinggiPrisma;
    }

    /**
     * Metode main
     *
     * @param args Argumen program
     */
    public static void main(String[] args) {
        double panjangAlas, tinggiAlas, tinggiPrisma;

        // Membaca input dari pengguna
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang alas: ");
        panjangAlas = input.nextDouble();
        System.out.print("Masukkan tinggi alas: ");
        tinggiAlas = input.nextDouble();
        System.out.print("Masukkan tinggi prisma: ");
        tinggiPrisma = input.nextDouble();

        // Menghitung luas alas dan volume prisma
        Prisma prisma = new Prisma(panjangAlas, tinggiAlas, tinggiPrisma);
        double luasAlasPrisma = prisma.hitungLuasAlas();
        double volume = prisma.hitungVolume();

        // Menampilkan hasil perhitungan
        System.out.println("Luas alas prisma = " + luasAlasPrisma);
        System.out.println("Volume prisma = " + volume);
    }
}