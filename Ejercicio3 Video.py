class Personaje:
    def __init__(self,nombre,fuerza,velocidad):
        self.nombre = nombre
        self.fuerza = fuerza
        self.velocidad = velocidad
    
    def __repr__(self):
        return f"{self.nombre}(Fuerza: {self.fuerza}, Velocidad: {self.velocidad})"

    def __add__(self,otro_pj):
        nuevo__nombre = self.nombre + "-" + otro_pj.nombre 
        nueva__fuerza = round(((self.fuerza + otro_pj.fuerza)/2)**1.34)
        nueva__velocidad = round(((self.velocidad + otro_pj.velocidad)/2)**1.34)
        return Personaje(nuevo__nombre, nueva__fuerza, nueva__velocidad)

Goku = Personaje("Goku",100,100)
Vegeta = Personaje("Vegeta",99,99)
Jiren = Personaje("Jiren",130,140)

Gogeta = Goku+Vegeta
Jireta = Gogeta+Jiren

print(Goku)  
print(Vegeta) 
print(Jiren) 
print(Gogeta)    
print(Jireta) 
 