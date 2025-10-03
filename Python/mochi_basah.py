from produk_mochi import ProdukMochi

class MochiBasah(ProdukMochi):
    def __init__(self, kode, nama, harga, isian, ukuran, warna):
        super().__init__(kode, nama, harga)
        self.isian = isian
        self.ukuran = ukuran
        self.warna = warna
