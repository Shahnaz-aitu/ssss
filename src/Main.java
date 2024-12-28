//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student1=new Student("Harry", "Potter",20,true);
        student1.addGrade(78);
        student1.addGrade(89);
        student1.addGrade(99);
        student1.addGrade(51);
        Student student2=new Student("Ron", "Oeasley",20,true);
        student2.addGrade(78);
        student2.addGrade(89);
        student2.addGrade(75);
        student2.addGrade(63);
        Student student3=new Student("Hermione", "Granger",19,false);
        student3.addGrade(100);
        student3.addGrade(99);
        student3.addGrade(95);
        student3.addGrade(98);
        Student student4=new Student("Luna", "Lovegood",19,false);
        student4.addGrade(46);
        student4.addGrade(87);
        student4.addGrade(67);
        student4.addGrade(79);

        Teacheer teacher1=new Teacher("Severus", "Snape", 51, true, "math", 7, 800000);
        Teacheer teacher2=new Teacher("Albus", "Dambledore", 71, true,"philosophy", 25, 1500000);
        Teacheer teacher3=new Teacher("Minerva", "McGonagall", 62, false, "Sociology", 17, 1100000);
        Teacheer teacher4=new Teacher("Sirius", "Black", 49, true, "physics", 9, 750000);


        System.out.println("Student1 GPA: " + student1.gpa());
        System.out.println("Student2 GPA: " + student2.gpa());
        teacher1.giveRaise(10); // 10% raise
        teacher2.giveRaise(10); // 10% raise

        // Create School and add members
        School school = new School();
        school.addMember(student1);
        school.addMember(teacher1);

        // Print all members
        System.out.println("\nSchool Members:");
        System.out.println(school);

    }
}