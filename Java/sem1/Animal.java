package Java.sem1;

public abstract class Animal {
    String name;
    String gender;
    int age;
    public void SetName(String Name) {
        this.name = Name;
    }
    public void SetAge(int Age) {
        this.age = Age;
    }
    public void SetGender(String Gender) {
        this.gender = Gender;
    }
    public abstract void Voice ();
}
