package ui;

import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JMenu;
import javax.swing.JTree;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JMenuBar;

public class Window {

	private JFrame frmFileexplorer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frmFileexplorer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFileexplorer = new JFrame();
		frmFileexplorer.setTitle("FileExplorer");
		frmFileexplorer.setBounds(100, 100, 610, 351);
		frmFileexplorer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFileexplorer.getContentPane().setLayout(new BorderLayout());
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		frmFileexplorer.getContentPane().add(leftPanel, BorderLayout.WEST);
		
		JTree tree = new JTree();
		leftPanel.add(tree);
		
		JPanel rightPanel = new JPanel();
		frmFileexplorer.getContentPane().add(rightPanel, BorderLayout.EAST);
		
		JPanel mainPanel = new JPanel();
		frmFileexplorer.getContentPane().add(mainPanel, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		frmFileexplorer.setJMenuBar(menuBar);
		
		JMenu mnFichier = new JMenu("Fichier");
		menuBar.add(mnFichier);
		
		JMenu mnEdition = new JMenu("Edition");
		menuBar.add(mnEdition);
		
		JMenu mnAffichage = new JMenu("Affichage");
		menuBar.add(mnAffichage);
	}

}
