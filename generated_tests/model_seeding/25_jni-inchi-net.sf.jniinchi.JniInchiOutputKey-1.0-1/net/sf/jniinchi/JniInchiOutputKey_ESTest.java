/*
 * This file was automatically generated by EvoSuite
 * Fri Oct 25 09:39:47 GMT 2019
 */

package net.sf.jniinchi;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.sf.jniinchi.INCHI_KEY;
import net.sf.jniinchi.JniInchiOutputKey;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JniInchiOutputKey_ESTest extends JniInchiOutputKey_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JniInchiOutputKey jniInchiOutputKey0 = new JniInchiOutputKey(0, "");
      INCHI_KEY iNCHI_KEY0 = jniInchiOutputKey0.getReturnStatus();
      assertEquals(0, iNCHI_KEY0.getIndx());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JniInchiOutputKey jniInchiOutputKey0 = new JniInchiOutputKey(2, (String) null);
      String string0 = jniInchiOutputKey0.getKey();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JniInchiOutputKey jniInchiOutputKey0 = new JniInchiOutputKey(0, "");
      String string0 = jniInchiOutputKey0.getKey();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      INCHI_KEY iNCHI_KEY0 = INCHI_KEY.OK;
      JniInchiOutputKey jniInchiOutputKey0 = null;
      try {
        jniInchiOutputKey0 = new JniInchiOutputKey(iNCHI_KEY0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Null InChIkey
         //
         verifyException("net.sf.jniinchi.JniInchiOutputKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JniInchiOutputKey jniInchiOutputKey0 = null;
      try {
        jniInchiOutputKey0 = new JniInchiOutputKey(44, "_1\nRjF3)LV");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Null return status
         //
         verifyException("net.sf.jniinchi.JniInchiOutputKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      INCHI_KEY iNCHI_KEY0 = INCHI_KEY.INVALID_INCHI_PREFIX;
      JniInchiOutputKey jniInchiOutputKey0 = new JniInchiOutputKey(iNCHI_KEY0, "net.sf.jniinchi.JniInchiOutputKey");
      INCHI_KEY iNCHI_KEY1 = jniInchiOutputKey0.getReturnStatus();
      assertSame(iNCHI_KEY0, iNCHI_KEY1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      INCHI_KEY iNCHI_KEY0 = INCHI_KEY.INVALID_INCHI;
      JniInchiOutputKey jniInchiOutputKey0 = new JniInchiOutputKey(iNCHI_KEY0, "kzKPTRfoD2[Mf`9@I$");
      String string0 = jniInchiOutputKey0.getKey();
      assertEquals("kzKPTRfoD2[Mf`9@I$", string0);
  }
}
