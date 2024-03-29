package dirtytornadoes.gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TrainGUI.java
 *
 * Created on 5-Apr-2009, 4:51:41 PM
 */

/**
 *
 * @author liviu
 */

public class TrainGUI extends javax.swing.JFrame {

    final String LEFT_DOOR_IS_OPEN_STRING = "Close Left Doors";
    final String RIGHT_DOOR_IS_OPEN_STRING = "Close Right Doors";
    final String LEFT_DOOR_IS_CLOSED_STRING = "Open Left Doors";
    final String RIGHT_DOOR_IS_CLOSED_STRING = "Open Right Doors";

    /** Creates new form TrainGUI */
    public TrainGUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        panelTrainDisplay = new javax.swing.JPanel();
        lrdPaneDoors = new javax.swing.JLayeredPane();
        lblLeftDoor = new javax.swing.JLabel();
        lblRightDoor = new javax.swing.JLabel();
        lblLeftDoorStatus = new javax.swing.JLabel();
        lblRightDoorStatus = new javax.swing.JLabel();
        lrdPaneEmergency = new javax.swing.JLayeredPane();
        lblEmergencyStatus = new javax.swing.JLabel();
        panelDoorControls = new javax.swing.JPanel();
        buttonLeftDoors = new javax.swing.JButton();
        buttonRightDoors = new javax.swing.JButton();
        panelEmergency = new javax.swing.JPanel();
        buttonSetEmergency = new javax.swing.JButton();
        buttonResetEmergency = new javax.swing.JButton();
        panelRun = new javax.swing.JPanel();
        buttonRun = new javax.swing.JButton();
        controlEmergencyLabel = new ControlEmergencyLabel(lblEmergencyStatus);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Train Car Simulation");
        lblTitle.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        panelTrainDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lrdPaneDoors.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblLeftDoor.setText("Left Doors:");
        lblLeftDoor.setBounds(10, 10, 100, 17);
        lrdPaneDoors.add(lblLeftDoor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblRightDoor.setText("Right Doors:");
        lblRightDoor.setBounds(10, 80, 100, 17);
        lrdPaneDoors.add(lblRightDoor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblLeftDoorStatus.setText("Closed");
        lblLeftDoorStatus.setBounds(110, 10, 100, 17);
        lrdPaneDoors.add(lblLeftDoorStatus, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lblRightDoorStatus.setText("Closed");
        lblRightDoorStatus.setBounds(110, 80, 100, 17);
        lrdPaneDoors.add(lblRightDoorStatus, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lrdPaneEmergency.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblEmergencyStatus.setBounds(10, 10, 280, 170);
        lrdPaneEmergency.add(lblEmergencyStatus, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelTrainDisplayLayout = new javax.swing.GroupLayout(panelTrainDisplay);
        panelTrainDisplay.setLayout(panelTrainDisplayLayout);
        panelTrainDisplayLayout.setHorizontalGroup(
            panelTrainDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrainDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lrdPaneDoors, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lrdPaneEmergency, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTrainDisplayLayout.setVerticalGroup(
            panelTrainDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTrainDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTrainDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lrdPaneEmergency, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(lrdPaneDoors, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelDoorControls.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonLeftDoors.setText("Open Left Doors");
        buttonLeftDoors.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonLeftDoors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLeftDoorsActionPerformed(evt);
            }
        });

        buttonRightDoors.setText("Open Right Doors");
        buttonRightDoors.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonRightDoors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRightDoorsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDoorControlsLayout = new javax.swing.GroupLayout(panelDoorControls);
        panelDoorControls.setLayout(panelDoorControlsLayout);
        panelDoorControlsLayout.setHorizontalGroup(
            panelDoorControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDoorControlsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDoorControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonRightDoors, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(buttonLeftDoors, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelDoorControlsLayout.setVerticalGroup(
            panelDoorControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDoorControlsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonLeftDoors)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(buttonRightDoors)
                .addContainerGap())
        );

        panelEmergency.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonSetEmergency.setText("Emergency");
        buttonSetEmergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSetEmergencyActionPerformed(evt);
            }
        });

        buttonResetEmergency.setText("Reset Emergency");
        buttonResetEmergency.setEnabled(false);
        buttonResetEmergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetEmergencyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEmergencyLayout = new javax.swing.GroupLayout(panelEmergency);
        panelEmergency.setLayout(panelEmergencyLayout);
        panelEmergencyLayout.setHorizontalGroup(
            panelEmergencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmergencyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEmergencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonResetEmergency, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(buttonSetEmergency, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelEmergencyLayout.setVerticalGroup(
            panelEmergencyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmergencyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonSetEmergency)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(buttonResetEmergency)
                .addContainerGap())
        );

        panelRun.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
     //   panelRun.setSize(panelEmergency.getWidth(), panelEmergency.getHeight() + 20);

        buttonRun.setText("Run");

        javax.swing.GroupLayout panelRunLayout = new javax.swing.GroupLayout(panelRun);
        panelRun.setLayout(panelRunLayout);
        panelRunLayout.setHorizontalGroup(
            panelRunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRunLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonRun, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRunLayout.setVerticalGroup(
            panelRunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRunLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(buttonRun)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelTrainDisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(panelDoorControls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(panelEmergency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(panelRun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(270, 270, 270))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTrainDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelEmergency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelDoorControls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLeftDoorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLeftDoorsActionPerformed
        if(buttonLeftDoors.getText() == LEFT_DOOR_IS_CLOSED_STRING){
            buttonLeftDoors.setText(LEFT_DOOR_IS_OPEN_STRING);
            lblLeftDoorStatus.setText("Open");
        }
        else if(buttonLeftDoors.getText() == LEFT_DOOR_IS_OPEN_STRING){
            buttonLeftDoors.setText(LEFT_DOOR_IS_CLOSED_STRING);
            lblLeftDoorStatus.setText("Closed");
        }
}//GEN-LAST:event_buttonLeftDoorsActionPerformed

    private void buttonRightDoorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRightDoorsActionPerformed
        if(buttonRightDoors.getText() == RIGHT_DOOR_IS_CLOSED_STRING){
            buttonRightDoors.setText(RIGHT_DOOR_IS_OPEN_STRING);
            lblRightDoorStatus.setText("Open");
        }
        else if(buttonRightDoors.getText() == RIGHT_DOOR_IS_OPEN_STRING){
            buttonRightDoors.setText(RIGHT_DOOR_IS_CLOSED_STRING);
            lblRightDoorStatus.setText("Closed");
        }
    }//GEN-LAST:event_buttonRightDoorsActionPerformed

    private void buttonSetEmergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSetEmergencyActionPerformed
        // TODO add your handling code here:
        buttonSetEmergency.setEnabled(false);
        buttonResetEmergency.setEnabled(true);
        lblEmergencyStatus.setText("EMERGENCY");
        createEmergencyTimer();
    }//GEN-LAST:event_buttonSetEmergencyActionPerformed

    private void buttonResetEmergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetEmergencyActionPerformed
        // TODO add your handling code here:
        buttonSetEmergency.setEnabled(true);
        buttonResetEmergency.setEnabled(false);
        timerEmergency.stop();
        lblEmergencyStatus.setText("");
    }//GEN-LAST:event_buttonResetEmergencyActionPerformed

    private void createEmergencyTimer(){
    	timerEmergency = new Timer(500, new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				controlEmergencyLabel.switchState();
			}
    	});
    	timerEmergency.start();
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLeftDoors;
    private javax.swing.JButton buttonResetEmergency;
    private javax.swing.JButton buttonRightDoors;
    private javax.swing.JButton buttonRun;
    private javax.swing.JButton buttonSetEmergency;
    private javax.swing.JLabel lblEmergencyStatus;
    private javax.swing.JLabel lblLeftDoor;
    private javax.swing.JLabel lblLeftDoorStatus;
    private javax.swing.JLabel lblRightDoorStatus;
    private javax.swing.JLabel lblRightDoor;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLayeredPane lrdPaneDoors;
    private javax.swing.JLayeredPane lrdPaneEmergency;
    private javax.swing.JPanel panelDoorControls;
    private javax.swing.JPanel panelEmergency;
    private javax.swing.JPanel panelRun;
    private javax.swing.JPanel panelTrainDisplay;
    // End of variables declaration//GEN-END:variables
    private javax.swing.Timer timerEmergency;
    private ControlEmergencyLabel controlEmergencyLabel;

}
