import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Student extends Person{
    private int studentId;
    private List<Integer> grades;

    public Student(String name,String surname, int age, boolean gender) {
        super(name,surname, age, gender);
        this.studentId = new Random().nextInt(1000);
        this.grades = new ArrayList<>();
    }
    public void addGrade(int grade) {
        if (grade>=0 && grade<=100){
            grades.add(grade);
        }
    }
    public double gpa(){
        if (grades.isEmpty()) return 0;
        int sum=0;
        for (Integer grade : grades) {
            sum+=grade;
        }
        return sum/(double)grades.size();
    }
    @Override
    public String toString() {
        return super.toString() + "I am a student with ID" + this.studentId +  " gpa: " + this.gpa();
    }
}
