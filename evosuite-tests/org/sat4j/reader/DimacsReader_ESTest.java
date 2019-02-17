/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 12:52:18 GMT 2019
 */

package org.sat4j.reader;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import org.sat4j.LightFactory;
import org.sat4j.reader.DimacsReader;
import org.sat4j.reader.EfficientScanner;
import org.sat4j.specs.ISolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.StatisticsSolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DimacsReader_ESTest extends DimacsReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null, "LJaZ]");
      int[] intArray0 = new int[2];
      intArray0[1] = (-324);
      File file0 = MockFile.createTempFile("LJaZ]", "LJaZ]");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(file0);
      dimacsReader0.decode(intArray0, (PrintWriter) mockPrintWriter0);
      assertFalse(dimacsReader0.isUsingMapping());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      dimacsReader0.expectedNbOfConstr = (-1276);
      int[] intArray0 = new int[5];
      String string0 = dimacsReader0.decode(intArray0);
      assertEquals("0 0 0 0 0 0", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      dimacsReader0.expectedNbOfConstr = 2639;
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      EfficientScanner efficientScanner0 = new EfficientScanner(sequenceInputStream0, '\'');
      dimacsReader0.scanner = efficientScanner0;
      try { 
        dimacsReader0.readConstrs();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing Errorwrong nbclauses parameter. Found 0, 2639 expected
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      DimacsReader dimacsReader0 = new DimacsReader(dimacsStringSolver0);
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)51;
      byteArray0[1] = (byte)11;
      byteArray0[4] = (byte)11;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 14);
      pushbackInputStream0.unread(byteArray0);
      try { 
        dimacsReader0.parseInstance((InputStream) pushbackInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing Errorproblem line expected (p cnf ...)
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 16, (-887));
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 1792);
      EfficientScanner efficientScanner0 = new EfficientScanner(bufferedInputStream0, '\'');
      dimacsReader0.scanner = efficientScanner0;
      dimacsReader0.skipComments();
      assertFalse(dimacsReader0.isVerbose());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      DimacsReader dimacsReader0 = new DimacsReader(dimacsStringSolver0);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        dimacsReader0.parseInstance((InputStream) pipedInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // java.io.IOException: Pipe not connected
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      DimacsReader dimacsReader0 = new DimacsReader(statisticsSolver0, (String) null);
      dimacsReader0.flushConstraint();
      assertFalse(dimacsReader0.isVerbose());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      DimacsReader dimacsReader0 = new DimacsReader(dimacsStringSolver0);
      ISolver iSolver0 = dimacsReader0.getSolver();
      assertFalse(iSolver0.isSolverKeptHot());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 16, (-887));
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 1792);
      EfficientScanner efficientScanner0 = new EfficientScanner(bufferedInputStream0, '\'');
      bufferedInputStream0.close();
      dimacsReader0.scanner = efficientScanner0;
      try { 
        dimacsReader0.skipComments();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      EfficientScanner efficientScanner0 = new EfficientScanner(sequenceInputStream0, '\'');
      dimacsReader0.scanner = efficientScanner0;
      try { 
        dimacsReader0.readProblemLine();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing Errorproblem line expected (p cnf ...)
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      // Undeclared exception!
      try { 
        dimacsReader0.readProblemLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      // Undeclared exception!
      try { 
        dimacsReader0.readConstrs();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false, false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      EfficientScanner efficientScanner0 = new EfficientScanner(sequenceInputStream0, '\'');
      efficientScanner0.close();
      dimacsReader0.scanner = efficientScanner0;
      try { 
        dimacsReader0.readConstrs();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)4);
      EfficientScanner efficientScanner0 = new EfficientScanner(pushbackInputStream0, 'u');
      dimacsReader0.scanner = efficientScanner0;
      try { 
        dimacsReader0.handleLine();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing ErrorUnknown character \u0000
         //
         verifyException("org.sat4j.reader.EfficientScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      // Undeclared exception!
      try { 
        dimacsReader0.handleLine();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.lightSolver();
      DimacsReader dimacsReader0 = new DimacsReader(iSolver0);
      try { 
        dimacsReader0.flushConstraint();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      // Undeclared exception!
      try { 
        dimacsReader0.flushConstraint();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      DimacsReader dimacsReader0 = new DimacsReader(dimacsStringSolver0);
      // Undeclared exception!
      try { 
        dimacsReader0.decode((int[]) null, (PrintWriter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      // Undeclared exception!
      try { 
        dimacsReader0.decode((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      EfficientScanner efficientScanner0 = new EfficientScanner(sequenceInputStream0, '\'');
      dimacsReader0.scanner = efficientScanner0;
      boolean boolean0 = dimacsReader0.handleLine();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      dimacsReader0.expectedNbOfConstr = (-1103100070);
      EfficientScanner efficientScanner0 = new EfficientScanner(sequenceInputStream0, 'W');
      dimacsReader0.scanner = efficientScanner0;
      try { 
        dimacsReader0.readConstrs();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing Errorwrong nbclauses parameter. Found 0, -1103100070 expected
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      dimacsReader0.disableNumberOfConstraintCheck();
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      EfficientScanner efficientScanner0 = new EfficientScanner(sequenceInputStream0, 'W');
      dimacsReader0.scanner = efficientScanner0;
      dimacsReader0.readConstrs();
      assertFalse(dimacsReader0.hasAMapping());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)4);
      EfficientScanner efficientScanner0 = new EfficientScanner(pushbackInputStream0, 'u');
      dimacsReader0.scanner = efficientScanner0;
      try { 
        dimacsReader0.readConstrs();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing ErrorUnknown character \u0000
         //
         verifyException("org.sat4j.reader.EfficientScanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      EfficientScanner efficientScanner0 = new EfficientScanner(sequenceInputStream0, 'W');
      dimacsReader0.scanner = efficientScanner0;
      dimacsReader0.readConstrs();
      assertFalse(dimacsReader0.isVerbose());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      DimacsReader dimacsReader0 = new DimacsReader(dimacsStringSolver0);
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte)102;
      byteArray0[2] = (byte)11;
      byteArray0[4] = (byte)11;
      byteArray0[8] = (byte)11;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        dimacsReader0.parseInstance((InputStream) byteArrayInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Parsing Errorproblem line expected (p cnf ...)
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      ISolver iSolver0 = dimacsReader0.getSolver();
      assertNull(iSolver0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      // Undeclared exception!
      try { 
        dimacsReader0.parseInstance((InputStream) pipedInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DimacsReader dimacsReader0 = new DimacsReader((ISolver) null);
      // Undeclared exception!
      try { 
        dimacsReader0.skipComments();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.reader.DimacsReader", e);
      }
  }
}
