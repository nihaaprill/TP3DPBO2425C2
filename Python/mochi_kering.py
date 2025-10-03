from produk_mochi import ProdukMochi

class MochiKering(ProdukMochi):
    def __init__(self, kode, nama, harga, rasa, daya_tahan, kemasan):
        super().__init__(kode, nama, harga)
        self.rasa = rasa
        self.daya_tahan = daya_tahan
        self.kemasan = kemasan
