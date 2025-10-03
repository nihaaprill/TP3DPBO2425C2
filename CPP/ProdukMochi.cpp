#include "ProdukMochi.h"

ProdukMochi::ProdukMochi(string k, string n, int h) : kode(k), nama(n), harga(h) {}
string ProdukMochi::getKode() { return kode; }
string ProdukMochi::getNama() { return nama; }
int ProdukMochi::getHarga() { return harga; }
