a = int(input("Первая сторона: "))
b = int(input("Вторая сторона: "))
c = int(input("Третья сторона: "))
if a+b<c or a+c<b or b+c<a:
    print("Треугольник с такими сторонами не может существовать")
elif a == b == c:
    print("Треугольник равносторонний")
elif a == b or b == c or a == c:
    print("Треугольник равнобедренный")
else:
    print("Треугольник разносторонний")