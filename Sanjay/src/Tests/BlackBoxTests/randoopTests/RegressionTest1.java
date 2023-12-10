package Tests.BlackBoxTests.randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isAutoRequestFocus();
        java.awt.Component component3 = durationAnalysis0.getMostRecentFocusOwner();
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        java.awt.MenuBar menuBar6 = null;
        durationAnalysis4.setMenuBar(menuBar6);
        boolean boolean8 = durationAnalysis4.isFocusOwner();
        boolean boolean9 = durationAnalysis4.isLightweight();
        youtubeAnalysis.durationAnalysis durationAnalysis10 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image11 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis14 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis14.removeAll();
        boolean boolean16 = durationAnalysis10.prepareImage(image11, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis14);
        java.awt.Event event17 = null;
        boolean boolean20 = durationAnalysis10.mouseUp(event17, 10, 10);
        int int21 = durationAnalysis10.getState();
        java.awt.Image image22 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis25 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis25.removeAll();
        int int27 = durationAnalysis25.getDefaultCloseOperation();
        java.awt.Dimension dimension28 = durationAnalysis25.getMaximumSize();
        int int29 = durationAnalysis10.checkImage(image22, 12, 100, (java.awt.image.ImageObserver) durationAnalysis25);
        youtubeAnalysis.durationAnalysis durationAnalysis30 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis30.removeAll();
        boolean boolean32 = durationAnalysis30.isForegroundSet();
        java.lang.String str33 = durationAnalysis30.toString();
        javax.swing.TransferHandler transferHandler34 = durationAnalysis30.getTransferHandler();
        durationAnalysis30.transferFocusBackward();
        durationAnalysis30.setVisible(true);
        java.awt.Point point38 = durationAnalysis30.location();
        boolean boolean39 = durationAnalysis10.contains(point38);
        java.awt.Point point40 = durationAnalysis4.getLocation(point38);
        durationAnalysis0.setLocation(point40);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(component3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "youtubeAnalysis.durationAnalysis[frame106,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str33, "youtubeAnalysis.durationAnalysis[frame106,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertNull(transferHandler34);
        org.junit.Assert.assertNotNull(point38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(point40);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        youtubeAnalysis.durationAnalysis durationAnalysis9 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis9.removeAll();
        int int11 = durationAnalysis9.getDefaultCloseOperation();
        boolean boolean12 = durationAnalysis9.isMinimumSizeSet();
        boolean boolean13 = durationAnalysis5.isAncestorOf((java.awt.Component) durationAnalysis9);
        boolean boolean14 = durationAnalysis9.isUndecorated();
        java.awt.Component[] componentArray15 = durationAnalysis9.getComponents();
        boolean boolean16 = durationAnalysis9.isMinimumSizeSet();
        java.awt.event.KeyListener keyListener17 = null;
        durationAnalysis9.removeKeyListener(keyListener17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(componentArray15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        boolean boolean11 = durationAnalysis0.isEnabled();
        boolean boolean12 = durationAnalysis0.getFocusableWindowState();
        java.awt.event.HierarchyListener[] hierarchyListenerArray13 = durationAnalysis0.getHierarchyListeners();
        java.awt.Graphics graphics14 = durationAnalysis0.getGraphics();
        int int15 = durationAnalysis0.getComponentCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(hierarchyListenerArray13);
        org.junit.Assert.assertNull(graphics14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        boolean boolean11 = durationAnalysis0.isEnabled();
        boolean boolean12 = durationAnalysis0.getFocusableWindowState();
        java.awt.event.HierarchyListener[] hierarchyListenerArray13 = durationAnalysis0.getHierarchyListeners();
        java.awt.event.WindowFocusListener[] windowFocusListenerArray14 = durationAnalysis0.getWindowFocusListeners();
        java.awt.Component component17 = durationAnalysis0.getComponentAt(64, 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(hierarchyListenerArray13);
        org.junit.Assert.assertNotNull(windowFocusListenerArray14);
        org.junit.Assert.assertNotNull(component17);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setFocusTraversalKeysEnabled(true);
        int int11 = durationAnalysis0.countComponents();
        java.awt.Point point12 = durationAnalysis0.getMousePosition();
        java.awt.GraphicsConfiguration graphicsConfiguration13 = durationAnalysis0.getGraphicsConfiguration();
        youtubeAnalysis.durationAnalysis durationAnalysis14 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis14.removeAll();
        java.awt.MenuBar menuBar16 = null;
        durationAnalysis14.setMenuBar(menuBar16);
        java.awt.LayoutManager layoutManager18 = null;
        durationAnalysis14.setLayout(layoutManager18);
        youtubeAnalysis.durationAnalysis durationAnalysis20 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis20.removeAll();
        boolean boolean22 = durationAnalysis20.isForegroundSet();
        durationAnalysis20.show(false);
        java.awt.event.ContainerListener containerListener25 = null;
        durationAnalysis20.removeContainerListener(containerListener25);
        youtubeAnalysis.durationAnalysis durationAnalysis27 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis27.removeAll();
        int int29 = durationAnalysis27.getDefaultCloseOperation();
        boolean boolean30 = durationAnalysis27.isMinimumSizeSet();
        java.awt.Image image31 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis32 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar33 = null;
        durationAnalysis32.setJMenuBar(jMenuBar33);
        boolean boolean35 = durationAnalysis27.prepareImage(image31, (java.awt.image.ImageObserver) durationAnalysis32);
        durationAnalysis27.setLocation((int) (short) 0, 3);
        int int39 = durationAnalysis27.getX();
        java.awt.event.ComponentListener componentListener40 = null;
        durationAnalysis27.addComponentListener(componentListener40);
        javax.swing.JLayeredPane jLayeredPane42 = durationAnalysis27.getLayeredPane();
        durationAnalysis20.setLayeredPane(jLayeredPane42);
        youtubeAnalysis.durationAnalysis durationAnalysis44 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis44.removeAll();
        java.awt.MenuBar menuBar46 = null;
        durationAnalysis44.setMenuBar(menuBar46);
        java.awt.Color color48 = durationAnalysis44.getBackground();
        jLayeredPane42.setForeground(color48);
        durationAnalysis14.setBackground(color48);
        durationAnalysis0.setBackground(color48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(point12);
        org.junit.Assert.assertNotNull(graphicsConfiguration13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(jLayeredPane42);
        org.junit.Assert.assertNotNull(color48);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        boolean boolean27 = durationAnalysis15.isShowing();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        durationAnalysis0.move((int) (byte) 0, 2);
        youtubeAnalysis.durationAnalysis durationAnalysis18 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis18.removeAll();
        boolean boolean20 = durationAnalysis18.isAutoRequestFocus();
        java.awt.Component component21 = durationAnalysis18.getMostRecentFocusOwner();
        durationAnalysis18.pack();
        java.awt.image.ImageProducer imageProducer23 = null;
        java.awt.Image image24 = durationAnalysis18.createImage(imageProducer23);
        youtubeAnalysis.durationAnalysis durationAnalysis27 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image28 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis31 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis31.removeAll();
        boolean boolean33 = durationAnalysis27.prepareImage(image28, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis31);
        java.awt.Event event34 = null;
        boolean boolean37 = durationAnalysis27.mouseUp(event34, 10, 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = durationAnalysis0.prepareImage(image24, 2, 12, (java.awt.image.ImageObserver) durationAnalysis27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.image.ImageProducer.startProduction(java.awt.image.ImageConsumer)\" because the return value of \"sun.awt.image.ToolkitImage.getSource()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(component21);
        org.junit.Assert.assertNotNull(image24);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        int int4 = durationAnalysis0.countComponents();
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis0.createBufferStrategy(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Component must have a valid peer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        youtubeAnalysis.durationAnalysis durationAnalysis9 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis9.removeAll();
        int int11 = durationAnalysis9.getDefaultCloseOperation();
        boolean boolean12 = durationAnalysis9.isMinimumSizeSet();
        boolean boolean13 = durationAnalysis5.isAncestorOf((java.awt.Component) durationAnalysis9);
        boolean boolean14 = durationAnalysis9.isLocationByPlatform();
        java.awt.Event event15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = durationAnalysis9.handleEvent(event15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        durationAnalysis15.addPropertyChangeListener("youtubeAnalysis.durationAnalysis[frame0,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", propertyChangeListener28);
        java.awt.im.InputContext inputContext30 = durationAnalysis15.getInputContext();
        java.awt.event.MouseListener mouseListener31 = null;
        durationAnalysis15.addMouseListener(mouseListener31);
        java.awt.Color color33 = durationAnalysis15.getForeground();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(inputContext30);
        org.junit.Assert.assertNull(color33);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        durationAnalysis4.revalidate();
        youtubeAnalysis.durationAnalysis durationAnalysis8 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis8.removeAll();
        int int10 = durationAnalysis8.getDefaultCloseOperation();
        boolean boolean11 = durationAnalysis8.isMinimumSizeSet();
        java.awt.Image image12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis13 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar14 = null;
        durationAnalysis13.setJMenuBar(jMenuBar14);
        boolean boolean16 = durationAnalysis8.prepareImage(image12, (java.awt.image.ImageObserver) durationAnalysis13);
        java.awt.Dimension dimension17 = null;
        java.awt.Dimension dimension18 = durationAnalysis8.getSize(dimension17);
        durationAnalysis4.setMinimumSize(dimension18);
        java.awt.Image image22 = durationAnalysis4.createImage((int) (short) 1, (int) (byte) 0);
        durationAnalysis4.revalidate();
        java.awt.Insets insets24 = durationAnalysis4.insets();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertNull(image22);
        org.junit.Assert.assertNotNull(insets24);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        java.awt.MenuBar menuBar2 = null;
        durationAnalysis0.setMenuBar(menuBar2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
        durationAnalysis0.removeHierarchyBoundsListener(hierarchyBoundsListener4);
        java.awt.Container container6 = durationAnalysis0.getParent();
        org.junit.Assert.assertNull(container6);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        durationAnalysis0.firePropertyChange("hi!", 10.0f, (float) 'a');
        java.awt.Image image31 = null;
        durationAnalysis0.setIconImage(image31);
        boolean boolean33 = durationAnalysis0.isAlwaysOnTop();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        java.awt.MenuBar menuBar2 = null;
        durationAnalysis0.setMenuBar(menuBar2);
        java.awt.event.FocusListener focusListener4 = null;
        durationAnalysis0.addFocusListener(focusListener4);
        java.awt.Graphics graphics6 = null;
        durationAnalysis0.paint(graphics6);
        java.awt.event.InputMethodListener[] inputMethodListenerArray8 = durationAnalysis0.getInputMethodListeners();
        boolean boolean11 = durationAnalysis0.inside(9, 5);
        org.junit.Assert.assertNotNull(inputMethodListenerArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        youtubeAnalysis.durationAnalysis durationAnalysis11 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis15.removeAll();
        boolean boolean17 = durationAnalysis11.prepareImage(image12, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis15);
        durationAnalysis15.revalidate();
        boolean boolean19 = durationAnalysis0.isFocusCycleRoot((java.awt.Container) durationAnalysis15);
        java.lang.Object obj20 = durationAnalysis15.getTreeLock();
        durationAnalysis15.setAutoRequestFocus(false);
        java.awt.image.ColorModel colorModel23 = durationAnalysis15.getColorModel();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray24 = durationAnalysis15.getHierarchyBoundsListeners();
        durationAnalysis15.setLocation((int) (byte) 10, (-1));
        java.awt.AWTKeyStroke[] aWTKeyStrokeArray29 = new java.awt.AWTKeyStroke[] {};
        java.util.LinkedHashSet<java.awt.AWTKeyStroke> aWTKeyStrokeSet30 = new java.util.LinkedHashSet<java.awt.AWTKeyStroke>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.awt.AWTKeyStroke>) aWTKeyStrokeSet30, aWTKeyStrokeArray29);
        durationAnalysis15.setFocusTraversalKeys(0, (java.util.Set<java.awt.AWTKeyStroke>) aWTKeyStrokeSet30);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(colorModel23);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray24);
        org.junit.Assert.assertNotNull(aWTKeyStrokeArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext3 = durationAnalysis0.getInputContext();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis5.removeAll();
        java.awt.Graphics graphics7 = null;
        durationAnalysis5.paintComponents(graphics7);
        boolean boolean9 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        java.awt.Dimension dimension10 = durationAnalysis5.getMaximumSize();
        java.awt.event.ComponentListener componentListener11 = null;
        durationAnalysis5.removeComponentListener(componentListener11);
        youtubeAnalysis.durationAnalysis durationAnalysis13 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis13.removeAll();
        int int15 = durationAnalysis13.getDefaultCloseOperation();
        java.awt.Rectangle rectangle16 = durationAnalysis13.getMaximizedBounds();
        java.awt.ComponentOrientation componentOrientation17 = durationAnalysis13.getComponentOrientation();
        durationAnalysis5.setComponentOrientation(componentOrientation17);
        java.awt.Point point19 = durationAnalysis5.getMousePosition();
        boolean boolean20 = durationAnalysis5.isForegroundSet();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(inputContext3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(rectangle16);
        org.junit.Assert.assertNotNull(componentOrientation17);
        org.junit.Assert.assertNull(point19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setFocusTraversalKeysEnabled(true);
        int int11 = durationAnalysis0.countComponents();
        youtubeAnalysis.durationAnalysis durationAnalysis12 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis12.removeAll();
        int int14 = durationAnalysis12.getDefaultCloseOperation();
        boolean boolean15 = durationAnalysis12.isMinimumSizeSet();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis17 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar18 = null;
        durationAnalysis17.setJMenuBar(jMenuBar18);
        boolean boolean20 = durationAnalysis12.prepareImage(image16, (java.awt.image.ImageObserver) durationAnalysis17);
        durationAnalysis12.setLocation((int) (short) 0, 3);
        int int24 = durationAnalysis12.getX();
        java.awt.event.ComponentListener componentListener25 = null;
        durationAnalysis12.addComponentListener(componentListener25);
        durationAnalysis12.move((int) (byte) 0, 2);
        java.awt.Dimension dimension30 = durationAnalysis12.minimumSize();
        durationAnalysis0.setMaximumSize(dimension30);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener32 = null;
        durationAnalysis0.removeHierarchyBoundsListener(hierarchyBoundsListener32);
        java.lang.String str34 = durationAnalysis0.getTitle();
        boolean boolean35 = durationAnalysis0.getIgnoreRepaint();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dimension30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Duration Analysis" + "'", str34, "Duration Analysis");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setFocusTraversalKeysEnabled(true);
        int int11 = durationAnalysis0.countComponents();
        youtubeAnalysis.durationAnalysis durationAnalysis12 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis12.removeAll();
        int int14 = durationAnalysis12.getDefaultCloseOperation();
        boolean boolean15 = durationAnalysis12.isMinimumSizeSet();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis17 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar18 = null;
        durationAnalysis17.setJMenuBar(jMenuBar18);
        boolean boolean20 = durationAnalysis12.prepareImage(image16, (java.awt.image.ImageObserver) durationAnalysis17);
        durationAnalysis12.setLocation((int) (short) 0, 3);
        int int24 = durationAnalysis12.getX();
        java.awt.event.ComponentListener componentListener25 = null;
        durationAnalysis12.addComponentListener(componentListener25);
        durationAnalysis12.move((int) (byte) 0, 2);
        java.awt.Dimension dimension30 = durationAnalysis12.minimumSize();
        durationAnalysis0.setMaximumSize(dimension30);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener32 = null;
        durationAnalysis0.removeHierarchyBoundsListener(hierarchyBoundsListener32);
        youtubeAnalysis.durationAnalysis durationAnalysis34 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis34.removeAll();
        int int36 = durationAnalysis34.getDefaultCloseOperation();
        boolean boolean37 = durationAnalysis34.isMinimumSizeSet();
        java.awt.Event event38 = null;
        java.lang.Object obj39 = null;
        boolean boolean40 = durationAnalysis34.gotFocus(event38, obj39);
        java.awt.event.HierarchyListener hierarchyListener41 = null;
        durationAnalysis34.addHierarchyListener(hierarchyListener41);
        durationAnalysis34.setBounds((int) (byte) -1, (int) 'a', 6, 2);
        youtubeAnalysis.durationAnalysis durationAnalysis48 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis48.removeAll();
        boolean boolean50 = durationAnalysis48.isAutoRequestFocus();
        java.awt.Component component51 = durationAnalysis48.getMostRecentFocusOwner();
        java.awt.event.HierarchyListener hierarchyListener52 = null;
        durationAnalysis48.removeHierarchyListener(hierarchyListener52);
        boolean boolean54 = durationAnalysis48.isResizable();
        durationAnalysis48.setFocusableWindowState(true);
        java.awt.image.BufferStrategy bufferStrategy57 = durationAnalysis48.getBufferStrategy();
        youtubeAnalysis.durationAnalysis durationAnalysis58 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis58.removeAll();
        java.awt.MenuBar menuBar60 = null;
        durationAnalysis58.setMenuBar(menuBar60);
        java.awt.event.FocusListener focusListener62 = null;
        durationAnalysis58.addFocusListener(focusListener62);
        java.awt.Graphics graphics64 = null;
        durationAnalysis58.paint(graphics64);
        boolean boolean66 = durationAnalysis58.isAlwaysOnTop();
        java.awt.Rectangle rectangle67 = durationAnalysis58.getBounds();
        java.awt.Rectangle rectangle68 = durationAnalysis48.getBounds(rectangle67);
        java.awt.Rectangle rectangle69 = durationAnalysis34.getBounds(rectangle68);
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis0.setShape((java.awt.Shape) rectangle68);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is decorated");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dimension30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(component51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(bufferStrategy57);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(rectangle67);
        org.junit.Assert.assertNotNull(rectangle68);
        org.junit.Assert.assertNotNull(rectangle69);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        youtubeAnalysis.durationAnalysis durationAnalysis11 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis15.removeAll();
        boolean boolean17 = durationAnalysis11.prepareImage(image12, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis15);
        durationAnalysis15.revalidate();
        boolean boolean19 = durationAnalysis0.isFocusCycleRoot((java.awt.Container) durationAnalysis15);
        java.io.PrintStream printStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis0.list(printStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isDisplayable();
        boolean boolean4 = durationAnalysis0.isFocusTraversalPolicyProvider();
        java.awt.event.WindowListener windowListener5 = null;
        durationAnalysis0.addWindowListener(windowListener5);
        youtubeAnalysis.durationAnalysis durationAnalysis7 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis7.removeAll();
        int int9 = durationAnalysis7.getDefaultCloseOperation();
        java.awt.Dimension dimension10 = null;
        durationAnalysis7.setMinimumSize(dimension10);
        boolean boolean12 = durationAnalysis7.isCursorSet();
        youtubeAnalysis.durationAnalysis durationAnalysis13 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis13.removeAll();
        int int15 = durationAnalysis13.getDefaultCloseOperation();
        boolean boolean16 = durationAnalysis13.isMinimumSizeSet();
        java.awt.Image image17 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis18 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar19 = null;
        durationAnalysis18.setJMenuBar(jMenuBar19);
        boolean boolean21 = durationAnalysis13.prepareImage(image17, (java.awt.image.ImageObserver) durationAnalysis18);
        java.awt.Dimension dimension22 = null;
        java.awt.Dimension dimension23 = durationAnalysis13.getSize(dimension22);
        durationAnalysis7.setSize(dimension23);
        durationAnalysis0.setSize(dimension23);
        java.awt.event.WindowFocusListener windowFocusListener26 = null;
        durationAnalysis0.removeWindowFocusListener(windowFocusListener26);
        durationAnalysis0.setCursor((int) (short) 0);
        durationAnalysis0.transferFocusBackward();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dimension23);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        int int11 = durationAnalysis0.getState();
        java.awt.Image image12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis15.removeAll();
        int int17 = durationAnalysis15.getDefaultCloseOperation();
        java.awt.Dimension dimension18 = durationAnalysis15.getMaximumSize();
        int int19 = durationAnalysis0.checkImage(image12, 12, 100, (java.awt.image.ImageObserver) durationAnalysis15);
        youtubeAnalysis.durationAnalysis durationAnalysis20 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis20.removeAll();
        int int22 = durationAnalysis20.getDefaultCloseOperation();
        boolean boolean23 = durationAnalysis20.isMinimumSizeSet();
        java.awt.Image image24 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis25 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar26 = null;
        durationAnalysis25.setJMenuBar(jMenuBar26);
        boolean boolean28 = durationAnalysis20.prepareImage(image24, (java.awt.image.ImageObserver) durationAnalysis25);
        youtubeAnalysis.durationAnalysis durationAnalysis29 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis29.removeAll();
        int int31 = durationAnalysis29.getDefaultCloseOperation();
        boolean boolean32 = durationAnalysis29.isMinimumSizeSet();
        boolean boolean33 = durationAnalysis25.isAncestorOf((java.awt.Component) durationAnalysis29);
        durationAnalysis25.revalidate();
        int int35 = durationAnalysis25.getComponentCount();
        boolean boolean36 = durationAnalysis25.isFocusTraversalPolicySet();
        boolean boolean37 = durationAnalysis25.isActive();
        durationAnalysis25.removeNotify();
        boolean boolean39 = durationAnalysis25.hasFocus();
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis15.setComponentZOrder((java.awt.Component) durationAnalysis25, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isOpaque();
        java.awt.Rectangle rectangle3 = null;
        java.awt.Rectangle rectangle4 = durationAnalysis0.getBounds(rectangle3);
        int int5 = durationAnalysis0.getX();
        java.awt.event.WindowFocusListener windowFocusListener6 = null;
        durationAnalysis0.addWindowFocusListener(windowFocusListener6);
        boolean boolean8 = durationAnalysis0.isFocusOwner();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(rectangle4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Event event4 = null;
        java.lang.Object obj5 = null;
        boolean boolean6 = durationAnalysis0.gotFocus(event4, obj5);
        youtubeAnalysis.durationAnalysis durationAnalysis7 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis7.removeAll();
        int int9 = durationAnalysis7.getDefaultCloseOperation();
        boolean boolean10 = durationAnalysis7.isMinimumSizeSet();
        java.awt.Event event11 = null;
        java.lang.Object obj12 = null;
        boolean boolean13 = durationAnalysis7.gotFocus(event11, obj12);
        java.awt.event.HierarchyListener hierarchyListener14 = null;
        durationAnalysis7.addHierarchyListener(hierarchyListener14);
        youtubeAnalysis.durationAnalysis durationAnalysis16 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image17 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis20 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis20.removeAll();
        boolean boolean22 = durationAnalysis16.prepareImage(image17, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis20);
        java.awt.Event event23 = null;
        boolean boolean26 = durationAnalysis16.mouseUp(event23, 10, 10);
        youtubeAnalysis.durationAnalysis durationAnalysis27 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image28 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis31 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis31.removeAll();
        boolean boolean33 = durationAnalysis27.prepareImage(image28, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis31);
        durationAnalysis31.revalidate();
        boolean boolean35 = durationAnalysis16.isFocusCycleRoot((java.awt.Container) durationAnalysis31);
        durationAnalysis7.setLocationRelativeTo((java.awt.Component) durationAnalysis31);
        boolean boolean37 = durationAnalysis31.isFocusTraversalPolicyProvider();
        java.awt.Event event38 = null;
        boolean boolean40 = durationAnalysis31.keyDown(event38, 0);
        youtubeAnalysis.durationAnalysis durationAnalysis41 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis41.removeAll();
        boolean boolean43 = durationAnalysis41.isAutoRequestFocus();
        java.awt.Component component44 = durationAnalysis41.getMostRecentFocusOwner();
        durationAnalysis41.pack();
        java.awt.image.ImageProducer imageProducer46 = null;
        java.awt.Image image47 = durationAnalysis41.createImage(imageProducer46);
        youtubeAnalysis.durationAnalysis durationAnalysis48 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis48.removeAll();
        int int50 = durationAnalysis48.getDefaultCloseOperation();
        boolean boolean51 = durationAnalysis48.isDisplayable();
        boolean boolean52 = durationAnalysis48.isFocusTraversalPolicyProvider();
        java.awt.event.MouseMotionListener mouseMotionListener53 = null;
        durationAnalysis48.addMouseMotionListener(mouseMotionListener53);
        java.awt.event.ComponentListener componentListener55 = null;
        durationAnalysis48.removeComponentListener(componentListener55);
        java.awt.event.FocusEvent.Cause cause57 = null;
        durationAnalysis48.requestFocus(cause57);
        int int59 = durationAnalysis31.checkImage(image47, (java.awt.image.ImageObserver) durationAnalysis48);
        youtubeAnalysis.durationAnalysis durationAnalysis62 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis62.removeAll();
        boolean boolean64 = durationAnalysis62.isOpaque();
        java.awt.Rectangle rectangle65 = null;
        java.awt.Rectangle rectangle66 = durationAnalysis62.getBounds(rectangle65);
        java.awt.ComponentOrientation componentOrientation67 = durationAnalysis62.getComponentOrientation();
        durationAnalysis62.setIgnoreRepaint(true);
        int int70 = durationAnalysis0.checkImage(image47, (int) (byte) 10, (int) (byte) -1, (java.awt.image.ImageObserver) durationAnalysis62);
        java.awt.event.InputMethodListener inputMethodListener71 = null;
        durationAnalysis62.removeInputMethodListener(inputMethodListener71);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(component44);
        org.junit.Assert.assertNotNull(image47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(rectangle66);
        org.junit.Assert.assertNotNull(componentOrientation67);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isOpaque();
        java.awt.Rectangle rectangle3 = null;
        java.awt.Rectangle rectangle4 = durationAnalysis0.getBounds(rectangle3);
        int int5 = durationAnalysis0.getX();
        boolean boolean6 = durationAnalysis0.requestFocusInWindow();
        durationAnalysis0.setFocusCycleRoot(true);
        float float9 = durationAnalysis0.getAlignmentY();
        youtubeAnalysis.durationAnalysis durationAnalysis10 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis10.removeAll();
        int int12 = durationAnalysis10.getDefaultCloseOperation();
        boolean boolean13 = durationAnalysis10.isMinimumSizeSet();
        java.awt.Image image14 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar16 = null;
        durationAnalysis15.setJMenuBar(jMenuBar16);
        boolean boolean18 = durationAnalysis10.prepareImage(image14, (java.awt.image.ImageObserver) durationAnalysis15);
        durationAnalysis10.setLocation((int) (short) 0, 3);
        int int22 = durationAnalysis10.getX();
        java.awt.event.ComponentListener componentListener23 = null;
        durationAnalysis10.addComponentListener(componentListener23);
        youtubeAnalysis.durationAnalysis durationAnalysis25 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image26 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis29 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis29.removeAll();
        boolean boolean31 = durationAnalysis25.prepareImage(image26, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis29);
        java.awt.Event event32 = null;
        boolean boolean35 = durationAnalysis25.mouseUp(event32, 10, 10);
        durationAnalysis10.remove((java.awt.Component) durationAnalysis25);
        durationAnalysis10.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane41 = durationAnalysis10.getRootPane();
        java.awt.ComponentOrientation componentOrientation42 = durationAnalysis10.getComponentOrientation();
        youtubeAnalysis.durationAnalysis durationAnalysis43 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis43.removeAll();
        boolean boolean45 = durationAnalysis43.isOpaque();
        durationAnalysis43.firePropertyChange("", (byte) -1, (byte) 1);
        java.lang.Object obj50 = durationAnalysis43.getTreeLock();
        java.awt.event.FocusListener[] focusListenerArray51 = durationAnalysis43.getFocusListeners();
        java.awt.image.ImageProducer imageProducer52 = null;
        java.awt.Image image53 = durationAnalysis43.createImage(imageProducer52);
        boolean boolean59 = durationAnalysis10.imageUpdate(image53, (int) (byte) 1, 2, 9, 800, 3);
        boolean boolean65 = durationAnalysis0.imageUpdate(image53, 800, (int) (short) 1, 0, 6, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(rectangle4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jRootPane41);
        org.junit.Assert.assertNotNull(componentOrientation42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertNotNull(focusListenerArray51);
        org.junit.Assert.assertNotNull(image53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Event event4 = null;
        java.lang.Object obj5 = null;
        boolean boolean6 = durationAnalysis0.gotFocus(event4, obj5);
        java.awt.event.HierarchyListener hierarchyListener7 = null;
        durationAnalysis0.addHierarchyListener(hierarchyListener7);
        java.awt.image.VolatileImage volatileImage11 = durationAnalysis0.createVolatileImage((int) (byte) 1, (int) (short) -1);
        javax.swing.TransferHandler transferHandler12 = durationAnalysis0.getTransferHandler();
        java.awt.Toolkit toolkit13 = durationAnalysis0.getToolkit();
        java.awt.FocusTraversalPolicy focusTraversalPolicy14 = durationAnalysis0.getFocusTraversalPolicy();
        java.awt.event.WindowListener windowListener15 = null;
        durationAnalysis0.addWindowListener(windowListener15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(volatileImage11);
        org.junit.Assert.assertNull(transferHandler12);
        org.junit.Assert.assertNotNull(toolkit13);
        org.junit.Assert.assertNotNull(focusTraversalPolicy14);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isOpaque();
        durationAnalysis0.firePropertyChange("", (byte) -1, (byte) 1);
        durationAnalysis0.setSize(32, 0);
        java.awt.Component component12 = durationAnalysis0.locate(3, (int) '#');
        java.awt.BufferCapabilities bufferCapabilities14 = null;
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis0.createBufferStrategy((int) (short) -1, bufferCapabilities14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Number of buffers must be at least 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(component12);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        durationAnalysis0.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane31 = durationAnalysis0.getRootPane();
        java.lang.String str32 = jRootPane31.getName();
        java.awt.Component[] componentArray33 = jRootPane31.getComponents();
        java.awt.Event event34 = null;
        boolean boolean36 = jRootPane31.keyUp(event34, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jRootPane31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(componentArray33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        youtubeAnalysis.durationAnalysis durationAnalysis11 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis15.removeAll();
        boolean boolean17 = durationAnalysis11.prepareImage(image12, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis15);
        durationAnalysis15.revalidate();
        boolean boolean19 = durationAnalysis0.isFocusCycleRoot((java.awt.Container) durationAnalysis15);
        durationAnalysis15.doLayout();
        java.awt.event.KeyListener[] keyListenerArray21 = durationAnalysis15.getKeyListeners();
        java.awt.Graphics graphics22 = durationAnalysis15.getGraphics();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(keyListenerArray21);
        org.junit.Assert.assertNull(graphics22);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isForegroundSet();
        java.lang.String str3 = durationAnalysis0.toString();
        java.awt.Event event4 = null;
        boolean boolean7 = durationAnalysis0.mouseUp(event4, (int) (byte) 100, (int) (short) 100);
        durationAnalysis0.setCursor((int) (byte) 10);
        java.awt.Rectangle rectangle10 = null;
        durationAnalysis0.setMaximizedBounds(rectangle10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "youtubeAnalysis.durationAnalysis[frame108,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str3, "youtubeAnalysis.durationAnalysis[frame108,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isOpaque();
        durationAnalysis0.firePropertyChange("", (byte) -1, (byte) 1);
        java.lang.Object obj7 = durationAnalysis0.getTreeLock();
        int int8 = durationAnalysis0.getComponentCount();
        boolean boolean9 = durationAnalysis0.isResizable();
        java.awt.event.FocusEvent.Cause cause10 = null;
        durationAnalysis0.requestFocus(cause10);
        java.awt.Image image12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis13 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis13.removeAll();
        int int15 = durationAnalysis13.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext16 = durationAnalysis13.getInputContext();
        boolean boolean17 = durationAnalysis0.prepareImage(image12, (java.awt.image.ImageObserver) durationAnalysis13);
        durationAnalysis13.firePropertyChange("youtubeAnalysis.durationAnalysis[frame3,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", '#', '#');
        boolean boolean22 = durationAnalysis13.isFocusTraversalPolicySet();
        durationAnalysis13.enableInputMethods(false);
        java.awt.event.WindowFocusListener windowFocusListener25 = null;
        durationAnalysis13.addWindowFocusListener(windowFocusListener25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(inputContext16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        int int13 = durationAnalysis0.getComponentCount();
        int int14 = durationAnalysis0.getComponentCount();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        durationAnalysis0.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane31 = durationAnalysis0.getRootPane();
        jRootPane31.setIgnoreRepaint(false);
        java.awt.Dimension dimension34 = jRootPane31.getMinimumSize();
        youtubeAnalysis.durationAnalysis durationAnalysis35 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis35.removeAll();
        java.awt.Graphics graphics37 = null;
        durationAnalysis35.paintComponents(graphics37);
        // The following exception was thrown during execution in test generation
        try {
            jRootPane31.setComponentZOrder((java.awt.Component) durationAnalysis35, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jRootPane31);
        org.junit.Assert.assertNotNull(dimension34);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isOpaque();
        java.awt.Rectangle rectangle3 = null;
        java.awt.Rectangle rectangle4 = durationAnalysis0.getBounds(rectangle3);
        java.awt.Component component5 = durationAnalysis0.getGlassPane();
        java.awt.Event event6 = null;
        boolean boolean9 = component5.mouseUp(event6, 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(rectangle4);
        org.junit.Assert.assertNotNull(component5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        java.awt.MenuBar menuBar2 = null;
        durationAnalysis0.setMenuBar(menuBar2);
        durationAnalysis0.nextFocus();
        java.awt.Graphics graphics5 = null;
        durationAnalysis0.paint(graphics5);
        boolean boolean7 = durationAnalysis0.isAlwaysOnTop();
        boolean boolean8 = durationAnalysis0.isFocusTraversalPolicySet();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        java.awt.MenuBar menuBar2 = null;
        durationAnalysis0.setMenuBar(menuBar2);
        durationAnalysis0.nextFocus();
        java.awt.event.MouseListener mouseListener5 = null;
        durationAnalysis0.removeMouseListener(mouseListener5);
        java.util.Locale locale7 = durationAnalysis0.getLocale();
        java.awt.GraphicsConfiguration graphicsConfiguration8 = durationAnalysis0.getGraphicsConfiguration();
        java.lang.String str9 = durationAnalysis0.getName();
        youtubeAnalysis.durationAnalysis durationAnalysis10 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image11 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis14 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis14.removeAll();
        boolean boolean16 = durationAnalysis10.prepareImage(image11, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis14);
        java.awt.Event event17 = null;
        boolean boolean20 = durationAnalysis10.mouseUp(event17, 10, 10);
        boolean boolean21 = durationAnalysis10.isEnabled();
        boolean boolean22 = durationAnalysis10.getFocusableWindowState();
        java.awt.event.HierarchyListener[] hierarchyListenerArray23 = durationAnalysis10.getHierarchyListeners();
        java.awt.Graphics graphics24 = durationAnalysis10.getGraphics();
        int int25 = durationAnalysis10.getX();
        java.awt.event.InputMethodListener inputMethodListener26 = null;
        durationAnalysis10.addInputMethodListener(inputMethodListener26);
        youtubeAnalysis.durationAnalysis durationAnalysis28 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis28.removeAll();
        int int30 = durationAnalysis28.getDefaultCloseOperation();
        boolean boolean31 = durationAnalysis28.isMinimumSizeSet();
        java.awt.Image image32 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis33 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar34 = null;
        durationAnalysis33.setJMenuBar(jMenuBar34);
        boolean boolean36 = durationAnalysis28.prepareImage(image32, (java.awt.image.ImageObserver) durationAnalysis33);
        durationAnalysis28.setLocation((int) (short) 0, 3);
        int int40 = durationAnalysis28.getX();
        java.awt.event.ComponentListener componentListener41 = null;
        durationAnalysis28.addComponentListener(componentListener41);
        youtubeAnalysis.durationAnalysis durationAnalysis43 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image44 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis47 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis47.removeAll();
        boolean boolean49 = durationAnalysis43.prepareImage(image44, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis47);
        java.awt.Event event50 = null;
        boolean boolean53 = durationAnalysis43.mouseUp(event50, 10, 10);
        durationAnalysis28.remove((java.awt.Component) durationAnalysis43);
        durationAnalysis28.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane59 = durationAnalysis28.getRootPane();
        jRootPane59.setIgnoreRepaint(false);
        boolean boolean62 = jRootPane59.isValid();
        java.awt.LayoutManager layoutManager63 = jRootPane59.getLayout();
        durationAnalysis10.setLayout(layoutManager63);
        durationAnalysis0.setLayout(layoutManager63);
        java.util.ResourceBundle resourceBundle66 = null;
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis0.applyResourceBundle(resourceBundle66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ResourceBundle.getLocale()\" because \"bdl\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_IN");
        org.junit.Assert.assertNotNull(graphicsConfiguration8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "frame109" + "'", str9, "frame109");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(hierarchyListenerArray23);
        org.junit.Assert.assertNull(graphics24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jRootPane59);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(layoutManager63);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isAutoRequestFocus();
        java.awt.Component component3 = durationAnalysis0.getMostRecentFocusOwner();
        durationAnalysis0.pack();
        java.awt.image.ImageProducer imageProducer5 = null;
        java.awt.Image image6 = durationAnalysis0.createImage(imageProducer5);
        durationAnalysis0.setEnabled(true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(component3);
        org.junit.Assert.assertNotNull(image6);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        durationAnalysis0.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane31 = durationAnalysis0.getRootPane();
        java.lang.String str32 = jRootPane31.getName();
        java.awt.event.InputMethodListener[] inputMethodListenerArray33 = jRootPane31.getInputMethodListeners();
        java.awt.Event event34 = null;
        boolean boolean37 = jRootPane31.mouseDown(event34, (int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jRootPane31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(inputMethodListenerArray33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        java.beans.PropertyChangeListener propertyChangeListener27 = null;
        durationAnalysis0.addPropertyChangeListener(propertyChangeListener27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext3 = durationAnalysis0.getInputContext();
        durationAnalysis0.firePropertyChange("hi!", (short) 10, (short) 1);
        durationAnalysis0.removeAll();
        java.awt.Container container9 = durationAnalysis0.getParent();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(inputContext3);
        org.junit.Assert.assertNull(container9);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        int int11 = durationAnalysis0.getState();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        durationAnalysis0.addPropertyChangeListener("youtubeAnalysis.durationAnalysis[frame3,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", propertyChangeListener13);
        java.awt.image.BufferStrategy bufferStrategy15 = durationAnalysis0.getBufferStrategy();
        youtubeAnalysis.durationAnalysis durationAnalysis16 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis16.removeAll();
        int int18 = durationAnalysis16.getDefaultCloseOperation();
        boolean boolean19 = durationAnalysis16.isMinimumSizeSet();
        java.awt.Image image20 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis21 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar22 = null;
        durationAnalysis21.setJMenuBar(jMenuBar22);
        boolean boolean24 = durationAnalysis16.prepareImage(image20, (java.awt.image.ImageObserver) durationAnalysis21);
        durationAnalysis16.setLocation((int) (short) 0, 3);
        int int28 = durationAnalysis16.getX();
        java.awt.event.ComponentListener componentListener29 = null;
        durationAnalysis16.addComponentListener(componentListener29);
        durationAnalysis16.move((int) (byte) 0, 2);
        java.awt.Dimension dimension34 = durationAnalysis16.minimumSize();
        durationAnalysis0.setMinimumSize(dimension34);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(bufferStrategy15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dimension34);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setFocusTraversalKeysEnabled(true);
        int int11 = durationAnalysis0.countComponents();
        youtubeAnalysis.durationAnalysis durationAnalysis12 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis12.removeAll();
        int int14 = durationAnalysis12.getDefaultCloseOperation();
        boolean boolean15 = durationAnalysis12.isMinimumSizeSet();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis17 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar18 = null;
        durationAnalysis17.setJMenuBar(jMenuBar18);
        boolean boolean20 = durationAnalysis12.prepareImage(image16, (java.awt.image.ImageObserver) durationAnalysis17);
        durationAnalysis12.setLocation((int) (short) 0, 3);
        int int24 = durationAnalysis12.getX();
        java.awt.event.ComponentListener componentListener25 = null;
        durationAnalysis12.addComponentListener(componentListener25);
        durationAnalysis12.move((int) (byte) 0, 2);
        java.awt.Dimension dimension30 = durationAnalysis12.minimumSize();
        durationAnalysis0.setMaximumSize(dimension30);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener32 = null;
        durationAnalysis0.addHierarchyBoundsListener(hierarchyBoundsListener32);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior34 = durationAnalysis0.getBaselineResizeBehavior();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dimension30);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior34 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior34.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        durationAnalysis0.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane31 = durationAnalysis0.getRootPane();
        jRootPane31.setIgnoreRepaint(false);
        java.awt.event.HierarchyListener hierarchyListener34 = null;
        jRootPane31.addHierarchyListener(hierarchyListener34);
        boolean boolean36 = jRootPane31.getIgnoreRepaint();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jRootPane31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isAutoRequestFocus();
        java.awt.Component component3 = durationAnalysis0.getMostRecentFocusOwner();
        durationAnalysis0.pack();
        durationAnalysis0.setName("youtubeAnalysis.durationAnalysis[frame56,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        java.lang.String str7 = durationAnalysis0.getWarningString();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(component3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        boolean boolean11 = durationAnalysis0.isEnabled();
        boolean boolean12 = durationAnalysis0.getFocusableWindowState();
        java.awt.event.HierarchyListener[] hierarchyListenerArray13 = durationAnalysis0.getHierarchyListeners();
        java.awt.Graphics graphics14 = durationAnalysis0.getGraphics();
        java.lang.String str15 = durationAnalysis0.getWarningString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(hierarchyListenerArray13);
        org.junit.Assert.assertNull(graphics14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setFocusTraversalKeysEnabled(true);
        durationAnalysis0.setFocusableWindowState(true);
        java.awt.event.WindowStateListener windowStateListener13 = null;
        durationAnalysis0.removeWindowStateListener(windowStateListener13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext3 = durationAnalysis0.getInputContext();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis5.removeAll();
        java.awt.Graphics graphics7 = null;
        durationAnalysis5.paintComponents(graphics7);
        boolean boolean9 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis5.removeNotify();
        java.awt.image.ImageProducer imageProducer11 = null;
        java.awt.Image image12 = durationAnalysis5.createImage(imageProducer11);
        java.awt.ImageCapabilities imageCapabilities15 = null;
        java.awt.image.VolatileImage volatileImage16 = durationAnalysis5.createVolatileImage(0, 1, imageCapabilities15);
        boolean boolean17 = durationAnalysis5.isFocused();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(inputContext3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(image12);
        org.junit.Assert.assertNull(volatileImage16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        java.awt.Dimension dimension3 = null;
        durationAnalysis0.setMinimumSize(dimension3);
        boolean boolean5 = durationAnalysis0.isCursorSet();
        java.awt.Event event6 = null;
        boolean boolean9 = durationAnalysis0.mouseEnter(event6, 10, (int) (byte) 0);
        java.awt.Graphics graphics10 = null;
        durationAnalysis0.printAll(graphics10);
        java.awt.event.FocusListener[] focusListenerArray12 = durationAnalysis0.getFocusListeners();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(focusListenerArray12);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isForegroundSet();
        java.awt.Component[] componentArray3 = durationAnalysis0.getComponents();
        java.awt.Dimension dimension4 = durationAnalysis0.size();
        java.awt.Event event5 = null;
        boolean boolean8 = durationAnalysis0.mouseEnter(event5, 7, 128);
        int int9 = durationAnalysis0.getX();
        javax.swing.TransferHandler transferHandler10 = durationAnalysis0.getTransferHandler();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(componentArray3);
        org.junit.Assert.assertNotNull(dimension4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNull(transferHandler10);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.event.InputMethodListener[] inputMethodListenerArray7 = durationAnalysis4.getInputMethodListeners();
        java.awt.event.HierarchyListener[] hierarchyListenerArray8 = durationAnalysis4.getHierarchyListeners();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(inputMethodListenerArray7);
        org.junit.Assert.assertNotNull(hierarchyListenerArray8);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        durationAnalysis4.revalidate();
        youtubeAnalysis.durationAnalysis durationAnalysis8 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis8.removeAll();
        int int10 = durationAnalysis8.getDefaultCloseOperation();
        boolean boolean11 = durationAnalysis8.isMinimumSizeSet();
        java.awt.Image image12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis13 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar14 = null;
        durationAnalysis13.setJMenuBar(jMenuBar14);
        boolean boolean16 = durationAnalysis8.prepareImage(image12, (java.awt.image.ImageObserver) durationAnalysis13);
        java.awt.Dimension dimension17 = null;
        java.awt.Dimension dimension18 = durationAnalysis8.getSize(dimension17);
        durationAnalysis4.setMinimumSize(dimension18);
        int int20 = durationAnalysis4.getWidth();
        javax.swing.JRootPane jRootPane21 = durationAnalysis4.getRootPane();
        java.awt.AWTEvent aWTEvent22 = null;
        // The following exception was thrown during execution in test generation
        try {
            jRootPane21.dispatchEvent(aWTEvent22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.AWTEvent.getID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 800 + "'", int20 == 800);
        org.junit.Assert.assertNotNull(jRootPane21);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        java.awt.MenuBar menuBar2 = null;
        durationAnalysis0.setMenuBar(menuBar2);
        boolean boolean4 = durationAnalysis0.isFocusOwner();
        boolean boolean5 = durationAnalysis0.isLightweight();
        youtubeAnalysis.durationAnalysis durationAnalysis6 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image7 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis10 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis10.removeAll();
        boolean boolean12 = durationAnalysis6.prepareImage(image7, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis10);
        java.awt.Event event13 = null;
        boolean boolean16 = durationAnalysis6.mouseUp(event13, 10, 10);
        int int17 = durationAnalysis6.getState();
        java.awt.Image image18 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis21 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis21.removeAll();
        int int23 = durationAnalysis21.getDefaultCloseOperation();
        java.awt.Dimension dimension24 = durationAnalysis21.getMaximumSize();
        int int25 = durationAnalysis6.checkImage(image18, 12, 100, (java.awt.image.ImageObserver) durationAnalysis21);
        youtubeAnalysis.durationAnalysis durationAnalysis26 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis26.removeAll();
        boolean boolean28 = durationAnalysis26.isForegroundSet();
        java.lang.String str29 = durationAnalysis26.toString();
        javax.swing.TransferHandler transferHandler30 = durationAnalysis26.getTransferHandler();
        durationAnalysis26.transferFocusBackward();
        durationAnalysis26.setVisible(true);
        java.awt.Point point34 = durationAnalysis26.location();
        boolean boolean35 = durationAnalysis6.contains(point34);
        java.awt.Point point36 = durationAnalysis0.getLocation(point34);
        javax.swing.TransferHandler transferHandler37 = durationAnalysis0.getTransferHandler();
        durationAnalysis0.repaint((long) 8, 100, (int) '4', 1, 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "youtubeAnalysis.durationAnalysis[frame111,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str29, "youtubeAnalysis.durationAnalysis[frame111,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertNull(transferHandler30);
        org.junit.Assert.assertNotNull(point34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(point36);
        org.junit.Assert.assertNull(transferHandler37);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isDisplayable();
        boolean boolean4 = durationAnalysis0.isFocusTraversalPolicyProvider();
        java.awt.event.MouseMotionListener mouseMotionListener5 = null;
        durationAnalysis0.addMouseMotionListener(mouseMotionListener5);
        java.awt.event.ComponentListener componentListener7 = null;
        durationAnalysis0.removeComponentListener(componentListener7);
        java.awt.event.FocusEvent.Cause cause9 = null;
        durationAnalysis0.requestFocus(cause9);
        java.awt.Container container11 = durationAnalysis0.getContentPane();
        java.awt.Event event12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis13 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis13.removeAll();
        int int15 = durationAnalysis13.getDefaultCloseOperation();
        boolean boolean16 = durationAnalysis13.isMinimumSizeSet();
        java.awt.Image image17 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis18 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar19 = null;
        durationAnalysis18.setJMenuBar(jMenuBar19);
        boolean boolean21 = durationAnalysis13.prepareImage(image17, (java.awt.image.ImageObserver) durationAnalysis18);
        durationAnalysis13.setLocation((int) (short) 0, 3);
        int int25 = durationAnalysis13.getX();
        java.awt.event.ComponentListener componentListener26 = null;
        durationAnalysis13.addComponentListener(componentListener26);
        boolean boolean28 = durationAnalysis13.isMinimumSizeSet();
        boolean boolean29 = durationAnalysis0.action(event12, (java.lang.Object) boolean28);
        durationAnalysis0.move(64, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(container11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        youtubeAnalysis.durationAnalysis durationAnalysis9 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis9.removeAll();
        int int11 = durationAnalysis9.getDefaultCloseOperation();
        boolean boolean12 = durationAnalysis9.isMinimumSizeSet();
        boolean boolean13 = durationAnalysis5.isAncestorOf((java.awt.Component) durationAnalysis9);
        boolean boolean14 = durationAnalysis9.isUndecorated();
        durationAnalysis9.setExtendedState((-1));
        boolean boolean17 = durationAnalysis9.getFocusTraversalKeysEnabled();
        java.awt.Dimension dimension18 = durationAnalysis9.size();
        java.awt.Rectangle rectangle19 = durationAnalysis9.getMaximizedBounds();
        durationAnalysis9.nextFocus();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertNull(rectangle19);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        youtubeAnalysis.durationAnalysis durationAnalysis9 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis9.removeAll();
        int int11 = durationAnalysis9.getDefaultCloseOperation();
        boolean boolean12 = durationAnalysis9.isMinimumSizeSet();
        boolean boolean13 = durationAnalysis5.isAncestorOf((java.awt.Component) durationAnalysis9);
        boolean boolean14 = durationAnalysis9.isUndecorated();
        java.awt.Component[] componentArray15 = durationAnalysis9.getComponents();
        durationAnalysis9.removeNotify();
        java.util.List<java.awt.Image> imageList17 = durationAnalysis9.getIconImages();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(componentArray15);
        org.junit.Assert.assertNotNull(imageList17);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        int int4 = durationAnalysis0.countComponents();
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis5.removeAll();
        int int7 = durationAnalysis5.getDefaultCloseOperation();
        java.awt.Dimension dimension8 = null;
        durationAnalysis5.setMinimumSize(dimension8);
        boolean boolean10 = durationAnalysis5.isCursorSet();
        youtubeAnalysis.durationAnalysis durationAnalysis11 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis11.removeAll();
        int int13 = durationAnalysis11.getDefaultCloseOperation();
        boolean boolean14 = durationAnalysis11.isMinimumSizeSet();
        java.awt.Image image15 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis16 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar17 = null;
        durationAnalysis16.setJMenuBar(jMenuBar17);
        boolean boolean19 = durationAnalysis11.prepareImage(image15, (java.awt.image.ImageObserver) durationAnalysis16);
        java.awt.Dimension dimension20 = null;
        java.awt.Dimension dimension21 = durationAnalysis11.getSize(dimension20);
        durationAnalysis5.setSize(dimension21);
        durationAnalysis0.resize(dimension21);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dimension21);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        java.awt.MenuBar menuBar2 = null;
        durationAnalysis0.setMenuBar(menuBar2);
        durationAnalysis0.nextFocus();
        java.awt.event.MouseListener mouseListener5 = null;
        durationAnalysis0.removeMouseListener(mouseListener5);
        youtubeAnalysis.durationAnalysis durationAnalysis7 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis7.removeAll();
        int int9 = durationAnalysis7.getDefaultCloseOperation();
        boolean boolean10 = durationAnalysis7.isMinimumSizeSet();
        java.awt.Image image11 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis12 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar13 = null;
        durationAnalysis12.setJMenuBar(jMenuBar13);
        boolean boolean15 = durationAnalysis7.prepareImage(image11, (java.awt.image.ImageObserver) durationAnalysis12);
        durationAnalysis7.setLocation((int) (short) 0, 3);
        int int19 = durationAnalysis7.getX();
        java.awt.event.ComponentListener componentListener20 = null;
        durationAnalysis7.addComponentListener(componentListener20);
        youtubeAnalysis.durationAnalysis durationAnalysis22 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image23 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis26 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis26.removeAll();
        boolean boolean28 = durationAnalysis22.prepareImage(image23, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis26);
        java.awt.Event event29 = null;
        boolean boolean32 = durationAnalysis22.mouseUp(event29, 10, 10);
        durationAnalysis7.remove((java.awt.Component) durationAnalysis22);
        durationAnalysis7.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane38 = durationAnalysis7.getRootPane();
        java.lang.String str39 = jRootPane38.getName();
        int int40 = durationAnalysis0.getComponentZOrder((java.awt.Component) jRootPane38);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray41 = durationAnalysis0.getWindowFocusListeners();
        youtubeAnalysis.durationAnalysis durationAnalysis42 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis42.removeAll();
        int int44 = durationAnalysis42.getDefaultCloseOperation();
        boolean boolean45 = durationAnalysis42.isDisplayable();
        java.awt.Dimension dimension46 = durationAnalysis42.getMaximumSize();
        durationAnalysis0.setSize(dimension46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jRootPane38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(windowFocusListenerArray41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dimension46);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        youtubeAnalysis.durationAnalysis durationAnalysis27 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis27.removeAll();
        boolean boolean29 = durationAnalysis27.isForegroundSet();
        java.lang.String str30 = durationAnalysis27.toString();
        javax.swing.TransferHandler transferHandler31 = durationAnalysis27.getTransferHandler();
        durationAnalysis27.transferFocusBackward();
        durationAnalysis27.setVisible(true);
        java.awt.Point point35 = durationAnalysis27.location();
        java.awt.Component component36 = durationAnalysis0.getComponentAt(point35);
        durationAnalysis0.requestFocus();
        java.awt.event.ComponentListener componentListener38 = null;
        durationAnalysis0.removeComponentListener(componentListener38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "youtubeAnalysis.durationAnalysis[frame112,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str30, "youtubeAnalysis.durationAnalysis[frame112,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertNull(transferHandler31);
        org.junit.Assert.assertNotNull(point35);
        org.junit.Assert.assertNotNull(component36);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isDisplayable();
        java.awt.event.FocusListener focusListener4 = null;
        durationAnalysis0.removeFocusListener(focusListener4);
        durationAnalysis0.transferFocusDownCycle();
        java.awt.event.ContainerListener containerListener7 = null;
        durationAnalysis0.addContainerListener(containerListener7);
        java.lang.String str9 = durationAnalysis0.getName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "frame113" + "'", str9, "frame113");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        boolean boolean7 = durationAnalysis0.isFocusableWindow();
        java.awt.Window.Type type8 = durationAnalysis0.getType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + java.awt.Window.Type.NORMAL + "'", type8.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Event event4 = null;
        java.lang.Object obj5 = null;
        boolean boolean6 = durationAnalysis0.gotFocus(event4, obj5);
        java.awt.event.HierarchyListener hierarchyListener7 = null;
        durationAnalysis0.addHierarchyListener(hierarchyListener7);
        java.awt.Graphics graphics9 = null;
        durationAnalysis0.paint(graphics9);
        youtubeAnalysis.durationAnalysis durationAnalysis11 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis15.removeAll();
        boolean boolean17 = durationAnalysis11.prepareImage(image12, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis15);
        durationAnalysis15.revalidate();
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        int int21 = durationAnalysis19.getDefaultCloseOperation();
        boolean boolean22 = durationAnalysis19.isMinimumSizeSet();
        java.awt.Image image23 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis24 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar25 = null;
        durationAnalysis24.setJMenuBar(jMenuBar25);
        boolean boolean27 = durationAnalysis19.prepareImage(image23, (java.awt.image.ImageObserver) durationAnalysis24);
        java.awt.Dimension dimension28 = null;
        java.awt.Dimension dimension29 = durationAnalysis19.getSize(dimension28);
        durationAnalysis15.setMinimumSize(dimension29);
        java.awt.Dimension dimension31 = durationAnalysis0.getSize(dimension29);
        durationAnalysis0.hide();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(dimension29);
        org.junit.Assert.assertNotNull(dimension31);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isOpaque();
        durationAnalysis0.firePropertyChange("", (byte) -1, (byte) 1);
        durationAnalysis0.setSize(32, 0);
        java.awt.Dimension dimension10 = durationAnalysis0.size();
        java.awt.Color color11 = durationAnalysis0.getForeground();
        java.awt.event.MouseMotionListener mouseMotionListener12 = null;
        durationAnalysis0.removeMouseMotionListener(mouseMotionListener12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertNull(color11);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        durationAnalysis0.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane31 = durationAnalysis0.getRootPane();
        java.awt.event.WindowStateListener windowStateListener32 = null;
        durationAnalysis0.removeWindowStateListener(windowStateListener32);
        durationAnalysis0.move((int) (short) 100, 11);
        durationAnalysis0.repaint((long) 0);
        youtubeAnalysis.durationAnalysis durationAnalysis39 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis39.removeAll();
        int int41 = durationAnalysis39.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext42 = durationAnalysis39.getInputContext();
        java.awt.Graphics graphics43 = durationAnalysis39.getGraphics();
        youtubeAnalysis.durationAnalysis durationAnalysis44 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis44.removeAll();
        int int46 = durationAnalysis44.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext47 = durationAnalysis44.getInputContext();
        java.awt.Image image48 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis49 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis49.removeAll();
        java.awt.Graphics graphics51 = null;
        durationAnalysis49.paintComponents(graphics51);
        boolean boolean53 = durationAnalysis44.prepareImage(image48, (java.awt.image.ImageObserver) durationAnalysis49);
        durationAnalysis49.removeNotify();
        java.awt.image.ImageProducer imageProducer55 = null;
        java.awt.Image image56 = durationAnalysis49.createImage(imageProducer55);
        youtubeAnalysis.durationAnalysis durationAnalysis57 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image58 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis61 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis61.removeAll();
        boolean boolean63 = durationAnalysis57.prepareImage(image58, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis61);
        java.awt.Event event64 = null;
        boolean boolean67 = durationAnalysis57.mouseUp(event64, 10, 10);
        boolean boolean68 = durationAnalysis57.isEnabled();
        boolean boolean69 = durationAnalysis57.getFocusableWindowState();
        int int70 = durationAnalysis39.checkImage(image56, (java.awt.image.ImageObserver) durationAnalysis57);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component72 = durationAnalysis0.add((java.awt.Component) durationAnalysis39, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jRootPane31);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertNotNull(inputContext42);
        org.junit.Assert.assertNull(graphics43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertNotNull(inputContext47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(image56);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext3 = durationAnalysis0.getInputContext();
        java.awt.Graphics graphics4 = durationAnalysis0.getGraphics();
        java.awt.Container container5 = durationAnalysis0.getParent();
        durationAnalysis0.dispose();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(inputContext3);
        org.junit.Assert.assertNull(graphics4);
        org.junit.Assert.assertNull(container5);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isForegroundSet();
        youtubeAnalysis.durationAnalysis durationAnalysis3 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis3.removeAll();
        boolean boolean5 = durationAnalysis3.isAutoRequestFocus();
        java.awt.Component component6 = durationAnalysis3.getMostRecentFocusOwner();
        java.awt.event.HierarchyListener hierarchyListener7 = null;
        durationAnalysis3.removeHierarchyListener(hierarchyListener7);
        boolean boolean9 = durationAnalysis3.isResizable();
        durationAnalysis3.setFocusableWindowState(true);
        java.awt.image.BufferStrategy bufferStrategy12 = durationAnalysis3.getBufferStrategy();
        youtubeAnalysis.durationAnalysis durationAnalysis13 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis13.removeAll();
        java.awt.MenuBar menuBar15 = null;
        durationAnalysis13.setMenuBar(menuBar15);
        java.awt.event.FocusListener focusListener17 = null;
        durationAnalysis13.addFocusListener(focusListener17);
        java.awt.Graphics graphics19 = null;
        durationAnalysis13.paint(graphics19);
        boolean boolean21 = durationAnalysis13.isAlwaysOnTop();
        java.awt.Rectangle rectangle22 = durationAnalysis13.getBounds();
        java.awt.Rectangle rectangle23 = durationAnalysis3.getBounds(rectangle22);
        durationAnalysis0.setMixingCutoutShape((java.awt.Shape) rectangle22);
        youtubeAnalysis.durationAnalysis durationAnalysis25 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis25.removeAll();
        int int27 = durationAnalysis25.getDefaultCloseOperation();
        boolean boolean28 = durationAnalysis25.isMinimumSizeSet();
        java.awt.Event event29 = null;
        java.lang.Object obj30 = null;
        boolean boolean31 = durationAnalysis25.gotFocus(event29, obj30);
        java.awt.event.HierarchyListener hierarchyListener32 = null;
        durationAnalysis25.addHierarchyListener(hierarchyListener32);
        java.awt.event.ContainerListener containerListener34 = null;
        durationAnalysis25.addContainerListener(containerListener34);
        int int36 = durationAnalysis0.getComponentZOrder((java.awt.Component) durationAnalysis25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(component6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(bufferStrategy12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(rectangle22);
        org.junit.Assert.assertNotNull(rectangle23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        java.awt.Dimension dimension3 = durationAnalysis0.getMaximumSize();
        durationAnalysis0.move(500, (int) 'a');
        java.awt.AWTEvent aWTEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis0.dispatchEvent(aWTEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.AWTEvent.getID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(dimension3);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        youtubeAnalysis.durationAnalysis durationAnalysis11 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis15.removeAll();
        boolean boolean17 = durationAnalysis11.prepareImage(image12, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis15);
        durationAnalysis15.revalidate();
        boolean boolean19 = durationAnalysis0.isFocusCycleRoot((java.awt.Container) durationAnalysis15);
        java.lang.Object obj20 = durationAnalysis15.getTreeLock();
        durationAnalysis15.setAutoRequestFocus(false);
        java.lang.Object obj23 = durationAnalysis15.getTreeLock();
        durationAnalysis15.setCursor(11);
        java.awt.Cursor cursor26 = durationAnalysis15.getCursor();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(cursor26);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isForegroundSet();
        java.awt.Component[] componentArray3 = durationAnalysis0.getComponents();
        durationAnalysis0.show();
        java.awt.GraphicsConfiguration graphicsConfiguration5 = durationAnalysis0.getGraphicsConfiguration();
        int int6 = durationAnalysis0.getComponentCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(componentArray3);
        org.junit.Assert.assertNotNull(graphicsConfiguration5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        int int11 = durationAnalysis0.getState();
        java.awt.Image image12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis15.removeAll();
        int int17 = durationAnalysis15.getDefaultCloseOperation();
        java.awt.Dimension dimension18 = durationAnalysis15.getMaximumSize();
        int int19 = durationAnalysis0.checkImage(image12, 12, 100, (java.awt.image.ImageObserver) durationAnalysis15);
        youtubeAnalysis.durationAnalysis durationAnalysis20 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis20.removeAll();
        boolean boolean22 = durationAnalysis20.isForegroundSet();
        java.lang.String str23 = durationAnalysis20.toString();
        javax.swing.TransferHandler transferHandler24 = durationAnalysis20.getTransferHandler();
        durationAnalysis20.transferFocusBackward();
        durationAnalysis20.setVisible(true);
        java.awt.Point point28 = durationAnalysis20.location();
        boolean boolean29 = durationAnalysis0.contains(point28);
        java.awt.Point point31 = durationAnalysis0.getMousePosition(true);
        durationAnalysis0.enable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "youtubeAnalysis.durationAnalysis[frame114,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str23, "youtubeAnalysis.durationAnalysis[frame114,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertNull(transferHandler24);
        org.junit.Assert.assertNotNull(point28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(point31);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        java.awt.Dimension dimension3 = null;
        durationAnalysis0.setMinimumSize(dimension3);
        durationAnalysis0.setLocationByPlatform(false);
        java.awt.Event event7 = null;
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis0.deliverEvent(event7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        javax.swing.TransferHandler transferHandler12 = durationAnalysis0.getTransferHandler();
        youtubeAnalysis.durationAnalysis durationAnalysis13 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis13.removeAll();
        int int15 = durationAnalysis13.getDefaultCloseOperation();
        boolean boolean16 = durationAnalysis13.isMinimumSizeSet();
        java.awt.Event event17 = null;
        java.lang.Object obj18 = null;
        boolean boolean19 = durationAnalysis13.gotFocus(event17, obj18);
        durationAnalysis13.addNotify();
        youtubeAnalysis.durationAnalysis durationAnalysis21 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis21.removeAll();
        boolean boolean23 = durationAnalysis21.isAutoRequestFocus();
        java.awt.Component component24 = durationAnalysis21.getMostRecentFocusOwner();
        durationAnalysis21.pack();
        durationAnalysis21.setName("youtubeAnalysis.durationAnalysis[frame56,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis0.add((java.awt.Component) durationAnalysis13, (java.lang.Object) durationAnalysis21, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(transferHandler12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(component24);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isForegroundSet();
        java.awt.Component[] componentArray3 = durationAnalysis0.getComponents();
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis4.isAutoRequestFocus();
        boolean boolean7 = durationAnalysis0.isAncestorOf((java.awt.Component) durationAnalysis4);
        youtubeAnalysis.durationAnalysis durationAnalysis8 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis8.removeAll();
        boolean boolean10 = durationAnalysis8.isAutoRequestFocus();
        java.awt.Component component11 = durationAnalysis8.getMostRecentFocusOwner();
        java.awt.event.HierarchyListener hierarchyListener12 = null;
        durationAnalysis8.removeHierarchyListener(hierarchyListener12);
        boolean boolean14 = durationAnalysis8.isResizable();
        durationAnalysis8.setFocusableWindowState(true);
        java.awt.image.BufferStrategy bufferStrategy17 = durationAnalysis8.getBufferStrategy();
        java.awt.event.MouseMotionListener mouseMotionListener18 = null;
        durationAnalysis8.addMouseMotionListener(mouseMotionListener18);
        youtubeAnalysis.durationAnalysis durationAnalysis20 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis20.removeAll();
        java.awt.MenuBar menuBar22 = null;
        durationAnalysis20.setMenuBar(menuBar22);
        java.awt.LayoutManager layoutManager24 = null;
        durationAnalysis20.setLayout(layoutManager24);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray26 = durationAnalysis20.getMouseMotionListeners();
        java.awt.event.KeyListener[] keyListenerArray27 = durationAnalysis20.getKeyListeners();
        java.awt.Container container28 = durationAnalysis20.getContentPane();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray29 = container28.getHierarchyBoundsListeners();
        java.awt.ComponentOrientation componentOrientation30 = container28.getComponentOrientation();
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis0.add((java.awt.Component) durationAnalysis8, (java.lang.Object) container28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(componentArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(component11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(bufferStrategy17);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray26);
        org.junit.Assert.assertNotNull(keyListenerArray27);
        org.junit.Assert.assertNotNull(container28);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray29);
        org.junit.Assert.assertNotNull(componentOrientation30);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        youtubeAnalysis.durationAnalysis durationAnalysis9 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis9.removeAll();
        int int11 = durationAnalysis9.getDefaultCloseOperation();
        boolean boolean12 = durationAnalysis9.isMinimumSizeSet();
        boolean boolean13 = durationAnalysis5.isAncestorOf((java.awt.Component) durationAnalysis9);
        boolean boolean14 = durationAnalysis9.isUndecorated();
        durationAnalysis9.setExtendedState((-1));
        boolean boolean17 = durationAnalysis9.getFocusTraversalKeysEnabled();
        java.awt.Component component20 = durationAnalysis9.locate(12, (int) (byte) -1);
        javax.swing.TransferHandler transferHandler21 = durationAnalysis9.getTransferHandler();
        boolean boolean22 = durationAnalysis9.isFocusOwner();
        boolean boolean23 = durationAnalysis9.isLocationByPlatform();
        java.awt.Component component26 = durationAnalysis9.getComponentAt((int) '4', 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(component20);
        org.junit.Assert.assertNull(transferHandler21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(component26);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isForegroundSet();
        java.awt.Component[] componentArray3 = durationAnalysis0.getComponents();
        java.awt.image.VolatileImage volatileImage6 = durationAnalysis0.createVolatileImage(128, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis0.applyResourceBundle("youtubeAnalysis.durationAnalysis[frame86,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Can't find bundle for base name youtubeAnalysis.durationAnalysis[frame86,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true], locale en_IN");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(componentArray3);
        org.junit.Assert.assertNull(volatileImage6);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        java.awt.Dimension dimension3 = null;
        durationAnalysis0.setMinimumSize(dimension3);
        boolean boolean5 = durationAnalysis0.isCursorSet();
        java.awt.Event event6 = null;
        boolean boolean9 = durationAnalysis0.mouseEnter(event6, 10, (int) (byte) 0);
        boolean boolean10 = durationAnalysis0.isFocusTraversalPolicyProvider();
        java.awt.event.HierarchyListener hierarchyListener11 = null;
        durationAnalysis0.removeHierarchyListener(hierarchyListener11);
        durationAnalysis0.transferFocusUpCycle();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isForegroundSet();
        java.awt.Component[] componentArray3 = durationAnalysis0.getComponents();
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis4.isAutoRequestFocus();
        boolean boolean7 = durationAnalysis0.isAncestorOf((java.awt.Component) durationAnalysis4);
        boolean boolean8 = durationAnalysis4.isUndecorated();
        durationAnalysis4.invalidate();
        java.awt.Dialog.ModalExclusionType modalExclusionType10 = durationAnalysis4.getModalExclusionType();
        int int11 = durationAnalysis4.getExtendedState();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(componentArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + modalExclusionType10 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType10.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        boolean boolean11 = durationAnalysis0.isValid();
        boolean boolean12 = durationAnalysis0.isDoubleBuffered();
        durationAnalysis0.hide();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        java.awt.MenuBar menuBar2 = null;
        durationAnalysis0.setMenuBar(menuBar2);
        java.awt.LayoutManager layoutManager4 = null;
        durationAnalysis0.setLayout(layoutManager4);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray6 = durationAnalysis0.getMouseMotionListeners();
        java.awt.event.KeyListener[] keyListenerArray7 = durationAnalysis0.getKeyListeners();
        java.awt.Container container8 = durationAnalysis0.getContentPane();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray9 = container8.getHierarchyBoundsListeners();
        youtubeAnalysis.durationAnalysis durationAnalysis10 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis10.removeAll();
        int int12 = durationAnalysis10.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext13 = durationAnalysis10.getInputContext();
        java.awt.Graphics graphics14 = durationAnalysis10.getGraphics();
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis15.removeAll();
        int int17 = durationAnalysis15.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext18 = durationAnalysis15.getInputContext();
        java.awt.Image image19 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis20 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis20.removeAll();
        java.awt.Graphics graphics22 = null;
        durationAnalysis20.paintComponents(graphics22);
        boolean boolean24 = durationAnalysis15.prepareImage(image19, (java.awt.image.ImageObserver) durationAnalysis20);
        durationAnalysis20.removeNotify();
        java.awt.image.ImageProducer imageProducer26 = null;
        java.awt.Image image27 = durationAnalysis20.createImage(imageProducer26);
        youtubeAnalysis.durationAnalysis durationAnalysis28 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image29 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis32 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis32.removeAll();
        boolean boolean34 = durationAnalysis28.prepareImage(image29, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis32);
        java.awt.Event event35 = null;
        boolean boolean38 = durationAnalysis28.mouseUp(event35, 10, 10);
        boolean boolean39 = durationAnalysis28.isEnabled();
        boolean boolean40 = durationAnalysis28.getFocusableWindowState();
        int int41 = durationAnalysis10.checkImage(image27, (java.awt.image.ImageObserver) durationAnalysis28);
        youtubeAnalysis.durationAnalysis durationAnalysis42 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis42.removeAll();
        int int44 = durationAnalysis42.getDefaultCloseOperation();
        boolean boolean45 = durationAnalysis42.isMinimumSizeSet();
        java.awt.Event event46 = null;
        java.lang.Object obj47 = null;
        boolean boolean48 = durationAnalysis42.gotFocus(event46, obj47);
        java.awt.event.HierarchyListener hierarchyListener49 = null;
        durationAnalysis42.addHierarchyListener(hierarchyListener49);
        youtubeAnalysis.durationAnalysis durationAnalysis51 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image52 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis55 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis55.removeAll();
        boolean boolean57 = durationAnalysis51.prepareImage(image52, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis55);
        java.awt.Event event58 = null;
        boolean boolean61 = durationAnalysis51.mouseUp(event58, 10, 10);
        youtubeAnalysis.durationAnalysis durationAnalysis62 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image63 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis66 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis66.removeAll();
        boolean boolean68 = durationAnalysis62.prepareImage(image63, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis66);
        durationAnalysis66.revalidate();
        boolean boolean70 = durationAnalysis51.isFocusCycleRoot((java.awt.Container) durationAnalysis66);
        durationAnalysis42.setLocationRelativeTo((java.awt.Component) durationAnalysis66);
        durationAnalysis66.firePropertyChange("youtubeAnalysis.durationAnalysis[frame18,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (long) 6, (long) (byte) 1);
        int int76 = container8.checkImage(image27, (java.awt.image.ImageObserver) durationAnalysis66);
        boolean boolean77 = container8.isFontSet();
        org.junit.Assert.assertNotNull(mouseMotionListenerArray6);
        org.junit.Assert.assertNotNull(keyListenerArray7);
        org.junit.Assert.assertNotNull(container8);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertNull(graphics14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(inputContext18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(image27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        durationAnalysis0.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane31 = durationAnalysis0.getRootPane();
        java.awt.Color color32 = null;
        durationAnalysis0.setForeground(color32);
        durationAnalysis0.transferFocusUpCycle();
        java.awt.Component component35 = durationAnalysis0.getMostRecentFocusOwner();
        java.awt.Rectangle rectangle36 = durationAnalysis0.getBounds();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jRootPane31);
        org.junit.Assert.assertNotNull(component35);
        org.junit.Assert.assertNotNull(rectangle36);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        java.awt.MenuBar menuBar2 = null;
        durationAnalysis0.setMenuBar(menuBar2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
        durationAnalysis0.removeHierarchyBoundsListener(hierarchyBoundsListener4);
        youtubeAnalysis.durationAnalysis durationAnalysis6 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis6.removeAll();
        boolean boolean8 = durationAnalysis6.isAutoRequestFocus();
        java.awt.Component component9 = durationAnalysis6.getMostRecentFocusOwner();
        java.awt.event.HierarchyListener hierarchyListener10 = null;
        durationAnalysis6.removeHierarchyListener(hierarchyListener10);
        boolean boolean12 = durationAnalysis6.isResizable();
        durationAnalysis6.setFocusableWindowState(true);
        boolean boolean15 = durationAnalysis0.isFocusCycleRoot((java.awt.Container) durationAnalysis6);
        java.awt.Rectangle rectangle16 = durationAnalysis0.bounds();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray18 = durationAnalysis0.getPropertyChangeListeners("");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(rectangle16);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray18);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        boolean boolean11 = durationAnalysis0.isEnabled();
        java.io.PrintWriter printWriter12 = null;
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis0.list(printWriter12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        boolean boolean11 = durationAnalysis0.isEnabled();
        boolean boolean12 = durationAnalysis0.getFocusableWindowState();
        java.awt.image.VolatileImage volatileImage15 = durationAnalysis0.createVolatileImage(10, (int) (short) 10);
        java.awt.ImageCapabilities imageCapabilities18 = null;
        java.awt.image.VolatileImage volatileImage19 = durationAnalysis0.createVolatileImage(6, 11, imageCapabilities18);
        boolean boolean20 = durationAnalysis0.isFocusTraversable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(volatileImage15);
        org.junit.Assert.assertNull(volatileImage19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        boolean boolean0 = javax.swing.JFrame.isDefaultLookAndFeelDecorated();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Event event4 = null;
        java.lang.Object obj5 = null;
        boolean boolean6 = durationAnalysis0.gotFocus(event4, obj5);
        java.awt.event.HierarchyListener hierarchyListener7 = null;
        durationAnalysis0.addHierarchyListener(hierarchyListener7);
        java.awt.Dimension dimension9 = durationAnalysis0.minimumSize();
        boolean boolean10 = durationAnalysis0.getFocusableWindowState();
        durationAnalysis0.toBack();
        durationAnalysis0.transferFocusBackward();
        int int13 = durationAnalysis0.getX();
        boolean boolean14 = durationAnalysis0.isUndecorated();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray15 = durationAnalysis0.getHierarchyBoundsListeners();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray15);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        java.awt.MenuBar menuBar2 = null;
        durationAnalysis0.setMenuBar(menuBar2);
        java.awt.LayoutManager layoutManager4 = null;
        durationAnalysis0.setLayout(layoutManager4);
        boolean boolean6 = durationAnalysis0.isMaximumSizeSet();
        youtubeAnalysis.durationAnalysis durationAnalysis7 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis7.removeAll();
        java.awt.MenuBar menuBar9 = null;
        durationAnalysis7.setMenuBar(menuBar9);
        boolean boolean11 = durationAnalysis7.isFocusOwner();
        boolean boolean12 = durationAnalysis7.isLightweight();
        youtubeAnalysis.durationAnalysis durationAnalysis13 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image14 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis17 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis17.removeAll();
        boolean boolean19 = durationAnalysis13.prepareImage(image14, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis17);
        java.awt.Event event20 = null;
        boolean boolean23 = durationAnalysis13.mouseUp(event20, 10, 10);
        int int24 = durationAnalysis13.getState();
        java.awt.Image image25 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis28 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis28.removeAll();
        int int30 = durationAnalysis28.getDefaultCloseOperation();
        java.awt.Dimension dimension31 = durationAnalysis28.getMaximumSize();
        int int32 = durationAnalysis13.checkImage(image25, 12, 100, (java.awt.image.ImageObserver) durationAnalysis28);
        youtubeAnalysis.durationAnalysis durationAnalysis33 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis33.removeAll();
        boolean boolean35 = durationAnalysis33.isForegroundSet();
        java.lang.String str36 = durationAnalysis33.toString();
        javax.swing.TransferHandler transferHandler37 = durationAnalysis33.getTransferHandler();
        durationAnalysis33.transferFocusBackward();
        durationAnalysis33.setVisible(true);
        java.awt.Point point41 = durationAnalysis33.location();
        boolean boolean42 = durationAnalysis13.contains(point41);
        java.awt.Point point43 = durationAnalysis7.getLocation(point41);
        java.awt.Component component44 = durationAnalysis0.getComponentAt(point43);
        java.awt.Graphics graphics45 = null;
        durationAnalysis0.printAll(graphics45);
        java.awt.Component component47 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis48 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis48.removeAll();
        int int50 = durationAnalysis48.getDefaultCloseOperation();
        java.awt.Dimension dimension51 = null;
        durationAnalysis48.setMinimumSize(dimension51);
        boolean boolean53 = durationAnalysis48.isCursorSet();
        java.awt.Event event54 = null;
        boolean boolean57 = durationAnalysis48.mouseEnter(event54, 10, (int) (byte) 0);
        java.awt.Graphics graphics58 = null;
        durationAnalysis48.printAll(graphics58);
        java.awt.Component component62 = durationAnalysis48.findComponentAt((int) (short) 10, 6);
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis0.add(component47, (java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"parent\" because \"comp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(dimension31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "youtubeAnalysis.durationAnalysis[frame116,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str36, "youtubeAnalysis.durationAnalysis[frame116,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertNull(transferHandler37);
        org.junit.Assert.assertNotNull(point41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(point43);
        org.junit.Assert.assertNotNull(component44);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 3 + "'", int50 == 3);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(component62);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        youtubeAnalysis.durationAnalysis durationAnalysis11 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis15.removeAll();
        boolean boolean17 = durationAnalysis11.prepareImage(image12, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis15);
        durationAnalysis15.revalidate();
        boolean boolean19 = durationAnalysis0.isFocusCycleRoot((java.awt.Container) durationAnalysis15);
        java.awt.Image image20 = durationAnalysis15.getIconImage();
        boolean boolean21 = durationAnalysis15.isDoubleBuffered();
        durationAnalysis15.repaint();
        java.awt.event.FocusEvent.Cause cause23 = null;
        durationAnalysis15.requestFocus(cause23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(image20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        durationAnalysis0.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane31 = durationAnalysis0.getRootPane();
        java.awt.ComponentOrientation componentOrientation32 = durationAnalysis0.getComponentOrientation();
        int int33 = durationAnalysis0.getHeight();
        java.awt.event.WindowStateListener windowStateListener34 = null;
        durationAnalysis0.addWindowStateListener(windowStateListener34);
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis0.applyResourceBundle("youtubeAnalysis.durationAnalysis[frame36,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Can't find bundle for base name youtubeAnalysis.durationAnalysis[frame36,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true], locale en_IN");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jRootPane31);
        org.junit.Assert.assertNotNull(componentOrientation32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 500 + "'", int33 == 500);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        durationAnalysis0.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane31 = durationAnalysis0.getRootPane();
        java.awt.Color color32 = null;
        durationAnalysis0.setForeground(color32);
        java.awt.Insets insets34 = durationAnalysis0.insets();
        youtubeAnalysis.durationAnalysis durationAnalysis35 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image36 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis39 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis39.removeAll();
        boolean boolean41 = durationAnalysis35.prepareImage(image36, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis39);
        java.awt.Event event42 = null;
        boolean boolean45 = durationAnalysis35.mouseUp(event42, 10, 10);
        int int46 = durationAnalysis35.getState();
        java.awt.Image image47 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis50 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis50.removeAll();
        int int52 = durationAnalysis50.getDefaultCloseOperation();
        java.awt.Dimension dimension53 = durationAnalysis50.getMaximumSize();
        int int54 = durationAnalysis35.checkImage(image47, 12, 100, (java.awt.image.ImageObserver) durationAnalysis50);
        youtubeAnalysis.durationAnalysis durationAnalysis55 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis55.removeAll();
        boolean boolean57 = durationAnalysis55.isForegroundSet();
        java.lang.String str58 = durationAnalysis55.toString();
        javax.swing.TransferHandler transferHandler59 = durationAnalysis55.getTransferHandler();
        durationAnalysis55.transferFocusBackward();
        durationAnalysis55.setVisible(true);
        java.awt.Point point63 = durationAnalysis55.location();
        boolean boolean64 = durationAnalysis35.contains(point63);
        java.awt.Component component65 = durationAnalysis0.getComponentAt(point63);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jRootPane31);
        org.junit.Assert.assertNotNull(insets34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 3 + "'", int52 == 3);
        org.junit.Assert.assertNotNull(dimension53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 32 + "'", int54 == 32);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "youtubeAnalysis.durationAnalysis[frame117,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str58, "youtubeAnalysis.durationAnalysis[frame117,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertNull(transferHandler59);
        org.junit.Assert.assertNotNull(point63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(component65);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        java.awt.MenuBar menuBar2 = null;
        durationAnalysis0.setMenuBar(menuBar2);
        java.awt.LayoutManager layoutManager4 = null;
        durationAnalysis0.setLayout(layoutManager4);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray6 = durationAnalysis0.getMouseMotionListeners();
        java.awt.event.KeyListener[] keyListenerArray7 = durationAnalysis0.getKeyListeners();
        java.lang.Class<?> wildcardClass8 = keyListenerArray7.getClass();
        org.junit.Assert.assertNotNull(mouseMotionListenerArray6);
        org.junit.Assert.assertNotNull(keyListenerArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Event event4 = null;
        java.lang.Object obj5 = null;
        boolean boolean6 = durationAnalysis0.gotFocus(event4, obj5);
        java.awt.event.HierarchyListener hierarchyListener7 = null;
        durationAnalysis0.addHierarchyListener(hierarchyListener7);
        youtubeAnalysis.durationAnalysis durationAnalysis9 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image10 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis13 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis13.removeAll();
        boolean boolean15 = durationAnalysis9.prepareImage(image10, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis13);
        java.awt.Event event16 = null;
        boolean boolean19 = durationAnalysis9.mouseUp(event16, 10, 10);
        youtubeAnalysis.durationAnalysis durationAnalysis20 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image21 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis24 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis24.removeAll();
        boolean boolean26 = durationAnalysis20.prepareImage(image21, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis24);
        durationAnalysis24.revalidate();
        boolean boolean28 = durationAnalysis9.isFocusCycleRoot((java.awt.Container) durationAnalysis24);
        durationAnalysis0.setLocationRelativeTo((java.awt.Component) durationAnalysis24);
        durationAnalysis24.firePropertyChange("youtubeAnalysis.durationAnalysis[frame18,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (long) 6, (long) (byte) 1);
        youtubeAnalysis.durationAnalysis durationAnalysis34 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis34.removeAll();
        int int36 = durationAnalysis34.getDefaultCloseOperation();
        boolean boolean37 = durationAnalysis34.isDisplayable();
        boolean boolean38 = durationAnalysis34.isFocusTraversalPolicyProvider();
        java.awt.event.WindowListener windowListener39 = null;
        durationAnalysis34.addWindowListener(windowListener39);
        youtubeAnalysis.durationAnalysis durationAnalysis41 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis41.removeAll();
        int int43 = durationAnalysis41.getDefaultCloseOperation();
        java.awt.Dimension dimension44 = null;
        durationAnalysis41.setMinimumSize(dimension44);
        boolean boolean46 = durationAnalysis41.isCursorSet();
        youtubeAnalysis.durationAnalysis durationAnalysis47 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis47.removeAll();
        int int49 = durationAnalysis47.getDefaultCloseOperation();
        boolean boolean50 = durationAnalysis47.isMinimumSizeSet();
        java.awt.Image image51 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis52 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar53 = null;
        durationAnalysis52.setJMenuBar(jMenuBar53);
        boolean boolean55 = durationAnalysis47.prepareImage(image51, (java.awt.image.ImageObserver) durationAnalysis52);
        java.awt.Dimension dimension56 = null;
        java.awt.Dimension dimension57 = durationAnalysis47.getSize(dimension56);
        durationAnalysis41.setSize(dimension57);
        durationAnalysis34.setSize(dimension57);
        boolean boolean60 = durationAnalysis34.hasFocus();
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis24.setComponentZOrder((java.awt.Component) durationAnalysis34, 500);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 3 + "'", int49 == 3);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(dimension57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        java.util.List<java.awt.Image> imageList27 = durationAnalysis0.getIconImages();
        javax.swing.JLayeredPane jLayeredPane28 = durationAnalysis0.getLayeredPane();
        youtubeAnalysis.durationAnalysis durationAnalysis29 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis29.removeAll();
        int int31 = durationAnalysis29.getDefaultCloseOperation();
        boolean boolean32 = durationAnalysis29.isMinimumSizeSet();
        java.awt.Image image33 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis34 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar35 = null;
        durationAnalysis34.setJMenuBar(jMenuBar35);
        boolean boolean37 = durationAnalysis29.prepareImage(image33, (java.awt.image.ImageObserver) durationAnalysis34);
        durationAnalysis29.setLocation((int) (short) 0, 3);
        int int41 = durationAnalysis29.getX();
        java.awt.event.ComponentListener componentListener42 = null;
        durationAnalysis29.addComponentListener(componentListener42);
        youtubeAnalysis.durationAnalysis durationAnalysis44 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image45 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis48 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis48.removeAll();
        boolean boolean50 = durationAnalysis44.prepareImage(image45, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis48);
        java.awt.Event event51 = null;
        boolean boolean54 = durationAnalysis44.mouseUp(event51, 10, 10);
        durationAnalysis29.remove((java.awt.Component) durationAnalysis44);
        durationAnalysis29.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane60 = durationAnalysis29.getRootPane();
        jRootPane60.setIgnoreRepaint(false);
        boolean boolean63 = jRootPane60.isValid();
        java.awt.LayoutManager layoutManager64 = jRootPane60.getLayout();
        durationAnalysis0.setLayout(layoutManager64);
        youtubeAnalysis.durationAnalysis durationAnalysis66 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis66.removeAll();
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis0.setGlassPane((java.awt.Component) durationAnalysis66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(imageList27);
        org.junit.Assert.assertNotNull(jLayeredPane28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jRootPane60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(layoutManager64);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        java.awt.MenuBar menuBar2 = null;
        durationAnalysis0.setMenuBar(menuBar2);
        boolean boolean4 = durationAnalysis0.isFocusOwner();
        java.awt.Event event5 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis6 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis6.removeAll();
        int int8 = durationAnalysis6.getDefaultCloseOperation();
        java.awt.Dimension dimension9 = null;
        durationAnalysis6.setMinimumSize(dimension9);
        boolean boolean11 = durationAnalysis6.isCursorSet();
        youtubeAnalysis.durationAnalysis durationAnalysis12 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis12.removeAll();
        int int14 = durationAnalysis12.getDefaultCloseOperation();
        boolean boolean15 = durationAnalysis12.isMinimumSizeSet();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis17 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar18 = null;
        durationAnalysis17.setJMenuBar(jMenuBar18);
        boolean boolean20 = durationAnalysis12.prepareImage(image16, (java.awt.image.ImageObserver) durationAnalysis17);
        java.awt.Dimension dimension21 = null;
        java.awt.Dimension dimension22 = durationAnalysis12.getSize(dimension21);
        durationAnalysis6.setSize(dimension22);
        boolean boolean24 = durationAnalysis0.action(event5, (java.lang.Object) dimension22);
        java.awt.Color color25 = durationAnalysis0.getForeground();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(dimension22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(color25);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        durationAnalysis15.addPropertyChangeListener("youtubeAnalysis.durationAnalysis[frame0,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", propertyChangeListener28);
        java.awt.Event event30 = null;
        boolean boolean33 = durationAnalysis15.mouseUp(event30, (int) (short) 100, (int) '#');
        youtubeAnalysis.durationAnalysis durationAnalysis34 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis34.removeAll();
        java.awt.MenuBar menuBar36 = null;
        durationAnalysis34.setMenuBar(menuBar36);
        boolean boolean38 = durationAnalysis34.isFocusOwner();
        boolean boolean39 = durationAnalysis34.isLightweight();
        youtubeAnalysis.durationAnalysis durationAnalysis40 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image41 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis44 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis44.removeAll();
        boolean boolean46 = durationAnalysis40.prepareImage(image41, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis44);
        java.awt.Event event47 = null;
        boolean boolean50 = durationAnalysis40.mouseUp(event47, 10, 10);
        int int51 = durationAnalysis40.getState();
        java.awt.Image image52 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis55 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis55.removeAll();
        int int57 = durationAnalysis55.getDefaultCloseOperation();
        java.awt.Dimension dimension58 = durationAnalysis55.getMaximumSize();
        int int59 = durationAnalysis40.checkImage(image52, 12, 100, (java.awt.image.ImageObserver) durationAnalysis55);
        youtubeAnalysis.durationAnalysis durationAnalysis60 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis60.removeAll();
        boolean boolean62 = durationAnalysis60.isForegroundSet();
        java.lang.String str63 = durationAnalysis60.toString();
        javax.swing.TransferHandler transferHandler64 = durationAnalysis60.getTransferHandler();
        durationAnalysis60.transferFocusBackward();
        durationAnalysis60.setVisible(true);
        java.awt.Point point68 = durationAnalysis60.location();
        boolean boolean69 = durationAnalysis40.contains(point68);
        java.awt.Point point70 = durationAnalysis34.getLocation(point68);
        java.awt.Component component71 = durationAnalysis15.findComponentAt(point70);
        int int72 = durationAnalysis15.getState();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertNotNull(dimension58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 32 + "'", int59 == 32);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "youtubeAnalysis.durationAnalysis[frame118,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str63, "youtubeAnalysis.durationAnalysis[frame118,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertNull(transferHandler64);
        org.junit.Assert.assertNotNull(point68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(point70);
        org.junit.Assert.assertNull(component71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isForegroundSet();
        java.awt.Component[] componentArray3 = durationAnalysis0.getComponents();
        java.awt.Dimension dimension4 = durationAnalysis0.size();
        java.awt.Event event5 = null;
        boolean boolean8 = durationAnalysis0.mouseEnter(event5, 7, 128);
        java.awt.Component component9 = durationAnalysis0.getFocusOwner();
        int int10 = durationAnalysis0.countComponents();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(componentArray3);
        org.junit.Assert.assertNotNull(dimension4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(component9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext3 = durationAnalysis0.getInputContext();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis5.removeAll();
        java.awt.Graphics graphics7 = null;
        durationAnalysis5.paintComponents(graphics7);
        boolean boolean9 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        java.awt.Dimension dimension10 = durationAnalysis5.getMaximumSize();
        java.awt.event.ComponentListener componentListener11 = null;
        durationAnalysis5.removeComponentListener(componentListener11);
        youtubeAnalysis.durationAnalysis durationAnalysis13 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis13.removeAll();
        int int15 = durationAnalysis13.getDefaultCloseOperation();
        java.awt.Rectangle rectangle16 = durationAnalysis13.getMaximizedBounds();
        java.awt.ComponentOrientation componentOrientation17 = durationAnalysis13.getComponentOrientation();
        durationAnalysis5.setComponentOrientation(componentOrientation17);
        java.awt.Point point19 = durationAnalysis5.getMousePosition();
        durationAnalysis5.invalidate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(inputContext3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(rectangle16);
        org.junit.Assert.assertNotNull(componentOrientation17);
        org.junit.Assert.assertNull(point19);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        durationAnalysis0.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane31 = durationAnalysis0.getRootPane();
        java.awt.Point point32 = durationAnalysis0.getLocation();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jRootPane31);
        org.junit.Assert.assertNotNull(point32);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        java.awt.Dimension dimension9 = null;
        java.awt.Dimension dimension10 = durationAnalysis0.getSize(dimension9);
        java.awt.Event event11 = null;
        boolean boolean14 = durationAnalysis0.mouseMove(event11, 12, (int) (short) 1);
        boolean boolean15 = durationAnalysis0.isActive();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        durationAnalysis15.addPropertyChangeListener("youtubeAnalysis.durationAnalysis[frame0,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", propertyChangeListener28);
        java.awt.Event event30 = null;
        boolean boolean33 = durationAnalysis15.mouseUp(event30, (int) (short) 100, (int) '#');
        youtubeAnalysis.durationAnalysis durationAnalysis34 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis34.removeAll();
        java.awt.MenuBar menuBar36 = null;
        durationAnalysis34.setMenuBar(menuBar36);
        boolean boolean38 = durationAnalysis34.isFocusOwner();
        boolean boolean39 = durationAnalysis34.isLightweight();
        youtubeAnalysis.durationAnalysis durationAnalysis40 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image41 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis44 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis44.removeAll();
        boolean boolean46 = durationAnalysis40.prepareImage(image41, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis44);
        java.awt.Event event47 = null;
        boolean boolean50 = durationAnalysis40.mouseUp(event47, 10, 10);
        int int51 = durationAnalysis40.getState();
        java.awt.Image image52 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis55 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis55.removeAll();
        int int57 = durationAnalysis55.getDefaultCloseOperation();
        java.awt.Dimension dimension58 = durationAnalysis55.getMaximumSize();
        int int59 = durationAnalysis40.checkImage(image52, 12, 100, (java.awt.image.ImageObserver) durationAnalysis55);
        youtubeAnalysis.durationAnalysis durationAnalysis60 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis60.removeAll();
        boolean boolean62 = durationAnalysis60.isForegroundSet();
        java.lang.String str63 = durationAnalysis60.toString();
        javax.swing.TransferHandler transferHandler64 = durationAnalysis60.getTransferHandler();
        durationAnalysis60.transferFocusBackward();
        durationAnalysis60.setVisible(true);
        java.awt.Point point68 = durationAnalysis60.location();
        boolean boolean69 = durationAnalysis40.contains(point68);
        java.awt.Point point70 = durationAnalysis34.getLocation(point68);
        java.awt.Component component71 = durationAnalysis15.findComponentAt(point70);
        durationAnalysis15.list();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 3 + "'", int57 == 3);
        org.junit.Assert.assertNotNull(dimension58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 32 + "'", int59 == 32);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str63 + "' != '" + "youtubeAnalysis.durationAnalysis[frame119,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str63, "youtubeAnalysis.durationAnalysis[frame119,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertNull(transferHandler64);
        org.junit.Assert.assertNotNull(point68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(point70);
        org.junit.Assert.assertNull(component71);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        java.awt.MenuBar menuBar2 = null;
        durationAnalysis0.setMenuBar(menuBar2);
        boolean boolean4 = durationAnalysis0.isFocusOwner();
        boolean boolean5 = durationAnalysis0.isLightweight();
        boolean boolean6 = durationAnalysis0.isFocused();
        boolean boolean7 = durationAnalysis0.isVisible();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext3 = durationAnalysis0.getInputContext();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis5.removeAll();
        java.awt.Graphics graphics7 = null;
        durationAnalysis5.paintComponents(graphics7);
        boolean boolean9 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis5.removeNotify();
        boolean boolean11 = durationAnalysis5.isFocusTraversalPolicySet();
        java.beans.PropertyChangeListener propertyChangeListener13 = null;
        durationAnalysis5.addPropertyChangeListener("youtubeAnalysis.durationAnalysis[frame6,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", propertyChangeListener13);
        java.awt.Rectangle rectangle15 = durationAnalysis5.getBounds();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(inputContext3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(rectangle15);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isDisplayable();
        java.awt.event.FocusListener focusListener4 = null;
        durationAnalysis0.removeFocusListener(focusListener4);
        durationAnalysis0.transferFocusDownCycle();
        java.awt.event.ContainerListener containerListener7 = null;
        durationAnalysis0.addContainerListener(containerListener7);
        javax.swing.TransferHandler transferHandler9 = null;
        durationAnalysis0.setTransferHandler(transferHandler9);
        durationAnalysis0.firePropertyChange("youtubeAnalysis.durationAnalysis[frame5,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (byte) -1, (byte) 10);
        java.awt.event.InputMethodListener[] inputMethodListenerArray15 = durationAnalysis0.getInputMethodListeners();
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis0.setDefaultCloseOperation((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: defaultCloseOperation must be one of: DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE, DISPOSE_ON_CLOSE, or EXIT_ON_CLOSE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray15);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Event event4 = null;
        java.lang.Object obj5 = null;
        boolean boolean6 = durationAnalysis0.gotFocus(event4, obj5);
        java.awt.event.HierarchyListener hierarchyListener7 = null;
        durationAnalysis0.addHierarchyListener(hierarchyListener7);
        youtubeAnalysis.durationAnalysis durationAnalysis9 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image10 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis13 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis13.removeAll();
        boolean boolean15 = durationAnalysis9.prepareImage(image10, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis13);
        java.awt.Event event16 = null;
        boolean boolean19 = durationAnalysis9.mouseUp(event16, 10, 10);
        youtubeAnalysis.durationAnalysis durationAnalysis20 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image21 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis24 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis24.removeAll();
        boolean boolean26 = durationAnalysis20.prepareImage(image21, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis24);
        durationAnalysis24.revalidate();
        boolean boolean28 = durationAnalysis9.isFocusCycleRoot((java.awt.Container) durationAnalysis24);
        durationAnalysis0.setLocationRelativeTo((java.awt.Component) durationAnalysis24);
        boolean boolean30 = durationAnalysis24.isFocusTraversalPolicyProvider();
        java.awt.Event event31 = null;
        boolean boolean33 = durationAnalysis24.keyDown(event31, 0);
        youtubeAnalysis.durationAnalysis durationAnalysis34 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis34.removeAll();
        boolean boolean36 = durationAnalysis34.isAutoRequestFocus();
        java.awt.Component component37 = durationAnalysis34.getMostRecentFocusOwner();
        durationAnalysis34.pack();
        java.awt.image.ImageProducer imageProducer39 = null;
        java.awt.Image image40 = durationAnalysis34.createImage(imageProducer39);
        youtubeAnalysis.durationAnalysis durationAnalysis41 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis41.removeAll();
        int int43 = durationAnalysis41.getDefaultCloseOperation();
        boolean boolean44 = durationAnalysis41.isDisplayable();
        boolean boolean45 = durationAnalysis41.isFocusTraversalPolicyProvider();
        java.awt.event.MouseMotionListener mouseMotionListener46 = null;
        durationAnalysis41.addMouseMotionListener(mouseMotionListener46);
        java.awt.event.ComponentListener componentListener48 = null;
        durationAnalysis41.removeComponentListener(componentListener48);
        java.awt.event.FocusEvent.Cause cause50 = null;
        durationAnalysis41.requestFocus(cause50);
        int int52 = durationAnalysis24.checkImage(image40, (java.awt.image.ImageObserver) durationAnalysis41);
        durationAnalysis41.setFocusTraversalPolicyProvider(true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(image40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Event event4 = null;
        java.lang.Object obj5 = null;
        boolean boolean6 = durationAnalysis0.gotFocus(event4, obj5);
        java.awt.event.HierarchyListener hierarchyListener7 = null;
        durationAnalysis0.addHierarchyListener(hierarchyListener7);
        java.awt.image.VolatileImage volatileImage11 = durationAnalysis0.createVolatileImage((int) (byte) 1, (int) (short) -1);
        java.awt.event.WindowStateListener[] windowStateListenerArray12 = durationAnalysis0.getWindowStateListeners();
        java.awt.event.MouseListener mouseListener13 = null;
        durationAnalysis0.addMouseListener(mouseListener13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(volatileImage11);
        org.junit.Assert.assertNotNull(windowStateListenerArray12);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        youtubeAnalysis.durationAnalysis durationAnalysis11 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis15.removeAll();
        boolean boolean17 = durationAnalysis11.prepareImage(image12, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis15);
        durationAnalysis15.revalidate();
        boolean boolean19 = durationAnalysis0.isFocusCycleRoot((java.awt.Container) durationAnalysis15);
        durationAnalysis15.doLayout();
        boolean boolean21 = durationAnalysis15.isFocusOwner();
        durationAnalysis15.transferFocusDownCycle();
        durationAnalysis15.setName("youtubeAnalysis.durationAnalysis[frame32,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        java.awt.MenuBar menuBar2 = null;
        durationAnalysis0.setMenuBar(menuBar2);
        java.awt.LayoutManager layoutManager4 = null;
        durationAnalysis0.setLayout(layoutManager4);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray6 = durationAnalysis0.getMouseMotionListeners();
        java.awt.event.KeyListener[] keyListenerArray7 = durationAnalysis0.getKeyListeners();
        java.awt.Container container8 = durationAnalysis0.getContentPane();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray9 = container8.getHierarchyBoundsListeners();
        youtubeAnalysis.durationAnalysis durationAnalysis10 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis10.removeAll();
        int int12 = durationAnalysis10.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext13 = durationAnalysis10.getInputContext();
        java.awt.Graphics graphics14 = durationAnalysis10.getGraphics();
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis15.removeAll();
        int int17 = durationAnalysis15.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext18 = durationAnalysis15.getInputContext();
        java.awt.Image image19 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis20 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis20.removeAll();
        java.awt.Graphics graphics22 = null;
        durationAnalysis20.paintComponents(graphics22);
        boolean boolean24 = durationAnalysis15.prepareImage(image19, (java.awt.image.ImageObserver) durationAnalysis20);
        durationAnalysis20.removeNotify();
        java.awt.image.ImageProducer imageProducer26 = null;
        java.awt.Image image27 = durationAnalysis20.createImage(imageProducer26);
        youtubeAnalysis.durationAnalysis durationAnalysis28 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image29 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis32 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis32.removeAll();
        boolean boolean34 = durationAnalysis28.prepareImage(image29, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis32);
        java.awt.Event event35 = null;
        boolean boolean38 = durationAnalysis28.mouseUp(event35, 10, 10);
        boolean boolean39 = durationAnalysis28.isEnabled();
        boolean boolean40 = durationAnalysis28.getFocusableWindowState();
        int int41 = durationAnalysis10.checkImage(image27, (java.awt.image.ImageObserver) durationAnalysis28);
        youtubeAnalysis.durationAnalysis durationAnalysis42 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis42.removeAll();
        int int44 = durationAnalysis42.getDefaultCloseOperation();
        boolean boolean45 = durationAnalysis42.isMinimumSizeSet();
        java.awt.Event event46 = null;
        java.lang.Object obj47 = null;
        boolean boolean48 = durationAnalysis42.gotFocus(event46, obj47);
        java.awt.event.HierarchyListener hierarchyListener49 = null;
        durationAnalysis42.addHierarchyListener(hierarchyListener49);
        youtubeAnalysis.durationAnalysis durationAnalysis51 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image52 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis55 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis55.removeAll();
        boolean boolean57 = durationAnalysis51.prepareImage(image52, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis55);
        java.awt.Event event58 = null;
        boolean boolean61 = durationAnalysis51.mouseUp(event58, 10, 10);
        youtubeAnalysis.durationAnalysis durationAnalysis62 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image63 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis66 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis66.removeAll();
        boolean boolean68 = durationAnalysis62.prepareImage(image63, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis66);
        durationAnalysis66.revalidate();
        boolean boolean70 = durationAnalysis51.isFocusCycleRoot((java.awt.Container) durationAnalysis66);
        durationAnalysis42.setLocationRelativeTo((java.awt.Component) durationAnalysis66);
        durationAnalysis66.firePropertyChange("youtubeAnalysis.durationAnalysis[frame18,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (long) 6, (long) (byte) 1);
        int int76 = container8.checkImage(image27, (java.awt.image.ImageObserver) durationAnalysis66);
        durationAnalysis66.list();
        org.junit.Assert.assertNotNull(mouseMotionListenerArray6);
        org.junit.Assert.assertNotNull(keyListenerArray7);
        org.junit.Assert.assertNotNull(container8);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertNull(graphics14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(inputContext18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(image27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isOpaque();
        durationAnalysis0.firePropertyChange("", (byte) -1, (byte) 1);
        java.lang.Object obj7 = durationAnalysis0.getTreeLock();
        int int8 = durationAnalysis0.getComponentCount();
        durationAnalysis0.nextFocus();
        durationAnalysis0.repaint((long) (short) 0, 5, 0, 64, 11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isOpaque();
        durationAnalysis0.firePropertyChange("", (byte) -1, (byte) 1);
        java.lang.Object obj7 = durationAnalysis0.getTreeLock();
        int int8 = durationAnalysis0.getComponentCount();
        durationAnalysis0.nextFocus();
        durationAnalysis0.nextFocus();
        durationAnalysis0.nextFocus();
        java.awt.Color color12 = durationAnalysis0.getForeground();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(color12);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        youtubeAnalysis.durationAnalysis durationAnalysis9 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis9.removeAll();
        int int11 = durationAnalysis9.getDefaultCloseOperation();
        boolean boolean12 = durationAnalysis9.isMinimumSizeSet();
        boolean boolean13 = durationAnalysis5.isAncestorOf((java.awt.Component) durationAnalysis9);
        youtubeAnalysis.durationAnalysis durationAnalysis14 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis14.removeAll();
        int int16 = durationAnalysis14.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext17 = durationAnalysis14.getInputContext();
        java.awt.Image image18 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        java.awt.Graphics graphics21 = null;
        durationAnalysis19.paintComponents(graphics21);
        boolean boolean23 = durationAnalysis14.prepareImage(image18, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Dimension dimension24 = durationAnalysis19.getMaximumSize();
        durationAnalysis9.resize(dimension24);
        boolean boolean26 = durationAnalysis9.isLocationByPlatform();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(inputContext17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        int int11 = durationAnalysis0.getState();
        java.awt.Image image12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis15.removeAll();
        int int17 = durationAnalysis15.getDefaultCloseOperation();
        java.awt.Dimension dimension18 = durationAnalysis15.getMaximumSize();
        int int19 = durationAnalysis0.checkImage(image12, 12, 100, (java.awt.image.ImageObserver) durationAnalysis15);
        youtubeAnalysis.durationAnalysis durationAnalysis20 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis20.removeAll();
        int int22 = durationAnalysis20.getDefaultCloseOperation();
        boolean boolean23 = durationAnalysis20.isMinimumSizeSet();
        java.awt.Event event24 = null;
        java.lang.Object obj25 = null;
        boolean boolean26 = durationAnalysis20.gotFocus(event24, obj25);
        java.awt.event.HierarchyListener hierarchyListener27 = null;
        durationAnalysis20.addHierarchyListener(hierarchyListener27);
        java.awt.Dimension dimension29 = durationAnalysis20.minimumSize();
        durationAnalysis0.resize(dimension29);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior31 = durationAnalysis0.getBaselineResizeBehavior();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dimension29);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior31 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior31.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setFocusTraversalKeysEnabled(true);
        java.awt.Dimension dimension11 = durationAnalysis0.getMinimumSize();
        youtubeAnalysis.durationAnalysis durationAnalysis12 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis12.removeAll();
        java.awt.MenuBar menuBar14 = null;
        durationAnalysis12.setMenuBar(menuBar14);
        boolean boolean16 = durationAnalysis12.isFocusOwner();
        boolean boolean17 = durationAnalysis12.isLightweight();
        youtubeAnalysis.durationAnalysis durationAnalysis18 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image19 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis22 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis22.removeAll();
        boolean boolean24 = durationAnalysis18.prepareImage(image19, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis22);
        java.awt.Event event25 = null;
        boolean boolean28 = durationAnalysis18.mouseUp(event25, 10, 10);
        int int29 = durationAnalysis18.getState();
        java.awt.Image image30 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis33 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis33.removeAll();
        int int35 = durationAnalysis33.getDefaultCloseOperation();
        java.awt.Dimension dimension36 = durationAnalysis33.getMaximumSize();
        int int37 = durationAnalysis18.checkImage(image30, 12, 100, (java.awt.image.ImageObserver) durationAnalysis33);
        youtubeAnalysis.durationAnalysis durationAnalysis38 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis38.removeAll();
        boolean boolean40 = durationAnalysis38.isForegroundSet();
        java.lang.String str41 = durationAnalysis38.toString();
        javax.swing.TransferHandler transferHandler42 = durationAnalysis38.getTransferHandler();
        durationAnalysis38.transferFocusBackward();
        durationAnalysis38.setVisible(true);
        java.awt.Point point46 = durationAnalysis38.location();
        boolean boolean47 = durationAnalysis18.contains(point46);
        java.awt.Point point48 = durationAnalysis12.getLocation(point46);
        java.awt.Component component49 = durationAnalysis0.findComponentAt(point46);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertNotNull(dimension36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "youtubeAnalysis.durationAnalysis[frame123,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str41, "youtubeAnalysis.durationAnalysis[frame123,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertNull(transferHandler42);
        org.junit.Assert.assertNotNull(point46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(point48);
        org.junit.Assert.assertNull(component49);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        java.awt.MenuBar menuBar2 = null;
        durationAnalysis0.setMenuBar(menuBar2);
        durationAnalysis0.nextFocus();
        java.awt.Graphics graphics5 = null;
        durationAnalysis0.paint(graphics5);
        float float7 = durationAnalysis0.getAlignmentX();
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        java.awt.event.HierarchyListener hierarchyListener3 = null;
        durationAnalysis0.removeHierarchyListener(hierarchyListener3);
        javax.accessibility.AccessibleContext accessibleContext5 = durationAnalysis0.getAccessibleContext();
        youtubeAnalysis.durationAnalysis durationAnalysis6 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis6.removeAll();
        int int8 = durationAnalysis6.getDefaultCloseOperation();
        boolean boolean9 = durationAnalysis6.isMinimumSizeSet();
        java.awt.Image image10 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis11 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar12 = null;
        durationAnalysis11.setJMenuBar(jMenuBar12);
        boolean boolean14 = durationAnalysis6.prepareImage(image10, (java.awt.image.ImageObserver) durationAnalysis11);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis15.removeAll();
        int int17 = durationAnalysis15.getDefaultCloseOperation();
        boolean boolean18 = durationAnalysis15.isMinimumSizeSet();
        boolean boolean19 = durationAnalysis11.isAncestorOf((java.awt.Component) durationAnalysis15);
        boolean boolean20 = durationAnalysis15.isUndecorated();
        durationAnalysis15.setExtendedState((-1));
        boolean boolean23 = durationAnalysis15.getFocusTraversalKeysEnabled();
        java.awt.Dimension dimension24 = durationAnalysis15.size();
        durationAnalysis0.resize(dimension24);
        durationAnalysis0.pack();
        youtubeAnalysis.durationAnalysis durationAnalysis27 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis27.removeAll();
        boolean boolean29 = durationAnalysis27.isForegroundSet();
        java.awt.Component[] componentArray30 = durationAnalysis27.getComponents();
        youtubeAnalysis.durationAnalysis durationAnalysis31 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis31.removeAll();
        boolean boolean33 = durationAnalysis31.isAutoRequestFocus();
        boolean boolean34 = durationAnalysis27.isAncestorOf((java.awt.Component) durationAnalysis31);
        boolean boolean35 = durationAnalysis31.isUndecorated();
        durationAnalysis31.invalidate();
        java.awt.Dialog.ModalExclusionType modalExclusionType37 = durationAnalysis31.getModalExclusionType();
        durationAnalysis0.setModalExclusionType(modalExclusionType37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(accessibleContext5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dimension24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(componentArray30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + modalExclusionType37 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType37.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isOpaque();
        durationAnalysis0.firePropertyChange("", (byte) -1, (byte) 1);
        java.lang.Object obj7 = durationAnalysis0.getTreeLock();
        java.awt.event.FocusListener[] focusListenerArray8 = durationAnalysis0.getFocusListeners();
        durationAnalysis0.resize(0, (int) (short) 1);
        java.awt.Event event12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis13 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis13.removeAll();
        boolean boolean15 = durationAnalysis13.isForegroundSet();
        java.lang.String str16 = durationAnalysis13.toString();
        durationAnalysis13.setIgnoreRepaint(false);
        boolean boolean19 = durationAnalysis0.gotFocus(event12, (java.lang.Object) false);
        java.awt.Event event20 = null;
        boolean boolean23 = durationAnalysis0.mouseDrag(event20, 500, 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(focusListenerArray8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "youtubeAnalysis.durationAnalysis[frame124,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str16, "youtubeAnalysis.durationAnalysis[frame124,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        java.awt.MenuBar menuBar2 = null;
        durationAnalysis0.setMenuBar(menuBar2);
        java.awt.LayoutManager layoutManager4 = null;
        durationAnalysis0.setLayout(layoutManager4);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray6 = durationAnalysis0.getMouseMotionListeners();
        java.awt.event.KeyListener[] keyListenerArray7 = durationAnalysis0.getKeyListeners();
        java.awt.Container container8 = durationAnalysis0.getContentPane();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray9 = container8.getHierarchyBoundsListeners();
        youtubeAnalysis.durationAnalysis durationAnalysis10 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis10.removeAll();
        int int12 = durationAnalysis10.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext13 = durationAnalysis10.getInputContext();
        java.awt.Graphics graphics14 = durationAnalysis10.getGraphics();
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis15.removeAll();
        int int17 = durationAnalysis15.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext18 = durationAnalysis15.getInputContext();
        java.awt.Image image19 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis20 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis20.removeAll();
        java.awt.Graphics graphics22 = null;
        durationAnalysis20.paintComponents(graphics22);
        boolean boolean24 = durationAnalysis15.prepareImage(image19, (java.awt.image.ImageObserver) durationAnalysis20);
        durationAnalysis20.removeNotify();
        java.awt.image.ImageProducer imageProducer26 = null;
        java.awt.Image image27 = durationAnalysis20.createImage(imageProducer26);
        youtubeAnalysis.durationAnalysis durationAnalysis28 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image29 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis32 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis32.removeAll();
        boolean boolean34 = durationAnalysis28.prepareImage(image29, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis32);
        java.awt.Event event35 = null;
        boolean boolean38 = durationAnalysis28.mouseUp(event35, 10, 10);
        boolean boolean39 = durationAnalysis28.isEnabled();
        boolean boolean40 = durationAnalysis28.getFocusableWindowState();
        int int41 = durationAnalysis10.checkImage(image27, (java.awt.image.ImageObserver) durationAnalysis28);
        youtubeAnalysis.durationAnalysis durationAnalysis42 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis42.removeAll();
        int int44 = durationAnalysis42.getDefaultCloseOperation();
        boolean boolean45 = durationAnalysis42.isMinimumSizeSet();
        java.awt.Event event46 = null;
        java.lang.Object obj47 = null;
        boolean boolean48 = durationAnalysis42.gotFocus(event46, obj47);
        java.awt.event.HierarchyListener hierarchyListener49 = null;
        durationAnalysis42.addHierarchyListener(hierarchyListener49);
        youtubeAnalysis.durationAnalysis durationAnalysis51 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image52 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis55 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis55.removeAll();
        boolean boolean57 = durationAnalysis51.prepareImage(image52, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis55);
        java.awt.Event event58 = null;
        boolean boolean61 = durationAnalysis51.mouseUp(event58, 10, 10);
        youtubeAnalysis.durationAnalysis durationAnalysis62 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image63 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis66 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis66.removeAll();
        boolean boolean68 = durationAnalysis62.prepareImage(image63, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis66);
        durationAnalysis66.revalidate();
        boolean boolean70 = durationAnalysis51.isFocusCycleRoot((java.awt.Container) durationAnalysis66);
        durationAnalysis42.setLocationRelativeTo((java.awt.Component) durationAnalysis66);
        durationAnalysis66.firePropertyChange("youtubeAnalysis.durationAnalysis[frame18,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (long) 6, (long) (byte) 1);
        int int76 = container8.checkImage(image27, (java.awt.image.ImageObserver) durationAnalysis66);
        youtubeAnalysis.durationAnalysis durationAnalysis77 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis77.removeAll();
        int int79 = durationAnalysis77.getDefaultCloseOperation();
        boolean boolean80 = durationAnalysis77.isMinimumSizeSet();
        java.awt.Image image81 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis82 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar83 = null;
        durationAnalysis82.setJMenuBar(jMenuBar83);
        boolean boolean85 = durationAnalysis77.prepareImage(image81, (java.awt.image.ImageObserver) durationAnalysis82);
        youtubeAnalysis.durationAnalysis durationAnalysis86 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis86.removeAll();
        int int88 = durationAnalysis86.getDefaultCloseOperation();
        boolean boolean89 = durationAnalysis86.isMinimumSizeSet();
        boolean boolean90 = durationAnalysis82.isAncestorOf((java.awt.Component) durationAnalysis86);
        java.awt.FocusTraversalPolicy focusTraversalPolicy91 = durationAnalysis82.getFocusTraversalPolicy();
        durationAnalysis66.setFocusTraversalPolicy(focusTraversalPolicy91);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray6);
        org.junit.Assert.assertNotNull(keyListenerArray7);
        org.junit.Assert.assertNotNull(container8);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertNull(graphics14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(inputContext18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(image27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 3 + "'", int79 == 3);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 3 + "'", int88 == 3);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(focusTraversalPolicy91);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        java.awt.MenuBar menuBar2 = null;
        durationAnalysis0.setMenuBar(menuBar2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
        durationAnalysis0.removeHierarchyBoundsListener(hierarchyBoundsListener4);
        youtubeAnalysis.durationAnalysis durationAnalysis6 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis6.removeAll();
        boolean boolean8 = durationAnalysis6.isAutoRequestFocus();
        java.awt.Component component9 = durationAnalysis6.getMostRecentFocusOwner();
        java.awt.event.HierarchyListener hierarchyListener10 = null;
        durationAnalysis6.removeHierarchyListener(hierarchyListener10);
        boolean boolean12 = durationAnalysis6.isResizable();
        durationAnalysis6.setFocusableWindowState(true);
        boolean boolean15 = durationAnalysis0.isFocusCycleRoot((java.awt.Container) durationAnalysis6);
        durationAnalysis6.setLocationByPlatform(false);
        youtubeAnalysis.durationAnalysis durationAnalysis18 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis18.removeAll();
        boolean boolean20 = durationAnalysis18.isForegroundSet();
        java.lang.String str21 = durationAnalysis18.toString();
        javax.swing.TransferHandler transferHandler22 = durationAnalysis18.getTransferHandler();
        durationAnalysis18.transferFocusBackward();
        durationAnalysis18.setVisible(true);
        java.awt.image.VolatileImage volatileImage28 = durationAnalysis18.createVolatileImage(9, 9);
        youtubeAnalysis.durationAnalysis durationAnalysis29 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis29.removeAll();
        int int31 = durationAnalysis29.getDefaultCloseOperation();
        boolean boolean32 = durationAnalysis29.isMinimumSizeSet();
        java.awt.Image image33 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis34 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar35 = null;
        durationAnalysis34.setJMenuBar(jMenuBar35);
        boolean boolean37 = durationAnalysis29.prepareImage(image33, (java.awt.image.ImageObserver) durationAnalysis34);
        durationAnalysis29.setLocation((int) (short) 0, 3);
        int int41 = durationAnalysis29.getX();
        java.awt.event.ComponentListener componentListener42 = null;
        durationAnalysis29.addComponentListener(componentListener42);
        youtubeAnalysis.durationAnalysis durationAnalysis44 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image45 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis48 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis48.removeAll();
        boolean boolean50 = durationAnalysis44.prepareImage(image45, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis48);
        java.awt.Event event51 = null;
        boolean boolean54 = durationAnalysis44.mouseUp(event51, 10, 10);
        durationAnalysis29.remove((java.awt.Component) durationAnalysis44);
        durationAnalysis29.firePropertyChange("hi!", 10.0f, (float) 'a');
        java.awt.Event event60 = null;
        boolean boolean63 = durationAnalysis29.mouseUp(event60, 3, (int) (short) 0);
        durationAnalysis29.setExtendedState((int) ' ');
        int int66 = durationAnalysis6.checkImage((java.awt.Image) volatileImage28, (java.awt.image.ImageObserver) durationAnalysis29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "youtubeAnalysis.durationAnalysis[frame126,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str21, "youtubeAnalysis.durationAnalysis[frame126,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertNull(transferHandler22);
        org.junit.Assert.assertNotNull(volatileImage28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 32 + "'", int66 == 32);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        youtubeAnalysis.durationAnalysis durationAnalysis11 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis15.removeAll();
        boolean boolean17 = durationAnalysis11.prepareImage(image12, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis15);
        durationAnalysis15.revalidate();
        boolean boolean19 = durationAnalysis0.isFocusCycleRoot((java.awt.Container) durationAnalysis15);
        java.awt.Dimension dimension20 = durationAnalysis0.getMaximumSize();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dimension20);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        boolean boolean11 = durationAnalysis0.isEnabled();
        boolean boolean12 = durationAnalysis0.getFocusableWindowState();
        java.awt.event.HierarchyListener[] hierarchyListenerArray13 = durationAnalysis0.getHierarchyListeners();
        java.awt.Component component16 = durationAnalysis0.getComponentAt((int) (short) 0, 2);
        java.awt.Point point17 = durationAnalysis0.location();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(hierarchyListenerArray13);
        org.junit.Assert.assertNotNull(component16);
        org.junit.Assert.assertNotNull(point17);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        durationAnalysis0.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane31 = durationAnalysis0.getRootPane();
        java.awt.Color color32 = null;
        durationAnalysis0.setForeground(color32);
        durationAnalysis0.transferFocusUpCycle();
        java.awt.Dimension dimension35 = durationAnalysis0.preferredSize();
        java.io.PrintStream printStream36 = null;
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis0.list(printStream36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jRootPane31);
        org.junit.Assert.assertNotNull(dimension35);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        durationAnalysis0.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane31 = durationAnalysis0.getRootPane();
        jRootPane31.setIgnoreRepaint(false);
        jRootPane31.transferFocusDownCycle();
        java.awt.event.InputMethodListener inputMethodListener35 = null;
        jRootPane31.addInputMethodListener(inputMethodListener35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jRootPane31);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Event event4 = null;
        java.lang.Object obj5 = null;
        boolean boolean6 = durationAnalysis0.gotFocus(event4, obj5);
        java.awt.event.HierarchyListener hierarchyListener7 = null;
        durationAnalysis0.addHierarchyListener(hierarchyListener7);
        java.awt.Dimension dimension9 = durationAnalysis0.minimumSize();
        boolean boolean10 = durationAnalysis0.getFocusableWindowState();
        boolean boolean11 = durationAnalysis0.isBackgroundSet();
        javax.swing.JRootPane jRootPane12 = durationAnalysis0.getRootPane();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jRootPane12);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext3 = durationAnalysis0.getInputContext();
        boolean boolean4 = durationAnalysis0.getIgnoreRepaint();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(inputContext3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        durationAnalysis0.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane31 = durationAnalysis0.getRootPane();
        java.awt.event.WindowStateListener windowStateListener32 = null;
        durationAnalysis0.removeWindowStateListener(windowStateListener32);
        java.awt.GraphicsConfiguration graphicsConfiguration34 = durationAnalysis0.getGraphicsConfiguration();
        durationAnalysis0.setTitle("youtubeAnalysis.durationAnalysis[frame60,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jRootPane31);
        org.junit.Assert.assertNotNull(graphicsConfiguration34);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        youtubeAnalysis.durationAnalysis durationAnalysis9 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis9.removeAll();
        int int11 = durationAnalysis9.getDefaultCloseOperation();
        boolean boolean12 = durationAnalysis9.isMinimumSizeSet();
        boolean boolean13 = durationAnalysis5.isAncestorOf((java.awt.Component) durationAnalysis9);
        boolean boolean14 = durationAnalysis9.isUndecorated();
        java.awt.event.WindowFocusListener[] windowFocusListenerArray15 = durationAnalysis9.getWindowFocusListeners();
        java.lang.String str16 = durationAnalysis9.getWarningString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(windowFocusListenerArray15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        youtubeAnalysis.durationAnalysis durationAnalysis9 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis9.removeAll();
        int int11 = durationAnalysis9.getDefaultCloseOperation();
        boolean boolean12 = durationAnalysis9.isMinimumSizeSet();
        boolean boolean13 = durationAnalysis5.isAncestorOf((java.awt.Component) durationAnalysis9);
        boolean boolean14 = durationAnalysis9.isUndecorated();
        durationAnalysis9.setExtendedState((-1));
        boolean boolean17 = durationAnalysis9.getFocusTraversalKeysEnabled();
        java.awt.Dimension dimension18 = durationAnalysis9.getMaximumSize();
        java.awt.Shape shape19 = durationAnalysis9.getShape();
        durationAnalysis9.repaint((int) (short) 100, 6, 9, (int) '4');
        java.awt.Image image27 = durationAnalysis9.createImage((int) (byte) 10, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertNull(shape19);
        org.junit.Assert.assertNull(image27);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        durationAnalysis0.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane31 = durationAnalysis0.getRootPane();
        java.awt.event.WindowStateListener windowStateListener32 = null;
        durationAnalysis0.removeWindowStateListener(windowStateListener32);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        durationAnalysis0.addPropertyChangeListener("youtubeAnalysis.durationAnalysis[frame7,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", propertyChangeListener35);
        java.awt.Color color37 = durationAnalysis0.getBackground();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jRootPane31);
        org.junit.Assert.assertNotNull(color37);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        javax.swing.JLayeredPane jLayeredPane15 = durationAnalysis0.getLayeredPane();
        youtubeAnalysis.durationAnalysis durationAnalysis16 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis16.removeAll();
        java.awt.MenuBar menuBar18 = null;
        durationAnalysis16.setMenuBar(menuBar18);
        java.awt.LayoutManager layoutManager20 = null;
        durationAnalysis16.setLayout(layoutManager20);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray22 = durationAnalysis16.getMouseMotionListeners();
        java.awt.event.KeyListener[] keyListenerArray23 = durationAnalysis16.getKeyListeners();
        java.awt.Container container24 = durationAnalysis16.getContentPane();
        boolean boolean25 = jLayeredPane15.isAncestorOf((java.awt.Component) durationAnalysis16);
        youtubeAnalysis.durationAnalysis durationAnalysis26 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis26.removeAll();
        int int28 = durationAnalysis26.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext29 = durationAnalysis26.getInputContext();
        java.awt.Image image30 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis31 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis31.removeAll();
        java.awt.Graphics graphics33 = null;
        durationAnalysis31.paintComponents(graphics33);
        boolean boolean35 = durationAnalysis26.prepareImage(image30, (java.awt.image.ImageObserver) durationAnalysis31);
        java.awt.Dimension dimension36 = durationAnalysis31.getMaximumSize();
        java.awt.event.ComponentListener componentListener37 = null;
        durationAnalysis31.removeComponentListener(componentListener37);
        java.awt.Component component39 = durationAnalysis31.getGlassPane();
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis16.setGlassPane((java.awt.Component) durationAnalysis31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(jLayeredPane15);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray22);
        org.junit.Assert.assertNotNull(keyListenerArray23);
        org.junit.Assert.assertNotNull(container24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(inputContext29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dimension36);
        org.junit.Assert.assertNotNull(component39);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Event event4 = null;
        java.lang.Object obj5 = null;
        boolean boolean6 = durationAnalysis0.gotFocus(event4, obj5);
        java.awt.event.HierarchyListener hierarchyListener7 = null;
        durationAnalysis0.addHierarchyListener(hierarchyListener7);
        youtubeAnalysis.durationAnalysis durationAnalysis9 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image10 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis13 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis13.removeAll();
        boolean boolean15 = durationAnalysis9.prepareImage(image10, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis13);
        java.awt.Event event16 = null;
        boolean boolean19 = durationAnalysis9.mouseUp(event16, 10, 10);
        youtubeAnalysis.durationAnalysis durationAnalysis20 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image21 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis24 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis24.removeAll();
        boolean boolean26 = durationAnalysis20.prepareImage(image21, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis24);
        durationAnalysis24.revalidate();
        boolean boolean28 = durationAnalysis9.isFocusCycleRoot((java.awt.Container) durationAnalysis24);
        durationAnalysis0.setLocationRelativeTo((java.awt.Component) durationAnalysis24);
        boolean boolean30 = durationAnalysis24.isFocusTraversalPolicyProvider();
        java.awt.Event event31 = null;
        boolean boolean33 = durationAnalysis24.keyDown(event31, 0);
        youtubeAnalysis.durationAnalysis durationAnalysis34 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis34.removeAll();
        boolean boolean36 = durationAnalysis34.isAutoRequestFocus();
        java.awt.Component component37 = durationAnalysis34.getMostRecentFocusOwner();
        durationAnalysis34.pack();
        java.awt.image.ImageProducer imageProducer39 = null;
        java.awt.Image image40 = durationAnalysis34.createImage(imageProducer39);
        youtubeAnalysis.durationAnalysis durationAnalysis41 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis41.removeAll();
        int int43 = durationAnalysis41.getDefaultCloseOperation();
        boolean boolean44 = durationAnalysis41.isDisplayable();
        boolean boolean45 = durationAnalysis41.isFocusTraversalPolicyProvider();
        java.awt.event.MouseMotionListener mouseMotionListener46 = null;
        durationAnalysis41.addMouseMotionListener(mouseMotionListener46);
        java.awt.event.ComponentListener componentListener48 = null;
        durationAnalysis41.removeComponentListener(componentListener48);
        java.awt.event.FocusEvent.Cause cause50 = null;
        durationAnalysis41.requestFocus(cause50);
        int int52 = durationAnalysis24.checkImage(image40, (java.awt.image.ImageObserver) durationAnalysis41);
        durationAnalysis24.setLocationByPlatform(false);
        javax.swing.JMenuBar jMenuBar55 = durationAnalysis24.getJMenuBar();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(component37);
        org.junit.Assert.assertNotNull(image40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 3 + "'", int43 == 3);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(jMenuBar55);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext3 = durationAnalysis0.getInputContext();
        java.awt.Graphics graphics4 = durationAnalysis0.getGraphics();
        java.util.ResourceBundle resourceBundle5 = null;
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis0.applyResourceBundle(resourceBundle5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ResourceBundle.getLocale()\" because \"bdl\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(inputContext3);
        org.junit.Assert.assertNull(graphics4);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isDisplayable();
        java.awt.Dimension dimension4 = durationAnalysis0.getMaximumSize();
        durationAnalysis0.setIgnoreRepaint(false);
        boolean boolean7 = durationAnalysis0.isFocusable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dimension4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext3 = durationAnalysis0.getInputContext();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis5.removeAll();
        java.awt.Graphics graphics7 = null;
        durationAnalysis5.paintComponents(graphics7);
        boolean boolean9 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis5.removeNotify();
        java.awt.image.ImageProducer imageProducer11 = null;
        java.awt.Image image12 = durationAnalysis5.createImage(imageProducer11);
        java.awt.Color color13 = durationAnalysis5.getBackground();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(inputContext3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(image12);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        youtubeAnalysis.durationAnalysis durationAnalysis9 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis9.removeAll();
        int int11 = durationAnalysis9.getDefaultCloseOperation();
        boolean boolean12 = durationAnalysis9.isMinimumSizeSet();
        boolean boolean13 = durationAnalysis5.isAncestorOf((java.awt.Component) durationAnalysis9);
        boolean boolean14 = durationAnalysis9.isUndecorated();
        durationAnalysis9.setExtendedState((-1));
        boolean boolean17 = durationAnalysis9.getFocusTraversalKeysEnabled();
        java.awt.Dimension dimension18 = durationAnalysis9.getMaximumSize();
        java.awt.Shape shape19 = durationAnalysis9.getShape();
        durationAnalysis9.repaint((int) (short) 100, 6, 9, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis9.setDefaultCloseOperation((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: defaultCloseOperation must be one of: DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE, DISPOSE_ON_CLOSE, or EXIT_ON_CLOSE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertNull(shape19);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext3 = durationAnalysis0.getInputContext();
        java.awt.Graphics graphics4 = durationAnalysis0.getGraphics();
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis5.removeAll();
        int int7 = durationAnalysis5.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext8 = durationAnalysis5.getInputContext();
        java.awt.Image image9 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis10 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis10.removeAll();
        java.awt.Graphics graphics12 = null;
        durationAnalysis10.paintComponents(graphics12);
        boolean boolean14 = durationAnalysis5.prepareImage(image9, (java.awt.image.ImageObserver) durationAnalysis10);
        durationAnalysis10.removeNotify();
        java.awt.image.ImageProducer imageProducer16 = null;
        java.awt.Image image17 = durationAnalysis10.createImage(imageProducer16);
        youtubeAnalysis.durationAnalysis durationAnalysis18 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image19 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis22 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis22.removeAll();
        boolean boolean24 = durationAnalysis18.prepareImage(image19, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis22);
        java.awt.Event event25 = null;
        boolean boolean28 = durationAnalysis18.mouseUp(event25, 10, 10);
        boolean boolean29 = durationAnalysis18.isEnabled();
        boolean boolean30 = durationAnalysis18.getFocusableWindowState();
        int int31 = durationAnalysis0.checkImage(image17, (java.awt.image.ImageObserver) durationAnalysis18);
        javax.swing.JRootPane jRootPane32 = durationAnalysis18.getRootPane();
        java.beans.PropertyChangeListener propertyChangeListener34 = null;
        jRootPane32.removePropertyChangeListener("youtubeAnalysis.durationAnalysis[frame48,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", propertyChangeListener34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(inputContext3);
        org.junit.Assert.assertNull(graphics4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(inputContext8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(image17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(jRootPane32);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        java.awt.Event event2 = null;
        boolean boolean5 = durationAnalysis0.mouseUp(event2, 0, (int) '#');
        durationAnalysis0.reshape(10, (int) (short) 1, (int) '#', (int) (byte) 100);
        durationAnalysis0.setAutoRequestFocus(false);
        java.awt.Toolkit toolkit13 = durationAnalysis0.getToolkit();
        boolean boolean14 = durationAnalysis0.isFontSet();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toolkit13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        durationAnalysis0.setFocusTraversalKeysEnabled(false);
        boolean boolean6 = durationAnalysis0.isFocusCycleRoot();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        youtubeAnalysis.durationAnalysis durationAnalysis11 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis15.removeAll();
        boolean boolean17 = durationAnalysis11.prepareImage(image12, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis15);
        durationAnalysis15.revalidate();
        boolean boolean19 = durationAnalysis0.isFocusCycleRoot((java.awt.Container) durationAnalysis15);
        java.awt.event.MouseListener[] mouseListenerArray20 = durationAnalysis15.getMouseListeners();
        java.util.Locale locale21 = null;
        durationAnalysis15.setLocale(locale21);
        java.awt.Rectangle rectangle23 = durationAnalysis15.getBounds();
        java.awt.event.WindowStateListener[] windowStateListenerArray24 = durationAnalysis15.getWindowStateListeners();
        java.awt.event.WindowStateListener[] windowStateListenerArray25 = durationAnalysis15.getWindowStateListeners();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(mouseListenerArray20);
        org.junit.Assert.assertNotNull(rectangle23);
        org.junit.Assert.assertNotNull(windowStateListenerArray24);
        org.junit.Assert.assertNotNull(windowStateListenerArray25);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setFocusTraversalKeysEnabled(true);
        java.awt.Dimension dimension11 = durationAnalysis0.getMinimumSize();
        javax.accessibility.AccessibleContext accessibleContext12 = durationAnalysis0.getAccessibleContext();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNotNull(accessibleContext12);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        boolean boolean11 = durationAnalysis0.isEnabled();
        boolean boolean12 = durationAnalysis0.getFocusableWindowState();
        java.awt.im.InputContext inputContext13 = durationAnalysis0.getInputContext();
        durationAnalysis0.setLocation((int) '4', (int) (byte) 10);
        youtubeAnalysis.durationAnalysis durationAnalysis17 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis17.removeAll();
        int int19 = durationAnalysis17.getDefaultCloseOperation();
        boolean boolean20 = durationAnalysis17.isMinimumSizeSet();
        java.awt.Event event21 = null;
        java.lang.Object obj22 = null;
        boolean boolean23 = durationAnalysis17.gotFocus(event21, obj22);
        java.awt.event.HierarchyListener hierarchyListener24 = null;
        durationAnalysis17.addHierarchyListener(hierarchyListener24);
        java.awt.image.VolatileImage volatileImage28 = durationAnalysis17.createVolatileImage((int) (byte) 1, (int) (short) -1);
        boolean boolean29 = durationAnalysis17.isVisible();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray30 = durationAnalysis17.getHierarchyBoundsListeners();
        youtubeAnalysis.durationAnalysis durationAnalysis31 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis31.removeAll();
        int int33 = durationAnalysis31.getDefaultCloseOperation();
        boolean boolean34 = durationAnalysis31.isMinimumSizeSet();
        java.awt.Image image35 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis36 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar37 = null;
        durationAnalysis36.setJMenuBar(jMenuBar37);
        boolean boolean39 = durationAnalysis31.prepareImage(image35, (java.awt.image.ImageObserver) durationAnalysis36);
        durationAnalysis31.setLocation((int) (short) 0, 3);
        int int43 = durationAnalysis31.getX();
        java.awt.event.ComponentListener componentListener44 = null;
        durationAnalysis31.addComponentListener(componentListener44);
        youtubeAnalysis.durationAnalysis durationAnalysis46 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image47 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis50 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis50.removeAll();
        boolean boolean52 = durationAnalysis46.prepareImage(image47, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis50);
        java.awt.Event event53 = null;
        boolean boolean56 = durationAnalysis46.mouseUp(event53, 10, 10);
        durationAnalysis31.remove((java.awt.Component) durationAnalysis46);
        durationAnalysis31.firePropertyChange("hi!", 10.0f, (float) 'a');
        java.awt.Image image62 = null;
        durationAnalysis31.setIconImage(image62);
        boolean boolean64 = durationAnalysis31.isPreferredSizeSet();
        durationAnalysis17.setLocationRelativeTo((java.awt.Component) durationAnalysis31);
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis0.setComponentZOrder((java.awt.Component) durationAnalysis17, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(inputContext13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(volatileImage28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isForegroundSet();
        java.awt.Component[] componentArray3 = durationAnalysis0.getComponents();
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis4.isAutoRequestFocus();
        boolean boolean7 = durationAnalysis0.isAncestorOf((java.awt.Component) durationAnalysis4);
        youtubeAnalysis.durationAnalysis durationAnalysis8 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis8.removeAll();
        int int10 = durationAnalysis8.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext11 = durationAnalysis8.getInputContext();
        java.awt.Image image12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis13 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis13.removeAll();
        java.awt.Graphics graphics15 = null;
        durationAnalysis13.paintComponents(graphics15);
        boolean boolean17 = durationAnalysis8.prepareImage(image12, (java.awt.image.ImageObserver) durationAnalysis13);
        durationAnalysis13.removeNotify();
        boolean boolean19 = durationAnalysis13.isFocusTraversalPolicySet();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        durationAnalysis13.addPropertyChangeListener("youtubeAnalysis.durationAnalysis[frame6,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", propertyChangeListener21);
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis4.setComponentZOrder((java.awt.Component) durationAnalysis13, 500);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(componentArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(inputContext11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        java.awt.MenuBar menuBar2 = null;
        durationAnalysis0.setMenuBar(menuBar2);
        boolean boolean4 = durationAnalysis0.isFocusOwner();
        boolean boolean5 = durationAnalysis0.isLightweight();
        durationAnalysis0.repaint((long) 32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        durationAnalysis0.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane31 = durationAnalysis0.getRootPane();
        java.awt.event.WindowStateListener windowStateListener32 = null;
        durationAnalysis0.removeWindowStateListener(windowStateListener32);
        java.awt.event.MouseListener mouseListener34 = null;
        durationAnalysis0.removeMouseListener(mouseListener34);
        boolean boolean36 = durationAnalysis0.getFocusableWindowState();
        java.awt.Component component37 = durationAnalysis0.getMostRecentFocusOwner();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jRootPane31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(component37);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        java.awt.MenuBar menuBar2 = null;
        durationAnalysis0.setMenuBar(menuBar2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
        durationAnalysis0.removeHierarchyBoundsListener(hierarchyBoundsListener4);
        youtubeAnalysis.durationAnalysis durationAnalysis6 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis6.removeAll();
        boolean boolean8 = durationAnalysis6.isAutoRequestFocus();
        java.awt.Component component9 = durationAnalysis6.getMostRecentFocusOwner();
        java.awt.event.HierarchyListener hierarchyListener10 = null;
        durationAnalysis6.removeHierarchyListener(hierarchyListener10);
        boolean boolean12 = durationAnalysis6.isResizable();
        durationAnalysis6.setFocusableWindowState(true);
        boolean boolean15 = durationAnalysis0.isFocusCycleRoot((java.awt.Container) durationAnalysis6);
        java.awt.Rectangle rectangle16 = durationAnalysis0.bounds();
        youtubeAnalysis.durationAnalysis durationAnalysis17 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis17.removeAll();
        int int19 = durationAnalysis17.getDefaultCloseOperation();
        boolean boolean20 = durationAnalysis17.isMinimumSizeSet();
        java.awt.Image image21 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis22 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar23 = null;
        durationAnalysis22.setJMenuBar(jMenuBar23);
        boolean boolean25 = durationAnalysis17.prepareImage(image21, (java.awt.image.ImageObserver) durationAnalysis22);
        youtubeAnalysis.durationAnalysis durationAnalysis26 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis26.removeAll();
        int int28 = durationAnalysis26.getDefaultCloseOperation();
        boolean boolean29 = durationAnalysis26.isMinimumSizeSet();
        boolean boolean30 = durationAnalysis22.isAncestorOf((java.awt.Component) durationAnalysis26);
        boolean boolean31 = durationAnalysis26.isUndecorated();
        youtubeAnalysis.durationAnalysis durationAnalysis32 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis32.removeAll();
        int int34 = durationAnalysis32.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext35 = durationAnalysis32.getInputContext();
        java.awt.Image image36 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis37 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis37.removeAll();
        java.awt.Graphics graphics39 = null;
        durationAnalysis37.paintComponents(graphics39);
        boolean boolean41 = durationAnalysis32.prepareImage(image36, (java.awt.image.ImageObserver) durationAnalysis37);
        java.awt.Dimension dimension42 = durationAnalysis37.getMaximumSize();
        java.awt.event.ComponentListener componentListener43 = null;
        durationAnalysis37.removeComponentListener(componentListener43);
        youtubeAnalysis.durationAnalysis durationAnalysis45 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis45.removeAll();
        int int47 = durationAnalysis45.getDefaultCloseOperation();
        java.awt.Rectangle rectangle48 = durationAnalysis45.getMaximizedBounds();
        java.awt.ComponentOrientation componentOrientation49 = durationAnalysis45.getComponentOrientation();
        durationAnalysis37.setComponentOrientation(componentOrientation49);
        java.awt.event.FocusListener focusListener51 = null;
        durationAnalysis37.addFocusListener(focusListener51);
        java.awt.Shape shape53 = durationAnalysis37.getShape();
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis0.add((java.awt.Component) durationAnalysis26, (java.lang.Object) durationAnalysis37, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(rectangle16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(inputContext35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(dimension42);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNull(rectangle48);
        org.junit.Assert.assertNotNull(componentOrientation49);
        org.junit.Assert.assertNull(shape53);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isOpaque();
        durationAnalysis0.firePropertyChange("", (byte) -1, (byte) 1);
        durationAnalysis0.setSize(32, 0);
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        durationAnalysis0.addInputMethodListener(inputMethodListener10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isForegroundSet();
        java.awt.Component[] componentArray3 = durationAnalysis0.getComponents();
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis4.isAutoRequestFocus();
        boolean boolean7 = durationAnalysis0.isAncestorOf((java.awt.Component) durationAnalysis4);
        durationAnalysis0.transferFocusUpCycle();
        durationAnalysis0.invalidate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(componentArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        durationAnalysis0.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane31 = durationAnalysis0.getRootPane();
        java.awt.ComponentOrientation componentOrientation32 = durationAnalysis0.getComponentOrientation();
        int int33 = durationAnalysis0.getHeight();
        java.awt.event.WindowStateListener windowStateListener34 = null;
        durationAnalysis0.addWindowStateListener(windowStateListener34);
        int int36 = durationAnalysis0.getCursorType();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jRootPane31);
        org.junit.Assert.assertNotNull(componentOrientation32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 500 + "'", int33 == 500);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext3 = durationAnalysis0.getInputContext();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis5.removeAll();
        java.awt.Graphics graphics7 = null;
        durationAnalysis5.paintComponents(graphics7);
        boolean boolean9 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis5.removeNotify();
        boolean boolean11 = durationAnalysis5.isFocusTraversalPolicySet();
        boolean boolean12 = durationAnalysis5.isEnabled();
        java.awt.Dimension dimension13 = durationAnalysis5.getMaximumSize();
        durationAnalysis5.disable();
        javax.swing.TransferHandler transferHandler15 = null;
        durationAnalysis5.setTransferHandler(transferHandler15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(inputContext3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dimension13);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        durationAnalysis0.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane31 = durationAnalysis0.getRootPane();
        java.awt.Color color32 = null;
        durationAnalysis0.setForeground(color32);
        durationAnalysis0.transferFocusUpCycle();
        java.awt.Graphics graphics35 = durationAnalysis0.getGraphics();
        javax.swing.TransferHandler transferHandler36 = durationAnalysis0.getTransferHandler();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jRootPane31);
        org.junit.Assert.assertNull(graphics35);
        org.junit.Assert.assertNull(transferHandler36);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        javax.swing.JLayeredPane jLayeredPane15 = durationAnalysis0.getLayeredPane();
        java.awt.event.MouseWheelListener mouseWheelListener16 = null;
        durationAnalysis0.addMouseWheelListener(mouseWheelListener16);
        java.awt.Event event18 = null;
        boolean boolean21 = durationAnalysis0.mouseDown(event18, 16, 13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(jLayeredPane15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        durationAnalysis0.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane31 = durationAnalysis0.getRootPane();
        java.awt.event.WindowStateListener windowStateListener32 = null;
        durationAnalysis0.removeWindowStateListener(windowStateListener32);
        boolean boolean34 = durationAnalysis0.isValid();
        java.awt.event.MouseListener mouseListener35 = null;
        durationAnalysis0.removeMouseListener(mouseListener35);
        boolean boolean37 = durationAnalysis0.isFocusTraversalPolicyProvider();
        java.awt.Component component38 = durationAnalysis0.getMostRecentFocusOwner();
        durationAnalysis0.addNotify();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jRootPane31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(component38);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        youtubeAnalysis.durationAnalysis durationAnalysis11 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis15.removeAll();
        boolean boolean17 = durationAnalysis11.prepareImage(image12, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis15);
        durationAnalysis15.revalidate();
        boolean boolean19 = durationAnalysis0.isFocusCycleRoot((java.awt.Container) durationAnalysis15);
        durationAnalysis0.validate();
        java.awt.Container container21 = durationAnalysis0.getFocusCycleRootAncestor();
        // The following exception was thrown during execution in test generation
        try {
            container21.setFocusable(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(container21);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.lang.String str7 = durationAnalysis4.getWarningString();
        int int8 = durationAnalysis4.getDefaultCloseOperation();
        boolean boolean9 = durationAnalysis4.isFontSet();
        java.awt.Container container10 = durationAnalysis4.getParent();
        java.awt.Event event11 = null;
        // The following exception was thrown during execution in test generation
        try {
            container10.deliverEvent(event11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(container10);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        java.util.List<java.awt.Image> imageList27 = durationAnalysis0.getIconImages();
        java.awt.Color color28 = durationAnalysis0.getForeground();
        durationAnalysis0.nextFocus();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(imageList27);
        org.junit.Assert.assertNull(color28);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isOpaque();
        durationAnalysis0.firePropertyChange("", (byte) -1, (byte) 1);
        java.lang.Object obj7 = durationAnalysis0.getTreeLock();
        durationAnalysis0.setFocusableWindowState(true);
        int int10 = durationAnalysis0.getWidth();
        durationAnalysis0.transferFocusDownCycle();
        java.io.PrintStream printStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis0.list(printStream12, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 800 + "'", int10 == 800);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        java.awt.Dimension dimension3 = null;
        durationAnalysis0.setMinimumSize(dimension3);
        boolean boolean5 = durationAnalysis0.isCursorSet();
        java.awt.Event event6 = null;
        boolean boolean9 = durationAnalysis0.mouseEnter(event6, 10, (int) (byte) 0);
        boolean boolean10 = durationAnalysis0.isFocusTraversalPolicyProvider();
        durationAnalysis0.removeNotify();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isOpaque();
        durationAnalysis0.firePropertyChange("", (byte) -1, (byte) 1);
        java.lang.Object obj7 = durationAnalysis0.getTreeLock();
        java.lang.String str8 = durationAnalysis0.getTitle();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        durationAnalysis0.addHierarchyBoundsListener(hierarchyBoundsListener9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Duration Analysis" + "'", str8, "Duration Analysis");
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        youtubeAnalysis.durationAnalysis durationAnalysis9 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis9.removeAll();
        int int11 = durationAnalysis9.getDefaultCloseOperation();
        boolean boolean12 = durationAnalysis9.isMinimumSizeSet();
        boolean boolean13 = durationAnalysis5.isAncestorOf((java.awt.Component) durationAnalysis9);
        boolean boolean14 = durationAnalysis9.isUndecorated();
        durationAnalysis9.setExtendedState((-1));
        boolean boolean17 = durationAnalysis9.getFocusTraversalKeysEnabled();
        java.awt.Dimension dimension18 = durationAnalysis9.getMaximumSize();
        java.awt.Shape shape19 = durationAnalysis9.getShape();
        java.awt.BufferCapabilities bufferCapabilities21 = null;
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis9.createBufferStrategy(7, bufferCapabilities21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No capabilities specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertNull(shape19);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isDisplayable();
        java.awt.event.FocusListener focusListener4 = null;
        durationAnalysis0.removeFocusListener(focusListener4);
        durationAnalysis0.transferFocusDownCycle();
        java.awt.event.ContainerListener containerListener7 = null;
        durationAnalysis0.addContainerListener(containerListener7);
        javax.swing.TransferHandler transferHandler9 = null;
        durationAnalysis0.setTransferHandler(transferHandler9);
        durationAnalysis0.firePropertyChange("youtubeAnalysis.durationAnalysis[frame5,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (byte) -1, (byte) 10);
        java.awt.event.InputMethodListener[] inputMethodListenerArray15 = durationAnalysis0.getInputMethodListeners();
        youtubeAnalysis.durationAnalysis durationAnalysis16 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis16.removeAll();
        java.awt.MenuBar menuBar18 = null;
        durationAnalysis16.setMenuBar(menuBar18);
        durationAnalysis16.nextFocus();
        java.awt.event.MouseListener mouseListener21 = null;
        durationAnalysis16.removeMouseListener(mouseListener21);
        java.util.Locale locale23 = durationAnalysis16.getLocale();
        durationAnalysis0.setLocale(locale23);
        java.awt.image.VolatileImage volatileImage27 = durationAnalysis0.createVolatileImage(11, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(inputMethodListenerArray15);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_IN");
        org.junit.Assert.assertNull(volatileImage27);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        boolean boolean11 = durationAnalysis0.isEnabled();
        boolean boolean12 = durationAnalysis0.getFocusableWindowState();
        java.awt.event.HierarchyListener[] hierarchyListenerArray13 = durationAnalysis0.getHierarchyListeners();
        durationAnalysis0.repaint();
        java.awt.Insets insets15 = durationAnalysis0.getInsets();
        java.awt.im.InputMethodRequests inputMethodRequests16 = durationAnalysis0.getInputMethodRequests();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(hierarchyListenerArray13);
        org.junit.Assert.assertNotNull(insets15);
        org.junit.Assert.assertNull(inputMethodRequests16);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext3 = durationAnalysis0.getInputContext();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis5.removeAll();
        java.awt.Graphics graphics7 = null;
        durationAnalysis5.paintComponents(graphics7);
        boolean boolean9 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis5.removeNotify();
        java.awt.image.ImageProducer imageProducer11 = null;
        java.awt.Image image12 = durationAnalysis5.createImage(imageProducer11);
        youtubeAnalysis.durationAnalysis durationAnalysis13 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis13.removeAll();
        int int15 = durationAnalysis13.getDefaultCloseOperation();
        boolean boolean16 = durationAnalysis13.isMinimumSizeSet();
        java.awt.Image image17 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis18 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar19 = null;
        durationAnalysis18.setJMenuBar(jMenuBar19);
        boolean boolean21 = durationAnalysis13.prepareImage(image17, (java.awt.image.ImageObserver) durationAnalysis18);
        durationAnalysis13.setLocation((int) (short) 0, 3);
        int int25 = durationAnalysis13.getX();
        java.awt.event.ComponentListener componentListener26 = null;
        durationAnalysis13.addComponentListener(componentListener26);
        youtubeAnalysis.durationAnalysis durationAnalysis28 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image29 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis32 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis32.removeAll();
        boolean boolean34 = durationAnalysis28.prepareImage(image29, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis32);
        java.awt.Event event35 = null;
        boolean boolean38 = durationAnalysis28.mouseUp(event35, 10, 10);
        durationAnalysis13.remove((java.awt.Component) durationAnalysis28);
        youtubeAnalysis.durationAnalysis durationAnalysis40 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis40.removeAll();
        boolean boolean42 = durationAnalysis40.isForegroundSet();
        java.lang.String str43 = durationAnalysis40.toString();
        javax.swing.TransferHandler transferHandler44 = durationAnalysis40.getTransferHandler();
        durationAnalysis40.transferFocusBackward();
        durationAnalysis40.setVisible(true);
        java.awt.Point point48 = durationAnalysis40.location();
        java.awt.Component component49 = durationAnalysis13.getComponentAt(point48);
        java.awt.Component component50 = durationAnalysis5.getComponentAt(point48);
        java.awt.Event event51 = null;
        boolean boolean54 = component50.mouseExit(event51, 800, (int) 'a');
        boolean boolean55 = component50.requestFocusInWindow();
        java.awt.event.ComponentListener componentListener56 = null;
        component50.removeComponentListener(componentListener56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(inputContext3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(image12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "youtubeAnalysis.durationAnalysis[frame129,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str43, "youtubeAnalysis.durationAnalysis[frame129,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertNull(transferHandler44);
        org.junit.Assert.assertNotNull(point48);
        org.junit.Assert.assertNotNull(component49);
        org.junit.Assert.assertNotNull(component50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        java.awt.MenuBar menuBar2 = null;
        durationAnalysis0.setMenuBar(menuBar2);
        durationAnalysis0.nextFocus();
        java.awt.event.MouseListener mouseListener5 = null;
        durationAnalysis0.removeMouseListener(mouseListener5);
        java.util.Locale locale7 = durationAnalysis0.getLocale();
        java.awt.GraphicsConfiguration graphicsConfiguration8 = durationAnalysis0.getGraphicsConfiguration();
        youtubeAnalysis.durationAnalysis durationAnalysis9 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis9.removeAll();
        int int11 = durationAnalysis9.getDefaultCloseOperation();
        boolean boolean12 = durationAnalysis9.isDisplayable();
        java.awt.event.FocusListener focusListener13 = null;
        durationAnalysis9.removeFocusListener(focusListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis15.removeAll();
        int int17 = durationAnalysis15.getDefaultCloseOperation();
        boolean boolean18 = durationAnalysis15.isDisplayable();
        boolean boolean19 = durationAnalysis15.isFocusTraversalPolicyProvider();
        java.awt.event.WindowListener windowListener20 = null;
        durationAnalysis15.addWindowListener(windowListener20);
        youtubeAnalysis.durationAnalysis durationAnalysis22 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis22.removeAll();
        int int24 = durationAnalysis22.getDefaultCloseOperation();
        java.awt.Dimension dimension25 = null;
        durationAnalysis22.setMinimumSize(dimension25);
        boolean boolean27 = durationAnalysis22.isCursorSet();
        youtubeAnalysis.durationAnalysis durationAnalysis28 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis28.removeAll();
        int int30 = durationAnalysis28.getDefaultCloseOperation();
        boolean boolean31 = durationAnalysis28.isMinimumSizeSet();
        java.awt.Image image32 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis33 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar34 = null;
        durationAnalysis33.setJMenuBar(jMenuBar34);
        boolean boolean36 = durationAnalysis28.prepareImage(image32, (java.awt.image.ImageObserver) durationAnalysis33);
        java.awt.Dimension dimension37 = null;
        java.awt.Dimension dimension38 = durationAnalysis28.getSize(dimension37);
        durationAnalysis22.setSize(dimension38);
        durationAnalysis15.setSize(dimension38);
        durationAnalysis9.setMaximumSize(dimension38);
        durationAnalysis0.setPreferredSize(dimension38);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_IN");
        org.junit.Assert.assertNotNull(graphicsConfiguration8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(dimension38);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isOpaque();
        durationAnalysis0.firePropertyChange("", (byte) -1, (byte) 1);
        java.lang.Object obj7 = durationAnalysis0.getTreeLock();
        int int8 = durationAnalysis0.getComponentCount();
        boolean boolean9 = durationAnalysis0.isResizable();
        java.awt.event.FocusEvent.Cause cause10 = null;
        durationAnalysis0.requestFocus(cause10);
        durationAnalysis0.transferFocus();
        java.awt.event.WindowStateListener windowStateListener13 = null;
        durationAnalysis0.addWindowStateListener(windowStateListener13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setFocusTraversalKeysEnabled(true);
        int int11 = durationAnalysis0.countComponents();
        youtubeAnalysis.durationAnalysis durationAnalysis12 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis12.removeAll();
        int int14 = durationAnalysis12.getDefaultCloseOperation();
        boolean boolean15 = durationAnalysis12.isMinimumSizeSet();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis17 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar18 = null;
        durationAnalysis17.setJMenuBar(jMenuBar18);
        boolean boolean20 = durationAnalysis12.prepareImage(image16, (java.awt.image.ImageObserver) durationAnalysis17);
        durationAnalysis12.setLocation((int) (short) 0, 3);
        int int24 = durationAnalysis12.getX();
        java.awt.event.ComponentListener componentListener25 = null;
        durationAnalysis12.addComponentListener(componentListener25);
        durationAnalysis12.move((int) (byte) 0, 2);
        java.awt.Dimension dimension30 = durationAnalysis12.minimumSize();
        durationAnalysis0.setMaximumSize(dimension30);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener32 = null;
        durationAnalysis0.removeHierarchyBoundsListener(hierarchyBoundsListener32);
        boolean boolean34 = durationAnalysis0.isUndecorated();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dimension30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        java.awt.event.WindowStateListener windowStateListener12 = null;
        durationAnalysis0.addWindowStateListener(windowStateListener12);
        durationAnalysis0.requestFocus();
        java.awt.Rectangle rectangle15 = durationAnalysis0.getBounds();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(rectangle15);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isOpaque();
        durationAnalysis0.firePropertyChange("", (byte) -1, (byte) 1);
        java.lang.Object obj7 = durationAnalysis0.getTreeLock();
        int int8 = durationAnalysis0.getComponentCount();
        boolean boolean9 = durationAnalysis0.isResizable();
        java.awt.event.FocusEvent.Cause cause10 = null;
        durationAnalysis0.requestFocus(cause10);
        java.awt.Image image12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis13 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis13.removeAll();
        int int15 = durationAnalysis13.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext16 = durationAnalysis13.getInputContext();
        boolean boolean17 = durationAnalysis0.prepareImage(image12, (java.awt.image.ImageObserver) durationAnalysis13);
        durationAnalysis13.repaint((long) ' ');
        durationAnalysis13.removeNotify();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(inputContext16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        youtubeAnalysis.durationAnalysis durationAnalysis11 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis15.removeAll();
        boolean boolean17 = durationAnalysis11.prepareImage(image12, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis15);
        durationAnalysis15.revalidate();
        boolean boolean19 = durationAnalysis0.isFocusCycleRoot((java.awt.Container) durationAnalysis15);
        durationAnalysis0.validate();
        java.beans.PropertyChangeListener propertyChangeListener21 = null;
        durationAnalysis0.addPropertyChangeListener(propertyChangeListener21);
        java.awt.Image image25 = durationAnalysis0.createImage((int) 'a', (int) '#');
        java.awt.Event event26 = null;
        boolean boolean28 = durationAnalysis0.keyUp(event26, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(image25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext3 = durationAnalysis0.getInputContext();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis5.removeAll();
        java.awt.Graphics graphics7 = null;
        durationAnalysis5.paintComponents(graphics7);
        boolean boolean9 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        java.awt.Dimension dimension10 = durationAnalysis5.getMaximumSize();
        java.awt.event.ComponentListener componentListener11 = null;
        durationAnalysis5.removeComponentListener(componentListener11);
        youtubeAnalysis.durationAnalysis durationAnalysis13 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis13.removeAll();
        int int15 = durationAnalysis13.getDefaultCloseOperation();
        java.awt.Rectangle rectangle16 = durationAnalysis13.getMaximizedBounds();
        java.awt.ComponentOrientation componentOrientation17 = durationAnalysis13.getComponentOrientation();
        durationAnalysis5.setComponentOrientation(componentOrientation17);
        java.awt.event.FocusListener focusListener19 = null;
        durationAnalysis5.addFocusListener(focusListener19);
        java.awt.Shape shape21 = durationAnalysis5.getShape();
        java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet23 = durationAnalysis5.getFocusTraversalKeys(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertNotNull(inputContext3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dimension10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(rectangle16);
        org.junit.Assert.assertNotNull(componentOrientation17);
        org.junit.Assert.assertNull(shape21);
        org.junit.Assert.assertNotNull(aWTKeyStrokeSet23);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isAutoRequestFocus();
        java.awt.Component component3 = durationAnalysis0.getMostRecentFocusOwner();
        durationAnalysis0.pack();
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis5.removeAll();
        int int7 = durationAnalysis5.getDefaultCloseOperation();
        boolean boolean8 = durationAnalysis5.isMinimumSizeSet();
        java.awt.Image image9 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis10 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar11 = null;
        durationAnalysis10.setJMenuBar(jMenuBar11);
        boolean boolean13 = durationAnalysis5.prepareImage(image9, (java.awt.image.ImageObserver) durationAnalysis10);
        durationAnalysis5.setLocation((int) (short) 0, 3);
        int int17 = durationAnalysis5.getX();
        java.awt.event.ComponentListener componentListener18 = null;
        durationAnalysis5.addComponentListener(componentListener18);
        youtubeAnalysis.durationAnalysis durationAnalysis20 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image21 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis24 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis24.removeAll();
        boolean boolean26 = durationAnalysis20.prepareImage(image21, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis24);
        java.awt.Event event27 = null;
        boolean boolean30 = durationAnalysis20.mouseUp(event27, 10, 10);
        durationAnalysis5.remove((java.awt.Component) durationAnalysis20);
        durationAnalysis5.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane36 = durationAnalysis5.getRootPane();
        java.lang.String str37 = jRootPane36.getName();
        youtubeAnalysis.durationAnalysis durationAnalysis38 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis38.removeAll();
        java.awt.MenuBar menuBar40 = null;
        durationAnalysis38.setMenuBar(menuBar40);
        boolean boolean42 = durationAnalysis38.isFocusOwner();
        boolean boolean43 = durationAnalysis38.isLightweight();
        youtubeAnalysis.durationAnalysis durationAnalysis44 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image45 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis48 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis48.removeAll();
        boolean boolean50 = durationAnalysis44.prepareImage(image45, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis48);
        java.awt.Event event51 = null;
        boolean boolean54 = durationAnalysis44.mouseUp(event51, 10, 10);
        int int55 = durationAnalysis44.getState();
        java.awt.Image image56 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis59 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis59.removeAll();
        int int61 = durationAnalysis59.getDefaultCloseOperation();
        java.awt.Dimension dimension62 = durationAnalysis59.getMaximumSize();
        int int63 = durationAnalysis44.checkImage(image56, 12, 100, (java.awt.image.ImageObserver) durationAnalysis59);
        youtubeAnalysis.durationAnalysis durationAnalysis64 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis64.removeAll();
        boolean boolean66 = durationAnalysis64.isForegroundSet();
        java.lang.String str67 = durationAnalysis64.toString();
        javax.swing.TransferHandler transferHandler68 = durationAnalysis64.getTransferHandler();
        durationAnalysis64.transferFocusBackward();
        durationAnalysis64.setVisible(true);
        java.awt.Point point72 = durationAnalysis64.location();
        boolean boolean73 = durationAnalysis44.contains(point72);
        java.awt.Point point74 = durationAnalysis38.getLocation(point72);
        boolean boolean75 = jRootPane36.contains(point74);
        java.awt.Point point76 = durationAnalysis0.getLocation(point74);
        durationAnalysis0.repaint((long) (byte) 100, (int) (short) 1, (int) (short) 0, (int) (short) 10, 13);
        java.awt.event.FocusEvent.Cause cause83 = null;
        durationAnalysis0.requestFocus(cause83);
        java.io.PrintStream printStream85 = null;
        // The following exception was thrown during execution in test generation
        try {
            durationAnalysis0.list(printStream85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(component3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jRootPane36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 3 + "'", int61 == 3);
        org.junit.Assert.assertNotNull(dimension62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 32 + "'", int63 == 32);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str67 + "' != '" + "youtubeAnalysis.durationAnalysis[frame130,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str67, "youtubeAnalysis.durationAnalysis[frame130,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertNull(transferHandler68);
        org.junit.Assert.assertNotNull(point72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(point74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(point76);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Event event4 = null;
        java.lang.Object obj5 = null;
        boolean boolean6 = durationAnalysis0.gotFocus(event4, obj5);
        java.awt.event.HierarchyListener hierarchyListener7 = null;
        durationAnalysis0.addHierarchyListener(hierarchyListener7);
        java.awt.image.VolatileImage volatileImage11 = durationAnalysis0.createVolatileImage((int) (byte) 1, (int) (short) -1);
        java.awt.event.WindowStateListener[] windowStateListenerArray12 = durationAnalysis0.getWindowStateListeners();
        javax.swing.JMenuBar jMenuBar13 = durationAnalysis0.getJMenuBar();
        java.awt.Event event14 = null;
        // The following exception was thrown during execution in test generation
        try {
            jMenuBar13.deliverEvent(event14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(volatileImage11);
        org.junit.Assert.assertNotNull(windowStateListenerArray12);
        org.junit.Assert.assertNull(jMenuBar13);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        java.awt.MenuBar menuBar2 = null;
        durationAnalysis0.setMenuBar(menuBar2);
        durationAnalysis0.nextFocus();
        java.awt.Graphics graphics5 = null;
        durationAnalysis0.paint(graphics5);
        java.awt.Color color7 = durationAnalysis0.getBackground();
        org.junit.Assert.assertNotNull(color7);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isAutoRequestFocus();
        java.awt.Component component3 = durationAnalysis0.getMostRecentFocusOwner();
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        durationAnalysis0.removeHierarchyListener(hierarchyListener4);
        boolean boolean6 = durationAnalysis0.isAlwaysOnTopSupported();
        java.awt.Event event7 = null;
        boolean boolean9 = durationAnalysis0.keyUp(event7, (int) '4');
        boolean boolean10 = durationAnalysis0.isAutoRequestFocus();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior11 = durationAnalysis0.getBaselineResizeBehavior();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(component3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior11 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior11.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        boolean boolean2 = durationAnalysis0.isForegroundSet();
        java.lang.String str3 = durationAnalysis0.toString();
        javax.swing.TransferHandler transferHandler4 = durationAnalysis0.getTransferHandler();
        java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet6 = durationAnalysis0.getFocusTraversalKeys(0);
        boolean boolean7 = durationAnalysis0.isResizable();
        youtubeAnalysis.durationAnalysis durationAnalysis8 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis8.removeAll();
        int int10 = durationAnalysis8.getDefaultCloseOperation();
        boolean boolean11 = durationAnalysis8.isMinimumSizeSet();
        java.awt.Image image12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis13 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar14 = null;
        durationAnalysis13.setJMenuBar(jMenuBar14);
        boolean boolean16 = durationAnalysis8.prepareImage(image12, (java.awt.image.ImageObserver) durationAnalysis13);
        durationAnalysis8.setLocation((int) (short) 0, 3);
        int int20 = durationAnalysis8.getX();
        java.awt.event.ComponentListener componentListener21 = null;
        durationAnalysis8.addComponentListener(componentListener21);
        youtubeAnalysis.durationAnalysis durationAnalysis23 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image24 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis27 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis27.removeAll();
        boolean boolean29 = durationAnalysis23.prepareImage(image24, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis27);
        java.awt.Event event30 = null;
        boolean boolean33 = durationAnalysis23.mouseUp(event30, 10, 10);
        durationAnalysis8.remove((java.awt.Component) durationAnalysis23);
        durationAnalysis8.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane39 = durationAnalysis8.getRootPane();
        java.awt.event.WindowStateListener windowStateListener40 = null;
        durationAnalysis8.removeWindowStateListener(windowStateListener40);
        boolean boolean42 = durationAnalysis8.isValid();
        youtubeAnalysis.durationAnalysis durationAnalysis43 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis43.removeAll();
        java.awt.Graphics graphics45 = null;
        durationAnalysis43.paintComponents(graphics45);
        java.awt.Image image47 = durationAnalysis43.getIconImage();
        java.awt.Rectangle rectangle48 = durationAnalysis43.bounds();
        durationAnalysis8.setBounds(rectangle48);
        java.awt.Rectangle rectangle50 = durationAnalysis0.getBounds(rectangle48);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "youtubeAnalysis.durationAnalysis[frame131,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str3, "youtubeAnalysis.durationAnalysis[frame131,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertNull(transferHandler4);
        org.junit.Assert.assertNotNull(aWTKeyStrokeSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jRootPane39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(image47);
        org.junit.Assert.assertNotNull(rectangle48);
        org.junit.Assert.assertNotNull(rectangle50);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        java.awt.Dimension dimension3 = null;
        durationAnalysis0.setMinimumSize(dimension3);
        boolean boolean5 = durationAnalysis0.isCursorSet();
        java.awt.Event event6 = null;
        boolean boolean9 = durationAnalysis0.mouseEnter(event6, 10, (int) (byte) 0);
        java.awt.Graphics graphics10 = null;
        durationAnalysis0.printAll(graphics10);
        java.awt.GraphicsConfiguration graphicsConfiguration12 = durationAnalysis0.getGraphicsConfiguration();
        youtubeAnalysis.durationAnalysis durationAnalysis13 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis13.removeAll();
        int int15 = durationAnalysis13.getDefaultCloseOperation();
        boolean boolean16 = durationAnalysis13.isMinimumSizeSet();
        java.awt.Event event17 = null;
        java.lang.Object obj18 = null;
        boolean boolean19 = durationAnalysis13.gotFocus(event17, obj18);
        java.awt.event.HierarchyListener hierarchyListener20 = null;
        durationAnalysis13.addHierarchyListener(hierarchyListener20);
        youtubeAnalysis.durationAnalysis durationAnalysis22 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image23 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis26 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis26.removeAll();
        boolean boolean28 = durationAnalysis22.prepareImage(image23, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis26);
        java.awt.Event event29 = null;
        boolean boolean32 = durationAnalysis22.mouseUp(event29, 10, 10);
        youtubeAnalysis.durationAnalysis durationAnalysis33 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image34 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis37 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis37.removeAll();
        boolean boolean39 = durationAnalysis33.prepareImage(image34, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis37);
        durationAnalysis37.revalidate();
        boolean boolean41 = durationAnalysis22.isFocusCycleRoot((java.awt.Container) durationAnalysis37);
        durationAnalysis13.setLocationRelativeTo((java.awt.Component) durationAnalysis37);
        boolean boolean43 = durationAnalysis37.isFocusTraversalPolicyProvider();
        java.awt.Event event44 = null;
        boolean boolean46 = durationAnalysis37.keyDown(event44, 0);
        youtubeAnalysis.durationAnalysis durationAnalysis47 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis47.removeAll();
        boolean boolean49 = durationAnalysis47.isAutoRequestFocus();
        java.awt.Component component50 = durationAnalysis47.getMostRecentFocusOwner();
        durationAnalysis47.pack();
        java.awt.image.ImageProducer imageProducer52 = null;
        java.awt.Image image53 = durationAnalysis47.createImage(imageProducer52);
        youtubeAnalysis.durationAnalysis durationAnalysis54 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis54.removeAll();
        int int56 = durationAnalysis54.getDefaultCloseOperation();
        boolean boolean57 = durationAnalysis54.isDisplayable();
        boolean boolean58 = durationAnalysis54.isFocusTraversalPolicyProvider();
        java.awt.event.MouseMotionListener mouseMotionListener59 = null;
        durationAnalysis54.addMouseMotionListener(mouseMotionListener59);
        java.awt.event.ComponentListener componentListener61 = null;
        durationAnalysis54.removeComponentListener(componentListener61);
        java.awt.event.FocusEvent.Cause cause63 = null;
        durationAnalysis54.requestFocus(cause63);
        int int65 = durationAnalysis37.checkImage(image53, (java.awt.image.ImageObserver) durationAnalysis54);
        youtubeAnalysis.durationAnalysis durationAnalysis66 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis66.removeAll();
        int int68 = durationAnalysis66.getDefaultCloseOperation();
        boolean boolean69 = durationAnalysis66.isMinimumSizeSet();
        java.awt.Event event70 = null;
        java.lang.Object obj71 = null;
        boolean boolean72 = durationAnalysis66.gotFocus(event70, obj71);
        java.awt.event.HierarchyListener hierarchyListener73 = null;
        durationAnalysis66.addHierarchyListener(hierarchyListener73);
        youtubeAnalysis.durationAnalysis durationAnalysis75 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image76 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis79 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis79.removeAll();
        boolean boolean81 = durationAnalysis75.prepareImage(image76, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis79);
        java.awt.Event event82 = null;
        boolean boolean85 = durationAnalysis75.mouseUp(event82, 10, 10);
        youtubeAnalysis.durationAnalysis durationAnalysis86 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image87 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis90 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis90.removeAll();
        boolean boolean92 = durationAnalysis86.prepareImage(image87, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis90);
        durationAnalysis90.revalidate();
        boolean boolean94 = durationAnalysis75.isFocusCycleRoot((java.awt.Container) durationAnalysis90);
        durationAnalysis66.setLocationRelativeTo((java.awt.Component) durationAnalysis90);
        boolean boolean96 = durationAnalysis90.isFocusTraversalPolicyProvider();
        int int97 = durationAnalysis0.checkImage(image53, (java.awt.image.ImageObserver) durationAnalysis90);
        java.awt.MenuBar menuBar98 = null;
        durationAnalysis0.setMenuBar(menuBar98);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(graphicsConfiguration12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(component50);
        org.junit.Assert.assertNotNull(image53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        boolean boolean11 = durationAnalysis0.isEnabled();
        boolean boolean12 = durationAnalysis0.getFocusableWindowState();
        java.awt.event.HierarchyListener[] hierarchyListenerArray13 = durationAnalysis0.getHierarchyListeners();
        durationAnalysis0.repaint();
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis15.removeAll();
        boolean boolean17 = durationAnalysis15.isOpaque();
        durationAnalysis15.firePropertyChange("", (byte) -1, (byte) 1);
        durationAnalysis15.setSize(32, 0);
        int int25 = durationAnalysis0.getComponentZOrder((java.awt.Component) durationAnalysis15);
        java.awt.event.WindowFocusListener windowFocusListener26 = null;
        durationAnalysis15.removeWindowFocusListener(windowFocusListener26);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(hierarchyListenerArray13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Event event4 = null;
        java.lang.Object obj5 = null;
        boolean boolean6 = durationAnalysis0.gotFocus(event4, obj5);
        java.awt.event.HierarchyListener hierarchyListener7 = null;
        durationAnalysis0.addHierarchyListener(hierarchyListener7);
        java.awt.Dimension dimension9 = durationAnalysis0.minimumSize();
        java.beans.PropertyChangeListener propertyChangeListener11 = null;
        durationAnalysis0.removePropertyChangeListener("youtubeAnalysis.durationAnalysis[frame71,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", propertyChangeListener11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dimension9);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        youtubeAnalysis.durationAnalysis durationAnalysis9 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis9.removeAll();
        int int11 = durationAnalysis9.getDefaultCloseOperation();
        boolean boolean12 = durationAnalysis9.isMinimumSizeSet();
        boolean boolean13 = durationAnalysis5.isAncestorOf((java.awt.Component) durationAnalysis9);
        java.awt.Point point15 = durationAnalysis9.getMousePosition(true);
        javax.swing.TransferHandler transferHandler16 = null;
        durationAnalysis9.setTransferHandler(transferHandler16);
        durationAnalysis9.invalidate();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(point15);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isDisplayable();
        boolean boolean4 = durationAnalysis0.isFocusTraversalPolicyProvider();
        java.awt.event.WindowListener windowListener5 = null;
        durationAnalysis0.addWindowListener(windowListener5);
        youtubeAnalysis.durationAnalysis durationAnalysis7 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis7.removeAll();
        int int9 = durationAnalysis7.getDefaultCloseOperation();
        java.awt.Dimension dimension10 = null;
        durationAnalysis7.setMinimumSize(dimension10);
        boolean boolean12 = durationAnalysis7.isCursorSet();
        youtubeAnalysis.durationAnalysis durationAnalysis13 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis13.removeAll();
        int int15 = durationAnalysis13.getDefaultCloseOperation();
        boolean boolean16 = durationAnalysis13.isMinimumSizeSet();
        java.awt.Image image17 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis18 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar19 = null;
        durationAnalysis18.setJMenuBar(jMenuBar19);
        boolean boolean21 = durationAnalysis13.prepareImage(image17, (java.awt.image.ImageObserver) durationAnalysis18);
        java.awt.Dimension dimension22 = null;
        java.awt.Dimension dimension23 = durationAnalysis13.getSize(dimension22);
        durationAnalysis7.setSize(dimension23);
        durationAnalysis0.setSize(dimension23);
        boolean boolean26 = durationAnalysis0.hasFocus();
        java.beans.PropertyChangeListener propertyChangeListener28 = null;
        durationAnalysis0.addPropertyChangeListener("youtubeAnalysis.durationAnalysis[frame1,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", propertyChangeListener28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dimension23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        boolean boolean11 = durationAnalysis0.isEnabled();
        boolean boolean12 = durationAnalysis0.getFocusableWindowState();
        java.awt.event.HierarchyListener[] hierarchyListenerArray13 = durationAnalysis0.getHierarchyListeners();
        durationAnalysis0.repaint();
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis15.removeAll();
        boolean boolean17 = durationAnalysis15.isOpaque();
        durationAnalysis15.firePropertyChange("", (byte) -1, (byte) 1);
        durationAnalysis15.setSize(32, 0);
        int int25 = durationAnalysis0.getComponentZOrder((java.awt.Component) durationAnalysis15);
        java.awt.event.MouseMotionListener mouseMotionListener26 = null;
        durationAnalysis0.addMouseMotionListener(mouseMotionListener26);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(hierarchyListenerArray13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        boolean boolean7 = durationAnalysis0.isFocusableWindow();
        java.awt.Graphics graphics8 = null;
        durationAnalysis0.paintAll(graphics8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        int int11 = durationAnalysis0.getState();
        java.awt.Image image12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis15.removeAll();
        int int17 = durationAnalysis15.getDefaultCloseOperation();
        java.awt.Dimension dimension18 = durationAnalysis15.getMaximumSize();
        int int19 = durationAnalysis0.checkImage(image12, 12, 100, (java.awt.image.ImageObserver) durationAnalysis15);
        youtubeAnalysis.durationAnalysis durationAnalysis20 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis20.removeAll();
        boolean boolean22 = durationAnalysis20.isForegroundSet();
        java.lang.String str23 = durationAnalysis20.toString();
        javax.swing.TransferHandler transferHandler24 = durationAnalysis20.getTransferHandler();
        durationAnalysis20.transferFocusBackward();
        durationAnalysis20.setVisible(true);
        java.awt.Point point28 = durationAnalysis20.location();
        boolean boolean29 = durationAnalysis0.contains(point28);
        java.awt.MenuComponent menuComponent30 = null;
        durationAnalysis0.remove(menuComponent30);
        durationAnalysis0.enableInputMethods(true);
        boolean boolean34 = durationAnalysis0.isDoubleBuffered();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(dimension18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "youtubeAnalysis.durationAnalysis[frame133,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str23, "youtubeAnalysis.durationAnalysis[frame133,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertNull(transferHandler24);
        org.junit.Assert.assertNotNull(point28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image1 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis4 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis4.removeAll();
        boolean boolean6 = durationAnalysis0.prepareImage(image1, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis4);
        java.awt.Event event7 = null;
        boolean boolean10 = durationAnalysis0.mouseUp(event7, 10, 10);
        youtubeAnalysis.durationAnalysis durationAnalysis11 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image12 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis15.removeAll();
        boolean boolean17 = durationAnalysis11.prepareImage(image12, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis15);
        durationAnalysis15.revalidate();
        boolean boolean19 = durationAnalysis0.isFocusCycleRoot((java.awt.Container) durationAnalysis15);
        java.lang.Object obj20 = durationAnalysis15.getTreeLock();
        durationAnalysis15.setAutoRequestFocus(false);
        java.lang.Object obj23 = durationAnalysis15.getTreeLock();
        int int24 = durationAnalysis15.getHeight();
        java.awt.event.WindowListener windowListener25 = null;
        durationAnalysis15.removeWindowListener(windowListener25);
        youtubeAnalysis.durationAnalysis durationAnalysis27 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis27.removeAll();
        int int29 = durationAnalysis27.getDefaultCloseOperation();
        boolean boolean30 = durationAnalysis27.isDisplayable();
        boolean boolean31 = durationAnalysis27.isFocusTraversalPolicyProvider();
        java.awt.event.WindowListener windowListener32 = null;
        durationAnalysis27.addWindowListener(windowListener32);
        youtubeAnalysis.durationAnalysis durationAnalysis34 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis34.removeAll();
        int int36 = durationAnalysis34.getDefaultCloseOperation();
        java.awt.Dimension dimension37 = null;
        durationAnalysis34.setMinimumSize(dimension37);
        boolean boolean39 = durationAnalysis34.isCursorSet();
        youtubeAnalysis.durationAnalysis durationAnalysis40 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis40.removeAll();
        int int42 = durationAnalysis40.getDefaultCloseOperation();
        boolean boolean43 = durationAnalysis40.isMinimumSizeSet();
        java.awt.Image image44 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis45 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar46 = null;
        durationAnalysis45.setJMenuBar(jMenuBar46);
        boolean boolean48 = durationAnalysis40.prepareImage(image44, (java.awt.image.ImageObserver) durationAnalysis45);
        java.awt.Dimension dimension49 = null;
        java.awt.Dimension dimension50 = durationAnalysis40.getSize(dimension49);
        durationAnalysis34.setSize(dimension50);
        durationAnalysis27.setSize(dimension50);
        durationAnalysis15.setMaximumSize(dimension50);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 500 + "'", int24 == 500);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(dimension50);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        javax.swing.TransferHandler transferHandler12 = durationAnalysis0.getTransferHandler();
        durationAnalysis0.revalidate();
        boolean boolean14 = durationAnalysis0.requestFocusInWindow();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(transferHandler12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        java.awt.Event event2 = null;
        boolean boolean5 = durationAnalysis0.mouseUp(event2, 0, (int) '#');
        durationAnalysis0.reshape(10, (int) (short) 1, (int) '#', (int) (byte) 100);
        int int11 = durationAnalysis0.getComponentCount();
        float float12 = durationAnalysis0.getOpacity();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Image image4 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis5 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar6 = null;
        durationAnalysis5.setJMenuBar(jMenuBar6);
        boolean boolean8 = durationAnalysis0.prepareImage(image4, (java.awt.image.ImageObserver) durationAnalysis5);
        durationAnalysis0.setLocation((int) (short) 0, 3);
        int int12 = durationAnalysis0.getX();
        java.awt.event.ComponentListener componentListener13 = null;
        durationAnalysis0.addComponentListener(componentListener13);
        youtubeAnalysis.durationAnalysis durationAnalysis15 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image16 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis19 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis19.removeAll();
        boolean boolean21 = durationAnalysis15.prepareImage(image16, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis19);
        java.awt.Event event22 = null;
        boolean boolean25 = durationAnalysis15.mouseUp(event22, 10, 10);
        durationAnalysis0.remove((java.awt.Component) durationAnalysis15);
        durationAnalysis0.firePropertyChange("hi!", 10.0f, (float) 'a');
        javax.swing.JRootPane jRootPane31 = durationAnalysis0.getRootPane();
        java.awt.event.WindowStateListener windowStateListener32 = null;
        durationAnalysis0.removeWindowStateListener(windowStateListener32);
        boolean boolean34 = durationAnalysis0.isValid();
        youtubeAnalysis.durationAnalysis durationAnalysis35 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis35.removeAll();
        java.awt.Graphics graphics37 = null;
        durationAnalysis35.paintComponents(graphics37);
        java.awt.Image image39 = durationAnalysis35.getIconImage();
        java.awt.Rectangle rectangle40 = durationAnalysis35.bounds();
        durationAnalysis0.setBounds(rectangle40);
        durationAnalysis0.show(false);
        java.beans.PropertyChangeListener propertyChangeListener44 = null;
        durationAnalysis0.addPropertyChangeListener(propertyChangeListener44);
        java.awt.event.FocusEvent.Cause cause46 = null;
        boolean boolean47 = durationAnalysis0.requestFocusInWindow(cause46);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jRootPane31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(image39);
        org.junit.Assert.assertNotNull(rectangle40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isDisplayable();
        java.awt.event.FocusListener focusListener4 = null;
        durationAnalysis0.removeFocusListener(focusListener4);
        youtubeAnalysis.durationAnalysis durationAnalysis6 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis6.removeAll();
        boolean boolean8 = durationAnalysis6.isForegroundSet();
        java.lang.String str9 = durationAnalysis6.toString();
        durationAnalysis6.move((int) (byte) -1, (int) '#');
        youtubeAnalysis.durationAnalysis durationAnalysis13 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis13.removeAll();
        int int15 = durationAnalysis13.getDefaultCloseOperation();
        java.awt.im.InputContext inputContext16 = durationAnalysis13.getInputContext();
        java.awt.Image image17 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis18 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis18.removeAll();
        java.awt.Graphics graphics20 = null;
        durationAnalysis18.paintComponents(graphics20);
        boolean boolean22 = durationAnalysis13.prepareImage(image17, (java.awt.image.ImageObserver) durationAnalysis18);
        durationAnalysis18.removeNotify();
        java.awt.image.ImageProducer imageProducer24 = null;
        java.awt.Image image25 = durationAnalysis18.createImage(imageProducer24);
        youtubeAnalysis.durationAnalysis durationAnalysis26 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis26.removeAll();
        int int28 = durationAnalysis26.getDefaultCloseOperation();
        boolean boolean29 = durationAnalysis26.isMinimumSizeSet();
        java.awt.Image image30 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis31 = new youtubeAnalysis.durationAnalysis();
        javax.swing.JMenuBar jMenuBar32 = null;
        durationAnalysis31.setJMenuBar(jMenuBar32);
        boolean boolean34 = durationAnalysis26.prepareImage(image30, (java.awt.image.ImageObserver) durationAnalysis31);
        durationAnalysis26.setLocation((int) (short) 0, 3);
        int int38 = durationAnalysis26.getX();
        java.awt.event.ComponentListener componentListener39 = null;
        durationAnalysis26.addComponentListener(componentListener39);
        youtubeAnalysis.durationAnalysis durationAnalysis41 = new youtubeAnalysis.durationAnalysis();
        java.awt.Image image42 = null;
        youtubeAnalysis.durationAnalysis durationAnalysis45 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis45.removeAll();
        boolean boolean47 = durationAnalysis41.prepareImage(image42, (int) (byte) -1, (int) (byte) 10, (java.awt.image.ImageObserver) durationAnalysis45);
        java.awt.Event event48 = null;
        boolean boolean51 = durationAnalysis41.mouseUp(event48, 10, 10);
        durationAnalysis26.remove((java.awt.Component) durationAnalysis41);
        youtubeAnalysis.durationAnalysis durationAnalysis53 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis53.removeAll();
        boolean boolean55 = durationAnalysis53.isForegroundSet();
        java.lang.String str56 = durationAnalysis53.toString();
        javax.swing.TransferHandler transferHandler57 = durationAnalysis53.getTransferHandler();
        durationAnalysis53.transferFocusBackward();
        durationAnalysis53.setVisible(true);
        java.awt.Point point61 = durationAnalysis53.location();
        java.awt.Component component62 = durationAnalysis26.getComponentAt(point61);
        java.awt.Component component63 = durationAnalysis18.getComponentAt(point61);
        java.awt.Component component64 = durationAnalysis6.findComponentAt(point61);
        boolean boolean65 = durationAnalysis0.contains(point61);
        javax.swing.JLayeredPane jLayeredPane66 = durationAnalysis0.getLayeredPane();
        java.awt.Graphics graphics67 = null;
        durationAnalysis0.printComponents(graphics67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "youtubeAnalysis.durationAnalysis[frame134,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str9, "youtubeAnalysis.durationAnalysis[frame134,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(inputContext16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(image25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str56 + "' != '" + "youtubeAnalysis.durationAnalysis[frame135,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str56, "youtubeAnalysis.durationAnalysis[frame135,100,100,800x500,invalid,hidden,layout=java.awt.BorderLayout,title=Duration Analysis,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertNull(transferHandler57);
        org.junit.Assert.assertNotNull(point61);
        org.junit.Assert.assertNotNull(component62);
        org.junit.Assert.assertNotNull(component63);
        org.junit.Assert.assertNull(component64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(jLayeredPane66);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        youtubeAnalysis.durationAnalysis durationAnalysis0 = new youtubeAnalysis.durationAnalysis();
        durationAnalysis0.removeAll();
        int int2 = durationAnalysis0.getDefaultCloseOperation();
        boolean boolean3 = durationAnalysis0.isMinimumSizeSet();
        java.awt.Event event4 = null;
        java.lang.Object obj5 = null;
        boolean boolean6 = durationAnalysis0.gotFocus(event4, obj5);
        int int7 = durationAnalysis0.getY();
        java.awt.Component component8 = durationAnalysis0.getFocusOwner();
        boolean boolean9 = durationAnalysis0.getIgnoreRepaint();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(component8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }
}
