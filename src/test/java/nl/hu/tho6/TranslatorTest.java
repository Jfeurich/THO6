package nl.hu.tho6;

import nl.hu.tho6.domain.businessrule.Attribute;
import nl.hu.tho6.domain.businessrule.BusinessRule;
import nl.hu.tho6.domain.businessrule.Operator;
import nl.hu.tho6.domain.businessrule.Value;
import nl.hu.tho6.translator.Translator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.stringtemplate.v4.ST;

import static org.junit.Assert.assertNotNull;

//TODO opnieuw kijken naar translatortest, dingen verwijderd omdat Translator aangepast is

/**
 * The class <code>TranslatorTest</code> contains tests for the class <code>{@link Translator}</code>.
 *
 * @author jayfeurich
 * @version $Revision: 1.0 $
 * @generatedBy CodePro at 1/14/15 2:17 PM
 */
public class TranslatorTest {
    /**
     * Run the String Translator(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/14/15 2:17 PM
     */
    @Test
    public void testTranslator_1() throws Exception {
        Translator fixture = new Translator();

        String language = "";

        //		String result = fixture.Translator(language);

        // add additional test code here
        //		assertEquals("", result);

        //je hoeft geen businessrule te setten in de translator het is alleen maar een soort utility class
        //fixture.setBusinessrule(new BusinessRule());

        //BusinessRule result = fixture.getBusinessrule();

        // add additional test code here
        //		assertNotNull(result);
        //		assertEquals(null, result.getAttribute2());
        //		assertEquals(null, result.getErrorType());
        //		assertEquals(null, result.getValue2());
        //		assertEquals(null, result.getValue1());
        //		assertEquals(null, result.getRuleNaam());
        //		assertEquals(null, result.getOperator());
        //		assertEquals(null, result.getCode());
        //		assertEquals(null, result.getError());
        //		assertEquals(null, result.getAttribute1());

    }

    /**
     * Run the String getLanguage() method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/14/15 2:17 PM
     */
    @Test
    public void testGetLanguage_1() throws Exception {
        Translator fixture = new Translator();

        //fixture.setBusinessrule(new BusinessRule());

        // add additional test code here
        //		assertEquals("", result);
    }

    /**
     * Run the void setBusinessrule(BusinessRule) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 14/01/15 10:31
     */
    @Test
    public void testSetBusinessrule_1() throws Exception {
        Translator fixture = new Translator();

        //fixture.setBusinessrule(new BusinessRule());
        BusinessRule businessrule = new BusinessRule();

        //fixture.setBusinessrule(businessrule);

        // add additional test code here
    }

    /**
     * Run the void setLanguage(String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/14/15 2:17 PM
     */
    @Test
    public void testSetLanguage_1() throws Exception {
        Translator fixture = new Translator();

        //fixture.setBusinessrule(new BusinessRule());
        String language = "";

        // add additional test code here
    }

    /**
     * Run the ST translate(ST,String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/14/15 2:17 PM
     */
    @Test
    public void testTranslate_1() throws Exception {
        Translator fixture = new Translator();

        //fixture.setBusinessrule(new BusinessRule());

        ST st = new ST(""); String language = "mysql";

        ST result = fixture.translate(st, language);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at st4hidden.org.antlr.runtime.ANTLRStringStream.<init>(ANTLRStringStream.java:75)
        //       at org.stringtemplate.v4.compiler.Compiler.compile(Compiler.java:111)
        //       at org.stringtemplate.v4.STGroup.compile(STGroup.java:448)
        //       at org.stringtemplate.v4.ST.<init>(ST.java:173)
        //       at org.stringtemplate.v4.ST.<init>(ST.java:159)
        //       at Translator.translate(Translator.java:34)
        assertNotNull(result);
    }

    /**
     * Run the ST translate(ST,String) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/14/15 2:17 PM
     */
    @Test
    public void testTranslate_2() throws Exception {
        Translator fixture = new Translator();

        //fixture.setBusinessrule(new BusinessRule());

        ST st = new ST(""); String language = "mysql";

        ST result = fixture.translate(st, language);

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at st4hidden.org.antlr.runtime.ANTLRStringStream.<init>(ANTLRStringStream.java:75)
        //       at org.stringtemplate.v4.compiler.Compiler.compile(Compiler.java:111)
        //       at org.stringtemplate.v4.STGroup.compile(STGroup.java:448)
        //       at org.stringtemplate.v4.ST.<init>(ST.java:173)
        //       at org.stringtemplate.v4.ST.<init>(ST.java:159)

        //       at Translator.translate(Translator.java:34)

        //       at Translator.translate(Translator.java:27)
        assertNotNull(result);
    }

    /**
     * Run the String translator(String,BusinessRule) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 14/01/15 10:31
     */
    @Test
    public void testTranslator_3() throws Exception {
        Translator fixture = new Translator();

        //fixture.setBusinessrule(new BusinessRule());
        String language = "mysql";
        BusinessRule businessrule = new BusinessRule("", "", "", "", new Operator("", ""), new Value("", "", ""), new Value("", "", ""), new Attribute("", "", "", "", 0), new Attribute("", "", "", "", 0));

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at st4hidden.org.antlr.runtime.ANTLRStringStream.<init>(ANTLRStringStream.java:75)
        //       at org.stringtemplate.v4.compiler.Compiler.compile(Compiler.java:111)
        //       at org.stringtemplate.v4.STGroup.compile(STGroup.java:448)
        //       at org.stringtemplate.v4.ST.<init>(ST.java:173)
        //       at org.stringtemplate.v4.ST.<init>(ST.java:159)
        //       at Translator.translator(Translator.java:15)

        //		assertNotNull(result);
    }

    /**
     * Run the String translator(String,BusinessRule) method test.
     *
     * @throws Exception
     * @generatedBy CodePro at 1/14/15 2:17 PM
     */
    @Test
    public void testTranslator_2() throws Exception {
        Translator fixture = new Translator();

        //fixture.setBusinessrule(new BusinessRule());

        String language = "mysql"; BusinessRule businessrule = new BusinessRule();

        // add additional test code here
        // An unexpected exception was thrown in user code while executing this test:
        //    java.lang.NullPointerException
        //       at st4hidden.org.antlr.runtime.ANTLRStringStream.<init>(ANTLRStringStream.java:75)
        //       at org.stringtemplate.v4.compiler.Compiler.compile(Compiler.java:111)
        //       at org.stringtemplate.v4.STGroup.compile(STGroup.java:448)
        //       at org.stringtemplate.v4.ST.<init>(ST.java:173)
        //       at org.stringtemplate.v4.ST.<init>(ST.java:159)
        //       at Translator.translator(Translator.java:15)
        //		assertNotNull(result);
    }

    /**
     * Perform pre-test initialization.
     *
     * @throws Exception
     *         if the initialization fails for some reason
     * @generatedBy CodePro at 1/14/15 2:17 PM
     */
    @Before
    public void setUp() throws Exception {
        // add additional set up code here
    }

    /**
     * Perform post-test clean-up.
     *
     * @throws Exception
     *         if the clean-up fails for some reason
     * @generatedBy CodePro at 1/14/15 2:17 PM
     */
    @After
    public void tearDown() throws Exception {
        // Add additional tear down code here
    }

    /**
     * Launch the test.
     *
     * @param args
     *         the command line arguments
     *
     * @generatedBy CodePro at 1/14/15 2:17 PM
     */
    public static void main(String[] args) {
        new org.junit.runner.JUnitCore().run(TranslatorTest.class);
    }
}