import java.awt.Color;
import java.time.LocalTime;

import ij.IJ;
import ij.ImagePlus;
import ij.process.ImageProcessor;

public class Main {
	public static LocalTime main(System[]args) {
		ImagePlus imp = IJ.openImage("/caminho/para/o/arquivo.jpg");
		ImageProcessor ip = imp.getProcessor();
		ip.setColor(Color.YELLOW);
		ip.setLineWidth(4);
		ip.drawRect(10, 10, imp.getWidth() - 20, imp.getHeight() - 20);

		imp.show();
		public void getHorario(String Horario) {
			LocalTime currentTime = new LocalTime();
			System.out.println("The current local time is: " + currentTime.toString());
			return currentTime;

		}
	}
}
