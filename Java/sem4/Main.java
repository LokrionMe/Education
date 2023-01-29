package Java.sem4;

public class Main {
    public static void main(String[] args) {
        Diary frstDiary = new Diary("everyday");
        Note frstNote = new Note("Jef", "Ivanov", "do homework", 17, 00, 30, 1, 2023,"low");
        Note scndNote = new Note("Jef", "Ivanov", "wash dishes", 16, 15, 25, 3, 2023,"high");
        Note thrdNote = new Note("Ilya", "Petrov", "write letter", 20, 00, 30, 2, 2023,"medium");
        Note frsNote = new Note(4, "Sidorov", "eat", 23, 00, 20, 2, 2023,"high");
        frstDiary.addNote(frstNote);
        frstDiary.addNote(scndNote);
        frstDiary.addNote(thrdNote);
        frstDiary.addNote(frsNote);
        frstDiary.showNotesList();
        frstDiary.sortNotesPLvl("high");
    }
}
