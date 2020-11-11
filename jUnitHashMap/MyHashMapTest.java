package jUnitHashMap;

import org.junit.Assert;
import org.junit.Test;
import mainHashMap.MyHashMap;

public class MyHashMapTest {

	@Test
	public void givenSentenceWhenWordsAreAddedToListShouldReturnFrequency() {
		
		String sentance = "To be or not to be";
		MyHashMap<String, Integer> hashMap = new MyHashMap();
		String[] words = sentance.toLowerCase().split(" ");
		
		for(String word : words) {
			
			Integer value = hashMap.get(word);
			
			if(value == null) 
				value = 1;
			else
				value = value + 1;
			hashMap.add(word, value);
		}
		
		int frequency = hashMap.get("to");
		System.out.println(hashMap);
		Assert.assertEquals(2, frequency);
	}
}
