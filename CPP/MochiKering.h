#ifndef MOCHI_KERING_H
#define MOCHI_KERING_H

#include "ProdukMochi.h"

class MochiKering : public ProdukMochi {
    string rasa, dayaTahan, kemasan;
public:
    MochiKering(string k, string n, int h, string r, string d, string kems);
    string getRasa();
    string getDayaTahan();
    string getKemasan();
};

#endif
