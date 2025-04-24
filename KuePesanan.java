public class KuePesanan extends Kue { // anak kelas dari kelas Kue
    private double berat; // variabel baru khusus kelas ini, yang kelas KueJadi beda lagi

    public KuePesanan(String nama, double harga, double berat) { // setter constructor
        super(nama, harga); // menset variabel yang dikerjakan oleh ibu kelas
        this.berat = berat; // set variabel baru khusus kelas ini
    }

    public double getBerat(){ // getter berat
        return berat;
    }

    @Override
    public double hitungHarga() { // override method abstak yang wajib dipake kelas ini
        return harga * berat; // rumus hitung harga kelas ini
    }

    @Override
    public String toString() { // output tapi ada tambahan variabel berat dan ngitung harga Kue Pesanan
        return super.toString() + "\nBerat: " + berat + "kg\nTotal Harga: " + hitungHarga();
    }
}
