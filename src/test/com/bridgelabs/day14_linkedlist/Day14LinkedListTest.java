package test.com.bridgelabs.day14_linkedlist;

import com.bridgelabs.day14_linkedlist.Day14LinkedList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

/**
* Day14LinkedList Tester.
*
* @author <Authors name>
* @since <pre>Jan 9, 2023</pre>
* @version 1.0
*/
public class Day14LinkedListTest {
    @Test
    public void testUc7_search() throws Exception {
        String expected = "30 is found at index 1";
        Day14LinkedList day14LinkedList = new Day14LinkedList();
        day14LinkedList.uc1_add(56);
        day14LinkedList.uc1_add(30);
        day14LinkedList.uc1_add(70);
        String actual = day14LinkedList.uc7_search(30);
        Assert.assertEquals(expected, actual);
    }
}
