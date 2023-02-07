class Car(object):
    open = False
    def __init__(self, Brand:str, Model:str, Year:int, Color:str) -> None:
        self.brand = Brand
        self.model = Model
        self.year = Year
        self.color = Color
    def __str__(self) -> str:
        return f"{self.brand} {self.model} {str(self.year)} {self.color}"
