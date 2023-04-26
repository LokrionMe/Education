class Note:
    def __init__(self) -> None:
        self.second_name = None
        self.name = None
        self.patronymic = None
        self.birthday = None
        self.sex = None
        self.number = None

    def __str__(self) -> str:
        return f"{self.second_name} {self.name} {self.patronymic} {self.birthday} {self.number} {self.sex}"
    
    def input_second_name(self,string):
        self.second_name = string

    def input_name(self,string):
        self.name = string

    def input_patronymic(self,string):
        self.patronymic = string

def null_data_person(array:list) -> bool:
    return len(array) != 0

def input_data()->list:
    while True:
        try:
            data_person = str(input("Input data of person: ")).split()
            check = data_person[0]
            if len(data_person) == 6:
                return data_person
            else:
                print("Wrong input data\nInput must be:'secondname name patronymic birthday sex number'")
        except IndexError:
            print("String is empty, try again")

def correct_input(array:list)->Note:
    new_note = Note()
    list_fio = list()
    for i in array:
        if (i =="m") or (i == "f"):
            new_note.sex = i
            print("Sex is correct")
        elif i.count(".") == 2:
            new_note.birthday = i
            print("Birhday is correct")
        elif i.isdigit():
            new_note.number = i
            print("Number is correct")
        else:
            list_fio.append(i)
    if len(list_fio) != 3:
        print("Wrong input data\nInput must be:'secondname name patronymic birthday sex number'")
        exit
    else:
        list_fio_standart = ["secondname", "name", "patronymic"]
        for i in list_fio_standart:
            input_number_fio(i,list_fio,new_note)
        return new_note
    

def input_number_fio(string:str,array:list,note:Note):
    while True:
        for i in range(len(array)):
            print(str(i+1)+". " + array[i])
        try:
            a = int(input(f"Input number of {string}: "))
        except ValueError:
            print("It must be a number")
        if a<=0 or a>len(array):
            print(f"Number must be > 0 and <{len(array)+1}")
        else:
            if string == "secondname":
                note.input_second_name(array[a-1])
            elif string == "name":
                note.input_name(array[a-1])
            else:
                note.input_patronymic(array[a-1])
            array.pop(a-1)
            break

while True:
    array_data = input_data()
    note = correct_input(array_data)
    if note != None:
        with open(f'{note.second_name}.txt', 'a') as notes:
            notes.write(str(note)+"\n")
        break

print(note)