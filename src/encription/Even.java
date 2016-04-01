package encription;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Even {
	String s ="";
	public void ReadEvenFile (String srcPath){
		try {
			int i=0;
			BufferedReader in = new BufferedReader(new FileReader(srcPath));
			while ((i = in.read()) != -1){
					s += (char) i;
			}
			System.out.println(s);
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void WriteEvenFile (String desPath){
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(desPath));
			for (int i = 0; i < s.length(); i++){
				if (i % 2 == 0) {
					out.write(s.charAt(i));
				}
			}
			out.close();			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
