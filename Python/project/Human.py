class Human(object):
    def __init__(self,Name:str,Age:int,Gender:str):
        self.name = Name
        self.age = Age
        self.gender = Gender

    def show_human(self):
        print(f"{self.name}{self.age}{self.gender}")
    
    def __str__(self) -> str:
        return f"{self.name} {str(self.age)} {self.gender} "
    def __add__(self,other):
        return self.__str__() + other.__str__()
