#ifndef CABANG_TOKO_H
#define CABANG_TOKO_H

#include "TokoMochi.h"

class CabangToko : public TokoMochi {
    string lokasi, jenis;
    int tahun;
public:
    CabangToko(string k, string n, string p, string l, int t, string j);
    void tampilkanData();
    void laporan();
};

#endif
