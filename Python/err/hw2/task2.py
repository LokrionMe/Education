def cathres(array:list, position:int):
    try:
        d = 0
        catchedRes1 = array[position] / d
        print("catchedRes1 = " + str(catchedRes1))
    except ZeroDivisionError as err:
        print("Catching exception: " + str(err))

cathres([0,1,1],2)
