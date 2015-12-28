package oops;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NotePad {

	public static void main(String[] args) {
		NotePad n=new NotePad();
		n.notepad();
		// TODO Auto-generated method stub

	}
	
public void notepad(){
	//String name="C:\\Users\\ACER\\Desktop\\note.txt";
	try {
		FileReader fr=new FileReader("C:\\Users\\ACER\\Desktop\\note.txt");
		BufferedReader b=new BufferedReader(fr);
		String manoj;
		while((manoj =b.readLine())!=null);
		System.out.println(manoj);
		b.close();
	} catch (Exception e){
	System.out.println(e);
		
		// TODO Auto-generated catch block
		//e.printStackTrace();
	}
}
}
