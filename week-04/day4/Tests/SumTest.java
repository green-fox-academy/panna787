import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SumTest {


    @Test
    public void sum_MultipleNumbers_ReturnsSum(){
        Sum mySum = new Sum();
        ArrayList<Integer> numbersToSum = new ArrayList<>();
        numbersToSum.add(1);
        numbersToSum.add(5);
        numbersToSum.add(7);
        numbersToSum.add(2);

        assertEquals((Integer)15, mySum.sum(numbersToSum));
    }

    @Test
    public void sum_OneElement_ReturnsElement(){
        Sum mySum = new Sum();
        ArrayList<Integer> numbersToSum = new ArrayList<>();
        numbersToSum.add(12);

        assertEquals((Integer)12, mySum.sum(numbersToSum));
    }

    @Test(expected = IllegalArgumentException.class)
    public void sum_WithEmptyList_ThrowsIllegalArgumentException(){
        Sum mySum = new Sum();
        ArrayList<Integer> numbersToSum = new ArrayList<>();
        mySum.sum(numbersToSum);
    }

    @Test(expected = NullPointerException.class)
    public void sum_WithNullValue_ThrowsNullPointerException(){
        Sum mySum = new Sum();
        ArrayList<Integer> numbersToSum = null;
        mySum.sum(numbersToSum);
    }



}
