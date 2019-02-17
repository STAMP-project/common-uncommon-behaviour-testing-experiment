/*
 * This file was automatically generated by EvoSuite
 * Sun Feb 17 12:40:26 GMT 2019
 */

package org.sat4j.minisat.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.sat4j.BasicLauncher;
import org.sat4j.core.ASolverFactory;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.constraints.CardinalityDataStructure;
import org.sat4j.minisat.constraints.CardinalityDataStructureYanMax;
import org.sat4j.minisat.constraints.CardinalityDataStructureYanMin;
import org.sat4j.minisat.constraints.ClausalDataStructureWL;
import org.sat4j.minisat.constraints.MixedDataStructureDanielHT;
import org.sat4j.minisat.constraints.MixedDataStructureSingleWL;
import org.sat4j.minisat.constraints.cnf.LearntWLClause;
import org.sat4j.minisat.constraints.cnf.UnitClauses;
import org.sat4j.minisat.core.ConflictTimerContainer;
import org.sat4j.minisat.core.Glucose2LCDS;
import org.sat4j.minisat.core.ILits;
import org.sat4j.minisat.core.SearchParams;
import org.sat4j.minisat.core.Solver;
import org.sat4j.minisat.learning.ActiveLearning;
import org.sat4j.minisat.learning.MiniSATLearning;
import org.sat4j.minisat.learning.NoLearningButHeuristics;
import org.sat4j.minisat.learning.PercentLengthLearning;
import org.sat4j.minisat.orders.LevelBasedVarOrderHeap;
import org.sat4j.minisat.orders.NaturalStaticOrder;
import org.sat4j.minisat.orders.PureOrder;
import org.sat4j.minisat.orders.TabuListDecorator;
import org.sat4j.minisat.restarts.ArminRestarts;
import org.sat4j.minisat.restarts.FixedPeriodRestarts;
import org.sat4j.minisat.restarts.LubyRestarts;
import org.sat4j.opt.MinOneDecorator;
import org.sat4j.specs.Constr;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Glucose2LCDS_ESTest extends Glucose2LCDS_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams(1297.17174186496, 2766);
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0, 0);
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      ASolverFactory<MinOneDecorator> aSolverFactory0 = (ASolverFactory<MinOneDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<MinOneDecorator> basicLauncher0 = new BasicLauncher<MinOneDecorator>(aSolverFactory0);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ActiveLearning<CardinalityDataStructure> activeLearning0 = new ActiveLearning<CardinalityDataStructure>();
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(activeLearning0, cardinalityDataStructure0, levelBasedVarOrderHeap0, fixedPeriodRestarts0);
      VecInt vecInt0 = (VecInt)solver0.learnedLiterals;
      Constr constr0 = cardinalityDataStructure0.createUnregisteredClause(vecInt0);
      MiniSATLearning<ClausalDataStructureWL> miniSATLearning0 = new MiniSATLearning<ClausalDataStructureWL>();
      ClausalDataStructureWL clausalDataStructureWL0 = new ClausalDataStructureWL();
      Solver<ClausalDataStructureWL> solver1 = new Solver<ClausalDataStructureWL>(miniSATLearning0, clausalDataStructureWL0, searchParams0, tabuListDecorator0, fixedPeriodRestarts0);
      ConflictTimerContainer conflictTimerContainer0 = new ConflictTimerContainer();
      constr0.incActivity(430.41385);
      Glucose2LCDS<ClausalDataStructureWL> glucose2LCDS0 = new Glucose2LCDS<ClausalDataStructureWL>(solver1, conflictTimerContainer0);
      glucose2LCDS0.onPropagation(constr0);
      ActiveLearning<MixedDataStructureDanielHT> activeLearning1 = new ActiveLearning<MixedDataStructureDanielHT>(576.780784163);
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      Solver<MixedDataStructureDanielHT> solver2 = new Solver<MixedDataStructureDanielHT>(activeLearning1, mixedDataStructureDanielHT0, searchParams0, tabuListDecorator0, fixedPeriodRestarts0);
      Glucose2LCDS<MixedDataStructureDanielHT> glucose2LCDS1 = new Glucose2LCDS<MixedDataStructureDanielHT>(solver2, fixedPeriodRestarts0);
      glucose2LCDS1.onClauseLearning(constr0);
      PercentLengthLearning<CardinalityDataStructureYanMax> percentLengthLearning0 = new PercentLengthLearning<CardinalityDataStructureYanMax>(1192);
      CardinalityDataStructureYanMax cardinalityDataStructureYanMax0 = new CardinalityDataStructureYanMax();
      Solver<CardinalityDataStructureYanMax> solver3 = new Solver<CardinalityDataStructureYanMax>(percentLengthLearning0, cardinalityDataStructureYanMax0, searchParams0, tabuListDecorator0, fixedPeriodRestarts0, basicLauncher0);
      Glucose2LCDS<CardinalityDataStructureYanMax> glucose2LCDS2 = new Glucose2LCDS<CardinalityDataStructureYanMax>(solver3, conflictTimerContainer0);
      glucose2LCDS2.onPropagation(constr0);
      assertEquals(2.0, constr0.getActivity(), 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MiniSATLearning<CardinalityDataStructureYanMin> miniSATLearning0 = new MiniSATLearning<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      NaturalStaticOrder naturalStaticOrder0 = new NaturalStaticOrder();
      ArminRestarts arminRestarts0 = new ArminRestarts();
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(miniSATLearning0, cardinalityDataStructureYanMin0, naturalStaticOrder0, arminRestarts0);
      Glucose2LCDS<CardinalityDataStructureYanMin> glucose2LCDS0 = new Glucose2LCDS<CardinalityDataStructureYanMin>(solver0, arminRestarts0);
      VecInt vecInt0 = new VecInt();
      UnitClauses unitClauses0 = new UnitClauses(vecInt0);
      // Undeclared exception!
      try { 
        glucose2LCDS0.onPropagation(unitClauses0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.constraints.cnf.UnitClauses", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NoLearningButHeuristics<CardinalityDataStructureYanMin> noLearningButHeuristics0 = new NoLearningButHeuristics<CardinalityDataStructureYanMin>();
      CardinalityDataStructureYanMin cardinalityDataStructureYanMin0 = new CardinalityDataStructureYanMin();
      PureOrder pureOrder0 = new PureOrder();
      LubyRestarts lubyRestarts0 = new LubyRestarts();
      Solver<CardinalityDataStructureYanMin> solver0 = new Solver<CardinalityDataStructureYanMin>(noLearningButHeuristics0, cardinalityDataStructureYanMin0, pureOrder0, lubyRestarts0);
      Glucose2LCDS<CardinalityDataStructureYanMin> glucose2LCDS0 = new Glucose2LCDS<CardinalityDataStructureYanMin>(solver0, lubyRestarts0);
      // Undeclared exception!
      try { 
        glucose2LCDS0.onPropagation((Constr) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.sat4j.minisat.core.Glucose2LCDS", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MiniSATLearning<MixedDataStructureSingleWL> miniSATLearning0 = new MiniSATLearning<MixedDataStructureSingleWL>();
      MixedDataStructureSingleWL mixedDataStructureSingleWL0 = new MixedDataStructureSingleWL();
      SearchParams searchParams0 = new SearchParams(1297.17174186496, 2766);
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0, 0);
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      ASolverFactory<MinOneDecorator> aSolverFactory0 = (ASolverFactory<MinOneDecorator>) mock(ASolverFactory.class, new ViolatedAssumptionAnswer());
      BasicLauncher<MinOneDecorator> basicLauncher0 = new BasicLauncher<MinOneDecorator>(aSolverFactory0);
      Solver<MixedDataStructureSingleWL> solver0 = new Solver<MixedDataStructureSingleWL>(miniSATLearning0, mixedDataStructureSingleWL0, searchParams0, tabuListDecorator0, fixedPeriodRestarts0, basicLauncher0);
      Glucose2LCDS<MixedDataStructureSingleWL> glucose2LCDS0 = new Glucose2LCDS<MixedDataStructureSingleWL>(solver0, fixedPeriodRestarts0);
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ActiveLearning<CardinalityDataStructure> activeLearning0 = new ActiveLearning<CardinalityDataStructure>();
      Solver<CardinalityDataStructure> solver1 = new Solver<CardinalityDataStructure>(activeLearning0, cardinalityDataStructure0, levelBasedVarOrderHeap0, fixedPeriodRestarts0);
      VecInt vecInt0 = (VecInt)solver1.learnedLiterals;
      Constr constr0 = cardinalityDataStructure0.createUnregisteredClause(vecInt0);
      glucose2LCDS0.onPropagation(constr0);
      assertFalse(constr0.canBePropagatedMultipleTimes());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SearchParams searchParams0 = new SearchParams(1297.17174186496, 2766);
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      TabuListDecorator tabuListDecorator0 = new TabuListDecorator(levelBasedVarOrderHeap0, 0);
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      ActiveLearning<MixedDataStructureDanielHT> activeLearning0 = new ActiveLearning<MixedDataStructureDanielHT>(576.780784163);
      MixedDataStructureDanielHT mixedDataStructureDanielHT0 = new MixedDataStructureDanielHT();
      Solver<MixedDataStructureDanielHT> solver0 = new Solver<MixedDataStructureDanielHT>(activeLearning0, mixedDataStructureDanielHT0, searchParams0, tabuListDecorator0, fixedPeriodRestarts0);
      Glucose2LCDS<MixedDataStructureDanielHT> glucose2LCDS0 = new Glucose2LCDS<MixedDataStructureDanielHT>(solver0, fixedPeriodRestarts0);
      String string0 = glucose2LCDS0.toString();
      assertEquals("Glucose 2 learned constraints deletion strategy (LBD updated on propagation) with timer constant restarts strategy every 0 conflicts", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LevelBasedVarOrderHeap levelBasedVarOrderHeap0 = new LevelBasedVarOrderHeap();
      FixedPeriodRestarts fixedPeriodRestarts0 = new FixedPeriodRestarts();
      CardinalityDataStructure cardinalityDataStructure0 = new CardinalityDataStructure();
      ActiveLearning<CardinalityDataStructure> activeLearning0 = new ActiveLearning<CardinalityDataStructure>();
      Solver<CardinalityDataStructure> solver0 = new Solver<CardinalityDataStructure>(activeLearning0, cardinalityDataStructure0, levelBasedVarOrderHeap0, fixedPeriodRestarts0);
      VecInt vecInt0 = new VecInt(3, 3);
      ILits iLits0 = levelBasedVarOrderHeap0.getVocabulary();
      LearntWLClause learntWLClause0 = new LearntWLClause(vecInt0, iLits0);
      learntWLClause0.incActivity(3);
      Glucose2LCDS<CardinalityDataStructure> glucose2LCDS0 = new Glucose2LCDS<CardinalityDataStructure>(solver0, fixedPeriodRestarts0);
      // Undeclared exception!
      try { 
        glucose2LCDS0.onPropagation(learntWLClause0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.sat4j.minisat.core.GlucoseLCDS", e);
      }
  }
}
