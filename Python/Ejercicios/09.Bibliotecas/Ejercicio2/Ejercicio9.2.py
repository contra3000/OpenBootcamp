from functools import reduce


def main():

    numberlist = [1, 2, 4, 5, 6, 8, 9]

    numerosfiltrados = filter(lambda x: x % 2 == 1, numberlist)
    imparlist = list(numerosfiltrados)
    print(reduce(lambda a, b: a + b, imparlist))


if __name__ == '__main__':
    main()
