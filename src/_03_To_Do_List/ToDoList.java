package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;

public class ToDoList implements ActionListener {
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 * 
	 * When add task is clicked:
	 * 		ask the user for a  task and save it to an array list
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list.
	 */
	JButton addtask;
	 JButton viewtask;
	 JButton removetask;
	 JButton savelist;
	 JButton loadlist;
	 String prevlist;
	 ArrayList<String> previouslist = new ArrayList();
	 ArrayList<String> list = new ArrayList();
	 public static void main(String[] args) {
		ToDoList asdfghjkl = new ToDoList();
		asdfghjkl.gaah();
	}
	 public void gaah () {
		 
		 JPanel panel = new JPanel();
		 JFrame frame = new JFrame();
		  addtask = new JButton("add task");
		  viewtask = new JButton("view task");
		  removetask = new JButton("remove task");
		  savelist = new JButton("save list");
		  loadlist = new JButton("load list");
		 
		 frame.setVisible(true);
		 frame.add(panel);
		 panel.add(loadlist);
		 panel.add(savelist);
		 panel.add(removetask);
		 panel.add(viewtask);
		 panel.add(addtask);
		 
		 addtask.addActionListener(this);
		 removetask.addActionListener(this);
		 viewtask.addActionListener(this);
		 savelist.addActionListener(this);
		 loadlist.addActionListener(this);
		 
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == addtask) {
		String bleh = JOptionPane.showInputDialog("add a task:").toLowerCase();
		list.add(bleh);
		}
		if(e.getSource() == viewtask) {
		JOptionPane.showMessageDialog(null, list.toString());
		}
		if(e.getSource() == removetask) {
		String what = JOptionPane.showInputDialog("which number task do you want to remove?");
		int p = Integer.parseInt(what) - 1;
		list.remove(p);
		}
		if(e.getSource() == savelist) {
			String name = JOptionPane.showInputDialog("name your file:");
			try {
			FileWriter fw = new FileWriter(name);
			for(int i = 0; i < list.size(); i++) {
				fw.write(list.get(i) + ", ");
			}
			fw.close();
			}catch(IOException g) {
				g.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "your list is saved.");
		}
		if(e.getSource() == loadlist) {
			String name = JOptionPane.showInputDialog("what is the name of the file?");
			prevlist = "";
			try {
				FileReader fr = new FileReader(name);
				int c = fr.read();
				while(c != -1){
					System.out.print((char)c);
					prevlist = prevlist + (char)c;
					c = fr.read();
				}
				fr.close();
			} catch (FileNotFoundException l) {
				l.printStackTrace();
			} catch (IOException g) {
				g.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, prevlist);
		}
	}
}
