package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	try {
            		int id = 109637;
            		String ap = "GALLARDO";
            		String nom = "Nicolás";
            		String mail = "nicogallardo2010@gmail.com";
            		String url = "https://github.com/NicoGallardo1986";
            		String rutaImagen = "/images/fotoPerfil.png";
            		Student miEstudiante = new Student(id, ap, nom, mail, url, rutaImagen);
					SimplePresentationScreen frame = new SimplePresentationScreen(miEstudiante);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
    }
}