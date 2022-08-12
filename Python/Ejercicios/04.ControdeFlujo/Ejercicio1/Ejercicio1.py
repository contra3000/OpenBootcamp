
def mayorEdad():
    try:
        edad = int(input("Indique su edad: "))

        if edad >= 18:
            print("Usted es mayor de edad.")
        else:
            print("Usted es menor de edad.")
    except ValueError:
        print("Debe ingresar un número entero.\nInténtelo nuevamente.")
        mayorEdad()


mayorEdad()
