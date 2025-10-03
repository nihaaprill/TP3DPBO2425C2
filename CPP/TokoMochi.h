#ifndef TOKO_MOCHI_H
#define TOKO_MOCHI_H

#include <vector>
#include "MochiBasah.h"
#include "MochiKering.h"

class TokoMochi {
protected:
    string kodeToko, namaToko, pemilik;
    vector<MochiBasah> daftarBasah;
    vector<MochiKering> daftarKering;
public:
    TokoMochi(string k, string n, string p);
    void tambahBasah(MochiBasah m);
    void tambahKering(MochiKering m);
    void tampilkanProduk();
};

#endif
