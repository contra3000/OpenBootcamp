
def showImpar():
    try:
        primer = int(input("indique el número inicial: "))
        ultimo = int(input("indique el número final: "))
    except ValueError:
        print("¡Ingrese números enteros!")
        showImpar()
        quit()

    if primer > ultimo:
        segundo = 0
        segundo = primer
        primer = ultimo
        ultimo = segundo

    for numero in range(primer, ultimo+1):
        if numero % 2 == 1:
            print(numero)


showImpar()
