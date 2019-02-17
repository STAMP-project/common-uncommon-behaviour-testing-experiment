/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 13:07:30 GMT 2019
 */

package org.sat4j;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;
import org.sat4j.BasicLauncher;
import org.sat4j.DecisionMode;
import org.sat4j.ExitCode;
import org.sat4j.ILauncherMode;
import org.sat4j.LightFactory;
import org.sat4j.MUSLauncher;
import org.sat4j.OptimizationMode;
import org.sat4j.core.ASolverFactory;
import org.sat4j.minisat.constraints.MixedDataStructureSingleWL;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.FixedLengthLearning;
import org.sat4j.minisat.learning.PercentLengthLearning;
import org.sat4j.minisat.orders.NegativeLiteralSelectionStrategy;
import org.sat4j.minisat.orders.RandomWalkDecorator;
import org.sat4j.minisat.orders.SubsetVarOrder;
import org.sat4j.minisat.orders.VarOrderHeap;
import org.sat4j.minisat.restarts.ArminRestarts;
import org.sat4j.minisat.restarts.MiniSATRestarts;
import org.sat4j.opt.MaxSatDecorator;
import org.sat4j.opt.MinOneDecorator;
import org.sat4j.reader.DimacsReader;
import org.sat4j.reader.InstanceReader;
import org.sat4j.reader.JSONReader;
import org.sat4j.reader.LecteurDimacs;
import org.sat4j.reader.Reader;
import org.sat4j.specs.ILogAble;
import org.sat4j.specs.IProblem;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.IVecInt;
import org.sat4j.tools.ClausalCardinalitiesDecorator;
import org.sat4j.tools.DimacsStringSolver;
import org.sat4j.tools.LexicoDecorator;
import org.sat4j.tools.ManyCore;
import org.sat4j.tools.ModelIterator;
import org.sat4j.tools.ModelIteratorToSATAdapter;
import org.sat4j.tools.OptToSatAdapter;
import org.sat4j.tools.SingleSolutionDetector;
import org.sat4j.tools.SolutionCounter;
import org.sat4j.tools.SolutionFoundListener;
import org.sat4j.tools.StatisticsSolver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DecisionMode_ESTest extends DecisionMode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DecisionMode decisionMode0 = (DecisionMode)ILauncherMode.DECISION;
      decisionMode0.getCurrentExitCode();
      DecisionMode decisionMode1 = new DecisionMode();
      MUSLauncher mUSLauncher0 = new MUSLauncher();
      MockPrintStream mockPrintStream0 = new MockPrintStream("c ");
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(mockPrintStream0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(filterOutputStream0);
      PrintWriter printWriter0 = mockPrintWriter0.append((CharSequence) "c ", 0, 0);
      MinOneDecorator minOneDecorator0 = new MinOneDecorator((ISolver) null);
      OptimizationMode optimizationMode0 = new OptimizationMode();
      OptToSatAdapter optToSatAdapter0 = new OptToSatAdapter(minOneDecorator0, optimizationMode0);
      JSONReader<OptToSatAdapter> jSONReader0 = new JSONReader<OptToSatAdapter>(optToSatAdapter0);
      decisionMode1.displayResult((ISolver) null, (IProblem) null, mUSLauncher0, printWriter0, jSONReader0, 0L, false);
      assertNotSame(decisionMode1, decisionMode0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DecisionMode decisionMode0 = (DecisionMode)ILauncherMode.DECISION;
      OptToSatAdapter[] optToSatAdapterArray0 = new OptToSatAdapter[0];
      ManyCore<OptToSatAdapter> manyCore0 = new ManyCore<OptToSatAdapter>(true, optToSatAdapterArray0);
      ModelIterator modelIterator0 = new ModelIterator(manyCore0);
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(modelIterator0, true);
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(maxSatDecorator0, decisionMode0);
      LecteurDimacs lecteurDimacs0 = new LecteurDimacs(maxSatDecorator0);
      ASolverFactory<OptToSatAdapter> aSolverFactory0 = (ASolverFactory<OptToSatAdapter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<OptToSatAdapter> basicLauncher0 = new BasicLauncher<OptToSatAdapter>(aSolverFactory0);
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("c ", true);
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFileOutputStream0, true);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockPrintStream0, false);
      // Undeclared exception!
      try { 
        decisionMode0.solve(modelIteratorToSATAdapter0, lecteurDimacs0, basicLauncher0, mockPrintWriter0, 0L);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.ManyCore", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DecisionMode decisionMode0 = new DecisionMode();
      ASolverFactory<OptToSatAdapter> aSolverFactory0 = (ASolverFactory<OptToSatAdapter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<OptToSatAdapter> basicLauncher0 = new BasicLauncher<OptToSatAdapter>(aSolverFactory0);
      PrintWriter printWriter0 = basicLauncher0.getLogWriter();
      // Undeclared exception!
      try { 
        decisionMode0.solve((IProblem) null, (Reader) null, basicLauncher0, printWriter0, 50L);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.DecisionMode", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DecisionMode decisionMode0 = (DecisionMode)ILauncherMode.DECISION;
      OptToSatAdapter[] optToSatAdapterArray0 = new OptToSatAdapter[5];
      OptToSatAdapter optToSatAdapter0 = mock(OptToSatAdapter.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(optToSatAdapter0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn((-3735)).when(optToSatAdapter0).nVars();
      LexicoDecorator<OptToSatAdapter> lexicoDecorator0 = new LexicoDecorator<OptToSatAdapter>(optToSatAdapter0);
      OptToSatAdapter optToSatAdapter1 = new OptToSatAdapter(lexicoDecorator0, decisionMode0);
      MUSLauncher mUSLauncher0 = new MUSLauncher();
      Reader reader0 = mUSLauncher0.createReader(optToSatAdapterArray0[0], "pi computation time: ");
      MockFile mockFile0 = new MockFile(" ms", " solution(s)");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      // Undeclared exception!
      try { 
        decisionMode0.solve(optToSatAdapter1, reader0, mUSLauncher0, mockPrintWriter0, 9223372036854775807L);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.tools.LexicoDecorator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DecisionMode decisionMode0 = (DecisionMode)ILauncherMode.DECISION;
      OptToSatAdapter optToSatAdapter0 = mock(OptToSatAdapter.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(optToSatAdapter0).isSatisfiable(any(org.sat4j.specs.IVecInt.class) , anyBoolean());
      doReturn((int[]) null).when(optToSatAdapter0).model();
      doReturn((int[]) null).when(optToSatAdapter0).modelWithInternalVariables();
      doReturn(0, 0).when(optToSatAdapter0).nVars();
      LexicoDecorator<OptToSatAdapter> lexicoDecorator0 = new LexicoDecorator<OptToSatAdapter>(optToSatAdapter0);
      OptToSatAdapter optToSatAdapter1 = new OptToSatAdapter(lexicoDecorator0, decisionMode0);
      MUSLauncher mUSLauncher0 = new MUSLauncher();
      Reader reader0 = mUSLauncher0.createReader(optToSatAdapter1, "pi computation time: ");
      MockFile mockFile0 = new MockFile(" ms", " solution(s)");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(mockFile0);
      // Undeclared exception!
      try { 
        decisionMode0.solve(optToSatAdapter1, reader0, mUSLauncher0, mockPrintWriter0, 9223372036854775807L);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DecisionMode decisionMode0 = new DecisionMode();
      PercentLengthLearning<MixedDataStructureSingleWL> percentLengthLearning0 = new PercentLengthLearning<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      SearchParams searchParams0 = new SearchParams(0.0, 1);
      int[] intArray0 = new int[4];
      intArray0[0] = 3626;
      SubsetVarOrder subsetVarOrder0 = new SubsetVarOrder(intArray0);
      ArminRestarts arminRestarts0 = new ArminRestarts();
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(percentLengthLearning0, mixedDataStructureSingleWL0, searchParams0, subsetVarOrder0, arminRestarts0, (ILogAble) null);
      SingleSolutionDetector singleSolutionDetector0 = new SingleSolutionDetector(solver0);
      ModelIteratorToSATAdapter modelIteratorToSATAdapter0 = new ModelIteratorToSATAdapter(singleSolutionDetector0, 1, decisionMode0);
      SolutionCounter solutionCounter0 = new SolutionCounter(modelIteratorToSATAdapter0);
      LecteurDimacs lecteurDimacs0 = new LecteurDimacs(singleSolutionDetector0);
      ASolverFactory<OptToSatAdapter> aSolverFactory0 = (ASolverFactory<OptToSatAdapter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<OptToSatAdapter> basicLauncher0 = new BasicLauncher<OptToSatAdapter>(aSolverFactory0);
      PrintWriter printWriter0 = basicLauncher0.getLogWriter();
      // Undeclared exception!
      try { 
        decisionMode0.solve(solutionCounter0, lecteurDimacs0, (ILogAble) null, printWriter0, 0L);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3626
         //
         verifyException("org.sat4j.minisat.orders.SubsetVarOrder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DecisionMode decisionMode0 = new DecisionMode();
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        decisionMode0.onSolutionFound(intArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.DecisionMode", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DecisionMode decisionMode0 = (DecisionMode)ILauncherMode.DECISION;
      MUSLauncher mUSLauncher0 = new MUSLauncher();
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0);
      StatisticsSolver statisticsSolver0 = new StatisticsSolver();
      DimacsReader dimacsReader0 = new DimacsReader(statisticsSolver0, "N%(N0 @0~*FJoHj_M");
      decisionMode0.displayResult(statisticsSolver0, statisticsSolver0, mUSLauncher0, mockPrintWriter0, dimacsReader0, (-14L), false);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DecisionMode decisionMode0 = (DecisionMode)ILauncherMode.DECISION;
      OptToSatAdapter[] optToSatAdapterArray0 = new OptToSatAdapter[0];
      ManyCore<OptToSatAdapter> manyCore0 = new ManyCore<OptToSatAdapter>(false, optToSatAdapterArray0);
      ILogAble iLogAble0 = ILogAble.CONSOLE;
      ASolverFactory<OptToSatAdapter> aSolverFactory0 = (ASolverFactory<OptToSatAdapter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<OptToSatAdapter> basicLauncher0 = new BasicLauncher<OptToSatAdapter>(aSolverFactory0);
      MockPrintWriter mockPrintWriter0 = (MockPrintWriter)basicLauncher0.out;
      LecteurDimacs lecteurDimacs0 = new LecteurDimacs(manyCore0);
      decisionMode0.displayResult(manyCore0, manyCore0, iLogAble0, mockPrintWriter0, lecteurDimacs0, 0L, false);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      ASolverFactory<OptToSatAdapter> aSolverFactory0 = (ASolverFactory<OptToSatAdapter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<OptToSatAdapter> basicLauncher0 = new BasicLauncher<OptToSatAdapter>(aSolverFactory0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0);
      OptimizationMode optimizationMode0 = new OptimizationMode();
      // Undeclared exception!
      try { 
        optimizationMode0.displayResult(dimacsStringSolver0, dimacsStringSolver0, basicLauncher0, mockPrintWriter0, (Reader) null, 802L, true);
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DecisionMode decisionMode0 = (DecisionMode)ILauncherMode.DECISION;
      decisionMode0.onUnsatTermination();
      int[] intArray0 = new int[6];
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DecisionMode decisionMode0 = new DecisionMode();
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(iSolver0);
      OptToSatAdapter optToSatAdapter0 = new OptToSatAdapter(maxSatDecorator0, decisionMode0);
      ASolverFactory<OptToSatAdapter> aSolverFactory0 = (ASolverFactory<OptToSatAdapter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<OptToSatAdapter> basicLauncher0 = new BasicLauncher<OptToSatAdapter>(aSolverFactory0);
      ClausalCardinalitiesDecorator<OptToSatAdapter> clausalCardinalitiesDecorator0 = new ClausalCardinalitiesDecorator<OptToSatAdapter>(optToSatAdapter0);
      Reader reader0 = basicLauncher0.createReader(clausalCardinalitiesDecorator0, "");
      StringWriter stringWriter0 = new StringWriter();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(stringWriter0, true);
      decisionMode0.solve(optToSatAdapter0, reader0, basicLauncher0, mockPrintWriter0, 0L);
      assertEquals(ExitCode.OPTIMUM_FOUND, decisionMode0.getCurrentExitCode());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      OptToSatAdapter optToSatAdapter0 = mock(OptToSatAdapter.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(optToSatAdapter0).isSatisfiable();
      LexicoDecorator<OptToSatAdapter> lexicoDecorator0 = new LexicoDecorator<OptToSatAdapter>(optToSatAdapter0);
      DecisionMode decisionMode0 = (DecisionMode)ILauncherMode.DECISION;
      MUSLauncher mUSLauncher0 = new MUSLauncher();
      Reader reader0 = mUSLauncher0.createReader(lexicoDecorator0, (String) null);
      assertEquals(ExitCode.UNKNOWN, mUSLauncher0.getExitCode());
      
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(byteArrayOutputStream0);
      decisionMode0.solve(lexicoDecorator0, reader0, mUSLauncher0, mockPrintWriter0, 0L);
      assertEquals(ExitCode.UNSATISFIABLE, decisionMode0.getCurrentExitCode());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(dimacsStringSolver0, false);
      OptToSatAdapter optToSatAdapter0 = new OptToSatAdapter(maxSatDecorator0);
      LexicoDecorator<OptToSatAdapter> lexicoDecorator0 = new LexicoDecorator<OptToSatAdapter>(optToSatAdapter0);
      DimacsReader dimacsReader0 = new DimacsReader(dimacsStringSolver0, "Y$D&");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("P>uq");
      InstanceReader instanceReader0 = new InstanceReader(optToSatAdapter0, dimacsReader0);
      DecisionMode decisionMode0 = (DecisionMode)ILauncherMode.DECISION;
      // Undeclared exception!
      try { 
        decisionMode0.displayResult(lexicoDecorator0, optToSatAdapter0, (ILogAble) null, mockPrintWriter0, instanceReader0, 131, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.DecisionMode", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DecisionMode decisionMode0 = new DecisionMode();
      decisionMode0.onUnsatTermination();
      DimacsStringSolver dimacsStringSolver0 = new DimacsStringSolver();
      MaxSatDecorator maxSatDecorator0 = new MaxSatDecorator(dimacsStringSolver0, false);
      OptToSatAdapter optToSatAdapter0 = new OptToSatAdapter(maxSatDecorator0);
      LexicoDecorator<OptToSatAdapter> lexicoDecorator0 = new LexicoDecorator<OptToSatAdapter>(optToSatAdapter0);
      SolutionFoundListener solutionFoundListener0 = SolutionFoundListener.VOID;
      OptToSatAdapter optToSatAdapter1 = new OptToSatAdapter(lexicoDecorator0, solutionFoundListener0);
      DimacsReader dimacsReader0 = new DimacsReader(dimacsStringSolver0, "Y$D&");
      int int0 = 131;
      FixedLengthLearning<MixedDataStructureSingleWL> fixedLengthLearning0 = new FixedLengthLearning<MixedDataStructureSingleWL>(131);
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      SearchParams searchParams0 = new SearchParams(1);
      NegativeLiteralSelectionStrategy negativeLiteralSelectionStrategy0 = new NegativeLiteralSelectionStrategy();
      VarOrderHeap varOrderHeap0 = new VarOrderHeap(negativeLiteralSelectionStrategy0);
      RandomWalkDecorator randomWalkDecorator0 = new RandomWalkDecorator(varOrderHeap0, 1);
      MiniSATRestarts miniSATRestarts0 = new MiniSATRestarts();
      ASolverFactory<OptToSatAdapter> aSolverFactory0 = (ASolverFactory<OptToSatAdapter>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<OptToSatAdapter> basicLauncher0 = new BasicLauncher<OptToSatAdapter>(aSolverFactory0);
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(fixedLengthLearning0, mixedDataStructureSingleWL0, searchParams0, randomWalkDecorator0, miniSATRestarts0, basicLauncher0);
      ILogAble iLogAble0 = solver0.getLogger();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("P>uq");
      PrintWriter printWriter0 = mockPrintWriter0.append((CharSequence) "P>uq");
      decisionMode0.solve(optToSatAdapter1, dimacsReader0, iLogAble0, printWriter0, 131);
      decisionMode0.solve(solver0, dimacsReader0, basicLauncher0, printWriter0, 1);
      int[] intArray0 = new int[5];
      intArray0[0] = 131;
      InstanceReader instanceReader0 = new InstanceReader(optToSatAdapter1, dimacsReader0);
      DecisionMode decisionMode1 = (DecisionMode)ILauncherMode.DECISION;
      ILogAble iLogAble1 = null;
      // Undeclared exception!
      try { 
        decisionMode1.displayResult(lexicoDecorator0, optToSatAdapter0, (ILogAble) null, mockPrintWriter0, instanceReader0, 131, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.DecisionMode", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DecisionMode decisionMode0 = new DecisionMode();
      LightFactory lightFactory0 = new LightFactory();
      ISolver iSolver0 = lightFactory0.defaultSolver();
      MUSLauncher mUSLauncher0 = new MUSLauncher();
      Reader reader0 = mUSLauncher0.createReader(iSolver0, "c ");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("c ");
      decisionMode0.solve(iSolver0, reader0, mUSLauncher0, mockPrintWriter0, 1414L);
      decisionMode0.displayResult(iSolver0, iSolver0, mUSLauncher0, mockPrintWriter0, reader0, 24L, false);
      assertEquals(ExitCode.SATISFIABLE, decisionMode0.getCurrentExitCode());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DecisionMode decisionMode0 = new DecisionMode();
      ExitCode exitCode0 = ExitCode.OPTIMUM_FOUND;
      decisionMode0.setExitCode(exitCode0);
      assertEquals(ExitCode.OPTIMUM_FOUND, decisionMode0.getCurrentExitCode());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DecisionMode decisionMode0 = (DecisionMode)ILauncherMode.DECISION;
      decisionMode0.setIncomplete(false);
      assertEquals(ExitCode.UNKNOWN, decisionMode0.getCurrentExitCode());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DecisionMode decisionMode0 = (DecisionMode)ILauncherMode.DECISION;
      // Undeclared exception!
      try { 
        decisionMode0.onSolutionFound((IVecInt) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Not implemented yet!
         //
         verifyException("org.sat4j.DecisionMode", e);
      }
  }
}
