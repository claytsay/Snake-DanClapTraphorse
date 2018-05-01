import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;
import javax.swing.UIManager;

public class SnakePanel extends JPanel {


	Snake s = new Snake();
	
	Timer timer = new Timer(500,null);
	public static void main(String[] args) {
		try {
			// Set System L&F
			UIManager.setLookAndFeel(
					UIManager.getSystemLookAndFeelClassName());
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		JFrame frame = new JFrame("Snake!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		SnakePanel sp = new SnakePanel();
		frame.add(sp);
		sp.setPreferredSize(new Dimension(800,600));
		frame.pack();
		frame.setVisible(true);
		sp.setUpKeyMappings();
		sp.startGame();
	}
	private void setUpKeyMappings() {
		this.getInputMap().put(KeyStroke.getKeyStroke("UP"),"left");
		this.getActionMap().put("left",new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Hit left arrow!!");
			}
		});
		this.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"left");
		this.getActionMap().put("left",new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("Hit left arrow!!");
			}
		});
		this.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"left");
		this.getActionMap().put("left",new AbstractAction(){

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("Hit left arrow!!");
			}
		});
        this.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"left");
        this.getActionMap().put("left",new AbstractAction(){

            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("Hit left arrow!!");
            }
        });
		this.requestFocusInWindow();
		
	}
	private void startGame() {
		timer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				tick();
			}
			
		});
		timer.start();
	}
	protected void tick() {
		System.out.println("Timer went off!");
	}
	
}