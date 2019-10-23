/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 13:29:45 GMT 2019
 */

package de.progra.charting.render;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import de.progra.charting.CoordSystem;
import de.progra.charting.PointToPixelTranslator;
import de.progra.charting.model.ChartDataModel;
import de.progra.charting.model.EditableChartDataModel;
import de.progra.charting.model.ObjectChartDataModel;
import de.progra.charting.render.BarChartRenderer;
import de.progra.charting.render.PieChartRenderer;
import de.progra.charting.render.PlotChartRenderer;
import de.progra.charting.render.RadarChartRenderer;
import de.progra.charting.render.RowColorModel;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractChartRenderer_ESTest extends AbstractChartRenderer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(editableChartDataModel0);
      RadarChartRenderer radarChartRenderer0 = new RadarChartRenderer(coordSystem0, (ChartDataModel) null);
      PointToPixelTranslator pointToPixelTranslator0 = coordSystem0.getPointToPixelTranslator((-3356));
      radarChartRenderer0.setPointToPixelTranslator(pointToPixelTranslator0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(editableChartDataModel0);
      PlotChartRenderer plotChartRenderer0 = new PlotChartRenderer(coordSystem0, editableChartDataModel0);
      AffineTransform affineTransform0 = plotChartRenderer0.getTransform(Integer.MAX_VALUE);
      assertNull(affineTransform0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(editableChartDataModel0);
      RadarChartRenderer radarChartRenderer0 = new RadarChartRenderer(coordSystem0, editableChartDataModel0);
      PointToPixelTranslator pointToPixelTranslator0 = coordSystem0.getPointToPixelTranslator(1);
      radarChartRenderer0.p = pointToPixelTranslator0;
      PointToPixelTranslator pointToPixelTranslator1 = radarChartRenderer0.getPointToPixelTranslator();
      assertSame(pointToPixelTranslator1, pointToPixelTranslator0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(editableChartDataModel0);
      RadarChartRenderer radarChartRenderer0 = new RadarChartRenderer(coordSystem0, editableChartDataModel0);
      CoordSystem coordSystem1 = radarChartRenderer0.getCoordSystem();
      assertEquals("x", coordSystem1.getXAxisUnit());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      PieChartRenderer pieChartRenderer0 = new PieChartRenderer(objectChartDataModel0);
      ChartDataModel chartDataModel0 = pieChartRenderer0.getChartDataModel();
      assertFalse(chartDataModel0.isColumnNumeric());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(editableChartDataModel0);
      RadarChartRenderer radarChartRenderer0 = new RadarChartRenderer(coordSystem0, editableChartDataModel0);
      editableChartDataModel0.setAutoScale(true);
      ChartDataModel chartDataModel0 = radarChartRenderer0.getChartDataModel();
      assertSame(chartDataModel0, editableChartDataModel0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(editableChartDataModel0);
      RadarChartRenderer radarChartRenderer0 = new RadarChartRenderer(coordSystem0, editableChartDataModel0);
      editableChartDataModel0.setMaximumColumnValue((-261.0));
      ChartDataModel chartDataModel0 = radarChartRenderer0.getChartDataModel();
      assertSame(editableChartDataModel0, chartDataModel0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(editableChartDataModel0);
      Rectangle rectangle0 = coordSystem0.getBounds();
      RadarChartRenderer radarChartRenderer0 = new RadarChartRenderer(coordSystem0, editableChartDataModel0);
      radarChartRenderer0.setBounds(rectangle0);
      Rectangle rectangle1 = radarChartRenderer0.getBounds();
      assertEquals(1.0737418235E9, rectangle1.getCenterX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PieChartRenderer pieChartRenderer0 = new PieChartRenderer((ChartDataModel) null);
      // Undeclared exception!
      try { 
        pieChartRenderer0.renderChart((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.PieChartRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PlotChartRenderer plotChartRenderer0 = new PlotChartRenderer((CoordSystem) null, (ChartDataModel) null);
      Rectangle rectangle0 = plotChartRenderer0.getBounds();
      assertNull(rectangle0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(editableChartDataModel0);
      RadarChartRenderer radarChartRenderer0 = new RadarChartRenderer(coordSystem0, (ChartDataModel) null);
      radarChartRenderer0.setChartDataModel(editableChartDataModel0);
      assertEquals(0.0, editableChartDataModel0.getManualMinimumColumnValue(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PieChartRenderer pieChartRenderer0 = new PieChartRenderer((ChartDataModel) null);
      PointToPixelTranslator pointToPixelTranslator0 = pieChartRenderer0.getPointToPixelTranslator();
      assertNull(pointToPixelTranslator0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PieChartRenderer pieChartRenderer0 = new PieChartRenderer((ChartDataModel) null);
      Dimension dimension0 = pieChartRenderer0.getPreferredSize();
      assertEquals(Integer.MIN_VALUE, dimension0.width);
      assertEquals(Integer.MIN_VALUE, dimension0.height);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BarChartRenderer barChartRenderer0 = new BarChartRenderer((CoordSystem) null, (ChartDataModel) null);
      RowColorModel rowColorModel0 = RowColorModel.getInstance((ChartDataModel) null);
      barChartRenderer0.setRowColorModel(rowColorModel0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PieChartRenderer pieChartRenderer0 = new PieChartRenderer((ChartDataModel) null);
      // Undeclared exception!
      try { 
        pieChartRenderer0.getTransform((-434));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.AbstractChartRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(editableChartDataModel0);
      RadarChartRenderer radarChartRenderer0 = new RadarChartRenderer(coordSystem0, (ChartDataModel) null);
      ChartDataModel chartDataModel0 = radarChartRenderer0.getChartDataModel();
      assertNull(chartDataModel0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      PieChartRenderer pieChartRenderer0 = new PieChartRenderer((ChartDataModel) null);
      // Undeclared exception!
      try { 
        pieChartRenderer0.render((Graphics2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("de.progra.charting.render.AbstractChartRenderer", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ObjectChartDataModel objectChartDataModel0 = new ObjectChartDataModel();
      PieChartRenderer pieChartRenderer0 = new PieChartRenderer(objectChartDataModel0);
      RowColorModel rowColorModel0 = pieChartRenderer0.getRowColorModel();
      assertNull(rowColorModel0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EditableChartDataModel editableChartDataModel0 = new EditableChartDataModel();
      CoordSystem coordSystem0 = new CoordSystem(editableChartDataModel0);
      RadarChartRenderer radarChartRenderer0 = new RadarChartRenderer(coordSystem0, (ChartDataModel) null);
      radarChartRenderer0.setCoordSystem((CoordSystem) null);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PieChartRenderer pieChartRenderer0 = new PieChartRenderer((ChartDataModel) null);
      CoordSystem coordSystem0 = pieChartRenderer0.getCoordSystem();
      assertNull(coordSystem0);
  }
}
