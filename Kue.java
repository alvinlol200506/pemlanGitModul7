public abstract class Kue { // menandakan abstract class, ndak bisa dibikin objek tapi bisa disiapkan array
    protected String nama; // mempersiapkan variabel nama yang bisa dipake anak kelas
    protected double harga; // sama kayak atas ni


    public Kue (String nama, double harga){ // method constructor setter, also ini emaknya yang ngerjakan bagian yang super super itu
        this.nama = nama; // ngeset nama kuenya nanti
        this.harga = harga; // ngeset harga kuenya nanti
    }

    public abstract double hitungHarga(); // abstract method yang harus dipake anak kelas

    public String toString(){ // method buat ngeprint output
        return "nama kue: " + nama +"\nharga: " + harga;
    }
}
