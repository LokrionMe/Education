def printSum(a: int, b: int):
    print(a + b)


try:
    a = 90
    b = 3
    print(a / b)
    printSum(23, 234)
    abc = [1, 2]
    abc[3] = 9
except IndexError:
    print("Unknown position")
except TypeError:
    print("Must be a number")
except RuntimeError:
    print("Unknown error")
