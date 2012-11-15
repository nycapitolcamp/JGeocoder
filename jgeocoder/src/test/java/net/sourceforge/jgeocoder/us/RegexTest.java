package net.sourceforge.jgeocoder.us;

import org.junit.Assert;
import org.junit.Test;

public class RegexTest {

	@Test
    public void testThatRegexLibrayOrdinalConstantMatchesSampleRealOrdinals() {
        String[] ordinals = new String[]{"12th","21st","23rd","5235th", "3456345th","4th","35634th","56th","345th",
         "634th","56th","3456th","345th","63456th","3456th", "2nd"};
         
        for(String ordinal : ordinals) 
         	Assert.assertTrue(ordinal.matches(RegexLibrary.ORDINAL_ALL));
    }
}