public class PemdasParktikumModul7 {
    public static void main(String[] args) {

        Kue[] daftarKue = new Kue[20];
        // Isi array 20 kue campuran
        daftarKue[0] = new KuePesanan("Brownies", 50000, 1.5);
        daftarKue[1] = new KueJadi("Donat", 3000, 10);
        daftarKue[2] = new KuePesanan("Bolu", 45000, 2);
        daftarKue[3] = new KueJadi("Cupcake", 4000, 12);
        daftarKue[4] = new KuePesanan("Onde-onde", 2000, 12);
        daftarKue[5] = new KueJadi("Matcha Opera", 250000, 1);
        daftarKue[6] = new KuePesanan("Lumpia", 2000, 12);
        daftarKue[7] = new KueJadi("Mix Vanilla Cheese", 415000, 1);
        daftarKue[8] = new KuePesanan("Lemper", 2500, 12);
        daftarKue[9] = new KueJadi("Cheesecake Flurry Regular Round", 415000, 1);
        daftarKue[10] = new KuePesanan("Klepon", 6000, 12);
        daftarKue[11] = new KueJadi("Chocolate Tiramisu", 225000, 2);
        daftarKue[12] = new KuePesanan("Kue Cucur", 1500, 12);
        daftarKue[13] = new KueJadi("Triple Chocolate", 225000, 3);
        daftarKue[14] = new KuePesanan("Molen", 2000, 12);
        daftarKue[15] = new KueJadi("Vanilla Fruit", 345000, 1);
        daftarKue[16] = new KuePesanan("Lapis", 5000, 8);
        daftarKue[17] = new KueJadi("Chocolate de Ville", 415000, 1);
        daftarKue[18] = new KuePesanan("Kue Putu", 4000, 12);
        daftarKue[19] = new KueJadi("Red Velvet", 240000, 1);


        System.out.println("\nA:");
        // a. Tampilkan semua kue dan jenisnya
        for (int i = 0; i < daftarKue.length; i++) {
            System.out.println(daftarKue[i].toString());


            if (daftarKue[i] instanceof KuePesanan) {
                System.out.println("Jenis: Kue Pesanan\n");
            } else if (daftarKue[i] instanceof KueJadi) {
                System.out.println("Jenis: Kue Jadi\n");
            }
        }

        System.out.println("\nB:");
        // b. Total harga semua kue
        double totalHarga = 0;
        for (int i = 0; i < daftarKue.length; i++) {
            totalHarga += daftarKue[i].hitungHarga();
        }
        System.out.println("Total harga semua kue: " + totalHarga);

        System.out.println("\nC:");
        // c. Total harga & berat KuePesanan
        double totalHargaPesanan = 0;
        double totalBerat = 0;
        for (int i = 0; i < daftarKue.length; i++) {
            if (daftarKue[i] instanceof KuePesanan) {
                totalHargaPesanan += daftarKue[i].hitungHarga();
                totalBerat += ((KuePesanan) daftarKue[i]).getBerat();
            }
        }
        System.out.println("Total harga KuePesanan: " + totalHargaPesanan);
        System.out.println("Total berat KuePesanan: " + totalBerat);

        System.out.println("\nD:");
        // d. Total harga & jumlah KueJadi
        double totalHargaJadi = 0;
        double totalJumlah = 0;
        for (int i = 0; i < daftarKue.length; i++) {
            if (daftarKue[i] instanceof KueJadi) {
                totalHargaJadi += daftarKue[i].hitungHarga();
                totalJumlah += ((KueJadi) daftarKue[i]).getJumlah();
            }
        }
        System.out.println("Total harga KueJadi: " + totalHargaJadi);
        System.out.println("Total jumlah KueJadi: " + totalJumlah);

        System.out.println("\nE:");
        // e. Kue dengan harga tertinggi
        Kue kueTermahal = null;
        for (int i = 0; i < daftarKue.length; i++) {
                if (kueTermahal == null || daftarKue[i].hitungHarga() > kueTermahal.hitungHarga()) {
                    kueTermahal = daftarKue[i];
                }
        }

        System.out.println("Kue dengan harga tertinggi");
        System.out.println(kueTermahal.toString());

    }
}
