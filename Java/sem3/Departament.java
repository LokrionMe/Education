package Java.sem3;

import java.util.ArrayList;

public class Departament {
    ConsoleView view = new ConsoleView();
    public String nameGroup;

    public void SetNameGroup(String NameGroup) {
        this.nameGroup = NameGroup;
    }

    public String GetNameGroup() {
        return nameGroup;
    }

    ArrayList<Worker> ListWorkers = new ArrayList<>();

    public ArrayList<Worker> GetListWorkers() {
        return ListWorkers;
    }

    public void addWorker(Worker man) {
        ArrayList<Worker> lst = GetListWorkers();
        lst.add(man);
    }

    public void ShowWorkers() {
        int k = 0;
        for (Worker i : ListWorkers) {
            k += 1;
            view.ShowString(k + ". " + i.GetName() + " (" + i.GetSex() + ") " + i.GetAge() + " y.o.");
        }
    }
}
