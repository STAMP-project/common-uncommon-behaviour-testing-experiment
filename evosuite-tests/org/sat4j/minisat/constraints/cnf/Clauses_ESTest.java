/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 13:02:10 GMT 2019
 */

package org.sat4j.minisat.constraints.cnf;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.core.ReadOnlyVecInt;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.minisat.constraints.MixedDataStructureSingleWL;
import org.sat4j.minisat.constraints.cnf.Clauses;
import org.sat4j.minisat.constraints.cnf.Lits;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.ClauseOnlyLearning;
import org.sat4j.minisat.learning.MiniSATLearning;
import org.sat4j.minisat.learning.NoLearningButHeuristics;
import org.sat4j.minisat.learning.PercentLengthLearning;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.orders.NaturalStaticOrder;
import org.sat4j.minisat.orders.NegativeLiteralSelectionStrategy;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.orders.RandomWalkDecorator;
import org.sat4j.minisat.orders.UserFixedPhaseSelectionStrategy;
import org.sat4j.minisat.restarts.FixedPeriodRestarts;
import org.sat4j.minisat.restarts.MiniSATRestarts;
import org.sat4j.minisat.restarts.NoRestarts;
import org.sat4j.specs.IVecInt;
import org.sat4j.specs.UnitPropagationListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Clauses_ESTest extends Clauses_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ClauseOnlyLearning<MixedDataStructureSingleWL> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      NegativeLiteralSelectionStrategy negativeLiteralSelectionStrategy0 = new NegativeLiteralSelectionStrategy();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap(negativeLiteralSelectionStrategy0);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(levelBasedVarOrderHeap0);
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(clauseOnlyLearning0, mixedDataStructureSingleWL0, (SearchParams) null, randomWalkDecorator0, miniSATRestarts0);
      IVecInt iVecInt0 = solver0.createBlockingClauseForCurrentModel();
      IVecInt iVecInt1 = iVecInt0.pop();
      boolean boolean0 = Clauses.propagationCheck(iVecInt1, solver0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VecInt vecInt0 = new VecInt(47, 47);
      NoLearningButHeuristics<MixedDataStructureSingleWL> noLearningButHeuristics0 = new NoLearningButHeuristics<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      NoRestarts noRestarts0 = new NoRestarts();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(noLearningButHeuristics0, mixedDataStructureSingleWL0, randomWalkDecorator0, noRestarts0);
      ILits iLits0 = solver0.getVocabulary();
      IVecInt iVecInt0 = Clauses.sanityCheck(vecInt0, iLits0, solver0);
      boolean boolean0 = Clauses.propagationCheck(iVecInt0, solver0);
      assertEquals(1, solver0.getPropagationLevel());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VecInt vecInt0 = new VecInt(4570, 25);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      PercentLengthLearning<MixedDataStructureSingleWL> percentLengthLearning0 = new PercentLengthLearning<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      SearchParams searchParams0 = new SearchParams();
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(percentLengthLearning0, mixedDataStructureSingleWL0, searchParams0, naturalStaticOrder0, fixedPeriodRestarts0);
      // Undeclared exception!
      Clauses.sanityCheck(vecInt0, iLits0, solver0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VecInt vecInt0 = new VecInt(0, 370);
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      // Undeclared exception!
      try { 
        Clauses.sanityCheck(readOnlyVecInt0, iLits0, (UnitPropagationListener) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.pop();
      // Undeclared exception!
      try { 
        Clauses.sanityCheck(iVecInt0, (ILits) null, (UnitPropagationListener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.push(1910);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ILits iLits0 = cardinalityDataStructure0.getVocabulary();
      // Undeclared exception!
      try { 
        Clauses.sanityCheck(iVecInt0, iLits0, (UnitPropagationListener) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VecInt vecInt0 = new VecInt(394);
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      try { 
        Clauses.propagationCheck(readOnlyVecInt0, (UnitPropagationListener) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[] intArray0 = new int[1];
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        Clauses.propagationCheck(vecInt0, (UnitPropagationListener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VecInt vecInt0 = new VecInt(2014);
      IVecInt iVecInt0 = vecInt0.push(4628);
      ClauseOnlyLearning<MixedDataStructureSingleWL> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      UserFixedPhaseSelectionStrategy userFixedPhaseSelectionStrategy0 = new UserFixedPhaseSelectionStrategy();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap(userFixedPhaseSelectionStrategy0);
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(clauseOnlyLearning0, mixedDataStructureSingleWL0, levelBasedVarOrderHeap0, fixedPeriodRestarts0);
      // Undeclared exception!
      try { 
        Clauses.propagationCheck(iVecInt0, solver0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4629
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Lits", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VecInt vecInt0 = new VecInt(57, 16);
      int[] intArray0 = new int[8];
      VecInt vecInt1 = new VecInt(intArray0);
      MiniSATLearning<MixedDataStructureSingleWL> miniSATLearning0 = new MiniSATLearning<MixedDataStructureSingleWL>();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      NoRestarts noRestarts0 = new NoRestarts();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      vecInt1.moveTo2(vecInt0);
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(miniSATLearning0, mixedDataStructureSingleWL0, levelBasedVarOrderHeap0, noRestarts0);
      vecInt1.insertFirst(1);
      Lits lits0 = new Lits();
      Clauses.sanityCheck(vecInt1, lits0, solver0);
      try { 
        Clauses.sanityCheck(vecInt0, lits0, solver0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Contradictory Unit Clauses
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[2] = 47;
      VecInt vecInt0 = new VecInt(intArray0);
      MiniSATLearning<MixedDataStructureSingleWL> miniSATLearning0 = new MiniSATLearning<MixedDataStructureSingleWL>();
      SearchParams searchParams0 = new SearchParams();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      NoRestarts noRestarts0 = new NoRestarts();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(miniSATLearning0, mixedDataStructureSingleWL0, searchParams0, levelBasedVarOrderHeap0, noRestarts0);
      Lits lits0 = new Lits();
      IVecInt iVecInt0 = Clauses.sanityCheck(vecInt0, lits0, solver0);
      assertNotNull(iVecInt0);
      assertEquals(0, solver0.getPropagationLevel());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[3];
      intArray0[2] = 1;
      VecInt vecInt0 = new VecInt(intArray0);
      MiniSATLearning<MixedDataStructureSingleWL> miniSATLearning0 = new MiniSATLearning<MixedDataStructureSingleWL>();
      SearchParams searchParams0 = new SearchParams();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      NoRestarts noRestarts0 = new NoRestarts();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(miniSATLearning0, mixedDataStructureSingleWL0, searchParams0, levelBasedVarOrderHeap0, noRestarts0);
      Lits lits0 = new Lits();
      IVecInt iVecInt0 = Clauses.sanityCheck(vecInt0, lits0, solver0);
      assertNull(iVecInt0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      VecInt vecInt0 = new VecInt(1, 1);
      int[] intArray0 = new int[3];
      VecInt vecInt1 = new VecInt(intArray0);
      MiniSATLearning<MixedDataStructureSingleWL> miniSATLearning0 = new MiniSATLearning<MixedDataStructureSingleWL>();
      SearchParams searchParams0 = new SearchParams();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      NoRestarts noRestarts0 = new NoRestarts();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(miniSATLearning0, mixedDataStructureSingleWL0, searchParams0, levelBasedVarOrderHeap0, noRestarts0);
      ILits iLits0 = solver0.getVocabulary();
      Clauses.sanityCheck(vecInt0, iLits0, solver0);
      try { 
        Clauses.sanityCheck(vecInt1, iLits0, solver0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VecInt vecInt0 = new VecInt(1, 1);
      MiniSATLearning<MixedDataStructureSingleWL> miniSATLearning0 = new MiniSATLearning<MixedDataStructureSingleWL>();
      SearchParams searchParams0 = new SearchParams();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      NoRestarts noRestarts0 = new NoRestarts();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(miniSATLearning0, mixedDataStructureSingleWL0, searchParams0, levelBasedVarOrderHeap0, noRestarts0);
      ILits iLits0 = solver0.getVocabulary();
      Clauses.sanityCheck(vecInt0, iLits0, solver0);
      Clauses.sanityCheck(vecInt0, iLits0, solver0);
      assertEquals(1, solver0.getPropagationLevel());
  }
}
