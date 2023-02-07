from Human_Persona import Persona
from Viewer import Viewer
from Car_Auto import Auto
import model
printer = Viewer
pers1 = Persona("Ilya", 18,"m")
printer(pers1)
pers1.add_phone("89039081710")
pers1.add_phone("89069241827")
printer(pers1 + str(pers1.lst_phones))
auto1 = Auto("Ferrarri", "Aventador",1974,"Red")
model.open_car(pers1,auto1)
model.close_car(pers1,auto1)
pers1.add_auto(Auto("Bughatti", "Veiron",2019,"Grey"))
pers1.add_auto(auto1)
pers1.add_auto(auto1)
printer(pers1.show_autos_list())
model.close_car(pers1,auto1)
model.open_car(pers1,auto1)
