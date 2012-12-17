/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cdiddy.gui;

import cdiddy.objects.Player;
import cdiddy.services.rest.PlayersRESTService;
import cdiddy.utils.application.GameService;
import cdiddy.utils.application.StatsService;
import cdiddy.utils.application.TeamService;
import cdiddy.utils.system.OAuthConnection;
import java.awt.CardLayout;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author cedric
 */
public class FantasyFootballFrame extends javax.swing.JFrame {
      private static final ApplicationContext applicationContext = 
        new ClassPathXmlApplicationContext("app-config.xml");
        private static OAuthConnection conn = applicationContext.getBean(OAuthConnection.class);
         private static PlayersRESTService playersRESTService = applicationContext.getBean(PlayersRESTService.class);
         private static StatsService statsService = applicationContext.getBean(StatsService.class);
         private static TeamService teamService = applicationContext.getBean(TeamService.class);
         private static GameService gameService = applicationContext.getBean(GameService.class);
        Player playerInContext = null;
    /**
     * Creates new form FantasyFootballFrame
     */
    public FantasyFootballFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        welcomePanel = new cdiddy.gui.WelcomePanel(teamService, playersRESTService);
        playerPanel = new cdiddy.gui.PlayerPanel(playersRESTService);
        playerInfoPanel = playerInfoPanel = new PlayerInfoPanel(playersRESTService, statsService);
        apiTestPanel = new APITestPanel(conn);
        testButtonPanel = new TestButtonPanel(gameService);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.CardLayout());
        jPanel1.add(welcomePanel, "card3");
        jPanel1.add(playerPanel, "card2");
        jPanel1.add(playerInfoPanel, "playerInfo");
        jPanel1.add(apiTestPanel, "apiTestPanel");
        jPanel1.add(testButtonPanel, "testButton");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Players");

        jMenuItem1.setText("View All Players");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Player Info");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Test");

        jMenuItem3.setText("Test URI");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem5.setText("Test Button Page");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void preparePlayerInfo(Player tempPlayer)
    {
        ((PlayerInfoPanel) playerInfoPanel).populatePanel(tempPlayer);
        CardLayout cl = (CardLayout)(jPanel1.getLayout());
        cl.show(jPanel1, "playerInfo");
    }
    
    public void prepareLeaugeInfo(String leaugeid) 
    {
       ((WelcomePanel) welcomePanel).loadTableForLeauge(leaugeid);
        CardLayout cl = (CardLayout)(jPanel1.getLayout());
        cl.show(jPanel1, "card3");
    }
    
    public void prepareRosterInfo(String teamId) 
    {
       ((WelcomePanel) welcomePanel).loadTableForRoster(teamId);
        CardLayout cl = (CardLayout)(jPanel1.getLayout());
        cl.show(jPanel1, "card3");
    }
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
   CardLayout cl = (CardLayout)(jPanel1.getLayout());
   cl.show(jPanel1, "card2");
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CardLayout cl = (CardLayout)(jPanel1.getLayout());
        cl.show(jPanel1, "playerInfo");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
                CardLayout cl = (CardLayout)(jPanel1.getLayout());
        cl.show(jPanel1, "apiTestPanel");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        CardLayout cl = (CardLayout)(jPanel1.getLayout());
        cl.show(jPanel1, "testButton");
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        conn.connect();
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FantasyFootballFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FantasyFootballFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FantasyFootballFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FantasyFootballFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FantasyFootballFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel apiTestPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private static javax.swing.JPanel jPanel1;
    private static javax.swing.JPanel playerInfoPanel;
    private javax.swing.JPanel playerPanel;
    private javax.swing.JPanel testButtonPanel;
    private javax.swing.JPanel welcomePanel;
    // End of variables declaration//GEN-END:variables






}
