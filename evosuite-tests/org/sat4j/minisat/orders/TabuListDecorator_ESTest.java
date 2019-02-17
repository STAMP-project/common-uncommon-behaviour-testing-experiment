/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 13:06:12 GMT 2019
 */

package org.sat4j.minisat.orders;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.BasicLauncher;
import org.sat4j.core.ASolverFactory;
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.minisat.constraints.cnf.Lits;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.IPhaseSelectionStrategy;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.orders.NegativeLiteralSelectionStrategy;
import org.sat4j.minisat.orders.PhaseInLastLearnedClauseSelectionStrategy;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.orders.RSATLastLearnedClausesPhaseSelectionStrategy;
import org.sat4j.minisat.orders.SubsetVarOrder;
import org.sat4j.minisat.orders.TabuListDecorator;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.tools.OptToSatAdapter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TabuListDecorator_ESTest extends TabuListDecorator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0, (-1505));
      // Undeclared exception!
      try { 
        tabuListDecorator0.undo(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder(10);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(pureOrder0, 10);
      tabuListDecorator0.varDecayActivity();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0, (-1));
      tabuListDecorator0.updateVarAtDecisionLevel((-1));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder(1);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(pureOrder0);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      tabuListDecorator0.setLits(iLits0);
      tabuListDecorator0.init();
      tabuListDecorator0.updateVar(1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder(0);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(pureOrder0, 0);
      NegativeLiteralSelectionStrategy negativeLiteralSelectionStrategy0 = new NegativeLiteralSelectionStrategy();
      tabuListDecorator0.setPhaseSelectionStrategy(negativeLiteralSelectionStrategy0);
      assertEquals("negative phase selection", negativeLiteralSelectionStrategy0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0);
      tabuListDecorator0.assignLiteral((-4746));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0, 0);
      levelBasedVarOrderHeap0.updateActivity(0);
      double double0 = tabuListDecorator0.varActivity(0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder(1);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(pureOrder0);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      tabuListDecorator0.setLits(iLits0);
      tabuListDecorator0.init();
      double double0 = tabuListDecorator0.varActivity(1);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      iLits0.getFromPool(2);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0);
      tabuListDecorator0.setLits(iLits0);
      tabuListDecorator0.init();
      int int0 = tabuListDecorator0.select();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      int[] intArray0 = new int[7];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      subsetVarOrder0.activity = null;
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(subsetVarOrder0, 2707);
      double[] doubleArray0 = tabuListDecorator0.getVariableHeuristics();
      assertNull(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap((IPhaseSelectionStrategy) null);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0, 0);
      IPhaseSelectionStrategy iPhaseSelectionStrategy0 = tabuListDecorator0.getPhaseSelectionStrategy();
      assertNull(iPhaseSelectionStrategy0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(varOrderHeap0);
      PhaseInLastLearnedClauseSelectionStrategy phaseInLastLearnedClauseSelectionStrategy0 = (PhaseInLastLearnedClauseSelectionStrategy)tabuListDecorator0.getPhaseSelectionStrategy();
      assertEquals("phase appearing in latest learned clause", phaseInLastLearnedClauseSelectionStrategy0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator((VarOrderHeap) null, 48);
      // Undeclared exception!
      try { 
        tabuListDecorator0.varActivity(48);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.TabuListDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0, (-14));
      // Undeclared exception!
      try { 
        tabuListDecorator0.varActivity((-14));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -7
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0);
      // Undeclared exception!
      try { 
        tabuListDecorator0.updateVar(2756);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1378
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(varOrderHeap0);
      // Undeclared exception!
      try { 
        tabuListDecorator0.undo((-447));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      Lits lits0 = new Lits();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0);
      tabuListDecorator0.setLits(lits0);
      tabuListDecorator0.init();
      // Undeclared exception!
      try { 
        tabuListDecorator0.undo(3015);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3015
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        tabuListDecorator0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.TabuListDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        tabuListDecorator0.setVarDecay(3022.08187172);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.TabuListDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator((VarOrderHeap) null, (-1948));
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      // Undeclared exception!
      try { 
        tabuListDecorator0.setLits(iLits0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.TabuListDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(varOrderHeap0);
      // Undeclared exception!
      try { 
        tabuListDecorator0.select();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      Lits lits0 = new Lits();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0);
      tabuListDecorator0.setLits(lits0);
      tabuListDecorator0.init();
      tabuListDecorator0.undo((-1));
      // Undeclared exception!
      try { 
        tabuListDecorator0.select();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0);
      // Undeclared exception!
      try { 
        tabuListDecorator0.printStat((PrintWriter) null, "cehHctzM`hw.@");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.TabuListDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0);
      Lits lits0 = new Lits();
      lits0.ensurePool(65535);
      tabuListDecorator0.setLits(lits0);
      // Undeclared exception!
      tabuListDecorator0.init();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(varOrderHeap0);
      // Undeclared exception!
      try { 
        tabuListDecorator0.init();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      Lits lits0 = new Lits();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0);
      tabuListDecorator0.setLits(lits0);
      int[] intArray0 = new int[1];
      intArray0[0] = (-406);
      levelBasedVarOrderHeap0.addLevel(intArray0);
      // Undeclared exception!
      try { 
        tabuListDecorator0.init();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        tabuListDecorator0.getVariableHeuristics();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.TabuListDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator((VarOrderHeap) null, 5000);
      // Undeclared exception!
      try { 
        tabuListDecorator0.getPhaseSelectionStrategy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.TabuListDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap((IPhaseSelectionStrategy) null);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0, 0);
      // Undeclared exception!
      try { 
        tabuListDecorator0.undo((-1415));
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0);
      tabuListDecorator0.setLits(iLits0);
      tabuListDecorator0.init();
      int int0 = tabuListDecorator0.select();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      RSATLastLearnedClausesPhaseSelectionStrategy rSATLastLearnedClausesPhaseSelectionStrategy0 = new RSATLastLearnedClausesPhaseSelectionStrategy();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap(rSATLastLearnedClausesPhaseSelectionStrategy0);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(varOrderHeap0);
      // Undeclared exception!
      try { 
        tabuListDecorator0.updateVarAtDecisionLevel((-907));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.RSATLastLearnedClausesPhaseSelectionStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder(1);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(pureOrder0);
      // Undeclared exception!
      try { 
        tabuListDecorator0.updateVar(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.PhaseInLastLearnedClauseSelectionStrategy", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0);
      String string0 = tabuListDecorator0.toString();
      assertEquals("Level and activity based heuristics using a heap phase appearing in latest learned clause with tabu list of size 10", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      PureOrder pureOrder0 = new PureOrder(1);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(pureOrder0);
      double double0 = tabuListDecorator0.varActivity(1);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      VarOrderHeap varOrderHeap0 = new VarOrderHeap((IPhaseSelectionStrategy) null);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(varOrderHeap0);
      // Undeclared exception!
      try { 
        tabuListDecorator0.assignLiteral(112);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.VarOrderHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0);
      double[] doubleArray0 = tabuListDecorator0.getVariableHeuristics();
      assertEquals(1, doubleArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ASolverFactory<OptToSatAdapter> aSolverFactory0 = (ASolverFactory<OptToSatAdapter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<OptToSatAdapter> basicLauncher0 = new BasicLauncher<OptToSatAdapter>(aSolverFactory0);
      PrintWriter printWriter0 = basicLauncher0.getLogWriter();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap((IPhaseSelectionStrategy) null);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0, 0);
      tabuListDecorator0.printStat(printWriter0, "");
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      int[] intArray0 = new int[7];
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(subsetVarOrder0, 2707);
      tabuListDecorator0.setVarDecay(0.0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator((VarOrderHeap) null);
      PhaseInLastLearnedClauseSelectionStrategy phaseInLastLearnedClauseSelectionStrategy0 = new PhaseInLastLearnedClauseSelectionStrategy();
      // Undeclared exception!
      try { 
        tabuListDecorator0.setPhaseSelectionStrategy(phaseInLastLearnedClauseSelectionStrategy0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.TabuListDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator((VarOrderHeap) null);
      // Undeclared exception!
      try { 
        tabuListDecorator0.varDecayActivity();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.orders.TabuListDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      Lits lits0 = new Lits();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0);
      tabuListDecorator0.setLits(lits0);
      tabuListDecorator0.init();
      tabuListDecorator0.undo(0);
      int int0 = tabuListDecorator0.select();
      assertEquals(0, int0);
      
      tabuListDecorator0.undo(0);
      int int1 = tabuListDecorator0.select();
      assertEquals(0, int1);
  }
}
