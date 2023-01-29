package Java.sem4;

interface Account<T> {
    void setID(T name);

    T getId();

    void showId();
}
