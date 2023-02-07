from Car import Car
class Auto(Car):
    def __init__(self, Brand: str, Model: str, Year: int, Color: str) -> None:
        super().__init__(Brand, Model, Year, Color)
    def set_gos_number(self,number: str):
        self.gos_number = number
    
    