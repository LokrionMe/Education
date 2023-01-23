import math
a = (str(math.factorial(1000)))
k = 0
max = 0
for i in range(len(a)):
    if a[i] == '0':
        k+=1
    else:
        if k > max:
            max = k
            k = 0
if k > max:
    max = k
print(max)