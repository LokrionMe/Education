a = [0,1,2]
b = [2,3,4]

def task3(x:list,y:list):
    new_array = []
    j = 0
    try:
        for i in x:
            new_array.append(i - y[j])
            j += 1
        return new_array
    except IndexError:
        print("Length of lists is not same")

print (task3(a,b))

def task4(x:list,y:list):
    new_array = []
    j = 0
    try:
        for i in x:
            new_array.append(i / y[j])
            j += 1
        return new_array
    except IndexError:
        print("Length of lists is not same")
    except RuntimeError:
        print("Unknown error")
    except ZeroDivisionError:
        print("Division by zero")

print (task4(a,b))
