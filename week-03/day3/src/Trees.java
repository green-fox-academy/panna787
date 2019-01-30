public class Trees {

    String type;
    String leafColor;
    int age;
    String sex;

    public Trees(String type, String leafColor, int age, String sex) {

        this.type = type;
        this.leafColor = leafColor;
        this.age = age;
        this.sex = sex;
    }

    Trees tree1 = new Trees("maple", "brown", 59, "male");
    Trees tree2 = new Trees("oak", "dark green", 70, "male");
    Trees tree3 = new Trees("pine", "green", 5, "female");
    Trees tree4 = new Trees("apple", "dark green", 59, "male");
    Trees tree5 = new Trees("cypress", "light green", 20, "female");

}
