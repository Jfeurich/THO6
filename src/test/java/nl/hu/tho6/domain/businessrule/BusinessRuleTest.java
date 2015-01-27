package nl.hu.tho6.domain.businessrule;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BusinessRuleTest {
    private BusinessRule testBusinessRule;
    private Operator     testOperator;
    private Value        testValue, testValue2;
    private Attribute testAttribute, testAttribute2;

    @Before
    public void setUp() {
        testBusinessRule = new BusinessRule();
        testBusinessRule.setRuleNaam("Naam");
        testBusinessRule.setError("Error");
        testBusinessRule.setErrorType("Type");
        testBusinessRule.setCode("Code");
        testOperator = new Operator("", "");
        testBusinessRule.setOperator(testOperator);
        testValue = new Value("", "", "");
        testBusinessRule.setValue1(testValue);
        testBusinessRule.setValue2(testValue);
        testAttribute = new Attribute("", "", "", "", 0);
        testBusinessRule.setAttribute1(testAttribute);
        testBusinessRule.setAttribute2(testAttribute);
        testBusinessRule.setRuleID(0);
    }

    @Test
    public void testGetRuleNaam() {
        assertEquals("Naam", testBusinessRule.getRuleNaam());
    }

    @Test
    public void testSetRuleNaam() {
        testBusinessRule.setRuleNaam("Rule");
        assertNotEquals("Naam", testBusinessRule.getRuleNaam());
        assertEquals("Rule", testBusinessRule.getRuleNaam());
    }

    @Test
    public void testGetError() {
        assertEquals("Error", testBusinessRule.getError());
    }

    @Test
    public void testSetError() {
        testBusinessRule.setError("Rule");
        assertNotEquals("Error", testBusinessRule.getError());
        assertEquals("Rule", testBusinessRule.getError());
    }

    @Test
    public void testGetErrorType() {
        assertEquals("Type", testBusinessRule.getErrorType());
    }

    @Test
    public void testSetErrorType() {
        testBusinessRule.setErrorType("Rule");
        assertNotEquals("Type", testBusinessRule.getErrorType());
        assertEquals("Rule", testBusinessRule.getErrorType());
    }

    @Test
    public void testGetCode() {
        assertEquals("Code", testBusinessRule.getCode());
    }

    @Test
    public void testSetCode() {
        testBusinessRule.setCode("Rule");
        assertNotEquals("Code", testBusinessRule.getCode());
        assertEquals("Rule", testBusinessRule.getCode());
    }

    @Test
    public void testGetOperator() {
        assertEquals(testOperator, testBusinessRule.getOperator());
    }

    @Test
    public void testSetOperator() {
        Operator testOperator2 = new Operator("a", "a");
        testBusinessRule.setOperator(testOperator2);
        assertNotEquals(new Operator("", ""), testBusinessRule.getOperator());
        assertEquals(testOperator2, testBusinessRule.getOperator());
    }

    @Test
    public void testGetValue1() {
        assertEquals(testValue, testBusinessRule.getValue1());
    }

    @Test
    public void testSetValue1() {
        testValue2 = new Value("a", "a", "a");
        testBusinessRule.setValue1(testValue2);
        assertNotEquals(new Value("", "", ""), testBusinessRule.getValue1());
        assertEquals(testValue2, testBusinessRule.getValue1());
    }

    @Test
    public void testGetValue2() {
        assertEquals(testValue, testBusinessRule.getValue2());
    }

    @Test
    public void testSetValue2() {
        testValue2 = new Value("a", "a", "a");
        testBusinessRule.setValue2(testValue2);
        assertNotEquals(new Value("", "", ""), testBusinessRule.getValue2());
        assertEquals(testValue2, testBusinessRule.getValue2());
    }

    @Test
    public void testGetAttribute1() {
        assertEquals(testAttribute, testBusinessRule.getAttribute1());
    }

    @Test
    public void testSetAttribute1() {
        testAttribute2 = new Attribute("a", "a", "a", "a", 1);
        testBusinessRule.setAttribute1(testAttribute2);
        assertNotEquals(new Attribute("", "", "", "", 0), testBusinessRule.getAttribute1());
        assertEquals(testAttribute2, testBusinessRule.getAttribute1());
    }

    @Test
    public void testGetAttribute2() {
        assertEquals(testAttribute, testBusinessRule.getAttribute2());
    }

    @Test
    public void testSetAttribute2() {
        testAttribute2 = new Attribute("a", "a", "a", "a", 1);
        testBusinessRule.setAttribute2(testAttribute2);
        assertNotEquals(new Attribute("", "", "", "", 0), testBusinessRule.getAttribute1());
        assertEquals(testAttribute2, testBusinessRule.getAttribute2());
    }

    @Test
    public void testGetAttributeID() {
        assertEquals(0, testBusinessRule.getRuleID());
    }

    @Test
    public void testSetAttributeID() {
        testBusinessRule.setRuleID(1);
        assertNotEquals(0, testBusinessRule.getRuleID());
        assertEquals(1, testBusinessRule.getRuleID());
    }

    @After
    public void tearDown() {
        testBusinessRule = null;
        testAttribute = null;
        testValue = null;
        testOperator = null;
    }
}