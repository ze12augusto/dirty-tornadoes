package dirtytornadoes.gui;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TrainTestGUI.java
 *
 * Created on 6-Apr-2009, 2:51:47 PM
 */



/**
 *
 * @author liviu
 */
public class TrainTestGUI extends javax.swing.JFrame {

    public static final String LEFT_DOOR_BUTTON_OPEN = "Open Left Doors";
    public static final String LEFT_DOOR_BUTTON_CLOSE = "Close Left Doors";
    public static final String RIGHT_DOOR_BUTTON_OPEN = "Open Right Doors";
    public static final String RIGHT_DOOR_BUTTON_CLOSE = "Close Right Doors";
    public static final String DOOR_OPEN = "Open";
    public static final String DOOR_CLOSED = "Closed";
    public static final String BUTTON_BLOCK_DOORS = "Block Doors";
    public static final String BUTTON_UNBLOCK_DOORS = "Unblock Doors";
    public static final String DOOR_BLOCKED = "Blocked";
    public static final String DOOR_LOCKED = "Locked";
    public static final String BUTTON_UNLOCK_DOORS = "Unlock Doors";
    public static final String BUTTON_LOCK_DOORS = "Lock Doors";
    public static final String BRAKE_ON = "On";
    public static final String BRAKE_OFF = "Off";
    public static final String BUTTON_TURN_BREAKS_ON = "Apply Breaks";
    public static final String BUTTON_TURN_BREAKS_OFF = "Turn Breaks Off";
    public static final String TRAIN_STATIONARY = "Stationary";
    public static final String TRAIN_IN_MOTION = "In Motion";
    public static final String BUTTON_STOP_TRAIN = "Stop Train";
    public static final String BUTTON_START_TRAIN = "Put Train In Motion";
    public static final String EMERGENCY = "Emergency!!!";
    public static final String NO_EMERGENCY = "No";
    /** Creates new form TrainTestGUI */
    public TrainTestGUI() {
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
        panelInputs = new javax.swing.JPanel();
        lrdPanelTrainInput = new javax.swing.JLayeredPane();
        lblTrainInput = new javax.swing.JLabel();
        buttonTrainInputLeftDoors = new javax.swing.JButton();
        buttonTrainInputBlockDoors = new javax.swing.JButton();
        buttonTrainInputTrainInMotion = new javax.swing.JButton();
        buttonTrainInputRightDoors = new javax.swing.JButton();
        buttonTrainInputBrakes = new javax.swing.JButton();
        buttonTrainInputLockDoors = new javax.swing.JButton();
        lrdPanelOperatorInput = new javax.swing.JLayeredPane();
        lblOperatorInput = new javax.swing.JLabel();
        buttonOperatorInputLeftDoors = new javax.swing.JButton();
        buttonOperatorInputRightDoors = new javax.swing.JButton();
        buttonOperatorInputResetEmergency = new javax.swing.JButton();
        buttonOperatorInputEmergency = new javax.swing.JButton();
        buttonOperatorInputRun = new javax.swing.JButton();
        panelStatusReport = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        lblStatusLeftDoor = new javax.swing.JLabel();
        lblStatusRightDoor = new javax.swing.JLabel();
        lblStatusBrakes = new javax.swing.JLabel();
        lblStatusTrainInMotion = new javax.swing.JLabel();
        lblStatusEmergency = new javax.swing.JLabel();
        lblStatusEmergencyStatus = new javax.swing.JLabel();
        lblStatusTrainStatus = new javax.swing.JLabel();
        lblStatusBrakeStatus = new javax.swing.JLabel();
        lblStatusRightDoorStatus = new javax.swing.JLabel();
        lblStatusLeftDoorStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitle.setText("Train Simulation Test");

        panelInputs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lrdPanelTrainInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTrainInput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrainInput.setText("<html><u>Train Input</u></html>");
        lblTrainInput.setBorder(null);
        lblTrainInput.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTrainInput.setBounds(160, 2, 90, 28);
        lrdPanelTrainInput.add(lblTrainInput, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonTrainInputLeftDoors.setText(LEFT_DOOR_BUTTON_OPEN);
        buttonTrainInputLeftDoors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTrainInputLeftDoorsActionPerformed(evt);
            }
        });
        buttonTrainInputLeftDoors.setBounds(10, 40, 190, 28);
        lrdPanelTrainInput.add(buttonTrainInputLeftDoors, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonTrainInputBlockDoors.setText(BUTTON_BLOCK_DOORS);
        buttonTrainInputBlockDoors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTrainInputBlockDoorsActionPerformed(evt);
            }
        });
        buttonTrainInputBlockDoors.setBounds(10, 80, 190, 28);
        lrdPanelTrainInput.add(buttonTrainInputBlockDoors, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonTrainInputTrainInMotion.setText(BUTTON_START_TRAIN);
        buttonTrainInputTrainInMotion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTrainInputTrainInMotionActionPerformed(evt);
            }
        });
        buttonTrainInputTrainInMotion.setBounds(210, 120, 200, 28);
        lrdPanelTrainInput.add(buttonTrainInputTrainInMotion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonTrainInputRightDoors.setText(RIGHT_DOOR_BUTTON_OPEN);
        buttonTrainInputRightDoors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTrainInputRightDoorsActionPerformed(evt);
            }
        });
        buttonTrainInputRightDoors.setBounds(210, 40, 200, 28);
        lrdPanelTrainInput.add(buttonTrainInputRightDoors, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonTrainInputBrakes.setText(BUTTON_TURN_BREAKS_OFF);
        buttonTrainInputBrakes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTrainInputBrakesActionPerformed(evt);
            }
        });
        buttonTrainInputBrakes.setBounds(10, 120, 190, 28);
        lrdPanelTrainInput.add(buttonTrainInputBrakes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonTrainInputLockDoors.setText(BUTTON_LOCK_DOORS);
        buttonTrainInputLockDoors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTrainInputLockDoorsActionPerformed(evt);
            }
        });
        buttonTrainInputLockDoors.setBounds(210, 80, 200, 28);
        lrdPanelTrainInput.add(buttonTrainInputLockDoors, javax.swing.JLayeredPane.DEFAULT_LAYER);

        lrdPanelOperatorInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblOperatorInput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOperatorInput.setText("<html><u>Operator Input</u></html>");
        lblOperatorInput.setBorder(null);
        lblOperatorInput.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblOperatorInput.setBounds(150, 2, 120, 28);
        lrdPanelOperatorInput.add(lblOperatorInput, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonOperatorInputLeftDoors.setText(LEFT_DOOR_BUTTON_OPEN);
        buttonOperatorInputLeftDoors.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		buttonOperatorInputLeftDoorsActionPerformed(evt);
        	}
        });
        buttonOperatorInputLeftDoors.setBounds(10, 40, 190, 28);
        lrdPanelOperatorInput.add(buttonOperatorInputLeftDoors, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonOperatorInputRightDoors.setText(RIGHT_DOOR_BUTTON_OPEN);
        buttonOperatorInputRightDoors.addActionListener(new java.awt.event.ActionListener(){
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		buttonOperatorInputRightDoorsActionPerformed(evt);
        	}
        });
        buttonOperatorInputRightDoors.setBounds(210, 40, 200, 28);
        lrdPanelOperatorInput.add(buttonOperatorInputRightDoors, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonOperatorInputResetEmergency.setText("Reset Emergency");
        buttonOperatorInputResetEmergency.setEnabled(false);
        buttonOperatorInputResetEmergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOperatorInputResetEmergencyActionPerformed(evt);
            }
        });
        buttonOperatorInputResetEmergency.setBounds(210, 80, 200, 28);
        lrdPanelOperatorInput.add(buttonOperatorInputResetEmergency, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonOperatorInputEmergency.setText("Emergency");
        buttonOperatorInputEmergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOperatorInputEmergencyActionPerformed(evt);
            }
        });
        buttonOperatorInputEmergency.setBounds(10, 80, 190, 28);
        lrdPanelOperatorInput.add(buttonOperatorInputEmergency, javax.swing.JLayeredPane.DEFAULT_LAYER);

        buttonOperatorInputRun.setText("Run");
        buttonOperatorInputRun.setBounds(10, 120, 400, 28);
        lrdPanelOperatorInput.add(buttonOperatorInputRun, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelInputsLayout = new javax.swing.GroupLayout(panelInputs);
        panelInputs.setLayout(panelInputsLayout);
        panelInputsLayout.setHorizontalGroup(
            panelInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lrdPanelOperatorInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                    .addComponent(lrdPanelTrainInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelInputsLayout.setVerticalGroup(
            panelInputsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lrdPanelTrainInput, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lrdPanelOperatorInput, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelStatusReport.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblStatus.setText("Status");

        lblStatusLeftDoor.setText("Left Door Status:");

        lblStatusRightDoor.setText("Right Door Status:");

        lblStatusBrakes.setText("Brake Status:");

        lblStatusTrainInMotion.setText("Train Status:");

        lblStatusEmergency.setText("Emergency Status:");

        lblStatusEmergencyStatus.setText(NO_EMERGENCY);

        lblStatusTrainStatus.setText(TRAIN_STATIONARY);

        lblStatusBrakeStatus.setText(BRAKE_ON);

        lblStatusRightDoorStatus.setText(DOOR_CLOSED);

        lblStatusLeftDoorStatus.setText(DOOR_CLOSED);

        javax.swing.GroupLayout panelStatusReportLayout = new javax.swing.GroupLayout(panelStatusReport);
        panelStatusReport.setLayout(panelStatusReportLayout);
        panelStatusReportLayout.setHorizontalGroup(
            panelStatusReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStatusReportLayout.createSequentialGroup()
                .addGroup(panelStatusReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStatusReportLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(lblStatus))
                    .addGroup(panelStatusReportLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblStatusLeftDoor)
                        .addGap(18, 18, 18)
                        .addComponent(lblStatusLeftDoorStatus))
                    .addGroup(panelStatusReportLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblStatusRightDoor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblStatusRightDoorStatus))
                    .addGroup(panelStatusReportLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelStatusReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStatusEmergency)
                            .addComponent(lblStatusTrainInMotion)
                            .addComponent(lblStatusBrakes))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelStatusReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStatusBrakeStatus)
                            .addComponent(lblStatusTrainStatus)
                            .addComponent(lblStatusEmergencyStatus))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        panelStatusReportLayout.setVerticalGroup(
            panelStatusReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStatusReportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStatus)
                .addGap(19, 19, 19)
                .addGroup(panelStatusReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatusLeftDoor)
                    .addComponent(lblStatusLeftDoorStatus))
                .addGap(18, 18, 18)
                .addGroup(panelStatusReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatusRightDoor)
                    .addComponent(lblStatusRightDoorStatus))
                .addGap(18, 18, 18)
                .addGroup(panelStatusReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatusBrakes)
                    .addComponent(lblStatusBrakeStatus))
                .addGap(18, 18, 18)
                .addGroup(panelStatusReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatusTrainInMotion)
                    .addComponent(lblStatusTrainStatus))
                .addGap(18, 18, 18)
                .addGroup(panelStatusReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatusEmergency)
                    .addComponent(lblStatusEmergencyStatus))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelInputs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(panelStatusReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(322, 322, 322))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelStatusReport, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(panelInputs, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonTrainInputLeftDoorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTrainInputLeftDoorsActionPerformed
        // TODO add your handling code here:
        toggleLeftDoorInfo();

    }//GEN-LAST:event_buttonTrainInputLeftDoorsActionPerformed

    private void buttonTrainInputRightDoorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTrainInputRightDoorsActionPerformed
        // TODO add your handling code here:
        toggleRightDoorInfo();
    }//GEN-LAST:event_buttonTrainInputRightDoorsActionPerformed
    
    private void buttonOperatorInputLeftDoorsActionPerformed(java.awt.event.ActionEvent evt) {
    	toggleLeftDoorInfo();
    }
    
    private void buttonOperatorInputRightDoorsActionPerformed(java.awt.event.ActionEvent evt) {
    	toggleRightDoorInfo();
    }
    
    
    private void buttonTrainInputBlockDoorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTrainInputBlockDoorsActionPerformed
        // TODO add your handling code here:
        lblStatusLeftDoorStatus.setText(DOOR_BLOCKED);
        lblStatusRightDoorStatus.setText(DOOR_BLOCKED);
    }//GEN-LAST:event_buttonTrainInputBlockDoorsActionPerformed

    private void buttonTrainInputLockDoorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTrainInputLockDoorsActionPerformed
        // TODO add your handling code here:
        lblStatusLeftDoorStatus.setText(DOOR_LOCKED);
        lblStatusRightDoorStatus.setText(DOOR_LOCKED);
    }//GEN-LAST:event_buttonTrainInputLockDoorsActionPerformed

    private void buttonTrainInputBrakesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTrainInputBrakesActionPerformed
        // TODO add your handling code here:
        toggleBreaks();
    }//GEN-LAST:event_buttonTrainInputBrakesActionPerformed

    private void buttonTrainInputTrainInMotionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTrainInputTrainInMotionActionPerformed
        // TODO add your handling code here:
        toggleTrainInMotion();
    }//GEN-LAST:event_buttonTrainInputTrainInMotionActionPerformed

    private void buttonOperatorInputEmergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOperatorInputEmergencyActionPerformed
        // TODO add your handling code here:
        lblStatusEmergencyStatus.setText(EMERGENCY);
        buttonOperatorInputEmergency.setEnabled(false);
        buttonOperatorInputResetEmergency.setEnabled(true);
    }//GEN-LAST:event_buttonOperatorInputEmergencyActionPerformed

    private void buttonOperatorInputResetEmergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOperatorInputResetEmergencyActionPerformed
        // TODO add your handling code here:
        lblStatusEmergencyStatus.setText(NO_EMERGENCY);
        buttonOperatorInputEmergency.setEnabled(true);
        buttonOperatorInputResetEmergency.setEnabled(false);
    }//GEN-LAST:event_buttonOperatorInputResetEmergencyActionPerformed

    private void toggleLeftDoorInfo(){
        if(buttonTrainInputLeftDoors.getText().equals(LEFT_DOOR_BUTTON_OPEN)){
            buttonTrainInputLeftDoors.setText(LEFT_DOOR_BUTTON_CLOSE);
            buttonOperatorInputLeftDoors.setText(LEFT_DOOR_BUTTON_CLOSE);
            lblStatusLeftDoorStatus.setText(DOOR_OPEN);
        }
        else{
            buttonTrainInputLeftDoors.setText(LEFT_DOOR_BUTTON_OPEN);
            buttonOperatorInputLeftDoors.setText(LEFT_DOOR_BUTTON_OPEN);
            lblStatusLeftDoorStatus.setText(DOOR_CLOSED);
        }
    }

    private void toggleRightDoorInfo(){
        if(buttonTrainInputRightDoors.getText().equals(RIGHT_DOOR_BUTTON_OPEN)){
            buttonTrainInputRightDoors.setText(RIGHT_DOOR_BUTTON_CLOSE);
            buttonOperatorInputRightDoors.setText(RIGHT_DOOR_BUTTON_CLOSE);
            lblStatusRightDoorStatus.setText(DOOR_OPEN);
        }
        else{
            buttonTrainInputRightDoors.setText(RIGHT_DOOR_BUTTON_OPEN);
            buttonOperatorInputRightDoors.setText(RIGHT_DOOR_BUTTON_OPEN);
            lblStatusRightDoorStatus.setText(DOOR_CLOSED);
        }
    }

    private void toggleBreaks(){
        if(lblStatusBrakeStatus.getText().equals(BRAKE_ON)){
            lblStatusBrakeStatus.setText(BRAKE_OFF);
            buttonTrainInputBrakes.setText(BUTTON_TURN_BREAKS_ON);
        }
        else{
            lblStatusBrakeStatus.setText(BRAKE_ON);
            buttonTrainInputBrakes.setText(BUTTON_TURN_BREAKS_OFF);
        }
    }

    private void toggleTrainInMotion(){
        if(buttonTrainInputTrainInMotion.getText().equals(BUTTON_START_TRAIN)){
            lblStatusTrainStatus.setText(TRAIN_IN_MOTION);
            buttonTrainInputTrainInMotion.setText(BUTTON_STOP_TRAIN);
        }
        else{
            lblStatusTrainStatus.setText(TRAIN_STATIONARY);
            buttonTrainInputTrainInMotion.setText(BUTTON_START_TRAIN);
        }
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainTestGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonOperatorInputEmergency;
    private javax.swing.JButton buttonOperatorInputLeftDoors;
    private javax.swing.JButton buttonOperatorInputResetEmergency;
    private javax.swing.JButton buttonOperatorInputRightDoors;
    private javax.swing.JButton buttonOperatorInputRun;
    private javax.swing.JButton buttonTrainInputBlockDoors;
    private javax.swing.JButton buttonTrainInputBrakes;
    private javax.swing.JButton buttonTrainInputLeftDoors;
    private javax.swing.JButton buttonTrainInputLockDoors;
    private javax.swing.JButton buttonTrainInputRightDoors;
    private javax.swing.JButton buttonTrainInputTrainInMotion;
    private javax.swing.JLabel lblOperatorInput;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblStatusBrakeStatus;
    private javax.swing.JLabel lblStatusBrakes;
    private javax.swing.JLabel lblStatusEmergency;
    private javax.swing.JLabel lblStatusEmergencyStatus;
    private javax.swing.JLabel lblStatusLeftDoor;
    private javax.swing.JLabel lblStatusLeftDoorStatus;
    private javax.swing.JLabel lblStatusRightDoor;
    private javax.swing.JLabel lblStatusRightDoorStatus;
    private javax.swing.JLabel lblStatusTrainInMotion;
    private javax.swing.JLabel lblStatusTrainStatus;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTrainInput;
    private javax.swing.JLayeredPane lrdPanelOperatorInput;
    private javax.swing.JLayeredPane lrdPanelTrainInput;
    private javax.swing.JPanel panelInputs;
    private javax.swing.JPanel panelStatusReport;
    // End of variables declaration//GEN-END:variables

}
