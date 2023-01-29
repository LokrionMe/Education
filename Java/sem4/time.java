package Java.sem4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class time {
    Viewer view = new Viewer();
    DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm");
    Calendar timing = new GregorianCalendar();
    Calendar deadline = new GregorianCalendar();

    void addedTime() {
        view.print("Сreation date: " + df.format(timing.getTime()));
    }

    void setDeadline(int hour, int min, int day, int month, int year) {
        this.deadline.set(year, month - 1, day, hour, min);
    }

    public String getDeadline() {
        return df.format(deadline.getTime());
    }

    public String getAddedTime() {
        return df.format(timing.getTime());
    }

    void showDeadline() {
        view.print("Deadline: " + df.format(deadline.getTime()));
    }

}
