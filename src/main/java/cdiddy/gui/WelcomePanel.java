/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cdiddy.gui;

import cdiddy.objects.draft.EnhancedDraftResults;
import cdiddy.objects.league.YahooLeague;
import cdiddy.objects.util.DraftUtil;
import cdiddy.services.rest.PlayersRESTService;
import cdiddy.utils.application.GameService;
import cdiddy.utils.application.PlayerService;
import cdiddy.utils.application.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DMDD
 */
@Repository("welcomePanel")
public class WelcomePanel extends javax.swing.JPanel {
    @Autowired 
    private TeamService teamservice;
    @Autowired 
    private PlayersRESTService playersRESTService;
    @Autowired 
    private PlayerService playerService;
    @Autowired 
    private GameService gameService;
    @Autowired
    private UserTeamListPanel userTeamListPanel;
    @Autowired
    private LeaugeTeamListPanel leaugeTeamListPanel;
    @Autowired
    private DraftUtil draftUtil;
    
    private int week = 1;
    private YahooLeague yl;
    /**
     * Creates new form WelcomePanel
     */
    public WelcomePanel() {
       // initComponents();
    }

     /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        userTeamPanel = userTeamListPanel;
        leaugePanel = leaugeTeamListPanel;
        rosterPanel = new TeamRosterPanel(teamservice, playerService, gameService, week);
        draftPanel = new DraftResultsPanel();

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setDoubleBuffered(true);
        jTabbedPane1.addTab("My Teams", userTeamPanel);
        jTabbedPane1.addTab("League", leaugePanel);
        jTabbedPane1.addTab("Roster", rosterPanel);
        jTabbedPane1.addTab("Draft", draftPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel draftPanel;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel leaugePanel;
    private javax.swing.JPanel rosterPanel;
    private javax.swing.JPanel userTeamPanel;
    // End of variables declaration//GEN-END:variables

    public void init() 
    {
        initInnerPanels();
        initComponents();
        
        
    }
    public void initInnerPanels()
    {
        userTeamListPanel.init();
        leaugeTeamListPanel.init();
    }
    public void populateInnerPanels()
    {
        userTeamListPanel.populatePanel();
    }
    public void loadTableForLeauge(String leaugeid) {
       
      EnhancedDraftResults edResults = draftUtil.createEnhancedDraftResults(gameService.getDraftResults(leaugeid), leaugeid);
      ((DraftResultsPanel) draftPanel).populateDraft(edResults);
      ((LeaugeTeamListPanel) leaugePanel).populateLeauge(leaugeid);
       jTabbedPane1.setSelectedComponent(leaugePanel); 
   }

    public void loadTableForRoster(String teamId, String leagueId) 
    {
       EnhancedDraftResults edResults = draftUtil.createEnhancedDraftResults(gameService.getDraftResults(leagueId), leagueId);
       ((DraftResultsPanel) draftPanel).populateDraft(edResults);
        ((TeamRosterPanel) rosterPanel).populateRoster(teamId, leagueId);
       jTabbedPane1.setSelectedComponent(rosterPanel); 
    }
}
