
def main():

    listapaises = input("Ingrese nombres de paises: ")
    listapaises = listapaises.replace(' ', '')
    listapaises = set(listapaises.split(','))
    listapaises = sorted(listapaises)
    print(listapaises)


if __name__ == '__main__':
    main()
