#include <iostream>

using namespace std;

class Personass {
public:
 
    string nombre;
    int edad;

    Personass(string nombre, int edad) {
        this->nombre = nombre;
        this->edad = edad;
    }

    void saltar() {
        cout << this->nombre << " " << this->edad << " Empezo a saltar" << endl;
    }

    void comer() {
        cout << this->nombre << " " << this->edad << " Empezo a comer" << endl;
    }

    void escribir() {
        cout << this->nombre << " " << this->edad << " Empezo a escribir" << endl;
    }
};

int main() {
    Personass p1("Anthony", 19); 

    p1.comer();
    p1.saltar();

    return 0;
}
