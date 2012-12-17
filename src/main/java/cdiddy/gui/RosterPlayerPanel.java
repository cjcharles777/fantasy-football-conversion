/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cdiddy.gui;

import cdiddy.objects.Player;
import cdiddy.objects.SeasonStat;
import cdiddy.objects.Stat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author DMDD
 */
public class RosterPlayerPanel extends javax.swing.JPanel {

    Player player;
    /**
     * Creates new form RosterPlayerPanel
     */
    public RosterPlayerPanel() {
        initComponents();
    }

    public void setPlayer(Player player) 
    {
        this.player = player;
      
        
        oppLabel.setText("N/A");

        playerNameLabel.setText(player.getName().getFull());
        playerTeamPosLabel.setText(player.getDisplay_position());
        positionLabel.setText(player.getDisplay_position());

        List<SeasonStat> seasonStatList = player.getSeasonStats();        
        Map<String,SeasonStat> seasonStatMap = new HashMap<String,SeasonStat>();
        for (SeasonStat i : seasonStatList)
        {
            seasonStatMap.put(i.getSeason(),i);
        } 
        
        SeasonStat currSeason = seasonStatMap.get("2012");
        
        List<Stat> statList = currSeason.getStats();        
        Map<String,Stat> statMap = new HashMap<String,Stat>();
        for (Stat i : statList)
        {
            statMap.put(i.getStat_id(),i);
        } 
        
        passingInt.setText(statMap.get("6").getValue()!=null?statMap.get("6").getValue().toString():"N/A");
        passingTDLabel.setText(statMap.get("5").getValue()!=null?statMap.get("5").getValue().toString():"N/A");
        passingYrdsLabel.setText(statMap.get("4").getValue()!=null?statMap.get("4").getValue().toString():"N/A");
        recievingTDLabel.setText(statMap.get("13").getValue()!=null?statMap.get("13").getValue().toString():"N/A");
        recievingYrdsLabel.setText(statMap.get("12").getValue()!=null?statMap.get("12").getValue().toString():"N/A");
        retTDLabel.setText(statMap.get("15").getValue()!=null?statMap.get("15").getValue().toString():"N/A");
        rushingTDLabel.setText(statMap.get("10").getValue()!=null?statMap.get("10").getValue().toString():"N/A");
        rushingYrdsLabel.setText(statMap.get("9").getValue()!=null?statMap.get("9").getValue().toString():"N/A");
        lostFumLabel.setText(statMap.get("18").getValue()!=null?statMap.get("18").getValue().toString():"N/A");
        twoPtLabel.setText(statMap.get("16").getValue()!=null?statMap.get("16").getValue().toString():"N/A");
        
        
        
        
        
        totalFanPtsLabel.setText("0");
    }
    public Player getPlayer() 
    {
        
        return this.player;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        positionPanel = new javax.swing.JPanel();
        positionLabel = new javax.swing.JLabel();
        playerInfoPanel = new javax.swing.JPanel();
        playerNameLabel = new javax.swing.JLabel();
        playerTeamPosLabel = new javax.swing.JLabel();
        oppLabel = new javax.swing.JLabel();
        playerStatsPanel = new javax.swing.JPanel();
        passingStatsPanel = new javax.swing.JPanel();
        passingStatsContainerPanel = new javax.swing.JPanel();
        passingYrdsLabel = new javax.swing.JLabel();
        passingTDLabel = new javax.swing.JLabel();
        passingInt = new javax.swing.JLabel();
        rushingStatsPanel = new javax.swing.JPanel();
        rushingStatsContainerPanel = new javax.swing.JPanel();
        rushingYrdsLabel = new javax.swing.JLabel();
        rushingTDLabel = new javax.swing.JLabel();
        recievingStatsPanel = new javax.swing.JPanel();
        recievingStatsContainerPanel = new javax.swing.JPanel();
        recievingYrdsLabel = new javax.swing.JLabel();
        recievingTDLabel = new javax.swing.JLabel();
        miscStatsPanel = new javax.swing.JPanel();
        miscStatsContainerPanel = new javax.swing.JPanel();
        retTDLabel = new javax.swing.JLabel();
        twoPtLabel = new javax.swing.JLabel();
        lostFumLabel = new javax.swing.JLabel();
        fanPointsPanel = new javax.swing.JPanel();
        totalFanPtsLabel = new javax.swing.JLabel();

        positionLabel.setText("pos");

        javax.swing.GroupLayout positionPanelLayout = new javax.swing.GroupLayout(positionPanel);
        positionPanel.setLayout(positionPanelLayout);
        positionPanelLayout.setHorizontalGroup(
            positionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(positionPanelLayout.createSequentialGroup()
                .addComponent(positionLabel)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        positionPanelLayout.setVerticalGroup(
            positionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(positionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(positionLabel)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        playerNameLabel.setText("jLabel1");

        playerTeamPosLabel.setText("jLabel1");

        oppLabel.setText("jLabel1");

        javax.swing.GroupLayout playerInfoPanelLayout = new javax.swing.GroupLayout(playerInfoPanel);
        playerInfoPanel.setLayout(playerInfoPanelLayout);
        playerInfoPanelLayout.setHorizontalGroup(
            playerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerInfoPanelLayout.createSequentialGroup()
                .addGroup(playerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playerNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(playerTeamPosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(oppLabel))
        );
        playerInfoPanelLayout.setVerticalGroup(
            playerInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerInfoPanelLayout.createSequentialGroup()
                .addComponent(playerNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(playerTeamPosLabel))
            .addGroup(playerInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(oppLabel)
                .addContainerGap())
        );

        passingYrdsLabel.setText("0");

        passingTDLabel.setText("0");

        passingInt.setText("0");

        javax.swing.GroupLayout passingStatsContainerPanelLayout = new javax.swing.GroupLayout(passingStatsContainerPanel);
        passingStatsContainerPanel.setLayout(passingStatsContainerPanelLayout);
        passingStatsContainerPanelLayout.setHorizontalGroup(
            passingStatsContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passingStatsContainerPanelLayout.createSequentialGroup()
                .addComponent(passingYrdsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passingTDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passingInt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        passingStatsContainerPanelLayout.setVerticalGroup(
            passingStatsContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passingStatsContainerPanelLayout.createSequentialGroup()
                .addGroup(passingStatsContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passingYrdsLabel)
                    .addComponent(passingTDLabel)
                    .addComponent(passingInt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout passingStatsPanelLayout = new javax.swing.GroupLayout(passingStatsPanel);
        passingStatsPanel.setLayout(passingStatsPanelLayout);
        passingStatsPanelLayout.setHorizontalGroup(
            passingStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passingStatsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passingStatsContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        passingStatsPanelLayout.setVerticalGroup(
            passingStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passingStatsContainerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        rushingYrdsLabel.setText("0");

        rushingTDLabel.setText("0");

        javax.swing.GroupLayout rushingStatsContainerPanelLayout = new javax.swing.GroupLayout(rushingStatsContainerPanel);
        rushingStatsContainerPanel.setLayout(rushingStatsContainerPanelLayout);
        rushingStatsContainerPanelLayout.setHorizontalGroup(
            rushingStatsContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rushingStatsContainerPanelLayout.createSequentialGroup()
                .addComponent(rushingYrdsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rushingTDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rushingStatsContainerPanelLayout.setVerticalGroup(
            rushingStatsContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rushingStatsContainerPanelLayout.createSequentialGroup()
                .addGroup(rushingStatsContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rushingYrdsLabel)
                    .addComponent(rushingTDLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rushingStatsPanelLayout = new javax.swing.GroupLayout(rushingStatsPanel);
        rushingStatsPanel.setLayout(rushingStatsPanelLayout);
        rushingStatsPanelLayout.setHorizontalGroup(
            rushingStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rushingStatsContainerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        rushingStatsPanelLayout.setVerticalGroup(
            rushingStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rushingStatsContainerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        recievingYrdsLabel.setText("0");

        recievingTDLabel.setText("0");

        javax.swing.GroupLayout recievingStatsContainerPanelLayout = new javax.swing.GroupLayout(recievingStatsContainerPanel);
        recievingStatsContainerPanel.setLayout(recievingStatsContainerPanelLayout);
        recievingStatsContainerPanelLayout.setHorizontalGroup(
            recievingStatsContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recievingStatsContainerPanelLayout.createSequentialGroup()
                .addComponent(recievingYrdsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(recievingTDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        recievingStatsContainerPanelLayout.setVerticalGroup(
            recievingStatsContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recievingStatsContainerPanelLayout.createSequentialGroup()
                .addGroup(recievingStatsContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recievingYrdsLabel)
                    .addComponent(recievingTDLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout recievingStatsPanelLayout = new javax.swing.GroupLayout(recievingStatsPanel);
        recievingStatsPanel.setLayout(recievingStatsPanelLayout);
        recievingStatsPanelLayout.setHorizontalGroup(
            recievingStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recievingStatsContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        recievingStatsPanelLayout.setVerticalGroup(
            recievingStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recievingStatsContainerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        retTDLabel.setText("0");

        twoPtLabel.setText("0");

        lostFumLabel.setText("0");

        javax.swing.GroupLayout miscStatsContainerPanelLayout = new javax.swing.GroupLayout(miscStatsContainerPanel);
        miscStatsContainerPanel.setLayout(miscStatsContainerPanelLayout);
        miscStatsContainerPanelLayout.setHorizontalGroup(
            miscStatsContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miscStatsContainerPanelLayout.createSequentialGroup()
                .addComponent(retTDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(twoPtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lostFumLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        miscStatsContainerPanelLayout.setVerticalGroup(
            miscStatsContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(miscStatsContainerPanelLayout.createSequentialGroup()
                .addGroup(miscStatsContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retTDLabel)
                    .addComponent(twoPtLabel)
                    .addComponent(lostFumLabel))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout miscStatsPanelLayout = new javax.swing.GroupLayout(miscStatsPanel);
        miscStatsPanel.setLayout(miscStatsPanelLayout);
        miscStatsPanelLayout.setHorizontalGroup(
            miscStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
            .addGroup(miscStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(miscStatsPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(miscStatsContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        miscStatsPanelLayout.setVerticalGroup(
            miscStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(miscStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(miscStatsContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        totalFanPtsLabel.setText("0");

        javax.swing.GroupLayout fanPointsPanelLayout = new javax.swing.GroupLayout(fanPointsPanel);
        fanPointsPanel.setLayout(fanPointsPanelLayout);
        fanPointsPanelLayout.setHorizontalGroup(
            fanPointsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(totalFanPtsLabel)
        );
        fanPointsPanelLayout.setVerticalGroup(
            fanPointsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fanPointsPanelLayout.createSequentialGroup()
                .addComponent(totalFanPtsLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout playerStatsPanelLayout = new javax.swing.GroupLayout(playerStatsPanel);
        playerStatsPanel.setLayout(playerStatsPanelLayout);
        playerStatsPanelLayout.setHorizontalGroup(
            playerStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerStatsPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(passingStatsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rushingStatsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recievingStatsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(miscStatsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fanPointsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        playerStatsPanelLayout.setVerticalGroup(
            playerStatsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recievingStatsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rushingStatsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(miscStatsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(passingStatsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fanPointsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(positionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(playerStatsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(playerStatsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(playerInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(positionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fanPointsPanel;
    private javax.swing.JLabel lostFumLabel;
    private javax.swing.JPanel miscStatsContainerPanel;
    private javax.swing.JPanel miscStatsPanel;
    private javax.swing.JLabel oppLabel;
    private javax.swing.JLabel passingInt;
    private javax.swing.JPanel passingStatsContainerPanel;
    private javax.swing.JPanel passingStatsPanel;
    private javax.swing.JLabel passingTDLabel;
    private javax.swing.JLabel passingYrdsLabel;
    private javax.swing.JPanel playerInfoPanel;
    private javax.swing.JLabel playerNameLabel;
    private javax.swing.JPanel playerStatsPanel;
    private javax.swing.JLabel playerTeamPosLabel;
    private javax.swing.JLabel positionLabel;
    private javax.swing.JPanel positionPanel;
    private javax.swing.JPanel recievingStatsContainerPanel;
    private javax.swing.JPanel recievingStatsPanel;
    private javax.swing.JLabel recievingTDLabel;
    private javax.swing.JLabel recievingYrdsLabel;
    private javax.swing.JLabel retTDLabel;
    private javax.swing.JPanel rushingStatsContainerPanel;
    private javax.swing.JPanel rushingStatsPanel;
    private javax.swing.JLabel rushingTDLabel;
    private javax.swing.JLabel rushingYrdsLabel;
    private javax.swing.JLabel totalFanPtsLabel;
    private javax.swing.JLabel twoPtLabel;
    // End of variables declaration//GEN-END:variables




}
