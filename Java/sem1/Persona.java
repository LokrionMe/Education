package Java.sem1;

import java.util.ArrayList;

public class Persona extends Human {
    public Persona(String Name, String Sex, int Age){
        SetName(Name);
        SetSex(Sex);
        SetAge(Age);
    }
    ArrayList <Persona> listName = new ArrayList<>(); 
    public void addName(Persona pers) {
        listName.add(pers);
    }
    public ArrayList<Persona> getListName() {
        return listName;
    }
    public void Voice() {
        String name = GetName();
        System.out.println("Hello! My name is " + name);
    }
    ArrayList <Animal> ArrayPets = new ArrayList<>(); 
    public void addPets(Animal pet) {
        ArrayPets.add(pet);
    }
    public ArrayList <Animal> GetPetsName() {
        return ArrayPets;
    }
    public void CallPets() {
        for (Animal i: GetPetsName()){
            System.out.print(i.name + ": "); 
            i.Voice();
        }
    }
}