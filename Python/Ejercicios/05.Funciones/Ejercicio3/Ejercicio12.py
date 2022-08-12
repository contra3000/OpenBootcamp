# Años Bisiestos

def esbisiesto():
    try:
        y = int(input("Indique el año a corroborar: "))
        if (y % 4 == 0 and(y % 100 != 0 or y % 400 == 0)):
            print(f"El año {y} es bisiesto")
        else:
            print(f"El año {y} no es bisiesto")
    except ValueError:
        print("Por favor ingresa un año en formato número entero positivo!")
        esbisiesto()


esbisiesto()
