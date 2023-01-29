package Java.sem4;

import java.util.ArrayList;

public class Diary {
    String nameDiary;
    ArrayList <Note> notesList = new ArrayList<>();

    public Diary(String NameDiary){
        this.nameDiary = NameDiary;
    }
    public void addNote(Note note) {
        this.notesList.add(note);
    }
    public ArrayList<Note> getNotes(){
        return notesList;
    }
    public void showNotesList(){
        for (Note note : notesList) {
            note.showNote();
        }
    }
    public void sortNotesPLvl(String priorityLvl){
        for (Note note : notesList){
            if (note.getPriority().equals(priorityLvl)){
                note.showNote();
            }
        }
    }
}
