
class Alumno:
    def __init__(self, nombre, nota):
        self.nombre = str(nombre)
        self.nota = float(nota)

    def calif(self):
        if self.nota > 5:
            print(f"{self.nombre} ha obtenido {self.nota}, está aprobado")
        else:
            print(f"{self.nombre} ha obtenido {self.nota}, está desaprobado")


al0001 = Alumno("Mario Echeverria", 3.5)
al0001.calif()
