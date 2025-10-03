from tabulate import tabulate

class TokoMochi:
    def __init__(self, kode_toko, nama_toko, pemilik):
        self.kode_toko = kode_toko
        self.nama_toko = nama_toko
        self.pemilik = pemilik
        self.mochi_basah = []
        self.mochi_kering = []

    def tambah_basah(self, mochi):
        self.mochi_basah.append(mochi)

    def tambah_kering(self, mochi):
        self.mochi_kering.append(mochi)

    def laporan(self):
        print("=== TOKO MOCHI ===")
        print(f"Kode Toko   : {self.kode_toko}")
        print(f"Nama Toko   : {self.nama_toko}")
        print(f"Pemilik     : {self.pemilik}\n")

        if self.mochi_basah:
            data_basah = [[m.kode, m.nama, m.harga, m.isian, m.ukuran, m.warna] for m in self.mochi_basah]
            print("Daftar Mochi Basah:")
            print(tabulate(data_basah, headers=["Kode", "Nama", "Harga", "Isian", "Ukuran", "Warna"], tablefmt="grid"))
            print()

        if self.mochi_kering:
            data_kering = [[m.kode, m.nama, m.harga, m.rasa, m.daya_tahan, m.kemasan] for m in self.mochi_kering]
            print("Daftar Mochi Kering:")
            print(tabulate(data_kering, headers=["Kode", "Nama", "Harga", "Rasa", "Daya Tahan", "Kemasan"], tablefmt="grid"))
            print()
