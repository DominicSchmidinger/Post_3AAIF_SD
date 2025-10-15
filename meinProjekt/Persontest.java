

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class StudentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PersonTest
{
    /**
     * Default constructor for test class StudentTest
     */
    public PersonTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    @Test
    public void testMinGewicht(){
        Person s=new Person("Dominic",75.0f,189,'m',2003);
        System.out.println(s.mannOderFrau());
        System.out.println(s.gewichtsklasse());
        assertEquals("Normalgewicht", s.gewichtsklasse());
        //assertEquals(75.0f, s.getKg());
        //s.setKg(2.0f);
        //assertEquals(2.0f, s.getKg(), 0.1);
        //assertEquals(2.0f, s.getKg());
    }
        
    
}