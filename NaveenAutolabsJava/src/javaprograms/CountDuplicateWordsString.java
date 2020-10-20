package javaprograms;

import java.util.HashMap;
import java.util.Set;

public class CountDuplicateWordsString {

	public static void main(String[] args) {
		// hey java is java best language is java
		//java:3
		//is:2
		
		
		countduplicatewords("hey java is java best language is java");
	}

	
		public static void countduplicatewords(String InputString){
			
			String words[]=InputString.split(" ");
			HashMap<String,Integer> wordCount=new HashMap<String,Integer>();
			
			for(String word : words){
				
				
				if(wordCount.containsKey(word)){
					System.out.println(wordCount.get(word));
					wordCount.put(word, wordCount.get(word)+1);
					
				}
				else
					wordCount.put(word,1);
			}
			
			Set<String> wordinstring=wordCount.keySet();
			
			for(String word:wordinstring){
				if(wordCount.get(word)>1)
					System.out.println(word+":"+ wordCount.get(word));
				
			}
			
			
			
			
			
			
		}
	
}
