package test;

import main.BalancedBrackets;
import org.junit.Test;


import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyTwoBalancedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void closingBracketWithoutOpeningBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void nestedBalacedBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][]]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][[]][]]"));
    }

    @Test
    public void balancedBracketsWithExtraTextReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LAUN[CH][[C]O][D]E]"));
    }

    @Test
    public void singleOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void extraOpeningBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]["));
    }

    @Test
    public void extraOpeningBracketsWithExtraTextReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LAU[N]C]HCODE["));
    }

    @Test
    public void extraClosingBracketsWithExtraTextReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LAU]NC]H]CO[DE]"));
    }

    @Test public void longStringWithLineBreaksBalancedBracketsReturnsTrue() {

        String testString = "That [is, whether it consists entirely of pairs of opening/closing\n" +
                "     * brackets (in that order), none of which mis-n]est. We consider a bracket\n" +
                "     * to be square-brackets: [ or ].\n" +
                "     *\n" +
                "     * The string may contain non-bracket characters as well.\n" +
                "     *\n" +
                "     * These strings have balanced brackets:\n" +
                "     *  \"[LaunchCode]\", \"Launch[Code]\", \"[]LaunchCode\", \"\", \"[]\"\n" +
                "     *\n" +
                "     * While these do not:\n" +
                "     *   \"[LaunchCode\", \"Launch]Code[\", \"[\", \"]]";

        assertTrue(BalancedBrackets.hasBalancedBrackets(testString));
    }

    @Test public void longStringWithLineBreaksUnbalancedBracketsReturnsFalse() {

        String testString = "That [is, whether] it consists entirely of pairs of opening/closing\n" +
                "     * brackets (in that order), none of which mis-n]est. We consider a bracket\n" +
                "     * to be square-brackets: [ or ].\n" +
                "     *\n" +
                "     * The string may contain non-bracket characters as well.\n" +
                "     *\n" +
                "     * These strings have balanced brackets:\n" +
                "     *  \"[LaunchCode]\", \"Launch[Code]\", \"[]LaunchCode\", \"\", \"[]\"\n" +
                "     *\n" +
                "     * While these do not:\n" +
                "     *   \"[LaunchCode\", \"Launch]Code[\", \"[\", \"]]";

        assertFalse(BalancedBrackets.hasBalancedBrackets(testString));
    }

    @Test
    public void fourBalancedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }


}
