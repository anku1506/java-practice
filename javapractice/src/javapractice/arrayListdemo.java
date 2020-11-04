//java arrayList example

package javapractice;
import java.util.*;
public class arrayListdemo { 
		public static void main(String[] args) 
		{ 
			ArrayList<String> al=new ArrayList<String>();
			al.add("Anku");
			al.add("satyam");
			al.add("ricky");
			al.add("Anand");
			al.add("resev");
			al.add("rahul");
			al.add("shubham");
			al.add("sonu");
			System.out.println(al);
			al.remove("rahul");
			al.remove("Anku");
			System.out.println(al);

			
		} 
	} 


