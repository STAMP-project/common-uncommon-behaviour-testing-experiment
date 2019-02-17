/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 12:49:33 GMT 2019
 */

package org.ow2.proactive.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;
import org.ow2.proactive.utils.BoundedStringWriter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BoundedStringWriter_ESTest extends BoundedStringWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.io.filefilter.AgeFileFilter");
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(mockPrintStream0, 1);
      char[] charArray0 = new char[5];
      boundedStringWriter0.write(1);
      boundedStringWriter0.write(charArray0);
      assertEquals("\u0000", boundedStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter((PrintStream) null, 0);
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "");
      stringBuilder0.append(1957);
      boundedStringWriter0.setContentBuffer(stringBuilder0);
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        boundedStringWriter0.write(charArray0, (-526), (-1));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.ow2.proactive.utils.BoundedStringWriter");
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(mockPrintStream0, 1522);
      char[] charArray0 = new char[20];
      boundedStringWriter0.write(charArray0);
      // Undeclared exception!
      try { 
        boundedStringWriter0.write(charArray0, 1522, (int) '7');
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("H#zR-.X", "H#zR-.X");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(mockPrintStream0, 0);
      char[] charArray0 = new char[7];
      boundedStringWriter0.write(charArray0, 0, 1);
      assertEquals(1L, mockFile0.length());
      assertEquals("", boundedStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.ow2.proactive.utils.BoundedStringWriter");
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(mockPrintStream0, 1522);
      char[] charArray0 = new char[20];
      boundedStringWriter0.write(charArray0);
      boundedStringWriter0.toString();
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", boundedStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.io.filefilter.AgeFileFilter");
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(mockPrintStream0, 1);
      boundedStringWriter0.setContentBuffer((StringBuilder) null);
      StringBuilder stringBuilder0 = boundedStringWriter0.getBuilder();
      assertNull(stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter((PrintStream) null, (-1959));
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        boundedStringWriter0.write(charArray0, (-11), (-11));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter((PrintStream) null, 0);
      // Undeclared exception!
      try { 
        boundedStringWriter0.write((char[]) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.io.filefilter.AgeFileFilter");
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(mockPrintStream0, 1);
      boundedStringWriter0.write(1);
      boundedStringWriter0.append('g');
      assertEquals("g", boundedStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter((PrintStream) null, 0);
      boundedStringWriter0.close();
      assertEquals("", boundedStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.io.filefilter.AgeFileFilter");
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(mockPrintStream0, 1);
      boundedStringWriter0.flush();
      assertEquals("", boundedStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("org.apache.commons.io.filefilter.AgeFileFilter");
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter(mockPrintStream0, 1);
      StringBuilder stringBuilder0 = boundedStringWriter0.getBuilder();
      assertEquals("", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter((PrintStream) null, 447);
      boundedStringWriter0.setContentBuffer((StringBuilder) null);
      // Undeclared exception!
      try { 
        boundedStringWriter0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.utils.BoundedStringWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BoundedStringWriter boundedStringWriter0 = new BoundedStringWriter((PrintStream) null, 447);
      String string0 = boundedStringWriter0.toString();
      assertEquals("", string0);
  }
}
