package Java.sem1;

public class Cat extends Animal {
    public Cat(String Name, String Gender, int Age) {
        SetName(Name);
        SetAge(Age);
        SetGender(Gender);
    }

    public void Voice() {
        System.out.println("Myau");
    }
}
