/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 23 13:16:24 GMT 2019
 */

package de.paragon.explorer.util;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ExplorerColorManager_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "de.paragon.explorer.util.ExplorerColorManager"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.home", "/home/pderakhshanfar"); 
    java.lang.System.setProperty("user.dir", "/home/pderakhshanfar/evosuite-model-seeding-ee/evosuite-model-seeding-empirical-evaluation"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ExplorerColorManager_ESTest_scaffolding.class.getClassLoader() ,
      "de.paragon.explorer.excp.FigureEventException",
      "de.paragon.explorer.gui.DisplayBox",
      "de.paragon.explorer.event.ObjectCopyDialogEventConverter",
      "de.paragon.explorer.model.ObjectModelPart",
      "de.paragon.explorer.util.ExplorerColorManager",
      "de.paragon.explorer.model.ExplorerModelBuilder",
      "de.paragon.explorer.model.NullObject",
      "de.paragon.explorer.model.ObjectModelBuilder",
      "de.paragon.explorer.figure.ExplorerFigure",
      "de.paragon.explorer.gui.ExplorerDrawingPanel",
      "de.paragon.explorer.figure.Figure",
      "de.paragon.explorer.event.DrawEvent",
      "de.paragon.explorer.util.StandardEnumerator",
      "de.paragon.explorer.event.ExplorerPopupActionConverter",
      "de.paragon.explorer.model.StandardAttributeModel",
      "de.paragon.explorer.util.ResourceBundleManager",
      "de.paragon.explorer.event.ExplorerActionConverter",
      "de.paragon.explorer.model.ObjectHeaderModel",
      "de.paragon.explorer.figure.FigureChangeEvent",
      "de.paragon.explorer.util.ConnectionBuilder",
      "de.paragon.explorer.popup.AttributePopupMenu",
      "de.paragon.explorer.util.ObjectTitleManager",
      "de.paragon.explorer.figure.ListBoxFigure",
      "de.paragon.explorer.model.ObjectModel",
      "de.paragon.explorer.model.ExplorerModel",
      "de.paragon.explorer.util.StandardEnumeration",
      "de.paragon.explorer.figure.ConnectionFigure",
      "de.paragon.explorer.model.AttributeModelBuilder",
      "de.paragon.explorer.util.PropertyManager",
      "de.paragon.explorer.event.RefreshEvent",
      "de.paragon.explorer.figure.ColorRectangleFigure",
      "de.paragon.explorer.event.DrawListener",
      "de.paragon.explorer.figure.ExplorerFieldListBoxFigure",
      "de.paragon.explorer.figure.StandardConnectionFigure",
      "de.paragon.explorer.figure.ListBoxFigureBuilder",
      "de.paragon.explorer.util.ExplorerManager",
      "de.paragon.explorer.figure.TextBoxFigure",
      "de.paragon.explorer.figure.CompositeFigure",
      "de.paragon.explorer.util.LoggerFactory",
      "de.paragon.explorer.figure.FigureChangeListener",
      "de.paragon.explorer.excp.FigureException",
      "de.paragon.explorer.figure.ExplorerFigureBuilder",
      "de.paragon.explorer.event.ObjectViewDialogEventConverter",
      "de.paragon.explorer.figure.AbstractFigure",
      "de.paragon.explorer.figure.RectangleFigure",
      "de.paragon.explorer.event.ExplorerFrameEventConverter",
      "de.paragon.explorer.figure.StandardCompositeFigure",
      "de.paragon.explorer.gui.ExplorerFrame",
      "de.paragon.explorer.model.Model",
      "de.paragon.explorer.model.AttributeModel",
      "de.paragon.explorer.model.ConnectionModel",
      "de.paragon.explorer.event.AboutDialogEventConverter",
      "de.paragon.explorer.util.AttributeTitleManager",
      "de.paragon.explorer.figure.FigureChangeManager",
      "de.paragon.explorer.util.ObjectViewManager",
      "de.paragon.explorer.gui.ObjectCopyDialog",
      "de.paragon.explorer.event.RefreshListenerIfc",
      "de.paragon.explorer.model.ArrayAttributeModel",
      "de.paragon.explorer.popup.HeaderPopupMenu"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ExplorerColorManager_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "de.paragon.explorer.util.ExplorerColorManager",
      "de.paragon.explorer.figure.FigureChangeManager",
      "de.paragon.explorer.model.AttributeModel",
      "de.paragon.explorer.model.ArrayAttributeModel",
      "de.paragon.explorer.util.StandardEnumerator",
      "de.paragon.explorer.model.NullObject",
      "de.paragon.explorer.figure.StandardConnectionFigure",
      "de.paragon.explorer.util.ObjectTitleManager",
      "de.paragon.explorer.gui.ExplorerFrame",
      "de.paragon.explorer.util.ResourceBundleManager",
      "de.paragon.explorer.figure.ListBoxFigure",
      "de.paragon.explorer.gui.ExplorerDrawingPanel",
      "de.paragon.explorer.util.ObjectViewManager",
      "de.paragon.explorer.util.PropertyManager",
      "de.paragon.explorer.util.AttributeTitleManager"
    );
  }
}
