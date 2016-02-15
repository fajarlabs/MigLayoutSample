package com.window.controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import com.window.library.WrapLayout;

import net.miginfocom.swing.MigLayout;
import javax.swing.JDesktopPane;
import java.awt.Insets;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppBaseController {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppBaseController window = new AppBaseController();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppBaseController() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("wrap 1", "[grow]", "[top][top][grow,top]"));
		
		JPanel panelTopMenu = new JPanel();
		panelTopMenu.setBackground(SystemColor.window);
		frame.getContentPane().add(panelTopMenu, "cell 0 0,push ,grow");
		// Custom wrap layout
		WrapLayout wl_panelTopMenu = new WrapLayout();
		wl_panelTopMenu.setAlignment(FlowLayout.LEFT);
		wl_panelTopMenu.setVgap(0);
		wl_panelTopMenu.setHgap(0);
		panelTopMenu.setLayout(wl_panelTopMenu);
		
		JMenuBar menuBarFile = new JMenuBar();
		panelTopMenu.add(menuBarFile);
		
		JMenu mnFile = new JMenu("File");
		mnFile.setMnemonic('F');
		menuBarFile.add(mnFile);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Quit");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon(AppBaseController.class.getResource("/javax/swing/plaf/metal/icons/ocean/paletteClose-pressed.gif")));
		mnFile.add(mntmNewMenuItem);
		
		JMenuBar menuBarEdit = new JMenuBar();
		panelTopMenu.add(menuBarEdit);
		
		JMenu mnEdit = new JMenu("Edit");
		mnEdit.setMnemonic('E');
		menuBarEdit.add(mnEdit);
		
		JMenuBar menuBarSource = new JMenuBar();
		panelTopMenu.add(menuBarSource);
		
		JMenu mnSource = new JMenu("Source");
		mnSource.setMnemonic('S');
		menuBarSource.add(mnSource);
		
		JMenuBar menuBarRefactor = new JMenuBar();
		panelTopMenu.add(menuBarRefactor);
		
		JMenu mnRefactor = new JMenu("Refactor");
		mnRefactor.setMnemonic('R');
		menuBarRefactor.add(mnRefactor);
		
		JMenuBar menuBarNavigate = new JMenuBar();
		panelTopMenu.add(menuBarNavigate);
		
		JMenu mnNavigate = new JMenu("Navigate");
		mnNavigate.setMnemonic('N');
		menuBarNavigate.add(mnNavigate);
		
		JMenuBar menuBarSearch = new JMenuBar();
		panelTopMenu.add(menuBarSearch);
		
		JMenu mnSearch = new JMenu("Search");
		mnSearch.setMnemonic('S');
		menuBarSearch.add(mnSearch);
		
		JMenuBar menuBarProject = new JMenuBar();
		panelTopMenu.add(menuBarProject);
		
		JMenu mnProject = new JMenu("Project");
		mnProject.setMnemonic('P');
		menuBarProject.add(mnProject);
		
		JPanel panelToolbarMenu = new JPanel();
		panelToolbarMenu.setLayout(new WrapLayout());
		panelToolbarMenu.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panelToolbarMenu, "cell 0 1,grow");
		
		JButton btnNewButton_4 = new JButton("New button");
		panelToolbarMenu.add(btnNewButton_4);
		
		JButton btnNewButton_3 = new JButton("New button");
		panelToolbarMenu.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("New button");
		panelToolbarMenu.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("New button");
		panelToolbarMenu.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("New button");
		panelToolbarMenu.add(btnNewButton);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "cell 0 2,grow");
	}

}
