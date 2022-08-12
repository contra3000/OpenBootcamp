class Vehiculo:
    Color = ""
    Ruedas = 0
    Puertas = 0

    def __init__(self, color, ruedas, puertas):
        self.Color = color
        self.Ruedas = ruedas
        self.Puertas = puertas


class Coche(Vehiculo):
    Velocidad = 0
    Cilindrada = 0

    def __init__(self, cilindrada, color, ruedas, puertas):
        super().__init__(color, ruedas, puertas)
        self.Cilindrada = cilindrada

    def acelerar(self, velocidad):
        self.Velocidad += velocidad

    def description(self):
        return (f"Color: {self.Color}\nCilindrada: {self.Cilindrada}\nRuedas: {self.Ruedas}"
                f"\nPuertas: {self.Puertas}\nVelocidad: {self.Velocidad}km/h")


FordFiesta = Coche(1.0, "blanco", 4, 5)
print(FordFiesta.description())
