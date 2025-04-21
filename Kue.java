public abstract class Kue {
    private String nama;
    private double harga;

    public String getNama(){
        return this.nama;
    }


    public abstract double hitungHarga();

    public String toString(){
        return "nama kue: " + nama +"\nharga: " + harga;
    }
}
