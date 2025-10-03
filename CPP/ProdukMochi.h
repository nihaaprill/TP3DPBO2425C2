#ifndef PRODUK_MOCHI_H
#define PRODUK_MOCHI_H

#include <string>
using namespace std;

class ProdukMochi {
protected:
    string kode, nama;
    int harga;
public:
    ProdukMochi(string k, string n, int h);
    string getKode();
    string getNama();
    int getHarga();
};

#endif
