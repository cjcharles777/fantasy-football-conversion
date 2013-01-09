/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cdiddy.gui;

import cdiddy.gui.table.model.DraftResultsTableModel;
import cdiddy.objects.draft.EnhancedDraftPick;
import cdiddy.objects.draft.EnhancedDraftResults;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author cedric
 */
public class DraftResultsPanel extends javax.swing.JPanel {
List<EnhancedDraftPick> picksList;
    /**
     * Creates new form DraftResultsPanel
     */
    public DraftResultsPanel() {
        this.picksList = new LinkedList<EnhancedDraftPick>();
        initComponents();
    }
    public DraftResultsPanel(EnhancedDraftResults edResults) 
    {
        this.picksList = edResults.getPicks();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new DraftResultsTableModel(picksList));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public void populateDraft(EnhancedDraftResults edResults) 
    {
 
        if (edResults != null)
        {    
           this.picksList = edResults.getPicks();
           initComponents();
        }

    }
}