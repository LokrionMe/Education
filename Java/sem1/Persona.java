package Java.sem1;

import java.util.ArrayList;

public class Persona {
    public String FullName;
    public Persona(String Name){
        this.FullName=Name;
    }
    ArrayList <Persona> listName = new ArrayList<>(); 
    public void addName(Persona pers) {
        listName.add(pers);
    }
    public ArrayList<Persona> getListName() {
        return listName;
    }
}