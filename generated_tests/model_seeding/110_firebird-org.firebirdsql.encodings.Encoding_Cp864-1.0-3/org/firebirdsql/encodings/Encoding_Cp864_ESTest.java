/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 06 09:37:25 GMT 2019
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
      char[] charArray0 = new char[8];
      byte[] byteArray0 = new byte[4];
      int int0 = encoding_Cp864_0.encodeToCharset(charArray0, 0, 0, byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Encoding_Cp864 encoding_Cp864_0 = new Encoding_Cp864();
      char[] charArray0 = new char[5];
      byte[] byteArray0 = new byte[3];
      int int0 = encoding_Cp864_0.encodeToCharset(charArray0, 1, 1, byteArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Encoding_Cp864 encoding_Cp864_0 = new Encoding_Cp864();
      char[] charArray0 = new char[9];
      byte[] byteArray0 = new byte[9];
      int int0 = encoding_Cp864_0.encodeToCharset(charArray0, 22, (-2431), byteArray0);
      assertEquals((-2431), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Encoding_Cp864 encoding_Cp864_0 = new Encoding_Cp864();
      char[] charArray0 = new char[8];
      byte[] byteArray0 = new byte[2];
      int int0 = encoding_Cp864_0.decodeFromCharset(byteArray0, (int) (byte)43, (int) (byte)0, charArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Encoding_Cp864 encoding_Cp864_0 = new Encoding_Cp864();
      byte[] byteArray0 = new byte[2];
      char[] charArray0 = new char[5];
      int int0 = encoding_Cp864_0.decodeFromCharset(byteArray0, (-581), (int) (byte) (-117), charArray0);
      assertEquals((-117), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      char[] charArray0 = new char[6];
      Encoding_Cp864 encoding_Cp864_0 = new Encoding_Cp864();
      // Undeclared exception!
      try { 
        encoding_Cp864_0.encodeToCharset(charArray0, (int) (byte)5, (int) (byte)5, (byte[]) null);
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
      char[] charArray0 = new char[6];
      Encoding_Cp864 encoding_Cp864_0 = new Encoding_Cp864();
      // Undeclared exception!
      try { 
        encoding_Cp864_0.encodeToCharset(charArray0, (int) (byte)6, (int) (byte)6, (byte[]) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 6
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[6];
      Encoding_Cp864 encoding_Cp864_0 = new Encoding_Cp864();
      // Undeclared exception!
      try { 
        encoding_Cp864_0.decodeFromCharset((byte[]) null, 4065, 4065, charArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      char[] charArray0 = new char[1];
      Encoding_Cp864 encoding_Cp864_0 = new Encoding_Cp864();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        encoding_Cp864_0.decodeFromCharset(byteArray0, 443, 443, charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 443
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      char[] charArray0 = new char[0];
      Encoding_Cp864 encoding_Cp864_0 = null;
      try {
        encoding_Cp864_0 = new Encoding_Cp864(charArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.firebirdsql.encodings.Encoding_OneByte", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      char[] charArray0 = new char[8];
      Encoding_Cp864 encoding_Cp864_0 = new Encoding_Cp864();
      byte[] byteArray0 = new byte[5];
      int int0 = encoding_Cp864_0.decodeFromCharset(byteArray0, (int) (byte)0, 1, charArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
}
