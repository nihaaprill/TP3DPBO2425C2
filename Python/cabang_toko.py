from toko_mochi import TokoMochi

class CabangToko(TokoMochi):
    def __init__(self, kode_toko, nama_toko, pemilik, lokasi, tahun, jenis):
        super().__init__(kode_toko, nama_toko, pemilik)
        self.lokasi = lokasi
        self.tahun = tahun
        self.jenis = jenis

    def laporan(self):
        print("=== DATA CABANG TOKO MOCHI ===")
        print(f"Kode Toko   : {self.kode_toko}")
        print(f"Nama Toko   : {self.nama_toko}")
        print(f"Pemilik     : {self.pemilik}")
        print(f"Lokasi      : {self.lokasi}")
        print(f"Tahun Berdiri : {self.tahun}")
        print(f"Jenis Usaha : {self.jenis}\n")
        super().laporan()
