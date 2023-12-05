#include <iostream>
#include <cstdio>

using namespace std;

class Perro {
public:
 
    string raza;
    int edad;

    Perro(string raza, int edad) {
        this->raza = raza;
        this->edad = edad;
    }

    void ladrar() {
        printf("%s %d Empezo a ladrar\n", this->raza.c_str(), this->edad);
    }

    void comer() {
        printf("%s %d Empezo a comer\n", this->raza.c_str(), this->edad);
    }

    void morder() {
        printf("%s %d Empezo a morder\n", this->raza.c_str(), this->edad);
    }
};

int main() {
    string raza;
    int edad;

    printf("Ingrese la raza del perro: ");
    cin >> raza;

    printf("Ingrese la edad del perro: ");
    scanf("%d", &edad);

    Perro pr1(raza, edad);
    pr1.ladrar();

    return 0;
}
