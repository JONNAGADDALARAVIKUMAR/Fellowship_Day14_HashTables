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
		System.out.println("Test Case 1 - Size : "+size);
		Assert.assertEquals(3, size);
	}
	
	@Test
	public void given13NumbersWhenAddedToBSTShouldReturnSize13() {
		
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(11);
		myBinaryTree.add(65);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
				
		int size = myBinaryTree.getSize();
		System.out.println("Test Case 2 - Size : "+size);
		Assert.assertEquals(13, size);
	}
}
