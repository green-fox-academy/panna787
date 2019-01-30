package counter;

public class Counter {

    int initValue;
    int value;

    public Counter(){

        this.initValue = 0;
        this.value = 0;

    }

    public Counter(int value){

        this.initValue = value;
        this.value = value;
    }

    public void add() {

        value += 1;
    }

    public void add(int number) {

        value += number;
    }

    public int get(){

        return value;
    }

    public void reset(){

        value = initValue;
    }
}
