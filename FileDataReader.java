import java.io.*;
import java.util.*;

public class Assignment3 {

	public static double sum(double total, DataInputStream in) {
		int val = 0;
		double data = 0;
		try {
			val = in.available();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		if (val <= 0) {
			return total;
		} else {
			try {
				data = in.readDouble();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
			System.out.println("Binary file data value: " + data);
			total = total + data;
			return sum(total, in);
		}
	}

	public static void main(String[] args) {
		double total_sum = 0;
		try {
			DataInputStream in = new DataInputStream(new FileInputStream("Assignment3.dat"));
			total_sum = sum(total_sum, in);
			System.out.println("Total sum of values = " + total_sum);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
