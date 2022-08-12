import time


def main():
    ahora = time.localtime()

    if ahora[3] >= 19:
        print(f"Son {time.strftime('%H:%M:%S', time.localtime())} hora de ir a casa.")

    else:
        print(f"Son {time.strftime('%H:%Mhs', time.localtime())} quedan {18 - ahora[3]}hs {59 - ahora[4]}min de trabajo.")



if __name__ == '__main__':
    main()
