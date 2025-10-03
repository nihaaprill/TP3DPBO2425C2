import java.util.ArrayList;
import java.util.Scanner;

// ===== Superclass ProdukMochi =====
class ProdukMochi {
    protected String kode, nama;
    protected int harga;

    public ProdukMochi(String kode, String nama, int harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public int getHarga() { return harga; }
}

// ===== Subclass MochiBasah =====
class MochiBasah extends ProdukMochi {
    private String isian, ukuran, warna;

    public MochiBasah(String kode, String nama, int harga, String isian, String ukuran, String warna) {
        super(kode, nama, harga);
        this.isian = isian;
        this.ukuran = ukuran;
        this.warna = warna;
    }

    public String getIsian() { return isian; }
    public String getUkuran() { return ukuran; }
    public String getWarna() { return warna; }
}

// ===== Subclass MochiKering =====
class MochiKering extends ProdukMochi {
    private String rasa, dayaTahan, kemasan;

    public MochiKering(String kode, String nama, int harga, String rasa, String dayaTahan, String kemasan) {
        super(kode, nama, harga);
        this.rasa = rasa;
        this.dayaTahan = dayaTahan;
        this.kemasan = kemasan;
    }

    public String getRasa() { return rasa; }
    public String getDayaTahan() { return dayaTahan; }
    public String getKemasan() { return kemasan; }
}

// ===== TokoMochi (HAS daftar produk) =====
class TokoMochi {
    protected String kodeToko, namaToko, pemilik;
    protected ArrayList<MochiBasah> daftarBasah = new ArrayList<>();
    protected ArrayList<MochiKering> daftarKering = new ArrayList<>();

    public TokoMochi(String kodeToko, String namaToko, String pemilik) {
        this.kodeToko = kodeToko;
        this.namaToko = namaToko;
        this.pemilik = pemilik;
    }

    public void tambahBasah(MochiBasah m) { daftarBasah.add(m); }
    public void tambahKering(MochiKering m) { daftarKering.add(m); }

    public void tampilkanProduk() {
    System.out.println("\n=== DATA TOKO MOCHI ===");
    System.out.println("Kode Toko : " + kodeToko);
    System.out.println("Nama Toko : " + namaToko);
    System.out.println("Pemilik   : " + pemilik + "\n");

    if (!daftarBasah.isEmpty()) {
        System.out.println("Daftar Mochi Basah:");
        System.out.println("+------+----------------+--------+----------+----------+---------+");
        System.out.printf("| %-4s | %-14s | %-6s | %-8s | %-8s | %-7s |%n", 
                          "Kode", "Nama", "Harga", "Isian", "Ukuran", "Warna");
        System.out.println("+------+----------------+--------+----------+----------+---------+");
        for (MochiBasah m : daftarBasah) {
            System.out.printf("| %-4s | %-14s | %-6d | %-8s | %-8s | %-7s |%n",
                    m.getKode(), m.getNama(), m.getHarga(), m.getIsian(), m.getUkuran(), m.getWarna());
        }
        System.out.println("+------+----------------+--------+----------+----------+---------+");
        System.out.println();
    }

    if (!daftarKering.isEmpty()) {
        System.out.println("Daftar Mochi Kering:");
        System.out.println("+------+----------------+--------+----------+------------+----------+");
        System.out.printf("| %-4s | %-14s | %-6s | %-8s | %-10s | %-8s |%n", 
                          "Kode", "Nama", "Harga", "Rasa", "DayaTahan", "Kemasan");
        System.out.println("+------+----------------+--------+----------+------------+----------+");
        for (MochiKering m : daftarKering) {
            System.out.printf("| %-4s | %-14s | %-6d | %-8s | %-10s | %-8s |%n",
                    m.getKode(), m.getNama(), m.getHarga(), m.getRasa(), m.getDayaTahan(), m.getKemasan());
        }
        System.out.println("+------+----------------+--------+----------+------------+----------+");
        System.out.println();
    }
}
}

// ===== Subclass CabangToko =====
class CabangToko extends TokoMochi {
    private String lokasi, jenis;
    private int tahun;

    public CabangToko(String kodeToko, String namaToko, String pemilik, String lokasi, int tahun, String jenis) {
        super(kodeToko, namaToko, pemilik);
        this.lokasi = lokasi;
        this.tahun = tahun;
        this.jenis = jenis;
    }

    public void tampilkanData() {
        System.out.println("\n=== DATA CABANG TOKO MOCHI ===");
        System.out.println("Kode Toko   : " + this.kodeToko);
        System.out.println("Nama Toko   : " + this.namaToko);
        System.out.println("Pemilik     : " + this.pemilik);
        System.out.println("Lokasi      : " + this.lokasi);
        System.out.println("Tahun       : " + this.tahun);
        System.out.println("Jenis Usaha : " + this.jenis + "\n");
    }

    public void laporan() {
        tampilkanData();
        this.tampilkanProduk();
    }
}

// ===== Main Program =====
public class Main {
    public static void main(String[] args) {
        CabangToko cabang = new CabangToko("T001", "Mochi Garut", "Budi", "Garut", 1999, "Reseller");

        // Tambah produk awal
        cabang.tambahBasah(new MochiBasah("MB01", "Mochi Stroberi", 5000, "Stroberi", "Kecil", "Merah"));
        cabang.tambahBasah(new MochiBasah("MB02", "Mochi Kacang", 6000, "Kacang", "Sedang", "Coklat"));
        cabang.tambahKering(new MochiKering("MK01", "Mochi Susu", 8000, "Susu", "7 Hari", "Kotak"));
        cabang.tambahKering(new MochiKering("MK02", "Mochi Coklat", 10000, "Coklat", "10 Hari", "Plastik"));

        Scanner sc = new Scanner(System.in);
        boolean jalan = true;

        while (jalan) {
            System.out.println("\n=== SISTEM TOKO MOCHI ===");
            System.out.println("1. Tambah Mochi Basah");
            System.out.println("2. Tambah Mochi Kering");
            System.out.println("3. Tampilkan Data");
            System.out.println("4. Cetak Laporan Cabang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            String pilih = sc.nextLine();

            if (pilih.equals("1")) {
                System.out.print("Kode: ");
                String kode = sc.nextLine();
                System.out.print("Nama: ");
                String nama = sc.nextLine();
                System.out.print("Harga: ");
                int harga = Integer.parseInt(sc.nextLine());
                System.out.print("Isian: ");
                String isian = sc.nextLine();
                System.out.print("Ukuran: ");
                String ukuran = sc.nextLine();
                System.out.print("Warna: ");
                String warna = sc.nextLine();
                cabang.tambahBasah(new MochiBasah(kode, nama, harga, isian, ukuran, warna));
                System.out.println(" Mochi Basah berhasil ditambahkan!");
            }
            else if (pilih.equals("2")) {
                System.out.print("Kode: ");
                String kode = sc.nextLine();
                System.out.print("Nama: ");
                String nama = sc.nextLine();
                System.out.print("Harga: ");
                int harga = Integer.parseInt(sc.nextLine());
                System.out.print("Rasa: ");
                String rasa = sc.nextLine();
                System.out.print("Daya Tahan: ");
                String daya = sc.nextLine();
                System.out.print("Kemasan: ");
                String kemasan = sc.nextLine();
                cabang.tambahKering(new MochiKering(kode, nama, harga, rasa, daya, kemasan));
                System.out.println(" Mochi Kering berhasil ditambahkan!");
            }
            else if (pilih.equals("3")) {
                cabang.tampilkanData();
                cabang.tampilkanProduk();
            }
            else if (pilih.equals("4")) {
                cabang.laporan();
            }
            else if (pilih.equals("0")) {
                System.out.println("Keluar program...");
                jalan = false; 
            }
            else {
                System.out.println("Menu tidak valid!");
            }
        }

        sc.close();
    }
}
