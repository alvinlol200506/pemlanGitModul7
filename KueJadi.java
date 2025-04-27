public class KueJadi extends Kue { // anak dari kelas Kue
    private double jumlah; // variabel baru khusus kelas KueJadi

    public KueJadi(String nama, double harga, double jumlah) { // setter dengan variabel baru yaitu jumlah
        super(nama, harga); // ini dikerjakan ibu kelasnya
        this.jumlah = jumlah; // setter variabel jumlah kuenya
    }

    public double getJumlah() { // getter jumlah kuenya
        return jumlah;
    }

    @Override
    public double hitungHarga() { // ngitung harga kue tergantung jumlahnya
        return harga * jumlah * 2;
    }

    @Override
    public String toString() { // output tapi tergantung jumlah
        return super.toString() + "\nJumlah: " + jumlah + "\nTotal Harga: " + hitungHarga();
    }
}
