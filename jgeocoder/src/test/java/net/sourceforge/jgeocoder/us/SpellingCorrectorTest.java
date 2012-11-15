package net.sourceforge.jgeocoder.us;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpellingCorrectorTest {
	
  @Test
  public void testStateCorrection() {
    assertEquals("123 main st cherry hill  NEW JERSEY 19456", SpellingCorrector.correctStateSpelling("123 main st cherry hill nwe jersey 19456"));
    assertEquals("123 main st philadelphia PENNSYLVANIA 19456", SpellingCorrector.correctStateSpelling("123 main st philadelphia PENSYLVANA 19456"));
    assertEquals("philadelphia PENNSYLVANIA 19456", SpellingCorrector.correctStateSpelling("philadelphia PENSYLVANA 19456"));
    assertEquals("philadelphia PENNSYLVANIA", SpellingCorrector.correctStateSpelling("philadelphia PENSYLVANA"));
    assertEquals("philadelphia PA", SpellingCorrector.correctStateSpelling("philadelphia PA"));
  }
}