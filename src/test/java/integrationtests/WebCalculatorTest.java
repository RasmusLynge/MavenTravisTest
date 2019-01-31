/*
 Spøgsmål til fredag:
- Kan ikke deploy til tomkat på digital ocean gennem cmn promt...
- 
 */
package integrationtests;

import calculator.Calculator;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import utils.HttpClient;

/**
 *
 * @author Rasmu
 */
public class WebCalculatorTest {

    /**
     * Test of div method, of class Calculator.
     */

    @Test
    public void testMakeHttpRequest() throws Exception {
        HttpClient httpC = new HttpClient("http://188.166.16.16:8080/WebApplication-1.0-SNAPSHOT/calculator");
        String params = "?operation=add&n1=2&n2=3";
        HttpClient instance = httpC;
        String expResult = "Result of: 2+3= 5";
        String result = instance.makeHttpRequest(params);
        assertEquals(expResult, result);
    }
}
