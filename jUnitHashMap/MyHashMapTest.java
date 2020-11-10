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
	
	@Test
	public void givenSentenceWhenWordsAreAddedToListShouldReturnParanoidFrequency() {
		
		String sentance = "Paranoids are not"
							+" paranoid because they are paranoid but"
							+" because they keep putting themselves"
							+" deliberately into paranoid avoidable"
							+" situations";
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
		
		int frequency = hashMap.get("paranoid");
		System.out.println(hashMap);
		Assert.assertEquals(3, frequency);
	}
}
