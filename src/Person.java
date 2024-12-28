public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean gender;

    public Person(String name, String surname, int age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;}

    @Override
    public String toString() {
        String g = gender ? "Male" : "Female";
        return "Hi! i am" + name + " " + surname + ", a " + age + " year old " + g;
    }
}