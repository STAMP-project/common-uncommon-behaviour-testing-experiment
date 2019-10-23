/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 13:02:14 GMT 2019
 */

package jahuwaldt.plot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import jahuwaldt.plot.RTriangle2Symbol;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RTriangle2Symbol_ESTest extends RTriangle2Symbol_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RTriangle2Symbol rTriangle2Symbol0 = new RTriangle2Symbol();
      rTriangle2Symbol0.setSize(1);
      rTriangle2Symbol0.generatePoints(0, 37);
      assertEquals(1, rTriangle2Symbol0.getSize());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RTriangle2Symbol rTriangle2Symbol0 = new RTriangle2Symbol();
      int[] intArray0 = new int[0];
      rTriangle2Symbol0.xPoints = intArray0;
      int[] intArray1 = new int[2];
      rTriangle2Symbol0.xPoints = intArray1;
      // Undeclared exception!
      try { 
        rTriangle2Symbol0.generatePoints((-1738), (-1738));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("jahuwaldt.plot.RTriangle2Symbol", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RTriangle2Symbol rTriangle2Symbol0 = new RTriangle2Symbol();
      rTriangle2Symbol0.generatePoints(1848, (-459));
      int[] intArray0 = new int[2];
      rTriangle2Symbol0.yPoints = intArray0;
      // Undeclared exception!
      try { 
        rTriangle2Symbol0.generatePoints(4514, 23);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("jahuwaldt.plot.RTriangle2Symbol", e);
      }
  }
}
