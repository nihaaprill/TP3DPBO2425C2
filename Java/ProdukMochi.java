public class ProdukMochi {
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
