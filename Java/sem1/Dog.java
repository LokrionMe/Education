package Java.sem1;

public class Dog extends Animal {
    public Dog(String Name, String Gender, int Age) {
        SetName(Name);
        SetAge(Age);
        SetGender(Gender);
    }

    public void Voice() {
        System.out.println("Hau");
    }
}
