/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 13:13:01 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.PauseAnimationAction;
import visu.handball.moves.model.HandballModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PauseAnimationAction_ESTest extends PauseAnimationAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PauseAnimationAction pauseAnimationAction0 = null;
      try {
        pauseAnimationAction0 = new PauseAnimationAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.PauseAnimationAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PauseAnimationAction pauseAnimationAction0 = new PauseAnimationAction(handballModel0);
      HandballModel.State handballModel_State0 = HandballModel.State.ANIMATION_RUNNING;
      handballModel0.setState(handballModel_State0);
      assertEquals("", handballModel0.getMoveName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PauseAnimationAction pauseAnimationAction0 = new PauseAnimationAction(handballModel0);
      pauseAnimationAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      PauseAnimationAction pauseAnimationAction0 = new PauseAnimationAction(handballModel0);
      // Undeclared exception!
      try { 
        pauseAnimationAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.model.HandballModel", e);
      }
  }
}
