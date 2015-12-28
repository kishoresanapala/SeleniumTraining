package com.adp.file.operations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class WriteNotePad {

	public static void main(String[] args) {

		 WriteNotePad RP= new WriteNotePad();
		 RP.readData();

	}

	public void readData() {
		//String filePath = "C:\\Users\\ACER\\Desktop\\Test.txt";
		try {
			FileWriter fr = new FileWriter("C:\\Users\\ACER\\Desktop\\Test1.txt"); // file location file
														// reader
			BufferedWriter br = new BufferedWriter(fr);
			
			br.write("I am useless fellow");
			br.newLine();
			br.write("I am useless fellow");
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
