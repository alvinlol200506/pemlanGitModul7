public class PemdasParktikumModul7 { // aku ndak karbit, aku masih setia dengan waifu hololive saya
    public static void main(String[] args) {

        Kue[] daftarKue = new Kue[20]; // Array tempat menyimpan inpo inpo Kue, btw harus class Kue karena kalau cuman di KueJadi nanti ndak bisa KuePesanan, dan sebaliknya dan ndak bisa juga class PemdasPraktikumModul7
        // Isi array 20 kue campuran Kue Pesanan dan Kue Jadi
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

        System.out.println("\nA:"); // A: yogurt, gurt: yo, finger: what, what: what
        // a. Tampilkan semua kue dan jenisnya
        for (int i = 0; i < daftarKue.length; i++) { // jalan dari 0 sampai 19
            System.out.println(daftarKue[i].toString()); // ngeprint output atau toString dari semua array

            if (daftarKue[i] instanceof KuePesanan) { // pas arraynya KuePesanan di akhir ngerjakan ngoutput jenis kuenya itu Kue Pesanan
                System.out.println("Jenis: Kue Pesanan\n");
            } else if (daftarKue[i] instanceof KueJadi) { // sama kayak di atas ini tapi Kue Jadi
                System.out.println("Jenis: Kue Jadi\n");
            }
        }

        System.out.println("\nB:"); // B: Im hungry I could eat a-, Matikane Tannhäuser: a what 🐴, also Matikane Tannhäuser: Mambo
        // b. Total harga semua kue
        double totalHarga = 0;
        for (int i = 0; i < daftarKue.length; i++) { // jalanin array 0 sampe 19 (20 array)
            totalHarga += daftarKue[i].hitungHarga(); // menjalankan hitung harga di masing masing KueJadi dan KuePesanan
        }
        System.out.println("Total harga semua kue: " + totalHarga); // habis ngitung diprintout

        System.out.println("\nC:"); // C: I bake you a pie, D: oh boy what flavour, C: pie pie pie, D: 😨
        // c. Total harga & berat KuePesanan
        double totalHargaPesanan = 0;
        double totalBerat = 0;
        for (int i = 0; i < daftarKue.length; i++) { // jalanin array dair 0 sampe 19
            if (daftarKue[i] instanceof KuePesanan) { // cuman jalanin KuePesanan
                totalHargaPesanan += daftarKue[i].hitungHarga(); // ngitung total harga KuePesanan doang
                totalBerat += ((KuePesanan) daftarKue[i]).getBerat(); // ngitung total berat KuePesanan doang
            }
        }
        System.out.println("Total harga KuePesanan: " + totalHargaPesanan); // habis ngitung total diprintout
        System.out.println("Total berat KuePesanan: " + totalBerat); // habis ngitung total diprintout

        System.out.println("\nD:"); // D: I good to zenless zone zero, orang yang ngerjakan codingan ini: wtf are you talking about big d
        // d. Total harga & jumlah KueJadi
        double totalHargaJadi = 0;
        double totalJumlah = 0;
        for (int i = 0; i < daftarKue.length; i++) { // njalanin array dari 0 sampe 19
            if (daftarKue[i] instanceof KueJadi) { // cuman ngerjakan KueJadi
                totalHargaJadi += daftarKue[i].hitungHarga(); // ngitung total harganya KueJadi doang
                totalJumlah += ((KueJadi) daftarKue[i]).getJumlah(); // ngitung total jumlahnya KueJadi doang
            }
        }
        System.out.println("Total harga KueJadi: " + totalHargaJadi); // ngeprintout habis ngitung
        System.out.println("Total jumlah KueJadi: " + totalJumlah); // ngeprintout habis ngitung

        System.out.println("\nE:"); // [ALERT LIHAT INI] *breakdance
        // e. Kue dengan harga tertinggi
        Kue kueTermahal = null;
        for (int i = 0; i < daftarKue.length; i++) { // jalanin array dari 0 sampe 19
                if (kueTermahal == null || daftarKue[i].hitungHarga() > kueTermahal.hitungHarga()) { // ngecek dan kalau ada yang melebihi rekor sebelumnya bakal nggantiin nilai tertinggi sebelumnya
                    kueTermahal = daftarKue[i];
                }
        }

        System.out.println("Kue dengan harga tertinggi"); // ngomong
        System.out.println(kueTermahal.toString()); // printout nama kue termahal, harga, jumlahnya (karena saya masukkan jumlah), dan total harga dari jumlah x harga

    }
}
