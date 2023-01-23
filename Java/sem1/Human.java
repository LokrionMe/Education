package Java.sem1;

public abstract class Human {
    private String sex;
    private String name;
    private int age;
    public void SetSex(String Sex) {
        this.sex = Sex;
    }
    public void SetName(String Name) {
        this.name = Name;
    }
    public void SetAge(int Age) {
        this.age = Age;
    }
    public String GetSex() {
        return sex;
    }
    public String GetName() {
        return name;
    }
    public int GetAge() {
        return age;
    }
    public abstract void Voice ();
}
