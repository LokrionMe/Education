from Human_Persona import Persona
from Car_Auto import Auto
from Viewer import Viewer
def open_car(person:Persona,auto:Auto):
    if auto in person.lst_autos:
        if not auto.open:
            Viewer("Car is opened")
        else:
            Viewer("Car is almost opened")
        auto.open = True
    else:
        Viewer("Car isn't your")
def close_car(person:Persona,auto:Auto):
    if auto in person.lst_autos:
        if auto.open:
            Viewer("Car is closed")
        else:
            Viewer("Car is almost closed")
        auto.open = False
    else:
        Viewer("Car isn't your")