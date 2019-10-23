/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 13:11:37 GMT 2019
 */

package visu.handball.moves.actions;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import visu.handball.moves.actions.StartAnimationAction;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.MoveEvent;
import visu.handball.moves.model.player.Offender;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StartAnimationAction_ESTest extends StartAnimationAction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StartAnimationAction startAnimationAction0 = null;
      try {
        startAnimationAction0 = new StartAnimationAction((HandballModel) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("visu.handball.moves.actions.StartAnimationAction", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Offender offender0 = new Offender(2207, 2207);
      MoveEvent moveEvent0 = mock(MoveEvent.class, new ViolatedAssumptionAnswer());
      doReturn(offender0, offender0).when(moveEvent0).getPlayer();
      doReturn(640, 640, (-2027), 2207).when(moveEvent0).getSequenceNr();
      doReturn(true, true).when(moveEvent0).isDestinationPointSet();
      handballModel0.setActualMoveEvent(moveEvent0);
      StartAnimationAction startAnimationAction0 = new StartAnimationAction(handballModel0);
      startAnimationAction0.actionPerformed((ActionEvent) null);
      startAnimationAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      StartAnimationAction startAnimationAction0 = new StartAnimationAction(handballModel0);
      startAnimationAction0.modelChanged();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      StartAnimationAction startAnimationAction0 = new StartAnimationAction(handballModel0);
      HandballModel.State handballModel_State0 = HandballModel.State.FULL_ANIMATION_ENDED;
      handballModel0.setState(handballModel_State0);
      assertEquals(0, handballModel0.getAcutalSequenceNr());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      handballModel0.stopAnimation();
      StartAnimationAction startAnimationAction0 = new StartAnimationAction(handballModel0);
      handballModel0.setComment(".1 Rd_L4Q:");
      assertEquals(0, handballModel0.getAcutalSequenceNr());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      Offender offender0 = new Offender(2207, 2207);
      MoveEvent moveEvent0 = mock(MoveEvent.class, new ViolatedAssumptionAnswer());
      doReturn(offender0, offender0).when(moveEvent0).getPlayer();
      doReturn(640, 640, (-2027), 2207).when(moveEvent0).getSequenceNr();
      doReturn(true, true).when(moveEvent0).isDestinationPointSet();
      handballModel0.setActualMoveEvent(moveEvent0);
      StartAnimationAction startAnimationAction0 = new StartAnimationAction(handballModel0);
      startAnimationAction0.actionPerformed((ActionEvent) null);
      ActionEvent actionEvent0 = new ActionEvent("", 501, "`Ir.HU$6~ijK z", 1L, 501);
      startAnimationAction0.actionPerformed(actionEvent0);
      assertEquals("`Ir.HU$6~ijK z", actionEvent0.getActionCommand());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      HandballModel handballModel0 = new HandballModel();
      StartAnimationAction startAnimationAction0 = new StartAnimationAction(handballModel0);
      // Undeclared exception!
      try { 
        startAnimationAction0.actionPerformed((ActionEvent) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
