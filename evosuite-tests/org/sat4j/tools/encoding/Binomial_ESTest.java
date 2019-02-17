/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 12:55:00 GMT 2019
 */

package org.sat4j.tools.encoding;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.sat4j.LightFactory;
import org.sat4j.MUSLauncher;
import org.sat4j.core.ReadOnlyVecInt;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructureYanMax;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.ActiveLearning;
import org.sat4j.minisat.learning.FixedLengthLearning;
import org.sat4j.minisat.learning.NoLearningNoHeuristics;
import org.sat4j.minisat.learning.PercentLengthLearning;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.orders.PhaseCachingAutoEraseStrategy;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.orders.SubsetVarOrder;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.minisat.restarts.EMARestarts;
import org.sat4j.minisat.restarts.Glucose21Restarts;
import org.sat4j.minisat.restarts.NoRestarts;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.ClausalCardinalitiesDecorator;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.ModelIteratorToSATAdapter;
import org.sat4j.tools.NegationDecorator;
import org.sat4j.tools.SingleSolutionDetector;
import org.sat4j.tools.SolutionFoundListener;
import org.sat4j.tools.encoding.Binomial;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Binomial_ESTest extends Binomial_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.lightSolver();
      VecInt vecInt0 = new VecInt(683);
      try { 
        binomial0.addExactlyOne(iSolver0, vecInt0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt(2185, 48);
      // Undeclared exception!
      binomial0.addExactlyOne(dimacsStringSolver0, vecInt0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int[] intArray0 = new int[3];
      VecInt vecInt0 = new VecInt(intArray0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(dimacsOutputSolver0, false);
      ReadOnlyVecInt readOnlyVecInt0 = new ReadOnlyVecInt(vecInt0);
      // Undeclared exception!
      try { 
        binomial0.addExactlyOne(maxSatDecorator0, readOnlyVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.ReadOnlyVecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      // Undeclared exception!
      try { 
        binomial0.addExactlyOne((ISolver) null, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.EncodingStrategyAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      PercentLengthLearning<CardinalityDataStructureYanMax> percentLengthLearning0 = new PercentLengthLearning<CardinalityDataStructureYanMax>();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      PureOrder pureOrder0 = new PureOrder(759);
      EMARestarts eMARestarts0 = new EMARestarts();
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(percentLengthLearning0, cardinalityDataStructureYanMax0, pureOrder0, eMARestarts0);
      FullClauseSelectorSolver<Solver<CardinalityDataStructureYanMax>> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<Solver<CardinalityDataStructureYanMax>>(solver0, true);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(fullClauseSelectorSolver0, solutionFoundListener0);
      int[] intArray0 = new int[8];
      intArray0[0] = 759;
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        binomial0.addExactlyOne(abstractMinimalModel0, vecInt0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(dimacsOutputSolver0, true);
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(maxSatDecorator0);
      // Undeclared exception!
      try { 
        binomial0.addExactlyOne(maxSatDecorator0, iVecInt0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The constraint you entered cannot be removed from the solver.
         //
         verifyException("org.sat4j.core.ConstrGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      VecInt vecInt0 = new VecInt();
      IVecInt iVecInt0 = vecInt0.push((-11));
      binomial0.addAtLeastOne(iSolver0, vecInt0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(iSolver0, (-1496L), solutionFoundListener0);
      try { 
        binomial0.addExactly(modelIteratorToSATAdapter0, iVecInt0, 0);
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
      Binomial binomial0 = new Binomial();
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      VecInt vecInt0 = new VecInt(3580, 3580);
      // Undeclared exception!
      binomial0.addExactly(iSolver0, vecInt0, 3580);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      // Undeclared exception!
      try { 
        binomial0.addExactly((ISolver) null, (IVecInt) null, 515);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      int[] intArray0 = new int[0];
      VecInt vecInt0 = new VecInt(intArray0);
      IVecInt iVecInt0 = vecInt0.pop();
      // Undeclared exception!
      try { 
        binomial0.addExactly((ISolver) null, iVecInt0, 2548);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      int[] intArray0 = new int[2];
      intArray0[0] = 752;
      VecInt vecInt0 = new VecInt(intArray0);
      NoLearningNoHeuristics<CardinalityDataStructureYanMax> noLearningNoHeuristics0 = new NoLearningNoHeuristics<CardinalityDataStructureYanMax>();
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SearchParams searchParams0 = new SearchParams(5362);
      PhaseCachingAutoEraseStrategy phaseCachingAutoEraseStrategy0 = new PhaseCachingAutoEraseStrategy();
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap(phaseCachingAutoEraseStrategy0);
      EMARestarts eMARestarts0 = new EMARestarts();
      MUSLauncher mUSLauncher0 = new MUSLauncher();
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(noLearningNoHeuristics0, cardinalityDataStructureYanMax0, searchParams0, levelBasedVarOrderHeap0, eMARestarts0, mUSLauncher0);
      NegationDecorator<Solver<CardinalityDataStructureYanMax>> negationDecorator0 = new NegationDecorator<Solver<CardinalityDataStructureYanMax>>(solver0);
      // Undeclared exception!
      try { 
        binomial0.addExactly(negationDecorator0, vecInt0, 1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      int[] intArray0 = new int[3];
      VecInt vecInt0 = new VecInt(intArray0);
      FixedLengthLearning<CardinalityDataStructureYanMax> fixedLengthLearning0 = new FixedLengthLearning<CardinalityDataStructureYanMax>(0);
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SearchParams searchParams0 = new SearchParams(0, 0, (-2657.1819668564412), 0);
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      Glucose21Restarts glucose21Restarts0 = new Glucose21Restarts();
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(fixedLengthLearning0, cardinalityDataStructureYanMax0, searchParams0, subsetVarOrder0, glucose21Restarts0);
      ClausalCardinalitiesDecorator<Solver<CardinalityDataStructureYanMax>> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<Solver<CardinalityDataStructureYanMax>>(solver0, binomial0);
      // Undeclared exception!
      try { 
        binomial0.addExactly(clausalCardinalitiesDecorator0, vecInt0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is not a valid variable identifier
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int[] intArray0 = new int[3];
      VecInt vecInt0 = new VecInt(intArray0);
      vecInt0.shrinkTo(3432);
      // Undeclared exception!
      try { 
        binomial0.addExactly(dimacsOutputSolver0, vecInt0, (-542));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.lightSolver();
      VecInt vecInt0 = new VecInt(683, 683);
      // Undeclared exception!
      binomial0.addAtMostOne(iSolver0, vecInt0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      // Undeclared exception!
      try { 
        binomial0.addAtMostOne((ISolver) null, (IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Binomial", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      int[] intArray0 = new int[3];
      intArray0[1] = (-2567);
      VecInt vecInt0 = new VecInt(intArray0);
      PercentLengthLearning<CardinalityDataStructureYanMax> percentLengthLearning0 = new PercentLengthLearning<CardinalityDataStructureYanMax>(1);
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      EMARestarts eMARestarts0 = new EMARestarts();
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(percentLengthLearning0, cardinalityDataStructureYanMax0, subsetVarOrder0, eMARestarts0);
      NegationDecorator<Solver<CardinalityDataStructureYanMax>> negationDecorator0 = new NegationDecorator<Solver<CardinalityDataStructureYanMax>>(solver0);
      // Undeclared exception!
      try { 
        binomial0.addAtMostOne(negationDecorator0, vecInt0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int[] intArray0 = new int[3];
      VecInt vecInt0 = new VecInt(intArray0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(dimacsOutputSolver0, true);
      // Undeclared exception!
      try { 
        binomial0.addAtMostOne(maxSatDecorator0, vecInt0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The constraint you entered cannot be removed from the solver.
         //
         verifyException("org.sat4j.core.ConstrGroup", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      VecInt vecInt0 = new VecInt();
      vecInt0.push((-11));
      binomial0.addAtLeastOne(iSolver0, vecInt0);
      try { 
        binomial0.addAtMost(iSolver0, vecInt0, 0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      VecInt vecInt0 = new VecInt(1010, (-558));
      // Undeclared exception!
      binomial0.addAtMost((ISolver) null, vecInt0, 19);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      // Undeclared exception!
      try { 
        binomial0.addAtMost(dimacsStringSolver0, (IVecInt) null, (-1612));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.encoding.Binomial", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int[] intArray0 = new int[6];
      VecInt vecInt0 = new VecInt(intArray0);
      vecInt0.shrink(2957);
      // Undeclared exception!
      try { 
        binomial0.addAtMost(dimacsOutputSolver0, vecInt0, 0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      int[] intArray0 = new int[2];
      intArray0[1] = (-2542);
      VecInt vecInt0 = new VecInt(intArray0);
      ActiveLearning<CardinalityDataStructureYanMax> activeLearning0 = new ActiveLearning<CardinalityDataStructureYanMax>(0.0);
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      SearchParams searchParams0 = new SearchParams(1897.0, (-2542));
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      NoRestarts noRestarts0 = new NoRestarts();
      MUSLauncher mUSLauncher0 = new MUSLauncher();
      Solver<CardinalityDataStructureYanMax> solver0 = new Solver<CardinalityDataStructureYanMax>(activeLearning0, cardinalityDataStructureYanMax0, searchParams0, varOrderHeap0, noRestarts0, mUSLauncher0);
      FullClauseSelectorSolver<Solver<CardinalityDataStructureYanMax>> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<Solver<CardinalityDataStructureYanMax>>(solver0, false);
      // Undeclared exception!
      try { 
        binomial0.addAtMost(fullClauseSelectorSolver0, vecInt0, 1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Please call newVar(int) before adding constraints!!!
         //
         verifyException("org.sat4j.tools.AbstractClauseSelectorSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      int[] intArray0 = new int[3];
      VecInt vecInt0 = new VecInt(intArray0);
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.lightSolver();
      // Undeclared exception!
      try { 
        binomial0.addAtMost(iSolver0, vecInt0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0 is not a valid variable identifier
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      VecInt vecInt0 = new VecInt(9);
      IVecInt iVecInt0 = vecInt0.pop();
      // Undeclared exception!
      try { 
        binomial0.addAtMost((ISolver) null, iVecInt0, 9);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int[] intArray0 = new int[3];
      VecInt vecInt0 = new VecInt(intArray0);
      IConstr iConstr0 = binomial0.addAtMostOne(dimacsOutputSolver0, vecInt0);
      assertEquals(3, iConstr0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int[] intArray0 = new int[3];
      VecInt vecInt0 = new VecInt(intArray0);
      IConstr iConstr0 = binomial0.addAtMost(dimacsOutputSolver0, vecInt0, 0);
      assertEquals(3, iConstr0.size());
      assertEquals(3, vecInt0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      VecInt vecInt0 = new VecInt();
      IConstr iConstr0 = binomial0.addAtMost(iSolver0, vecInt0, 1);
      assertEquals(0.0, iConstr0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int[] intArray0 = new int[3];
      VecInt vecInt0 = new VecInt(intArray0);
      binomial0.addExactlyOne(dimacsOutputSolver0, vecInt0);
      assertEquals(3, vecInt0.size());
      assertFalse(vecInt0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Binomial binomial0 = new Binomial();
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      int[] intArray0 = new int[3];
      VecInt vecInt0 = new VecInt(intArray0);
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(dimacsOutputSolver0);
      binomial0.addExactly(singleSolutionDetector0, vecInt0, 1);
      assertFalse(vecInt0.isEmpty());
      assertEquals(3, vecInt0.size());
  }
}
