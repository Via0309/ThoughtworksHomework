import org.junit.Test;

import static org.junit.Assert.*;

public class CompareNumberTest {

    @Test
    public void compare() {
        CompareNumber cn = new CompareNumber();
        String sysNum = "1234";
        assertTrue(cn.compare(sysNum, "4321").equals("0A4B"));
        assertTrue(cn.compare(sysNum, "1342").equals("1A3B"));
        assertTrue(cn.compare(sysNum, "1243").equals("2A2B"));
        assertTrue(cn.compare(sysNum, "1234").equals("4A0B"));
        assertTrue(cn.compare(sysNum, "2345").equals("0A3B"));
        assertTrue(cn.compare(sysNum, "3245").equals("1A2B"));
        assertTrue(cn.compare(sysNum, "4235").equals("2A1B"));
        assertTrue(cn.compare(sysNum, "5234").equals("3A0B"));
        assertTrue(cn.compare(sysNum, "2563").equals("0A2B"));
        assertTrue(cn.compare(sysNum, "5263").equals("1A1B"));
        assertTrue(cn.compare(sysNum, "5236").equals("2A0B"));
        assertTrue(cn.compare(sysNum, "4567").equals("0A1B"));
        assertTrue(cn.compare(sysNum, "5674").equals("1A0B"));
        assertTrue(cn.compare(sysNum, "5678").equals("0A0B"));
    }
}