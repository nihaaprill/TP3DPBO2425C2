public class MochiBasah extends ProdukMochi {
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
