from mochi_basah import MochiBasah
from mochi_kering import MochiKering
from cabang_toko import CabangToko
from tabulate import tabulate

def menu():
    print("\n=== SISTEM TOKO MOCHI ===")
    print("1. Tambah Mochi Basah")
    print("2. Tambah Mochi Kering")
    print("3. Tampilkan Data")
    print("4. Cetak Laporan Cabang")
    print("0. Keluar")

if __name__ == "__main__":
    # Cabang Toko
    cabang = CabangToko("T001", "Mochi Garut", "Budi", "Garut", 1999, "Reseller")

    # Produk awal
    cabang.tambah_basah(MochiBasah("MB01", "Mochi Stroberi", 5000, "Stroberi", "Kecil", "Merah"))
    cabang.tambah_basah(MochiBasah("MB02", "Mochi Kacang", 6000, "Kacang", "Sedang", "Coklat"))
    cabang.tambah_kering(MochiKering("MK01", "Mochi Susu", 8000, "Susu", "7 Hari", "Kotak"))
    cabang.tambah_kering(MochiKering("MK02", "Mochi Coklat", 10000, "Coklat", "10 Hari", "Plastik"))

    jalan = True
    while jalan:
        menu()
        pilih = input("Pilih menu: ")

        if pilih == "1":
            kode = input("Kode: ")
            nama = input("Nama: ")
            harga = int(input("Harga: "))
            isian = input("Isian: ")
            ukuran = input("Ukuran: ")
            warna = input("Warna: ")
            cabang.tambah_basah(MochiBasah(kode, nama, harga, isian, ukuran, warna))
            print("Mochi Basah berhasil ditambahkan!")

        elif pilih == "2":
            kode = input("Kode: ")
            nama = input("Nama: ")
            harga = int(input("Harga: "))
            rasa = input("Rasa: ")
            daya_tahan = input("Daya Tahan: ")
            kemasan = input("Kemasan: ")
            cabang.tambah_kering(MochiKering(kode, nama, harga, rasa, daya_tahan, kemasan))
            print("Mochi Kering berhasil ditambahkan!")

        elif pilih == "3":
            print("\n=== DATA TOKO & PRODUK ===\n")

            # Data CabangToko
            print("Data Cabang Toko:")
            print(f"Kode Toko     : {cabang.kode_toko}")
            print(f"Nama Toko     : {cabang.nama_toko}")
            print(f"Pemilik       : {cabang.pemilik}")
            print(f"Lokasi        : {cabang.lokasi}")
            print(f"Tahun Berdiri : {cabang.tahun}")
            print(f"Jenis Usaha   : {cabang.jenis}\n")

            # Daftar Mochi Basah
            if cabang.mochi_basah:
                data_basah = [[m.kode, m.nama, m.harga, m.isian, m.ukuran, m.warna] for m in cabang.mochi_basah]
                print("Mochi Basah:")
                print(tabulate(data_basah, headers=["Kode", "Nama", "Harga", "Isian", "Ukuran", "Warna"], tablefmt="grid"))
                print()
            else:
                print("Belum ada Mochi Basah.\n")

            # Daftar Mochi Kering
            if cabang.mochi_kering:
                data_kering = [[m.kode, m.nama, m.harga, m.rasa, m.daya_tahan, m.kemasan] for m in cabang.mochi_kering]
                print("Mochi Kering:")
                print(tabulate(data_kering, headers=["Kode", "Nama", "Harga", "Rasa", "Daya Tahan", "Kemasan"], tablefmt="grid"))
                print()
            else:
                print("Belum ada Mochi Kering.\n")

        elif pilih == "4":
            cabang.laporan()

        elif pilih == "0":
            print("Keluar dari program...")
            jalan = False  

        else:
            print("Menu tidak valid, coba lagi!")
