# Реализация пирамидальной сортировки

# Процедура для преобразования в двоичную кучу поддерева с корневым узлом i, 
# что является индексом в arr[]. n - размер кучи
def heapify(arr, n, i):
    largest = i # Initialize largest as root
    l = 2 * i + 1   # left = 2*i + 1
    r = 2 * i + 2   # right = 2*i + 2

    if l < n and arr[i] < arr[l]: # Проверяем существует ли левый дочерний элемент больший, чем корень
        largest = l
    
    if r < n and arr[largest] < arr[r]: # Проверяем существует ли правый дочерний элемент больший, чем корень
        largest = r
    
    # Заменяем корень, если нужно
    if largest != i:
        arr[i],arr[largest] = arr[largest],arr[i] # свап

        heapify(arr, n, largest) # Применяем heapify к корню.
    

# Основная функция для сортировки массива заданного размера
def heapSort(arr):
    n = len(arr)

    for i in range(n, -1, -1): # Построение max-heap.
        heapify(arr, n, i)

    print (arr)

    for i in range(n-1, 0, -1): # Один за другим извлекаем элементы
        arr[i], arr[0] = arr[0], arr[i] # свап 
        heapify(arr, i, 0)

arr = [ 12, 11, 13, 5, 6, 7]
heapSort(arr)
n = len(arr)
print (f"Sorted array is: {arr}")
