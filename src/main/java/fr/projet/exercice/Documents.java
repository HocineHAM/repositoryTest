package fr.projet.exercice;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




public class Documents {
	String line;
	
	public void readDoc() throws IOException  {
		
		BufferedReader br = new BufferedReader(new FileReader("C:/Users/Hammar/Desktop/document1.txt"));
		while ((line = br.readLine()) != null) {
		  
			System.out.println(line);
			int taille = line.length();
			System.out.println(taille);
		}
		br.close();
		}
	
	
	
	
	
	
	public void test() 
	{
	 try
	 {
	 	BufferedReader bfr = new BufferedReader (new FileReader ("C:/Users/Hammar/Desktop/document1.txt"));
	 	String line;
	 
	 	while ((line = bfr.readLine())!= null)
	 	{
	   String [] tokens = line.split("\\b" );
	   int i = 0;
	   while (tokens.length > i)
	   {
		
	   	String Word = tokens[i++];
	   	Word = Word.toLowerCase();
	   	Word = Word.replaceAll("[^a-z]","" );
	   
	   	if(Word.length()>1)
	   	{
	   		List<Integer> listLettre = new ArrayList<Integer>();
	   		listLettre.add(Word.length());
	   		System.out.println(listLettre);
	   		System.out.println(Word);
	   	}
	   }
	 	}
	 	bfr.close();
	 	
	 }
	 	catch (Exception e) {
	 	System.out.println(e);
	 }
	}

}

