import java.util.ArrayList;

public class Cohort {

    String name;
    ArrayList<Student> students;
    ArrayList<Mentor> mentors;

    public Cohort(String name){
        this.name = name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void addMentor(Mentor mentor){
        mentors.add(mentor);
    }

    public void info(){
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }

}
