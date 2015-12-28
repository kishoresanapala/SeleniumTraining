package oops;

import java.util.ArrayList;

public class Collections2 {

	public static void main(Advisor[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> b= new ArrayList<Integer>();
		int a[]={20,30};
		b.add(40);
		b.add(50);
		b.add(60);
		b.add(70);
		b.add(80);
		b.add(90);
		System.out.println(b.size());
		System.out.println(b.get(0));
		for(int i=0;i<b.size();i++){
			System.out.println(b);
			b.remove(2);
			b.remove(5);
		}
	}
	

}
