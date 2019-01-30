package teacherstudent;

public class Teacher {

    public void teach(Student student) {
        student.learn();
        System.out.println("I teached you stuff, your knowledge is now: " + student.knowledge);
    }

    public void answer() {
        String answer = "This is the answer";
        System.out.println(answer);
    }
}
