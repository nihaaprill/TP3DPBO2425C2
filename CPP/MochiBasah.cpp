#include "MochiBasah.h"

MochiBasah::MochiBasah(string k, string n, int h, string i, string u, string w)
    : ProdukMochi(k, n, h), isian(i), ukuran(u), warna(w) {}

string MochiBasah::getIsian() { return isian; }
string MochiBasah::getUkuran() { return ukuran; }
string MochiBasah::getWarna() { return warna; }
