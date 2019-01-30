package teacherstudent;

public class Main {
    public static void main(String[] args) {

        Student guy = new Student();
        Teacher walter = new Teacher();

        walter.teach(guy);
        guy.question(walter);


    }

}
