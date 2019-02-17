/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 13:09:05 GMT 2019
 */

package org.ow2.proactive.scripting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Serializable;
import java.net.URI;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.SimpleBindings;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.ow2.proactive.scripting.ForkEnvironmentScript;
import org.ow2.proactive.scripting.Script;
import org.ow2.proactive.scripting.ScriptResult;
import org.ow2.proactive.scripting.ScriptTest;
import org.ow2.proactive.scripting.SelectionScript;
import org.ow2.proactive.scripting.SimpleScript;
import org.ow2.proactive.scripting.TaskScript;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Script_ESTest extends Script_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Serializable[] serializableArray0 = new Serializable[0];
      SimpleScript simpleScript0 = new SimpleScript(uRL0, "", serializableArray0);
      String string0 = simpleScript0.display();
      assertEquals(" { \nScript '/fooExample'\n\tscriptEngineLookupName = ''\n\tscript = \nnull\n\tid = \nhttp://www.someFakeButWellFormedURL.org/fooExample\n\tparameters = []\n}", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ScriptTest scriptTest0 = new ScriptTest();
      ScriptTest.ScriptForTests scriptTest_ScriptForTests0 = scriptTest0.new ScriptForTests("selected", "qss`i");
      String string0 = scriptTest_ScriptForTests0.getEngineName();
      assertNotNull(string0);
      assertEquals("qss`i", string0);
      assertEquals("selected", scriptTest_ScriptForTests0.getId());
      assertEquals("selected", scriptTest_ScriptForTests0.getScript());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ScriptTest scriptTest0 = new ScriptTest();
      MockFile mockFile0 = new MockFile("args", "args");
      File file0 = MockFile.createTempFile("-1388696026\n5PrKI~%BuY?Sxho", "Not allowed to write to a closed appender.", (File) mockFile0);
      ScriptTest.ScriptForTests scriptTest_ScriptForTests0 = scriptTest0.new ScriptForTests(file0);
      Reader reader0 = scriptTest_ScriptForTests0.getReader();
      assertNotNull(reader0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("5PrKI~%BuY?Sxho", "x0.I1OXNC)L&f~hIG");
      TaskScript taskScript0 = new TaskScript(selectionScript0);
      assertEquals("5PrKI~%BuY?Sxho", taskScript0.getId());
      
      taskScript0.id = "\tscriptEngineLookupName = '";
      String string0 = taskScript0.fetchScript();
      assertEquals("5PrKI~%BuY?Sxho", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Serializable[] serializableArray0 = new Serializable[0];
      SimpleScript simpleScript0 = new SimpleScript(uRL0, "", serializableArray0);
      TaskScript taskScript0 = new TaskScript(simpleScript0);
      assertEquals("/fooExample", taskScript0.getScriptName());
      assertEquals("http://www.someFakeButWellFormedURL.org/fooExample", taskScript0.getId());
      assertEquals("", taskScript0.getEngineName());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript("5PrKI~%BuY?Sxho", "x0.I1OXNC)L&f~hIG");
      selectionScript0.fetchUrlIfNeeded();
      assertEquals("SelectionScript", selectionScript0.getScriptName());
      assertEquals("5PrKI~%BuY?Sxho", selectionScript0.getId());
      assertEquals("x0.I1OXNC)L&f~hIG", selectionScript0.getEngineName());
      assertEquals("5PrKI~%BuY?Sxho", selectionScript0.getScript());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("U-0a,ss&e.E", "U-0a,ss&e.E");
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript(mockFile0, (Serializable[]) null, true);
        fail("Expecting exception: Exception");
      
      } catch(Throwable e) {
         //
         // Unable to read script : /home/pderakhshanfar/common-uncommon-behaviour-testing-experiment/U-0a,ss&e.E/U-0a,ss&e.E
         //
         verifyException("org.ow2.proactive.scripting.Script", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Script<Integer> script0 = (Script<Integer>) mock(Script.class, CALLS_REAL_METHODS);
      TaskScript taskScript0 = new TaskScript(script0);
      SimpleScript simpleScript0 = new SimpleScript(taskScript0);
      String string0 = simpleScript0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ScriptTest scriptTest0 = new ScriptTest();
      ScriptTest.ScriptForTests scriptTest_ScriptForTests0 = scriptTest0.new ScriptForTests("org.apache.commons.io.filefilter.MagicNumberFileFilter", "OnK@Vm");
      scriptTest_ScriptForTests0.overrideDefaultScriptName("");
      scriptTest_ScriptForTests0.toString();
      assertEquals("", scriptTest_ScriptForTests0.getScriptName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      File file0 = MockFile.createTempFile("MD5", "MD5");
      String string0 = Script.readFile(file0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      Serializable[] serializableArray0 = new Serializable[0];
      SimpleScript simpleScript0 = new SimpleScript(uRL0, "", serializableArray0);
      URL uRL1 = simpleScript0.getScriptUrl();
      assertEquals("", simpleScript0.getEngineName());
      assertNotNull(uRL1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ScriptTest scriptTest0 = new ScriptTest();
      ScriptTest.ScriptForTests scriptTest_ScriptForTests0 = scriptTest0.new ScriptForTests("", "");
      String string0 = scriptTest_ScriptForTests0.getScriptName();
      assertEquals("", scriptTest_ScriptForTests0.getScript());
      assertEquals("", scriptTest_ScriptForTests0.getEngineName());
      assertEquals("TestScript", string0);
      assertEquals("", scriptTest_ScriptForTests0.getId());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      URI uRI0 = MockURI.aFTPURI;
      URL uRL0 = MockURI.toURL(uRI0);
      Serializable[] serializableArray0 = new Serializable[0];
      SimpleScript simpleScript0 = new SimpleScript(uRL0, "kx", serializableArray0);
      String string0 = simpleScript0.getScriptName();
      assertEquals("", string0);
      assertEquals("kx", simpleScript0.getEngineName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      SimpleScript simpleScript0 = new SimpleScript(uRL0, (Serializable[]) null);
      String string0 = simpleScript0.getScript();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ScriptTest scriptTest0 = new ScriptTest();
      ScriptTest.ScriptForTests scriptTest_ScriptForTests0 = scriptTest0.new ScriptForTests("/fake/but/wellformed/url", "MD5");
      String string0 = scriptTest_ScriptForTests0.getScript();
      assertEquals("/fake/but/wellformed/url", scriptTest_ScriptForTests0.getId());
      assertEquals("MD5", scriptTest_ScriptForTests0.getEngineName());
      assertEquals("/fake/but/wellformed/url", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[5];
      SimpleScript simpleScript0 = new SimpleScript("MiIt~(T", "p;{z$k6?^765c!qtv3", serializableArray0);
      simpleScript0.getReader();
      assertEquals("p;{z$k6?^765c!qtv3", simpleScript0.getEngineName());
      assertEquals("MiIt~(T", simpleScript0.getId());
      assertEquals("MiIt~(T", simpleScript0.getScript());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ScriptTest scriptTest0 = new ScriptTest();
      ScriptTest.ScriptForTests scriptTest_ScriptForTests0 = scriptTest0.new ScriptForTests("L:Q`@R[Nb", "L:Q`@R[Nb");
      ForkEnvironmentScript forkEnvironmentScript0 = new ForkEnvironmentScript(scriptTest_ScriptForTests0);
      SimpleScript simpleScript0 = new SimpleScript(forkEnvironmentScript0);
      simpleScript0.getParameters();
      assertEquals("L:Q`@R[Nb", simpleScript0.getScript());
      assertEquals("L:Q`@R[Nb", simpleScript0.getEngineName());
      assertEquals("TestScript", simpleScript0.getScriptName());
      assertEquals("L:Q`@R[Nb", simpleScript0.getId());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ScriptTest scriptTest0 = new ScriptTest();
      ScriptTest.ScriptForTests scriptTest_ScriptForTests0 = scriptTest0.new ScriptForTests("L:Q`@R[Nb", "L:Q`@R[Nb");
      ForkEnvironmentScript forkEnvironmentScript0 = new ForkEnvironmentScript(scriptTest_ScriptForTests0);
      Serializable[] serializableArray0 = new Serializable[7];
      forkEnvironmentScript0.parameters = serializableArray0;
      SimpleScript simpleScript0 = new SimpleScript(forkEnvironmentScript0);
      Serializable[] serializableArray1 = simpleScript0.getParameters();
      assertEquals("TestScript", simpleScript0.getScriptName());
      assertEquals("L:Q`@R[Nb", simpleScript0.getEngineName());
      assertNotNull(serializableArray1);
      assertEquals("L:Q`@R[Nb", simpleScript0.getScript());
      assertEquals("L:Q`@R[Nb", simpleScript0.getId());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleScript simpleScript0 = new SimpleScript("FF5tCudR0F", "===end icann domains===", (Serializable[]) null);
      String string0 = simpleScript0.getId();
      assertEquals("FF5tCudR0F", string0);
      assertNotNull(string0);
      assertEquals("FF5tCudR0F", simpleScript0.getScript());
      assertEquals("===end icann domains===", simpleScript0.getEngineName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      SimpleScript simpleScript0 = new SimpleScript(selectionScript0);
      String string0 = simpleScript0.getEngineName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ScriptTest scriptTest0 = new ScriptTest();
      MockFile mockFile0 = new MockFile("args", "args");
      File file0 = MockFile.createTempFile("-1388696026\n5PrKI~%BuY?Sxho", "Not allowed to write to a closed appender.", (File) mockFile0);
      ScriptTest.ScriptForTests scriptTest_ScriptForTests0 = scriptTest0.new ScriptForTests(file0);
      String string0 = scriptTest_ScriptForTests0.fetchScriptWithExceptionHandling();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Serializable[] serializableArray0 = new Serializable[0];
      SimpleScript simpleScript0 = new SimpleScript("", "kx", serializableArray0);
      String string0 = simpleScript0.fetchScript();
      assertEquals("", string0);
      assertEquals("kx", simpleScript0.getEngineName());
      assertNotNull(string0);
      assertEquals("", simpleScript0.getId());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = Script.digest("args");
      assertEquals("\uFFFDV\uFFFD\t\u0016(p\uFFFDl\uFFFD\uFFFD\uFFFD\uFFFD,\uFFFD\uFFFD", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      ScriptEngine scriptEngine0 = selectionScript0.createScriptEngine();
      assertNull(scriptEngine0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        Script.readFile((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFile mockFile0 = new MockFile("MD5", "MD5");
      try { 
        Script.readFile(mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      // Undeclared exception!
      try { 
        selectionScript0.overrideDefaultScriptName("\\9aK\"Qc;%c");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Script<ForkEnvironmentScript> script0 = (Script<ForkEnvironmentScript>) mock(Script.class, CALLS_REAL_METHODS);
      ForkEnvironmentScript forkEnvironmentScript0 = new ForkEnvironmentScript(script0);
      // Undeclared exception!
      try { 
        forkEnvironmentScript0.getReader();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      SimpleScript simpleScript0 = new SimpleScript(uRL0, "JnJ}E`cs.,IE.i", (Serializable[]) null);
      // Undeclared exception!
      simpleScript0.fetchUrlIfNeeded();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      Serializable[] serializableArray0 = new Serializable[0];
      SimpleScript simpleScript0 = new SimpleScript(uRL0, "Detected IBM VisualAge environment.", serializableArray0);
      // Undeclared exception!
      try { 
        simpleScript0.fetchUrlIfNeeded();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      SimpleScript simpleScript0 = new SimpleScript(uRL0, "Jna}E`cs.,IE.", (Serializable[]) null);
      // Undeclared exception!
      simpleScript0.fetchScriptWithExceptionHandling();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      SimpleScript simpleScript0 = new SimpleScript(uRL0, (Serializable[]) null);
      simpleScript0.overrideDefaultScriptName("Jna}E`cs.,IE.");
      assertEquals("/fooExample", simpleScript0.getScriptName());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/MD50MD5");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      File file0 = MockFile.createTempFile("MD5", "MD5");
      try { 
        Script.readFile(file0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ScriptTest scriptTest0 = new ScriptTest();
      ScriptTest.ScriptForTests scriptTest_ScriptForTests0 = scriptTest0.new ScriptForTests("org.apache.commons.io.filefilter.MagicNumberFileFilter", "org.apache.commons.io.filefilter.MagicNumberFileFilter");
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      MockFile mockFile0 = new MockFile("", "args");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      scriptTest_ScriptForTests0.execute((Map<String, Object>) hashtable0, (PrintStream) mockPrintStream0, (PrintStream) mockPrintStream0);
      assertEquals("org.apache.commons.io.filefilter.MagicNumberFileFilter", scriptTest_ScriptForTests0.getId());
      assertEquals("org.apache.commons.io.filefilter.MagicNumberFileFilter", scriptTest_ScriptForTests0.getScript());
      assertEquals("org.apache.commons.io.filefilter.MagicNumberFileFilter", scriptTest_ScriptForTests0.getEngineName());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Serializable[] serializableArray0 = new Serializable[8];
      SimpleScript simpleScript0 = new SimpleScript(uRL0, "zjT/Z!", serializableArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, true);
      simpleScript0.execute((Map<String, Object>) hashtable0, (PrintStream) mockPrintStream0, (PrintStream) mockPrintStream0);
      assertEquals("zjT/Z!", simpleScript0.getEngineName());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ScriptTest scriptTest0 = new ScriptTest();
      URL uRL0 = MockURL.getFtpExample();
      ScriptTest.ScriptForTests scriptTest_ScriptForTests0 = scriptTest0.new ScriptForTests(uRL0, "args", false);
      ScriptTest.ScriptForTests scriptTest_ScriptForTests1 = scriptTest0.new ScriptForTests(uRL0, "args", false);
      boolean boolean0 = scriptTest_ScriptForTests0.equals(scriptTest_ScriptForTests1);
      assertEquals("ftp://ftp.someFakeButWellFormedURL.org/fooExample", scriptTest_ScriptForTests1.getId());
      assertEquals("args", scriptTest_ScriptForTests1.getEngineName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ScriptTest scriptTest0 = new ScriptTest();
      ScriptTest.ScriptForTests scriptTest_ScriptForTests0 = scriptTest0.new ScriptForTests((String) null, (String) null);
      SimpleScript simpleScript0 = new SimpleScript("args", "kx");
      boolean boolean0 = scriptTest_ScriptForTests0.equals(simpleScript0);
      assertEquals("kx", simpleScript0.getEngineName());
      assertFalse(boolean0);
      assertEquals("args", simpleScript0.getScript());
      assertEquals("args", simpleScript0.getId());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ScriptTest scriptTest0 = new ScriptTest();
      ScriptTest.ScriptForTests scriptTest_ScriptForTests0 = scriptTest0.new ScriptForTests((String) null, (String) null);
      ForkEnvironmentScript forkEnvironmentScript0 = new ForkEnvironmentScript(scriptTest_ScriptForTests0);
      boolean boolean0 = scriptTest_ScriptForTests0.equals(forkEnvironmentScript0);
      assertEquals("TestScript", forkEnvironmentScript0.getScriptName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ScriptTest scriptTest0 = new ScriptTest();
      ScriptTest.ScriptForTests scriptTest_ScriptForTests0 = scriptTest0.new ScriptForTests("$Q`-FL>>S&N\\7`K", "$Q`-FL>>S&N\\7`K");
      boolean boolean0 = scriptTest_ScriptForTests0.equals(scriptTest0);
      assertEquals("$Q`-FL>>S&N\\7`K", scriptTest_ScriptForTests0.getId());
      assertEquals("$Q`-FL>>S&N\\7`K", scriptTest_ScriptForTests0.getScript());
      assertFalse(boolean0);
      assertEquals("$Q`-FL>>S&N\\7`K", scriptTest_ScriptForTests0.getEngineName());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ScriptTest scriptTest0 = new ScriptTest();
      ScriptTest.ScriptForTests scriptTest_ScriptForTests0 = scriptTest0.new ScriptForTests("selected", "selected");
      boolean boolean0 = scriptTest_ScriptForTests0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals("selected", scriptTest_ScriptForTests0.getId());
      assertEquals("selected", scriptTest_ScriptForTests0.getEngineName());
      assertEquals("selected", scriptTest_ScriptForTests0.getScript());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ScriptTest scriptTest0 = new ScriptTest();
      ScriptTest.ScriptForTests scriptTest_ScriptForTests0 = scriptTest0.new ScriptForTests("closed", "AvW_+f%-h35ged=3_:=");
      SelectionScript selectionScript0 = new SelectionScript("args", "args", true);
      boolean boolean0 = scriptTest_ScriptForTests0.equals(selectionScript0);
      assertEquals("args", selectionScript0.getScript());
      assertEquals("args", selectionScript0.getId());
      assertEquals("closed", scriptTest_ScriptForTests0.getScript());
      assertEquals("args", selectionScript0.getEngineName());
      assertEquals("AvW_+f%-h35ged=3_:=", scriptTest_ScriptForTests0.getEngineName());
      assertFalse(boolean0);
      assertEquals("closed", scriptTest_ScriptForTests0.getId());
      assertEquals("SelectionScript", selectionScript0.getScriptName());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Script<ForkEnvironmentScript> script0 = (Script<ForkEnvironmentScript>) mock(Script.class, CALLS_REAL_METHODS);
      TaskScript taskScript0 = new TaskScript(script0);
      taskScript0.hashCode();
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      TaskScript taskScript0 = new TaskScript(selectionScript0);
      taskScript0.id = "MD5";
      taskScript0.hashCode();
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      File file0 = MockFile.createTempFile("MD5", "MD5");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/tmp/MD50MD5");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "selected");
      String string0 = Script.readFile(file0);
      assertEquals("selected\n", string0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      Serializable[] serializableArray0 = new Serializable[2];
      selectionScript0.parameters = serializableArray0;
      // Undeclared exception!
      try { 
        selectionScript0.prepareBindings((Bindings) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.scripting.Script", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      SimpleBindings simpleBindings0 = new SimpleBindings();
      selectionScript0.prepareBindings(simpleBindings0);
      assertNull(selectionScript0.getScriptName());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          SimpleScript simpleScript0 = new SimpleScript("javascript", "javascript");
          // Undeclared exception!
          try { 
            simpleScript0.execute();
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.lang.RuntimePermission\" \"nashorn.createContext\")
             // java.lang.Thread.getStackTrace(Thread.java:1552)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:434)
             // jdk.nashorn.internal.runtime.Context.<init>(Context.java:492)
             // jdk.nashorn.internal.runtime.Context.<init>(Context.java:463)
             // jdk.nashorn.api.scripting.NashornScriptEngine$1.run(NashornScriptEngine.java:129)
             // jdk.nashorn.api.scripting.NashornScriptEngine$1.run(NashornScriptEngine.java:125)
             // java.security.AccessController.doPrivileged(Native Method)
             // jdk.nashorn.api.scripting.NashornScriptEngine.<init>(NashornScriptEngine.java:125)
             // jdk.nashorn.api.scripting.NashornScriptEngineFactory.getScriptEngine(NashornScriptEngineFactory.java:148)
             // org.ow2.proactive.scripting.Script.findScriptEngineCandidates(Script.java:545)
             // org.ow2.proactive.scripting.Script.createScriptEngine(Script.java:521)
             // org.ow2.proactive.scripting.Script.execute(Script.java:375)
             // org.ow2.proactive.scripting.Script.execute(Script.java:352)
             // sun.reflect.GeneratedMethodAccessor202.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
             // java.lang.Thread.run(Thread.java:745)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      URLStreamHandler uRLStreamHandler0 = mock(URLStreamHandler.class, new ViolatedAssumptionAnswer());
      URL uRL0 = MockURL.URL("https", "MD5", 1048576, "\tid = ", uRLStreamHandler0);
      Serializable[] serializableArray0 = new Serializable[1];
      SimpleScript simpleScript0 = new SimpleScript(uRL0, "https", serializableArray0);
      simpleScript0.execute();
      assertEquals("https", simpleScript0.getEngineName());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      ScriptResult<Boolean> scriptResult0 = selectionScript0.execute();
      assertNull(scriptResult0.getOutput());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      SimpleScript simpleScript0 = new SimpleScript("selected", "MD5");
      simpleScript0.execute();
      assertEquals("selected", simpleScript0.getId());
      assertEquals("MD5", simpleScript0.getEngineName());
      assertEquals("selected", simpleScript0.getScript());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Create a logger MBean");
      URL uRL0 = mockFile0.toURL();
      Serializable[] serializableArray0 = new Serializable[3];
      SimpleScript simpleScript0 = new SimpleScript(uRL0, "file", serializableArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintStream mockPrintStream0 = new MockPrintStream(byteArrayOutputStream0, true);
      simpleScript0.execute((Map<String, Object>) hashtable0, (PrintStream) mockPrintStream0, (PrintStream) mockPrintStream0);
      assertEquals("file", simpleScript0.getEngineName());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      String string0 = selectionScript0.fetchScriptWithExceptionHandling();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      SimpleScript simpleScript0 = new SimpleScript(uRL0, "2z92jLKR,itO<", (Serializable[]) null);
      // Undeclared exception!
      try { 
        simpleScript0.fetchScriptWithExceptionHandling();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      SimpleScript simpleScript0 = new SimpleScript("args", "selected");
      String string0 = simpleScript0.fetchScriptWithExceptionHandling();
      assertEquals("args", simpleScript0.getId());
      assertEquals("args", string0);
      assertEquals("selected", simpleScript0.getEngineName());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      TaskScript taskScript0 = new TaskScript(selectionScript0);
      String string0 = taskScript0.fetchScript();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      SimpleScript simpleScript0 = new SimpleScript(uRL0, "JnJ}E`cs.,IE.i", (Serializable[]) null);
      simpleScript0.fetchScript();
      assertEquals("JnJ}E`cs.,IE.i", simpleScript0.getEngineName());
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      URI uRI0 = MockURI.aFTPURI;
      URL uRL0 = MockURI.toURL(uRI0);
      SelectionScript selectionScript0 = null;
      try {
        selectionScript0 = new SelectionScript(uRL0, "appender name", true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try { 
        Script.digest((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.ow2.proactive.scripting.Script", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      ScriptTest scriptTest0 = new ScriptTest();
      ScriptTest.ScriptForTests scriptTest_ScriptForTests0 = scriptTest0.new ScriptForTests("", "No algorithm found, digest will use the script content");
      String string0 = scriptTest_ScriptForTests0.getId();
      assertEquals("", scriptTest_ScriptForTests0.getScript());
      assertEquals("No algorithm found, digest will use the script content", scriptTest_ScriptForTests0.getEngineName());
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      SimpleScript simpleScript0 = new SimpleScript(selectionScript0);
      URL uRL0 = simpleScript0.getScriptUrl();
      assertNull(uRL0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      SelectionScript selectionScript0 = new SelectionScript();
      selectionScript0.setScript("h}+3Ni:cs<+C1T<4");
      assertEquals("h}+3Ni:cs<+C1T<4", selectionScript0.getScript());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ScriptTest scriptTest0 = new ScriptTest();
      URL uRL0 = MockURL.getFtpExample();
      ScriptTest.ScriptForTests scriptTest_ScriptForTests0 = scriptTest0.new ScriptForTests(uRL0, "args", false);
      boolean boolean0 = scriptTest_ScriptForTests0.equals(scriptTest_ScriptForTests0);
      assertEquals("args", scriptTest_ScriptForTests0.getEngineName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      SimpleScript simpleScript0 = new SimpleScript("7YS(j1}OR7XOK%#(", "7YS(j1}OR7XOK%#(");
      String string0 = simpleScript0.toString();
      assertEquals("7YS(j1}OR7XOK%#(", simpleScript0.getId());
      assertEquals("7YS(j1}OR7XOK%#(", simpleScript0.getEngineName());
      assertEquals("SimpleScript", string0);
      assertEquals("7YS(j1}OR7XOK%#(", simpleScript0.getScript());
  }
}
