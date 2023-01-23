package Java.sem1;

public class Main {
    public static void main(String[] args) {
        Persona Father = new Persona("John", "Male", 86);
        Persona Son = new Persona("Frank", "Male", 67);
        Persona Grandson = new Persona("Ilya", "Male", 46);
        Persona Daughter = new Persona("Eliza", "Female", 63);
        Persona Grandson2 = new Persona("Jake", "Male", 47);
        Persona Granddauter = new Persona("Sonya", "Female", 37);
        Persona Granddauter2 = new Persona("Violla", "Female", 44);
        Persona Grandgranddauter2 = new Persona("Pagi", "Female", 22);
        Father.addName(Son);
        Father.addName(Daughter);
        Son.addName(Grandson);
        Son.addName(Granddauter2);
        Daughter.addName(Granddauter);
        Daughter.addName(Grandson2);
        Granddauter2.addName(Grandgranddauter2);
        TreeView.treeView(Father, 0);
        Father.Voice();
        Cat pet1 = new Cat("Pushok", "Male", 2);
        Dog pet2 = new Dog("Raul", "Male", 3);
        Father.addPets(pet1);
        Father.addPets(pet2);
        Father.CallPets();

    }
}
