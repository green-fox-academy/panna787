package teacherstudent;

public class Student {

    int knowledge = 0;

    public void learn() {
        knowledge += 5;


    }

    public void question(Teacher teacher) {
        String question = "This is my question";
        System.out.println(question);
        teacher.answer();

    }
}
