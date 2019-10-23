/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 13:12:43 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.StopAnimationAction;
import visu.handball.moves.model.HandballModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StopAnimationAction_ESTest extends StopAnimationAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StopAnimationAction stopAnimationAction0 = null;
      try {
        stopAnimationAction0 = new StopAnimationAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.StopAnimationAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      StopAnimationAction stopAnimationAction0 = new StopAnimationAction(handballModel0);
      stopAnimationAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      StopAnimationAction stopAnimationAction0 = new StopAnimationAction(handballModel0);
      HandballModel.State handballModel_State0 = HandballModel.State.ANIMATION_RUNNING;
      handballModel0.setState(handballModel_State0);
      ActionEvent actionEvent0 = new ActionEvent(handballModel0, 1, "$VqDa@sQ", 438);
      stopAnimationAction0.actionPerformed(actionEvent0);
      assertEquals(HandballModel.State.ANIMATION, handballModel0.getState());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      StopAnimationAction stopAnimationAction0 = new StopAnimationAction(handballModel0);
      ActionEvent actionEvent0 = new ActionEvent(handballModel0, 1, "$VqDa@sQ", 438);
      stopAnimationAction0.actionPerformed(actionEvent0);
      assertEquals(HandballModel.State.PLACE_OFFENDERS, handballModel0.getState());
  }
}
