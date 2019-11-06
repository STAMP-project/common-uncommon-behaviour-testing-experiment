/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 09:37:04 GMT 2019
 */

package org.firebirdsql.encodings;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.firebirdsql.encodings.Encoding_Cp864;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Encoding_Cp864_ESTest extends Encoding_Cp864_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Encoding_Cp864 encoding_Cp864_0 = new Encoding_Cp864();
      char[] charArray0 = new char[1];
      byte[] byteArray0 = new byte[3];
      int int0 = encoding_Cp864_0.encodeToCharset(charArray0, 0, 0, byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Encoding_Cp864 encoding_Cp864_0 = new Encoding_Cp864();
      char[] charArray0 = new char[7];
      byte[] byteArray0 = new byte[6];
      int int0 = encoding_Cp864_0.encodeToCharset(charArray0, 1, 1, byteArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Encoding_Cp864 encoding_Cp864_0 = new Encoding_Cp864();
      char[] charArray0 = new char[5];
      byte[] byteArray0 = new byte[9];
      int int0 = encoding_Cp864_0.encodeToCharset(charArray0, (-1), (-2804), byteArray0);
      assertEquals((-2804), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Encoding_Cp864 encoding_Cp864_0 = new Encoding_Cp864();
      byte[] byteArray0 = new byte[5];
      char[] charArray0 = new char[2];
      int int0 = encoding_Cp864_0.decodeFromCharset(byteArray0, (int) (byte)1, 1, charArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Encoding_Cp864 encoding_Cp864_0 = new Encoding_Cp864();
      byte[] byteArray0 = new byte[5];
      char[] charArray0 = new char[2];
      int int0 = encoding_Cp864_0.decodeFromCharset(byteArray0, 5399, (-1444), charArray0);
      assertEquals((-1444), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Encoding_Cp864 encoding_Cp864_0 = new Encoding_Cp864();
      // Undeclared exception!
      try { 
        encoding_Cp864_0.encodeToCharset((char[]) null, 36, 36, (byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Encoding_Cp864 encoding_Cp864_0 = new Encoding_Cp864();
      // Undeclared exception!
      try { 
        encoding_Cp864_0.decodeFromCharset((byte[]) null, 6, 6, (char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Encoding_Cp864 encoding_Cp864_0 = new Encoding_Cp864();
      char[] charArray0 = new char[7];
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        encoding_Cp864_0.decodeFromCharset(byteArray0, (int) (byte) (-127), (int) (byte)38, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -127
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[2];
      Encoding_Cp864 encoding_Cp864_0 = null;
      try {
        encoding_Cp864_0 = new Encoding_Cp864(charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Encoding_Cp864 encoding_Cp864_0 = new Encoding_Cp864();
      byte[] byteArray0 = new byte[5];
      char[] charArray0 = new char[2];
      int int0 = encoding_Cp864_0.decodeFromCharset(byteArray0, 1854, 0, charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Encoding_Cp864 encoding_Cp864_0 = null;
      try {
        encoding_Cp864_0 = new Encoding_Cp864((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      char[] charArray0 = new char[7];
      Encoding_Cp864 encoding_Cp864_0 = new Encoding_Cp864();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        encoding_Cp864_0.encodeToCharset(charArray0, 2175, 2175, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2175
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }
}
