package Java.sem3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Departament dep0 = new Departament();
        Checker check = new Checker();
        ConsoleView view = new ConsoleView();
        ArrayList<Group> groupList = new ArrayList<>();
        Group dep1 = new Group("Accounts");
        Group dep2 = new Group("Textile");
        Group dep3 = new Group("Paint shop");
        Worker worker1 = new Worker("Ivanov", "m", 23);
        Worker worker2 = new Worker("Sidorov", "m", 34);
        Worker worker3 = new Worker("Petrov", "m", 26);
        Worker worker4 = new Worker("Sidorenko", "f", 36);
        Worker worker5 = new Worker("Ibragimov", "m", 64);
        Worker worker6 = new Worker("Percson", "f", 43);
        Worker worker7 = new Worker("Glyancev", "m", 44);
        Worker worker8 = new Worker("Poroshenko", "f", 19);
        dep0.addWorker(worker7);
        dep0.addWorker(worker8);
        dep1.addWorker(worker6);
        dep1.addWorker(worker3);
        dep2.addWorker(worker4);
        dep2.addWorker(worker1);
        dep3.addWorker(worker2);
        dep3.addWorker(worker5);
        groupList.add(dep1);
        groupList.add(dep2);
        groupList.add(dep3);
        int number = 0;
        while (number != 5) {
            view.ShowString(
                    "Choose number:\n1. Add worker\n2. Show workers list\n3. Distribute workers\n4. Reassign worker\n5. Exit");
            number = check.CheckNumber(number, 1, 5);
            if (number == 1) {
                String name = check.InputString("Input name:");
                String sex = check.InputString("Input gender:");
                int age = check.InputInt("Input age:");
                dep0.addWorker(new Worker(name, sex, age));
            } else if (number == 2) {
                int k = 0;
                view.ShowString("Choose group:");
                for (Group group : groupList) {
                    k += 1;
                    view.ShowString(k + ". " + group.nameGroup);
                }
                view.ShowString(groupList.size() + 1 + ". Back");
                int numb = 0;
                numb = check.CheckNumber(numb, 1, groupList.size() + 1) - 1;
                view.ShowString("Workers list of " + groupList.get(numb).GetNameGroup());
                groupList.get(numb).ShowWorkers();
            } else if (number == 3) {
                int numbOfWorker = 0;
                int numbOfGroup = 0;
                view.ShowString("Choose worker:");
                dep0.ShowWorkers();
                numbOfWorker = check.CheckNumber(numbOfWorker, 1, dep0.GetListWorkers().size() + 1) - 1;
                view.ShowString(dep0.GetListWorkers().get(numbOfWorker).GetName());
                view.ShowString("Choose group:");
                int k = 0;
                for (Group group : groupList) {
                    k += 1;
                    view.ShowString(k + ". " + group.nameGroup);
                }
                numbOfGroup = check.CheckNumber(numbOfGroup, 1, groupList.size() + 1) - 1;
                view.ShowString("Person is agree?\n1. Yes\n2. No");
                int numbAgree = 0;
                numbAgree = check.CheckNumber(numbAgree, 1, 2);
                if (numbAgree == 1) {
                    Worker temp = dep0.GetListWorkers().get(numbOfWorker);
                    dep0.GetListWorkers().remove(numbOfWorker);
                    groupList.get(numbOfGroup).addWorker(temp);
                } else {
                    view.ShowString("Person doesn't agree");
                }
            } else if (number == 4) {
                int numbOfWorker = 0;
                int numbOfGroup = 0;
                int numbOfGroupChanged = 0;
                view.ShowString("Choose group:");
                int k = 0;
                for (Group group : groupList) {
                    k += 1;
                    view.ShowString(k + ". " + group.nameGroup);
                }
                numbOfGroup = check.CheckNumber(numbOfGroup, 1, groupList.size() + 1) - 1;
                view.ShowString("Choose worker:");
                groupList.get(numbOfGroup).ShowWorkers();
                numbOfWorker = check.CheckNumber(numbOfWorker, 1,
                        groupList.get(numbOfGroup).GetListWorkers().size() + 1) - 1;
                view.ShowString(groupList.get(numbOfGroup).GetListWorkers().get(numbOfWorker).GetName());
                view.ShowString("Choose group:");
                k = 0;
                for (Group group : groupList) {
                    k += 1;
                    view.ShowString(k + ". " + group.nameGroup);
                }
                numbOfGroupChanged = check.CheckNumber(numbOfGroupChanged, 1, groupList.size() + 1) - 1;
                view.ShowString("Person is agree?\n1. Yes\n2. No");
                int numbAgree = 0;
                numbAgree = check.CheckNumber(numbAgree, 1, 2);
                if (numbAgree == 1) {
                    Worker temp = groupList.get(numbOfGroup).GetListWorkers().get(numbOfWorker);
                    groupList.get(numbOfGroup).GetListWorkers().remove(numbOfWorker);
                    groupList.get(numbOfGroupChanged).addWorker(temp);
                } else {
                    view.ShowString("Person doesn't agree");
                }
            }
        }
    }
}
