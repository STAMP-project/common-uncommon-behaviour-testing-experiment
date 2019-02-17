/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 12:58:48 GMT 2019
 */

package org.sat4j.tools;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.LightFactory;
import org.sat4j.core.ASolverFactory;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.MixedDataStructureDanielWL;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.ActiveLearning;
import org.sat4j.minisat.learning.ClauseOnlyLearning;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.orders.RandomWalkDecorator;
import org.sat4j.minisat.orders.TabuListDecorator;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.minisat.restarts.LubyRestarts;
import org.sat4j.opt.MinOneDecorator;
import org.sat4j.specs.IConstr;
import org.sat4j.specs.ILogAble;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.CheckMUSSolutionListener;
import org.sat4j.tools.ClausalCardinalitiesDecorator;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.FullClauseSelectorSolver;
import org.sat4j.tools.GroupClauseSelectorSolver;
import org.sat4j.tools.IVisualizationTool;
import org.sat4j.tools.LexicoDecorator;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.ModelIteratorToSATAdapter;
import org.sat4j.tools.NegationDecorator;
import org.sat4j.tools.OptToSatAdapter;
import org.sat4j.tools.SingleSolutionDetector;
import org.sat4j.tools.SolutionCounter;
import org.sat4j.tools.SolutionFoundListener;
import org.sat4j.tools.StatisticsSolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LexicoDecorator_ESTest extends LexicoDecorator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      LexicoDecorator<DimacsStringSolver> lexicoDecorator0 = new LexicoDecorator<DimacsStringSolver>(dimacsStringSolver0);
      IVecInt iVecInt0 = AbstractMinimalModel.negativeLiterals(lexicoDecorator0);
      lexicoDecorator0.addCriterion(iVecInt0);
      Number number0 = lexicoDecorator0.evaluate(778);
      assertEquals(0, number0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(32);
      LexicoDecorator<DimacsStringSolver> lexicoDecorator0 = new LexicoDecorator<DimacsStringSolver>(dimacsStringSolver0);
      ClauseOnlyLearning<MixedDataStructureDanielWL> clauseOnlyLearning0 = new ClauseOnlyLearning<MixedDataStructureDanielWL>();
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      PureOrder pureOrder0 = new PureOrder();
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(pureOrder0);
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<MixedDataStructureDanielWL> solver0 = new Solver<MixedDataStructureDanielWL>(clauseOnlyLearning0, mixedDataStructureDanielWL0, randomWalkDecorator0, lubyRestarts0);
      IVecInt iVecInt0 = solver0.getOutLearnt();
      lexicoDecorator0.addCriterion(iVecInt0);
      Number number0 = lexicoDecorator0.evaluate();
      assertEquals(0, number0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      LexicoDecorator<DimacsStringSolver> lexicoDecorator0 = new LexicoDecorator<DimacsStringSolver>(dimacsStringSolver0);
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(dimacsStringSolver0);
      lexicoDecorator0.addCriterion(iVecInt0);
      lexicoDecorator0.fixCriterionValue();
      assertEquals(1, lexicoDecorator0.numberOfCriteria());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt(0, 0);
      LexicoDecorator<DimacsStringSolver> lexicoDecorator0 = new LexicoDecorator<DimacsStringSolver>(dimacsStringSolver0);
      lexicoDecorator0.addCriterion(vecInt0);
      lexicoDecorator0.discardCurrentSolution();
      assertTrue(lexicoDecorator0.nonOptimalMeansSatisfiable());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LexicoDecorator<DimacsOutputSolver> lexicoDecorator0 = new LexicoDecorator<DimacsOutputSolver>((DimacsOutputSolver) null);
      int[] intArray0 = new int[1];
      lexicoDecorator0.prevmodelwithinternalvars = intArray0;
      int[] intArray1 = lexicoDecorator0.modelWithInternalVariables();
      assertSame(intArray1, intArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      LexicoDecorator<DimacsStringSolver> lexicoDecorator0 = new LexicoDecorator<DimacsStringSolver>(dimacsStringSolver0);
      int[] intArray0 = new int[4];
      lexicoDecorator0.prevfullmodel = intArray0;
      int[] intArray1 = lexicoDecorator0.model();
      assertEquals(4, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      LexicoDecorator<DimacsStringSolver> lexicoDecorator0 = new LexicoDecorator<DimacsStringSolver>(dimacsStringSolver0);
      boolean boolean0 = lexicoDecorator0.manageUnsatCase();
      assertFalse(boolean0);
      assertFalse(lexicoDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      IVecInt iVecInt0 = AbstractMinimalModel.positiveLiterals(dimacsStringSolver0);
      LexicoDecorator<DimacsStringSolver> lexicoDecorator0 = new LexicoDecorator<DimacsStringSolver>(dimacsStringSolver0);
      lexicoDecorator0.addCriterion(iVecInt0);
      IConstr iConstr0 = lexicoDecorator0.discardSolutionsForOptimizing();
      assertNull(iConstr0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.lightSolver();
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(iSolver0, vecInt0, solutionFoundListener0);
      LexicoDecorator<AbstractMinimalModel> lexicoDecorator0 = new LexicoDecorator<AbstractMinimalModel>(abstractMinimalModel0);
      lexicoDecorator0.addCriterion(vecInt0);
      boolean boolean0 = lexicoDecorator0.admitABetterSolution();
      assertTrue(boolean0);
      assertFalse(lexicoDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      LexicoDecorator<DimacsStringSolver> lexicoDecorator0 = new LexicoDecorator<DimacsStringSolver>(dimacsStringSolver0);
      // Undeclared exception!
      try { 
        lexicoDecorator0.evaluate(1000);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      LexicoDecorator<DimacsStringSolver> lexicoDecorator0 = new LexicoDecorator<DimacsStringSolver>(dimacsStringSolver0);
      VecInt vecInt0 = new VecInt(2124, 47);
      lexicoDecorator0.addCriterion(vecInt0);
      boolean[] booleanArray0 = new boolean[5];
      lexicoDecorator0.prevboolmodel = booleanArray0;
      // Undeclared exception!
      try { 
        lexicoDecorator0.evaluate(2110);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 46
         //
         verifyException("org.sat4j.tools.LexicoDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LexicoDecorator<AbstractMinimalModel> lexicoDecorator0 = new LexicoDecorator<AbstractMinimalModel>((AbstractMinimalModel) null);
      // Undeclared exception!
      try { 
        lexicoDecorator0.evaluate();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(dimacsOutputSolver0);
      LexicoDecorator<SingleSolutionDetector> lexicoDecorator0 = new LexicoDecorator<SingleSolutionDetector>(singleSolutionDetector0);
      // Undeclared exception!
      try { 
        lexicoDecorator0.discardSolutionsForOptimizing();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      LexicoDecorator<StatisticsSolver> lexicoDecorator0 = new LexicoDecorator<StatisticsSolver>((StatisticsSolver) null);
      lexicoDecorator0.addCriterion(vecInt0);
      // Undeclared exception!
      try { 
        lexicoDecorator0.discard();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LexicoDecorator<AbstractMinimalModel> lexicoDecorator0 = new LexicoDecorator<AbstractMinimalModel>((AbstractMinimalModel) null);
      lexicoDecorator0.currentCriterion = (-390);
      // Undeclared exception!
      try { 
        lexicoDecorator0.discard();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LexicoDecorator<AbstractMinimalModel> lexicoDecorator0 = new LexicoDecorator<AbstractMinimalModel>((AbstractMinimalModel) null);
      // Undeclared exception!
      try { 
        lexicoDecorator0.calculateObjective();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      FullClauseSelectorSolver<DimacsOutputSolver> fullClauseSelectorSolver0 = new FullClauseSelectorSolver<DimacsOutputSolver>(dimacsOutputSolver0, true);
      LexicoDecorator<FullClauseSelectorSolver<DimacsOutputSolver>> lexicoDecorator0 = new LexicoDecorator<FullClauseSelectorSolver<DimacsOutputSolver>>(fullClauseSelectorSolver0);
      VecInt vecInt0 = new VecInt(0);
      try { 
        lexicoDecorator0.admitABetterSolution((IVecInt) vecInt0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // There is no real solver behind!
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      VecInt vecInt0 = new VecInt(837, (-789));
      ActiveLearning<MixedDataStructureDanielWL> activeLearning0 = new ActiveLearning<MixedDataStructureDanielWL>();
      MixedDataStructureDanielWL mixedDataStructureDanielWL0 = new MixedDataStructureDanielWL();
      SearchParams searchParams0 = new SearchParams((-789), 837);
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(varOrderHeap0, 0);
      LubyRestarts lubyRestarts0 = new LubyRestarts(837);
      Solver<MixedDataStructureDanielWL> solver0 = new Solver<MixedDataStructureDanielWL>(activeLearning0, mixedDataStructureDanielWL0, varOrderHeap0, lubyRestarts0);
      ILogAble iLogAble0 = solver0.getLogger();
      Solver<MixedDataStructureDanielWL> solver1 = new Solver<MixedDataStructureDanielWL>(activeLearning0, mixedDataStructureDanielWL0, searchParams0, tabuListDecorator0, lubyRestarts0, iLogAble0);
      ASolverFactory<MinOneDecorator> aSolverFactory0 = (ASolverFactory<MinOneDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(solver1, vecInt0, checkMUSSolutionListener0);
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(minimal4CardinalityModel0, 0L, (SolutionFoundListener) null);
      LexicoDecorator<ModelIteratorToSATAdapter> lexicoDecorator0 = new LexicoDecorator<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter0);
      // Undeclared exception!
      try { 
        lexicoDecorator0.admitABetterSolution((IVecInt) vecInt0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IVecInt iVecInt0 = VecInt.EMPTY;
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      LexicoDecorator<DimacsStringSolver> lexicoDecorator0 = new LexicoDecorator<DimacsStringSolver>(dimacsStringSolver0);
      ASolverFactory<MinOneDecorator> aSolverFactory0 = (ASolverFactory<MinOneDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(lexicoDecorator0, checkMUSSolutionListener0);
      NegationDecorator<Minimal4CardinalityModel> negationDecorator0 = new NegationDecorator<Minimal4CardinalityModel>(minimal4CardinalityModel0);
      LexicoDecorator<NegationDecorator<Minimal4CardinalityModel>> lexicoDecorator1 = new LexicoDecorator<NegationDecorator<Minimal4CardinalityModel>>(negationDecorator0);
      // Undeclared exception!
      try { 
        lexicoDecorator1.admitABetterSolution(iVecInt0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter((ISolver) null, (SolutionFoundListener) null);
      LexicoDecorator<ModelIteratorToSATAdapter> lexicoDecorator0 = new LexicoDecorator<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter0);
      IVecInt iVecInt0 = VecInt.EMPTY;
      // Undeclared exception!
      try { 
        lexicoDecorator0.admitABetterSolution(iVecInt0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      VecInt vecInt0 = new VecInt(2465);
      IVecInt iVecInt0 = vecInt0.pop();
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.lightSolver();
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(iSolver0, solutionFoundListener0);
      LexicoDecorator<ModelIteratorToSATAdapter> lexicoDecorator0 = new LexicoDecorator<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter0);
      // Undeclared exception!
      try { 
        lexicoDecorator0.admitABetterSolution(iVecInt0);
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
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      LexicoDecorator<DimacsStringSolver> lexicoDecorator0 = new LexicoDecorator<DimacsStringSolver>(dimacsStringSolver0);
      try { 
        lexicoDecorator0.admitABetterSolution();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // There is no real solver behind!
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IVecInt iVecInt0 = VecInt.EMPTY;
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      VecInt vecInt0 = new VecInt(4903, 4903);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(iSolver0, iVecInt0, solutionFoundListener0);
      abstractMinimalModel0.findModel((IVecInt) vecInt0);
      LexicoDecorator<AbstractMinimalModel> lexicoDecorator0 = new LexicoDecorator<AbstractMinimalModel>(abstractMinimalModel0);
      // Undeclared exception!
      lexicoDecorator0.admitABetterSolution();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LexicoDecorator<AbstractMinimalModel> lexicoDecorator0 = new LexicoDecorator<AbstractMinimalModel>((AbstractMinimalModel) null);
      // Undeclared exception!
      try { 
        lexicoDecorator0.admitABetterSolution();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.LexicoDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      LexicoDecorator<DimacsStringSolver> lexicoDecorator0 = new LexicoDecorator<DimacsStringSolver>(dimacsStringSolver0);
      // Undeclared exception!
      try { 
        lexicoDecorator0.addCriterion((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.LexicoDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      LexicoDecorator<DimacsStringSolver> lexicoDecorator0 = new LexicoDecorator<DimacsStringSolver>(dimacsStringSolver0);
      VecInt vecInt0 = new VecInt(1510);
      IVecInt iVecInt0 = vecInt0.pop();
      // Undeclared exception!
      try { 
        lexicoDecorator0.addCriterion(iVecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      vecInt0.shrinkTo(449);
      LexicoDecorator<DimacsStringSolver> lexicoDecorator0 = new LexicoDecorator<DimacsStringSolver>((DimacsStringSolver) null);
      // Undeclared exception!
      try { 
        lexicoDecorator0.addCriterion(vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LexicoDecorator<OptToSatAdapter> lexicoDecorator0 = new LexicoDecorator<OptToSatAdapter>((OptToSatAdapter) null);
      // Undeclared exception!
      try { 
        lexicoDecorator0.discardCurrentSolution();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      VecInt vecInt0 = new VecInt(0, 0);
      vecInt0.push(0);
      LexicoDecorator<DimacsStringSolver> lexicoDecorator0 = new LexicoDecorator<DimacsStringSolver>(dimacsStringSolver0);
      lexicoDecorator0.addCriterion(vecInt0);
      assertEquals(1, vecInt0.size());
      
      Number number0 = lexicoDecorator0.evaluate(0);
      assertEquals(0, number0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      LexicoDecorator<DimacsStringSolver> lexicoDecorator0 = new LexicoDecorator<DimacsStringSolver>(dimacsStringSolver0);
      VecInt vecInt0 = new VecInt();
      vecInt0.push(843);
      lexicoDecorator0.addCriterion(vecInt0);
      // Undeclared exception!
      try { 
        lexicoDecorator0.evaluate(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.LexicoDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      LexicoDecorator<DimacsStringSolver> lexicoDecorator0 = new LexicoDecorator<DimacsStringSolver>(dimacsStringSolver0);
      VecInt vecInt0 = new VecInt();
      vecInt0.push((-3618));
      lexicoDecorator0.addCriterion(vecInt0);
      // Undeclared exception!
      try { 
        lexicoDecorator0.evaluate(2093);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.LexicoDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      IVecInt iVecInt0 = VecInt.EMPTY;
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      LexicoDecorator<DimacsStringSolver> lexicoDecorator0 = new LexicoDecorator<DimacsStringSolver>(dimacsStringSolver0);
      lexicoDecorator0.addCriterion(iVecInt0);
      Number number0 = lexicoDecorator0.calculateObjective();
      assertEquals(0, number0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = (-1560);
      VecInt vecInt0 = new VecInt(intArray0);
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.lightSolver();
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(iSolver0, (SolutionFoundListener) null);
      LexicoDecorator<ModelIteratorToSATAdapter> lexicoDecorator0 = new LexicoDecorator<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter0);
      // Undeclared exception!
      try { 
        lexicoDecorator0.admitABetterSolution((IVecInt) vecInt0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      VecInt vecInt0 = new VecInt(837, 837);
      SolutionCounter solutionCounter0 = mock(SolutionCounter.class, new ViolatedAssumptionAnswer());
      doReturn((IConstr) null).when(solutionCounter0).addClause(any(org.sat4j.specs.IVecInt.class));
      doReturn(false).when(solutionCounter0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn(false).when(solutionCounter0).removeConstr(any(org.sat4j.specs.IConstr.class));
      NegationDecorator<SolutionCounter> negationDecorator0 = new NegationDecorator<SolutionCounter>(solutionCounter0);
      SolutionCounter solutionCounter1 = new SolutionCounter(negationDecorator0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(solutionCounter1, 0L, solutionFoundListener0);
      LexicoDecorator<ModelIteratorToSATAdapter> lexicoDecorator0 = new LexicoDecorator<ModelIteratorToSATAdapter>(modelIteratorToSATAdapter0);
      boolean boolean0 = lexicoDecorator0.admitABetterSolution((IVecInt) vecInt0);
      assertFalse(lexicoDecorator0.isOptimal());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      VecInt vecInt0 = new VecInt();
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.lightSolver();
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(iSolver0, vecInt0, solutionFoundListener0);
      LexicoDecorator<AbstractMinimalModel> lexicoDecorator0 = new LexicoDecorator<AbstractMinimalModel>(abstractMinimalModel0);
      // Undeclared exception!
      try { 
        lexicoDecorator0.admitABetterSolution();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LexicoDecorator<GroupClauseSelectorSolver<AbstractMinimalModel>> lexicoDecorator0 = new LexicoDecorator<GroupClauseSelectorSolver<AbstractMinimalModel>>((GroupClauseSelectorSolver<AbstractMinimalModel>) null);
      Number number0 = lexicoDecorator0.getObjectiveValue();
      assertEquals((-1), number0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LexicoDecorator<DimacsOutputSolver> lexicoDecorator0 = new LexicoDecorator<DimacsOutputSolver>((DimacsOutputSolver) null);
      int[] intArray0 = lexicoDecorator0.modelWithInternalVariables();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      LexicoDecorator<DimacsStringSolver> lexicoDecorator0 = new LexicoDecorator<DimacsStringSolver>(dimacsStringSolver0);
      // Undeclared exception!
      try { 
        lexicoDecorator0.fixCriterionValue();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LexicoDecorator<AbstractMinimalModel> lexicoDecorator0 = new LexicoDecorator<AbstractMinimalModel>((AbstractMinimalModel) null);
      boolean boolean0 = lexicoDecorator0.nonOptimalMeansSatisfiable();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      ClausalCardinalitiesDecorator<StatisticsSolver> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<StatisticsSolver>(statisticsSolver0);
      LexicoDecorator<ClausalCardinalitiesDecorator<StatisticsSolver>> lexicoDecorator0 = new LexicoDecorator<ClausalCardinalitiesDecorator<StatisticsSolver>>(clausalCardinalitiesDecorator0);
      // Undeclared exception!
      try { 
        lexicoDecorator0.model((-621));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.LexicoDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      LexicoDecorator<DimacsStringSolver> lexicoDecorator0 = new LexicoDecorator<DimacsStringSolver>(dimacsStringSolver0);
      int[] intArray0 = lexicoDecorator0.model();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      LexicoDecorator<ManyCore<OptToSatAdapter>> lexicoDecorator0 = new LexicoDecorator<ManyCore<OptToSatAdapter>>((ManyCore<OptToSatAdapter>) null);
      // Undeclared exception!
      try { 
        lexicoDecorator0.setTimeoutForFindingBetterSolution((-1895));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // No implemented yet
         //
         verifyException("org.sat4j.tools.LexicoDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(0);
      LexicoDecorator<DimacsStringSolver> lexicoDecorator0 = new LexicoDecorator<DimacsStringSolver>(dimacsStringSolver0);
      boolean boolean0 = lexicoDecorator0.isOptimal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      LexicoDecorator<StatisticsSolver> lexicoDecorator0 = new LexicoDecorator<StatisticsSolver>(statisticsSolver0);
      Integer integer0 = IVisualizationTool.NOTGOOD;
      // Undeclared exception!
      try { 
        lexicoDecorator0.forceObjectiveValueTo(integer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.LexicoDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      LexicoDecorator<DimacsOutputSolver> lexicoDecorator0 = new LexicoDecorator<DimacsOutputSolver>(dimacsOutputSolver0);
      boolean boolean0 = lexicoDecorator0.hasNoObjectiveFunction();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      MinOneDecorator minOneDecorator0 = new MinOneDecorator((ISolver) null);
      LexicoDecorator<MinOneDecorator> lexicoDecorator0 = new LexicoDecorator<MinOneDecorator>(minOneDecorator0);
      // Undeclared exception!
      try { 
        lexicoDecorator0.getObjectiveValue(1044);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      LexicoDecorator<StatisticsSolver> lexicoDecorator0 = new LexicoDecorator<StatisticsSolver>((StatisticsSolver) null);
      // Undeclared exception!
      try { 
        lexicoDecorator0.discard();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      LexicoDecorator<AbstractMinimalModel> lexicoDecorator0 = new LexicoDecorator<AbstractMinimalModel>((AbstractMinimalModel) null);
      int int0 = lexicoDecorator0.numberOfCriteria();
      assertEquals(0, int0);
  }
}
