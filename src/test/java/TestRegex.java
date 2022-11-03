import myTask.regex.MyPattern;
import org.testng.annotations.Test;

import java.util.regex.Pattern;

import static org.testng.Assert.*;

public class TestRegex {
    MyPattern pattern = new MyPattern();

    @Test
    public void test01(){
        boolean expected = Pattern.matches("", "");
        boolean actual = pattern.matches("", "");
        assertEquals(expected, actual);
    }

    @Test
    public void test02(){
        boolean expected = Pattern.matches("a", "aa");
        boolean actual = pattern.matches("a", "aa");
        assertEquals(expected, actual);
    }

    @Test
    public void test03(){
        boolean expected = Pattern.matches("a*", "aaaa");
        boolean actual = pattern.matches("a*", "aaaa");
        assertEquals(expected, actual);
    }

    @Test
    public void test04(){
        boolean expected = Pattern.matches("ba*b", "baaaab");
        boolean actual = pattern.matches("ba*b", "baaaab");
        assertEquals(expected, actual);
    }

    @Test
    public void test05(){
        boolean expected = Pattern.matches("a*cg", "aacg");
        boolean actual = pattern.matches("a*cg", "aacg");
        assertEquals(expected, actual);
    }

    @Test
    public void test06(){
        boolean expected = Pattern.matches(".*", "ablol");
        boolean actual = pattern.matches(".*", "ablol");
        assertEquals(expected, actual);
    }

    @Test
    public void test07(){
        boolean expected = Pattern.matches("aba.aba...", "abazabaosz");
        boolean actual = pattern.matches("aba.aba...", "abazabaosz");
        assertEquals(expected, actual);
    }

    @Test
    public void test08(){
        boolean expected = Pattern.matches("...Z", "asdZ");
        boolean actual = pattern.matches("...Z", "asdZ");
        assertEquals(expected, actual);
    }

    @Test
    public void test09(){
        boolean expected = Pattern.matches("f*", "fffffffff");
        boolean actual = pattern.matches("f*", "ffffffffff");
        assertEquals(expected, actual);
    }

    @Test
    public void test10(){
        boolean expected = Pattern.matches(".", "f");
        boolean actual = pattern.matches(".", "f");
        assertEquals(expected, actual);
    }

    @Test
    public void test11(){
        boolean expected = Pattern.matches(".s", "as");
        boolean actual = pattern.matches(".s", "as");
        assertEquals(expected, actual);
    }

    @Test
    public void test12(){
        boolean expected = Pattern.matches(".s", "as");
        boolean actual = pattern.matches(".s", "mk");
        assertEquals(expected, actual);
    }

    @Test
    public void test13(){
        boolean expected = Pattern.matches(".s", "as");
        boolean actual = pattern.matches(".s", "mst");
        assertEquals(expected, actual);
    }

    @Test
    public void test14(){
        boolean expected = Pattern.matches(".s", "as");
        boolean actual = pattern.matches(".s", "amms");
        assertEquals(expected, actual);
    }

    @Test
    public void test15(){
        boolean expected = Pattern.matches("..s", "mas");
        boolean actual = pattern.matches("..s", "mas");
        assertEquals(expected, actual);
    }

    @Test
    public void test16(){
        boolean expected = Pattern.matches("...abux*shl...", "oooabuxxshlhhh");
        boolean actual = pattern.matches("...abux*shl...", "oooabuxxshlhhh");
        assertEquals(expected, actual);
    }
}
