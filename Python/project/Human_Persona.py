from Human import Human
from Car_Auto import Auto
from Viewer import Viewer
class Persona(Human):
    def __init__(self, Name: str, Age: int, Gender: str):
        super().__init__(Name, Age, Gender)
    lst_phones = []
    def add_phone(self, number:str):
        self.lst_phones.append(number)
    def get_phones_list(self):
        return self.lst_phones
    lst_autos = []
    def add_auto(self,auto: Auto):
        if auto not in self.lst_autos:
            self.lst_autos.append(auto)
        else:
            Viewer("Car almost added")
    def show_autos_list(self):
        return list(map(str,self.lst_autos))
