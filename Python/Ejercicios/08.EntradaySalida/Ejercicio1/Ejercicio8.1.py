
def main():

    lista = [
        'quisiera ser un pez',
        'para mojar mi nariz',
        'en tu pecera'
    ]

    escribe('archivito.txt', lista)
    print(leeme('archivito.txt'))


def escribe(fichero, datos):
    f = open(fichero, 'w')

    for linea in datos:
        if not linea.endswith('\n'):
            linea = linea + '\n'

        f.write(linea)
    f.close()

def leeme(fichero):
    f = open(fichero, 'rt')

    versos = f.readlines()
    f.close()

    r = []

    for linea in versos:
        if linea[-1] == '\n':
            linea = linea.replace('\n', '')
        r.append(linea)

    return f"Verso 1 = {r[0]}\nVerso 2 = {r[1]}\nVerso 3 = {r[2]}"


if __name__ == '__main__':
    main()
