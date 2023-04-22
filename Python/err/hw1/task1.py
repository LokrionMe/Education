try:
    a = int(input("Enter a nimber: "))
except ValueError:
    print("It's not a number")

x = 3
y = 0
try:
    result = x / y
except ZeroDivisionError:
    print("Division by zero")

arr = [0,1,2]
try:
    print(arr[4])
except IndexError:
    print("Out of range")

