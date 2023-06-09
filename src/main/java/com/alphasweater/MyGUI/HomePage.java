package com.alphasweater.MyGUI;
/* Author: Chad Fairlie
*  Pseudonym: AlphaSweater
*  Student Number: ST10269509
---------------------------------------------------------------------------------------------------------------------*/

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.Locale;

public class HomePage {
    DefaultTableModel model = new DefaultTableModel();
    protected JPanel panel;
    protected JButton btnLogOut;
    protected JLabel lblWelcome;
    protected JLabel lblTitle;
    protected JPanel JPanelCentre;
    protected JButton btnAddTasks;
    protected JTable tblTasksList;
    protected JScrollPane tblScrollPane;
    protected JButton btnShowReport;
    protected JLabel lblTotalHours;
    protected final JFrame homeFrame = new JFrame("Home Page");
    private MyHomeWorkerClass homeWorker;

    public void setHomeWorker(MyHomeWorkerClass homeWorker) {
        this.homeWorker = homeWorker;
    }

    public MyHomeWorkerClass getHomeWorker() {
        return homeWorker;
    }

    //----------------------------------------------------------------------------------------------------------------//
    public HomePage(MyHomeWorkerClass myHomeWorkerClass) {
        $$$setupUI$$$();
        this.homeWorker = myHomeWorkerClass;
        this.homeWorker.setHomePage(this);
        this.homeWorker.beginHere();

        // Add an ActionListener to the log-out button
        btnLogOut.addActionListener(click -> {
            this.homeWorker.logOut();
        });
        btnAddTasks.addActionListener(click -> {
            this.homeWorker.beginAddTasks();
        });
        btnShowReport.addActionListener(click -> {
            //TODO: Show Report
            this.homeWorker.beginShowReportHere();
        });
    }

    //----------------------------------------------------------------------------------------------------------------//
    private void createUIComponents() {
        this.tblTasksList = new JTable();
        this.tblScrollPane = new JScrollPane();
        this.lblTotalHours = new JLabel();
        if (this.homeWorker == null) {
            homeWorker = new MyHomeWorkerClass();
        }
        this.homeWorker.editComponents();
        this.tblScrollPane.setViewportView(tblTasksList);
        this.tblScrollPane.getViewport().setPreferredSize(tblTasksList.getPreferredSize());
    }

    //----------------------------------------------UI Designer Code--------------------------------------------------//

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        panel = new JPanel();
        panel.setLayout(new GridLayoutManager(1, 1, new Insets(5, 5, 5, 5), -1, -1));
        panel.setBackground(new Color(-13223617));
        panel.setPreferredSize(new Dimension(900, 600));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayoutManager(7, 4, new Insets(0, 0, 0, 0), -1, -1));
        panel1.setBackground(new Color(-13223617));
        panel.add(panel1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        lblWelcome = new JLabel();
        Font lblWelcomeFont = this.$$$getFont$$$("Arial Rounded MT Bold", Font.PLAIN, 14, lblWelcome.getFont());
        if (lblWelcomeFont != null) lblWelcome.setFont(lblWelcomeFont);
        lblWelcome.setForeground(new Color(-1250067));
        lblWelcome.setText("This is a temp welcome message");
        panel1.add(lblWelcome, new GridConstraints(1, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lblTitle = new JLabel();
        Font lblTitleFont = this.$$$getFont$$$("Arial Rounded MT Bold", Font.PLAIN, 24, lblTitle.getFont());
        if (lblTitleFont != null) lblTitle.setFont(lblTitleFont);
        lblTitle.setForeground(new Color(-1250067));
        lblTitle.setText("Title");
        panel1.add(lblTitle, new GridConstraints(0, 1, 1, 2, GridConstraints.ANCHOR_SOUTH, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        JPanelCentre = new JPanel();
        JPanelCentre.setLayout(new GridLayoutManager(4, 3, new Insets(0, 0, 0, 0), -1, -1));
        JPanelCentre.setBackground(new Color(-13223617));
        panel1.add(JPanelCentre, new GridConstraints(3, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        btnAddTasks = new JButton();
        btnAddTasks.setBackground(new Color(-9270822));
        btnAddTasks.setBorderPainted(true);
        btnAddTasks.setFocusable(false);
        Font btnAddTasksFont = this.$$$getFont$$$("Arial Rounded MT Bold", Font.PLAIN, 18, btnAddTasks.getFont());
        if (btnAddTasksFont != null) btnAddTasks.setFont(btnAddTasksFont);
        btnAddTasks.setForeground(new Color(-1250067));
        btnAddTasks.setText("Add Tasks");
        JPanelCentre.add(btnAddTasks, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(300, 45), null, 0, false));
        btnShowReport = new JButton();
        btnShowReport.setBackground(new Color(-9270822));
        btnShowReport.setFocusable(false);
        Font btnShowReportFont = this.$$$getFont$$$("Arial Rounded MT Bold", Font.PLAIN, 18, btnShowReport.getFont());
        if (btnShowReportFont != null) btnShowReport.setFont(btnShowReportFont);
        btnShowReport.setForeground(new Color(-1250067));
        btnShowReport.setText("Show Report");
        JPanelCentre.add(btnShowReport, new GridConstraints(0, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(300, 45), null, 0, false));
        tblScrollPane.setBackground(new Color(-13223617));
        Font tblScrollPaneFont = this.$$$getFont$$$("Arial Rounded MT Bold", Font.PLAIN, -1, tblScrollPane.getFont());
        if (tblScrollPaneFont != null) tblScrollPane.setFont(tblScrollPaneFont);
        tblScrollPane.setForeground(new Color(-1250067));
        tblScrollPane.setHorizontalScrollBarPolicy(31);
        tblScrollPane.setOpaque(true);
        tblScrollPane.setVerticalScrollBarPolicy(20);
        JPanelCentre.add(tblScrollPane, new GridConstraints(3, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        tblScrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), null, TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, null, null));
        tblTasksList.setAutoResizeMode(0);
        tblTasksList.setBackground(new Color(-13223617));
        tblTasksList.setFillsViewportHeight(true);
        Font tblTasksListFont = this.$$$getFont$$$("Arial Rounded MT Bold", Font.PLAIN, -1, tblTasksList.getFont());
        if (tblTasksListFont != null) tblTasksList.setFont(tblTasksListFont);
        tblTasksList.setForeground(new Color(-1250067));
        tblTasksList.setMinimumSize(new Dimension(460, 120));
        tblTasksList.setPreferredSize(new Dimension(460, 120));
        tblTasksList.setRowHeight(60);
        tblTasksList.setRowSelectionAllowed(true);
        tblTasksList.setVisible(false);
        tblScrollPane.setViewportView(tblTasksList);
        final Spacer spacer1 = new Spacer();
        JPanelCentre.add(spacer1, new GridConstraints(1, 2, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, 1, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(-1, 15), null, 0, false));
        final Spacer spacer2 = new Spacer();
        JPanelCentre.add(spacer2, new GridConstraints(1, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, 1, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(-1, 15), null, 0, false));
        final Spacer spacer3 = new Spacer();
        JPanelCentre.add(spacer3, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, 1, null, new Dimension(30, -1), null, 0, false));
        Font lblTotalHoursFont = this.$$$getFont$$$("Arial Rounded MT Bold", Font.PLAIN, 14, lblTotalHours.getFont());
        if (lblTotalHoursFont != null) lblTotalHours.setFont(lblTotalHoursFont);
        lblTotalHours.setForeground(new Color(-1250067));
        lblTotalHours.setText("");
        JPanelCentre.add(lblTotalHours, new GridConstraints(2, 0, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer4 = new Spacer();
        panel1.add(spacer4, new GridConstraints(6, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(-1, 15), null, 0, false));
        final Spacer spacer5 = new Spacer();
        panel1.add(spacer5, new GridConstraints(2, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE, 1, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(-1, 15), null, 0, false));
        final Spacer spacer6 = new Spacer();
        panel1.add(spacer6, new GridConstraints(5, 3, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer7 = new Spacer();
        panel1.add(spacer7, new GridConstraints(5, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer8 = new Spacer();
        panel1.add(spacer8, new GridConstraints(4, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(-1, 15), null, 0, false));
        btnLogOut = new JButton();
        btnLogOut.setActionCommand("");
        btnLogOut.setBackground(new Color(-9270822));
        btnLogOut.setBorderPainted(true);
        btnLogOut.setContentAreaFilled(true);
        btnLogOut.setFocusable(false);
        Font btnLogOutFont = this.$$$getFont$$$("Arial Rounded MT Bold", Font.PLAIN, 22, btnLogOut.getFont());
        if (btnLogOutFont != null) btnLogOut.setFont(btnLogOutFont);
        btnLogOut.setForeground(new Color(-1250067));
        btnLogOut.setText("Logout");
        panel1.add(btnLogOut, new GridConstraints(5, 1, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(450, 45), null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel;
    }

    //----------------------------------------------UI Designer Code--------------------------------------------------//
}
//--------------------------------------------------------------------------------------------------------------------//
//--------------------------------------------------------EOF---------------------------------------------------------//