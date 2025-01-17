class Teacher extends Person {
    private String subject;
    private int yearOfExp;
    private int salary;

    public Teacher(String name, String surname , int age, boolean gender, String subject, int yearOfExp, int salary) {
        super(name, surname, age, gender);
        this.subject=subject;
        this.yearOfExp=yearOfExp;
        this.salary=salary;
    }
    public void giveRaise( double percentage){
        if(percentage>=0){
            salary+=salary * percentage/100;
        }
    }
    @Override
    public String toString() {
        return super.toString() + " i teach" + subject;
    }
}
