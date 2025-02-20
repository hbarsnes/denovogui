package com.compomics.denovogui.gui.panels;

import com.compomics.denovogui.gui.DeNovoGUI;

/**
 *
 * @author Thilo Muth
 * @author Harald Barsnes
 */
public class StatisticsPanel extends javax.swing.JPanel {

    /**
     * A references to the main frame.
     */
    private DeNovoGUI deNovoGUI;

    /**
     * Creates a new StatisticsPanel.
     * 
     * @param deNovoGUI a references to the main frame
     */
    public StatisticsPanel(DeNovoGUI deNovoGUI) {
        initComponents();
        this.deNovoGUI = deNovoGUI;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        statisticsPanel = new javax.swing.JPanel();
        deNovoHistogramPanel = new javax.swing.JPanel();
        deNovoHistogramPlotPanel = new javax.swing.JPanel();

        statisticsPanel.setBackground(new java.awt.Color(230, 230, 230));

        deNovoHistogramPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("De Novo Score Histogram"));
        deNovoHistogramPanel.setOpaque(false);

        deNovoHistogramPlotPanel.setLayout(new javax.swing.BoxLayout(deNovoHistogramPlotPanel, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout deNovoHistogramPanelLayout = new javax.swing.GroupLayout(deNovoHistogramPanel);
        deNovoHistogramPanel.setLayout(deNovoHistogramPanelLayout);
        deNovoHistogramPanelLayout.setHorizontalGroup(
            deNovoHistogramPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deNovoHistogramPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deNovoHistogramPlotPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                .addContainerGap())
        );
        deNovoHistogramPanelLayout.setVerticalGroup(
            deNovoHistogramPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deNovoHistogramPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deNovoHistogramPlotPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout statisticsPanelLayout = new javax.swing.GroupLayout(statisticsPanel);
        statisticsPanel.setLayout(statisticsPanelLayout);
        statisticsPanelLayout.setHorizontalGroup(
            statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deNovoHistogramPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        statisticsPanelLayout.setVerticalGroup(
            statisticsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statisticsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deNovoHistogramPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(statisticsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statisticsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel deNovoHistogramPanel;
    private javax.swing.JPanel deNovoHistogramPlotPanel;
    private javax.swing.JPanel statisticsPanel;
    // End of variables declaration//GEN-END:variables
}
