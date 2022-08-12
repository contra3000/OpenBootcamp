
def isprimnumb():
    try:
        n = int(input("Indique el número a corroborar: "))
        if n > 1:
            for i in range(2, n):
                if n % i == 0:
                    print(f"El numero {n} no es primo")
                    break
                else:
                    print(f"El numero {n} es primo")
                    break
        else:
            print("Recuerda:\nUn número primo es un entero natural que admite solo dos divisores "
                  "distintos enteros y positivos\nIngresa un número entero positivo!")
            isprimnumb()
    except ValueError:
        print("Recuerda:\nUn número primo es un entero natural que admite solo dos divisores "
                "distintos enteros y positivos\nIngresa un número entero positivo!")
        isprimnumb()


isprimnumb()
