package GUI;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class ControlEmergencyLabel {
	private final Color COLOR_ONE = Color.red;
	private final Color COLOR_TWO = Color.YELLOW;
	private boolean isFirstState;
	private JLabel lblEmrgncy;
	
	public ControlEmergencyLabel(JLabel lblEmergency){
		isFirstState = true;
		lblEmrgncy = lblEmergency;
		lblEmrgncy.setBackground(COLOR_TWO);
		lblEmrgncy.setForeground(COLOR_ONE);
		lblEmrgncy.setFont(lblEmrgncy.getFont().deriveFont((float) 40.0));
		lblEmrgncy.setHorizontalTextPosition(SwingConstants.CENTER);
	}
	
	public void switchState(){
		if(isFirstState){
			lblEmrgncy.setBackground(COLOR_ONE);
			lblEmrgncy.setForeground(COLOR_TWO);
			isFirstState = false;
		}
		else{
			lblEmrgncy.setBackground(COLOR_TWO);
			lblEmrgncy.setForeground(COLOR_ONE);
			isFirstState = true;
		}
	}
}
