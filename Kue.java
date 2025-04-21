public abstract class Kue {
    private String nama;
    private double harga;

    public abstract double hitungHarga();

    public String toString(){
        return "nama kue: " + nama +"\nharga: " + harga;
    }
}
