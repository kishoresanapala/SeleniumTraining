package com.adp.file.operations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadNotePad {

	public static void main(String[] args) {

		 ReadNotePad RP= new ReadNotePad();
		 RP.readData();

	}

	public void readData() {
		//String filePath = "C:\\Users\\ACER\\Desktop\\Test.txt";
		try {
			FileReader fr = new FileReader("C:\\Users\\ACER\\Desktop\\Test.txt"); // file location file
														// reader
			BufferedReader br = new BufferedReader(fr);
			String s;
			//System.out.println(br.readLine());
			while((s =br.readLine())!=null)
				System.out.println(s);
			
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
