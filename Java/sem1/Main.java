package Java.sem1;

public class Main {
    public static void main(String[] args) {
        Persona Father = new Persona("John");
        Persona Son = new Persona("Frank");
        Persona Grandson = new Persona("Ilya");
        Persona Daughter = new Persona("Eliza");
        Persona Grandson2 = new Persona("Jake");
        Persona Granddauter = new Persona("Sonya");
        Persona Granddauter2 = new Persona("Violla");
        Persona Grandgranddauter2 = new Persona("Pagi");
        Father.addName(Son);
        Father.addName(Daughter);
        Son.addName(Grandson);
        Son.addName(Granddauter2);
        Daughter.addName(Granddauter);
        Daughter.addName(Grandson2);
        Granddauter2.addName(Grandgranddauter2);
        TreeView.treeView(Father,0);

    }
}
