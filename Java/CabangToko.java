public class CabangToko extends TokoMochi {
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
