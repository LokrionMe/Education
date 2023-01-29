package Java.sem4;

public class Note {
    
    Viewer view = new Viewer();
    ID Id;
    String Author;
    time StartTime = new time();
    String Text;
    time DeadLine = StartTime;
    String Priority;

    public Note(Object id, String author, String text, int hour, int min, int day, int month, int year, String priority) {
        this.Id = new ID(id);
        this.Author = author;
        this.Text = text;
        this.DeadLine.setDeadline(hour, min, day, month, year);
        this.Priority = priority;
    }

    public void showNote() {
        view.print(
                Id.getId() + " " + Author + " " + StartTime.getAddedTime() + " " + Text + " " + DeadLine.getDeadline()+ " " + Priority);
    }
    public time getDeadLIne() {
        return DeadLine;
    }
    public String getPriority() {
        return Priority;
    }
}
