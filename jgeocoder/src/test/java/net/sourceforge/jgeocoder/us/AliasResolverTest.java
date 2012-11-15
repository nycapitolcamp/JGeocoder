package net.sourceforge.jgeocoder.us;

import static org.junit.Assert.assertEquals;

public class AliasResolverTest {
    @org.junit.Test
    public void testAliasResolver() {
        assertEquals("PHILADELPHIA", AliasResolver.resolveCityAlias("PHILA", "PA"));
        assertEquals("PHILADELPHIA", AliasResolver.resolveCityAlias("MANAYUNK", "PA"));
        assertEquals("CHENANGO BRIDGE", AliasResolver.resolveCityAlias("CHENANGO BRG", "NY"));
    }
}
