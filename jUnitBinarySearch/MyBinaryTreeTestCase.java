package jUnitBinarySearch;

import org.junit.Assert;
import org.junit.Test;

import mainBinarySearch.MyBinaryTree;

public class MyBinaryTreeTestCase {
	
	@Test
	public void given3NumbersWhenAddedToBSTShouldReturnSize3() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
				
		int size = myBinaryTree.getSize();
		Assert.assertEquals(3, size);
	}
}