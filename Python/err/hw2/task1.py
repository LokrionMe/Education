while True:
    try:
        a = float(input("Enter a number: "))
    except ValueError:
        print("It's not a number")
    else:
        print(a)
        break
