import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javafx.beans.binding.*;;




class MediaPlayer{
	JFrame mainwindow = new JFrame("Media App");
	JMenuBar mainmenu=new JMenuBar();
	JMenu filemenu= new JMenu("File");
	JMenuItem openmenuitem=new JMenuItem("Open");
	public static void main(String xyz[]){
			MediaPlayer mediaplayerrefvar=new MediaPlayer();
	}
	
	MediaPlayer(){
		mainwindow.setVisible(true);
		mainwindow.setSize(400,400);
		mainwindow.setJMenuBar(mainmenu);
		mainmenu.add(filemenu);
		filemenu.add(openmenuitem);
		
	}

	
}