package encription;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SoNguyenTo {
	String s = "";

	public void ReadSoNguyenToFile(String srcPath) {
		try {
			int i = 0;
			BufferedReader in = new BufferedReader(new FileReader(srcPath));
			while ((i = in.read()) != -1) {
				s += (char) i;
			}
			System.out.println(s);
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void WriteSoNguyenToFile(String desPath) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(desPath));
			int demUoc;
			for (int n = 1; n < s.length(); n++) {
				demUoc = 0;
				for (int i = 1; i <= n; i++) {
					if (n % i == 0) {
						demUoc++;
					}
				}
				if (demUoc == 2) {
					out.write(s.charAt(n));
				}
			}

			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
