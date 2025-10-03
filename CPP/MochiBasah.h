#ifndef MOCHI_BASAH_H
#define MOCHI_BASAH_H

#include "ProdukMochi.h"

class MochiBasah : public ProdukMochi {
    string isian, ukuran, warna;
public:
    MochiBasah(string k, string n, int h, string i, string u, string w);
    string getIsian();
    string getUkuran();
    string getWarna();
};

#endif
