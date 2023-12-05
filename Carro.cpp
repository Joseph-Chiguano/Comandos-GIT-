#include <iostream>
#include <cstdio>

using namespace std;

class Carro {
public:
    string marca;
    int placa;

    Carro(string marca, int placa) {
        this->marca = marca;
        this->placa = placa;
    }

    void acelerar() {
        int velocidad = 100; 

        printf("%s %d Empezo a acelerar a %d km/h\n", this->marca.c_str(), this->placa, velocidad);

        if (velocidad > 50) {
            printf("Multa: Excedio el limite de velocidad de 50 km/h\n");
        }
    }
};

int main() {
    Carro c1("BMW", 907); 

    c1.acelerar();

    return 0;
}
