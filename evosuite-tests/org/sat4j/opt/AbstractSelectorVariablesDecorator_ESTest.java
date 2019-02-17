/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 13:08:38 GMT 2019
 */

package org.sat4j.opt;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.LightFactory;
import org.sat4j.core.ASolverFactory;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.PercentLengthLearning;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.minisat.restarts.LubyRestarts;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.specs.ILogAble;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.AbstractMinimalModel;
import org.sat4j.tools.CheckMUSSolutionListener;
import org.sat4j.tools.DimacsOutputSolver;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.GroupClauseSelectorSolver;
import org.sat4j.tools.LexicoDecorator;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.Minimal4CardinalityModel;
import org.sat4j.tools.NegationDecorator;
import org.sat4j.tools.OptToSatAdapter;
import org.sat4j.tools.SingleSolutionDetector;
import org.sat4j.tools.StatisticsSolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractSelectorVariablesDecorator_ESTest extends AbstractSelectorVariablesDecorator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MaxSatDecorator[] maxSatDecoratorArray0 = new MaxSatDecorator[0];
      ManyCore<MaxSatDecorator> manyCore0 = new ManyCore<MaxSatDecorator>(true, maxSatDecoratorArray0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(manyCore0, false);
      maxSatDecorator0.setSolutionOptimal(true);
      assertTrue(maxSatDecorator0.isSolutionOptimal());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator((ISolver) null, true);
      maxSatDecorator0.setExpectedNumberOfClauses(102);
      assertEquals(102, maxSatDecorator0.getExpectedNumberOfClauses());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver(1229);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(dimacsStringSolver0, true);
      int[] intArray0 = new int[1];
      maxSatDecorator0.setPrevmodel(intArray0);
      assertEquals(0, maxSatDecorator0.getNbexpectedclauses());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      LexicoDecorator<DimacsOutputSolver> lexicoDecorator0 = new LexicoDecorator<DimacsOutputSolver>(dimacsOutputSolver0);
      GroupClauseSelectorSolver<LexicoDecorator<DimacsOutputSolver>> groupClauseSelectorSolver0 = new GroupClauseSelectorSolver<LexicoDecorator<DimacsOutputSolver>>(lexicoDecorator0);
      AbstractMinimalModel abstractMinimalModel0 = new AbstractMinimalModel(groupClauseSelectorSolver0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(abstractMinimalModel0);
      boolean[] booleanArray0 = new boolean[8];
      maxSatDecorator0.setPrevboolmodel(booleanArray0);
      boolean boolean0 = maxSatDecorator0.model(1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.lightSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0, true);
      VecInt vecInt0 = new VecInt(2816, 885);
      boolean boolean0 = maxSatDecorator0.admitABetterSolution((IVecInt) vecInt0);
      assertTrue(boolean0);
      
      maxSatDecorator0.model();
      assertFalse(maxSatDecorator0.isSolutionOptimal());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PercentLengthLearning<CardinalityDataStructure> percentLengthLearning0 = new PercentLengthLearning<CardinalityDataStructure>((-1));
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      SearchParams searchParams0 = new SearchParams(1.0, (-1088.1483525907), 0.0, (-1));
      VarOrderHeap varOrderHeap0 = new VarOrderHeap();
      LubyRestarts lubyRestarts0 = new LubyRestarts(1);
      ILogAble iLogAble0 = ILogAble.CONSOLE;
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(percentLengthLearning0, cardinalityDataStructure0, searchParams0, varOrderHeap0, lubyRestarts0, iLogAble0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(solver0, false);
      VecInt vecInt0 = new VecInt(0, 706);
      boolean boolean0 = maxSatDecorator0.admitABetterSolution((IVecInt) vecInt0);
      assertTrue(boolean0);
      
      maxSatDecorator0.model();
      assertFalse(maxSatDecorator0.isSolutionOptimal());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      VecInt vecInt0 = new VecInt(912, 912);
      boolean boolean0 = maxSatDecorator0.admitABetterSolution((IVecInt) vecInt0);
      assertTrue(boolean0);
      
      maxSatDecorator0.getPrevmodel();
      assertFalse(maxSatDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      Minimal4CardinalityModel[] minimal4CardinalityModelArray0 = new Minimal4CardinalityModel[1];
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(iSolver0);
      minimal4CardinalityModelArray0[0] = minimal4CardinalityModel0;
      ManyCore<Minimal4CardinalityModel> manyCore0 = new ManyCore<Minimal4CardinalityModel>(minimal4CardinalityModelArray0);
      IVecInt iVecInt0 = manyCore0.createBlockingClauseForCurrentModel();
      boolean boolean0 = maxSatDecorator0.admitABetterSolution(iVecInt0);
      assertTrue(boolean0);
      
      maxSatDecorator0.getPrevmodel();
      assertFalse(maxSatDecorator0.isSolutionOptimal());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0, true);
      int[] intArray0 = new int[8];
      maxSatDecorator0.setPrevfullmodel(intArray0);
      int[] intArray1 = maxSatDecorator0.getPrevfullmodel();
      assertFalse(intArray1.equals((Object)intArray0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      Minimal4CardinalityModel[] minimal4CardinalityModelArray0 = new Minimal4CardinalityModel[1];
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(iSolver0);
      minimal4CardinalityModelArray0[0] = minimal4CardinalityModel0;
      ManyCore<Minimal4CardinalityModel> manyCore0 = new ManyCore<Minimal4CardinalityModel>(minimal4CardinalityModelArray0);
      IVecInt iVecInt0 = manyCore0.createBlockingClauseForCurrentModel();
      boolean boolean0 = maxSatDecorator0.admitABetterSolution(iVecInt0);
      assertTrue(boolean0);
      
      maxSatDecorator0.getPrevfullmodel();
      assertFalse(maxSatDecorator0.isSolutionOptimal());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      VecInt vecInt0 = new VecInt(912, 912);
      boolean boolean0 = maxSatDecorator0.admitABetterSolution((IVecInt) vecInt0);
      assertTrue(boolean0);
      
      maxSatDecorator0.getPrevboolmodel();
      assertFalse(maxSatDecorator0.isSolutionOptimal());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      Minimal4CardinalityModel[] minimal4CardinalityModelArray0 = new Minimal4CardinalityModel[1];
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(iSolver0);
      minimal4CardinalityModelArray0[0] = minimal4CardinalityModel0;
      ManyCore<Minimal4CardinalityModel> manyCore0 = new ManyCore<Minimal4CardinalityModel>(minimal4CardinalityModelArray0);
      IVecInt iVecInt0 = manyCore0.createBlockingClauseForCurrentModel();
      boolean boolean0 = maxSatDecorator0.admitABetterSolution(iVecInt0);
      assertTrue(boolean0);
      
      maxSatDecorator0.getPrevboolmodel();
      assertFalse(maxSatDecorator0.isSolutionOptimal());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      maxSatDecorator0.setExpectedNumberOfClauses(894);
      int int0 = maxSatDecorator0.getNbexpectedclauses();
      assertEquals(894, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PercentLengthLearning<CardinalityDataStructure> percentLengthLearning0 = new PercentLengthLearning<CardinalityDataStructure>((-1));
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      SearchParams searchParams0 = new SearchParams(1.0, (-1088.1483525907), 0.0, (-1));
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      LubyRestarts lubyRestarts0 = new LubyRestarts(1);
      ILogAble iLogAble0 = ILogAble.CONSOLE;
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(percentLengthLearning0, cardinalityDataStructure0, searchParams0, levelBasedVarOrderHeap0, lubyRestarts0, iLogAble0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(solver0, false);
      VecInt vecInt0 = new VecInt(87, 48);
      boolean boolean0 = maxSatDecorator0.admitABetterSolution((IVecInt) vecInt0);
      assertTrue(boolean0);
      
      maxSatDecorator0.discardCurrentModel();
      assertFalse(maxSatDecorator0.isSolutionOptimal());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      Minimal4CardinalityModel[] minimal4CardinalityModelArray0 = new Minimal4CardinalityModel[1];
      Minimal4CardinalityModel minimal4CardinalityModel0 = new Minimal4CardinalityModel(iSolver0);
      minimal4CardinalityModelArray0[0] = minimal4CardinalityModel0;
      ManyCore<Minimal4CardinalityModel> manyCore0 = new ManyCore<Minimal4CardinalityModel>(minimal4CardinalityModelArray0);
      IVecInt iVecInt0 = manyCore0.createBlockingClauseForCurrentModel();
      boolean boolean0 = maxSatDecorator0.admitABetterSolution(iVecInt0);
      assertTrue(boolean0);
      
      maxSatDecorator0.createBlockingClauseForCurrentModel();
      assertFalse(maxSatDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      VecInt vecInt0 = new VecInt(912, 912);
      boolean boolean0 = maxSatDecorator0.admitABetterSolution((IVecInt) vecInt0);
      assertTrue(boolean0);
      
      maxSatDecorator0.createBlockingClauseForCurrentModel();
      assertFalse(maxSatDecorator0.isOptimal());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0, false);
      // Undeclared exception!
      try { 
        maxSatDecorator0.setPrevfullmodel((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.opt.AbstractSelectorVariablesDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      // Undeclared exception!
      try { 
        maxSatDecorator0.setPrevboolmodel((boolean[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.opt.AbstractSelectorVariablesDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      maxSatDecorator0.admitABetterSolution();
      // Undeclared exception!
      try { 
        maxSatDecorator0.model(1270);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1269
         //
         verifyException("org.sat4j.opt.AbstractSelectorVariablesDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(dimacsStringSolver0);
      // Undeclared exception!
      try { 
        maxSatDecorator0.discardCurrentModel();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DimacsOutputSolver dimacsOutputSolver0 = new DimacsOutputSolver();
      LexicoDecorator<DimacsOutputSolver> lexicoDecorator0 = new LexicoDecorator<DimacsOutputSolver>(dimacsOutputSolver0);
      OptToSatAdapter optToSatAdapter0 = new OptToSatAdapter(lexicoDecorator0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(optToSatAdapter0);
      int[] intArray0 = new int[1];
      VecInt vecInt0 = new VecInt(intArray0);
      try { 
        maxSatDecorator0.admitABetterSolution((IVecInt) vecInt0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // There is no real solver behind!
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      int[] intArray0 = new int[7];
      intArray0[1] = (-3776);
      VecInt vecInt0 = new VecInt(intArray0);
      maxSatDecorator0.admitABetterSolution((IVecInt) vecInt0);
      // Undeclared exception!
      maxSatDecorator0.admitABetterSolution((IVecInt) vecInt0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      LexicoDecorator<StatisticsSolver> lexicoDecorator0 = new LexicoDecorator<StatisticsSolver>(statisticsSolver0);
      ASolverFactory<SingleSolutionDetector> aSolverFactory0 = (ASolverFactory<SingleSolutionDetector>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      CheckMUSSolutionListener checkMUSSolutionListener0 = new CheckMUSSolutionListener(aSolverFactory0);
      OptToSatAdapter optToSatAdapter0 = new OptToSatAdapter(lexicoDecorator0, checkMUSSolutionListener0);
      NegationDecorator<OptToSatAdapter> negationDecorator0 = new NegationDecorator<OptToSatAdapter>(optToSatAdapter0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(negationDecorator0);
      // Undeclared exception!
      try { 
        maxSatDecorator0.admitABetterSolution((IVecInt) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.tools.StatisticsSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      // Undeclared exception!
      try { 
        maxSatDecorator0.admitABetterSolution((IVecInt) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      int[] intArray0 = new int[5];
      VecInt vecInt0 = new VecInt(intArray0);
      vecInt0.shrinkTo((-1536));
      // Undeclared exception!
      try { 
        maxSatDecorator0.admitABetterSolution((IVecInt) vecInt0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      int[] intArray0 = new int[5];
      intArray0[0] = (-1);
      intArray0[3] = 1;
      VecInt vecInt0 = new VecInt(intArray0);
      // Undeclared exception!
      try { 
        maxSatDecorator0.admitABetterSolution((IVecInt) vecInt0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(dimacsStringSolver0);
      try { 
        maxSatDecorator0.admitABetterSolution();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // There is no real solver behind!
         //
         verifyException("org.sat4j.tools.AbstractOutputSolver", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      int[] intArray0 = new int[7];
      intArray0[1] = (-3776);
      VecInt vecInt0 = new VecInt(intArray0);
      maxSatDecorator0.admitABetterSolution((IVecInt) vecInt0);
      // Undeclared exception!
      maxSatDecorator0.admitABetterSolution();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator((ISolver) null, false);
      // Undeclared exception!
      try { 
        maxSatDecorator0.admitABetterSolution();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.SolverDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      maxSatDecorator0.newVar((-1));
      // Undeclared exception!
      try { 
        maxSatDecorator0.admitABetterSolution();
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.core.VecInt", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(dimacsStringSolver0);
      IVecInt iVecInt0 = maxSatDecorator0.createBlockingClauseForCurrentModel();
      assertNull(iVecInt0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(statisticsSolver0, false);
      int[] intArray0 = maxSatDecorator0.model();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0, false);
      int[] intArray0 = maxSatDecorator0.getPrevfullmodel();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      boolean[] booleanArray0 = maxSatDecorator0.getPrevboolmodel();
      assertNull(booleanArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      maxSatDecorator0.setNbexpectedclauses(65535);
      assertEquals(65535, maxSatDecorator0.getExpectedNumberOfClauses());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      boolean boolean0 = maxSatDecorator0.isSolutionOptimal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      // Undeclared exception!
      try { 
        maxSatDecorator0.discardCurrentModel();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.core.Solver", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      int[] intArray0 = maxSatDecorator0.getPrevmodel();
      assertNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.lightSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      int int0 = maxSatDecorator0.getExpectedNumberOfClauses();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      maxSatDecorator0.admitABetterSolution();
      try { 
        maxSatDecorator0.discardCurrentModel();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Creating Empty clause ?
         //
         verifyException("org.sat4j.minisat.constraints.cnf.Clauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.lightSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0, true);
      boolean boolean0 = maxSatDecorator0.isOptimal();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      PercentLengthLearning<CardinalityDataStructure> percentLengthLearning0 = new PercentLengthLearning<CardinalityDataStructure>((-1));
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      SearchParams searchParams0 = new SearchParams(1.0, (-1088.1483525907), 0.0, (-1));
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      LubyRestarts lubyRestarts0 = new LubyRestarts(1);
      ILogAble iLogAble0 = ILogAble.CONSOLE;
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(percentLengthLearning0, cardinalityDataStructure0, searchParams0, levelBasedVarOrderHeap0, lubyRestarts0, iLogAble0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(solver0, false);
      VecInt vecInt0 = new VecInt(87, 48);
      maxSatDecorator0.admitABetterSolution((IVecInt) vecInt0);
      MaxSatDecorator maxSatDecorator1 = new MaxSatDecorator(maxSatDecorator0, false);
      boolean boolean0 = maxSatDecorator1.admitABetterSolution((IVecInt) vecInt0);
      assertFalse(maxSatDecorator1.isSolutionOptimal());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      LightFactory lightFactory0 = LightFactory.instance();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      // Undeclared exception!
      try { 
        maxSatDecorator0.setPrevmodel((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.opt.AbstractSelectorVariablesDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      PercentLengthLearning<CardinalityDataStructure> percentLengthLearning0 = new PercentLengthLearning<CardinalityDataStructure>((-1));
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      SearchParams searchParams0 = new SearchParams(1.0, (-1088.1483525907), 0.0, (-1));
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      LubyRestarts lubyRestarts0 = new LubyRestarts(1);
      ILogAble iLogAble0 = ILogAble.CONSOLE;
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(percentLengthLearning0, cardinalityDataStructure0, searchParams0, levelBasedVarOrderHeap0, lubyRestarts0, iLogAble0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(solver0, false);
      int int0 = maxSatDecorator0.getNbexpectedclauses();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      // Undeclared exception!
      try { 
        maxSatDecorator0.model(1270);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.opt.AbstractSelectorVariablesDecorator", e);
      }
  }
}
