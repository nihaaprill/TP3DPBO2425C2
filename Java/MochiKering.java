public class MochiKering extends ProdukMochi {
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
