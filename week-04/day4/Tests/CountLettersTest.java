import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountLettersTest {

    static String testString = "Test this";
    static Map testMap = new HashMap();
    CountLetters test = new CountLetters();

    @Test
    public void countLetters_WithNonEmptyString_ReturnsDictionary(){
        testMap.put('T', 1);
        testMap.put('e', 1);
        testMap.put('s', 2);
        testMap.put('t', 2);
        testMap.put(' ', 1);
        testMap.put('h', 1);
        testMap.put('i', 1);

        assertEquals(testMap, test.countLettersInString(testString));
    }
}
