package practica2_1;

import java.io.*;
import java.util.HashMap;

public class ContadorDePalabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> counter = new HashMap<String, Integer>();
		FileReader file = null;
		String word ="";
		try {
			file = new FileReader ("C:\\Users\\ferpa\\Desktop\\Desktop\\RandTxt.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		try {
			int i;
			
			while( ( i=file.read()) != -1) {
				char ic = (char)i;
				String is = Character.toString(ic);
				is = is.toLowerCase();
				if (Character.isLetter(ic) && is!=" ") {
					word+=is;
					//System.out.println(word);
				}
				//System.out.println(is);
				else if(word!="") {
				if (!counter.containsKey(word)){
					counter.put(word, 1);
					word="";
					//System.out.println(is);
					
				}else {
				int newVal = counter.get(word);
				newVal+=1;
					counter.replace(word, newVal);
					word="";
				}
				}
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(counter.entrySet());
	}

}
