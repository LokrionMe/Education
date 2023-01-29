package Java.sem4;

public class ID {
    Viewer view = new Viewer();
    Object Id;

    public ID(Object id) {
        setID(id);
    }

    public void setID(Object id) {
        this.Id = id;
    }

    public Object getId() {
        return Id;
    }

    public void showId() {
        view.print(Id);

    };
}
