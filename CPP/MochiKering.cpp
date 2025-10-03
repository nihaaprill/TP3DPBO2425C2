#include "MochiKering.h"

MochiKering::MochiKering(string k, string n, int h, string r, string d, string kems)
    : ProdukMochi(k, n, h), rasa(r), dayaTahan(d), kemasan(kems) {}

string MochiKering::getRasa() { return rasa; }
string MochiKering::getDayaTahan() { return dayaTahan; }
string MochiKering::getKemasan() { return kemasan; }
