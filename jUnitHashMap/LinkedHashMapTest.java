package jUnitHashMap;

import org.junit.Assert;
import org.junit.Test;

import mainHashMap.MyLinkedHashMap;

public class LinkedHashMapTest {
	
	@Test
	public void addedStringWhenSearchForAWordShouldReturnAccurence() {
		
		String sentence = "Paranoids are not paranoid because "
						+ "they are paranoid but because they "
						+ "keep putting themselves deliberately "
						+ "into paranoid avoidable situation";
		
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		
		for(String key : words) {
			
			Integer value = myLinkedHashMap.get(key);
			if(value == null) {
				value = 1;
			}
			else {
				value = value + 1;
			}
			myLinkedHashMap.add(key, value);
		}
		int frequency = myLinkedHashMap.get("paranoid");
		System.out.println(myLinkedHashMap);
		Assert.assertEquals(3, frequency);
	}
	
	@Test
	public void addedStringWhenRemoveAWordFromSentenceShouldRemoveThatWordFromHashMap() {
		
		String sentence = "Paranoids are not paranoid because "
						+ "they are paranoid but because they "
						+ "keep putting themselves deliberately "
						+ "into paranoid avoidable situation";
		
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		String[] words = sentence.toLowerCase().split(" ");
		
		for(String word : words) {
		
			Integer value = myLinkedHashMap.get(word);
			if(value == null) {
				value = 1;
			}
			else {
				value = value + 1;
			}
			myLinkedHashMap.add(word, value);
		}
		boolean result = myLinkedHashMap.remove("avoidable");
		System.out.println(myLinkedHashMap);
		Assert.assertTrue(result);
	}
}
