#include <iostream>
#include <cstdio>

using namespace std;

class Gato {
public:
 
    string raza;
    int edad;

    Gato(string raza, int edad) {
        this->raza = raza;
        this->edad = edad;
    }

    void maullar() {
        printf("%s %d Empezo a maullar\n", this->raza.c_str(), this->edad);
    }

    void comer() {
        printf("%s %d Empezo a comer\n", this->raza.c_str(), this->edad);
    }

    void lamerse() {
        printf("%s %d Empezo a lamerse\n", this->raza.c_str(), this->edad);
    }
};

int main() {
    string raza;
    int edad;

    printf("Ingrese la raza del gato: ");
    cin >> raza;

    printf("Ingrese la edad del gato: ");
    scanf("%d", &edad);

    Gato g1(raza, edad);
    g1.maullar();
    return 0;
}
