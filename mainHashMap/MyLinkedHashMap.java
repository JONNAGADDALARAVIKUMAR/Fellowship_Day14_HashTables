package mainHashMap;

import java.util.ArrayList;

public class MyLinkedHashMap<K, V> {
	
	int numBuckets;
	ArrayList<MyLinkedList<K>> myBucketArray;
	
	public MyLinkedHashMap() {
		
		this.numBuckets = 10;
		this.myBucketArray = new ArrayList<>(numBuckets);
		
		for(int i = 0; i < numBuckets; i++) {
			this.myBucketArray.add(null);
		}
	}

	public int getBucketIndex(K key) {
		
		int hashcode = Math.abs(key.hashCode());
		int index = hashcode % numBuckets;
		return index;
	}
	
	public V get(K key) {
		
		int index = this.getBucketIndex(key);
		MyLinkedList<K> linkedList = this.myBucketArray.get(index);
		
		if(linkedList == null) {
			return null;
		}
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) linkedList.search(key);
		
		if(myMapNode == null) {
			return null;
		}
		else {
			return myMapNode.getValue();
		}
	}

	public void add(K key, V value) {
		
		int index = this.getBucketIndex(key);
		MyLinkedList<K> linkedList = this.myBucketArray.get(index);
		
		if(linkedList == null) {
			linkedList = new MyLinkedList<>();
			this.myBucketArray.set(index, linkedList);
		}
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) linkedList.search(key);
		
		if(myMapNode == null) {
			myMapNode = new MyMapNode<K, V>(key, value);
			linkedList.append(myMapNode);
		} else
			myMapNode.setValue(value);
	}
	
	public boolean remove(K key) {
		
		int index = this.getBucketIndex(key);
		
		MyLinkedList<K> linkedList = this.myBucketArray.get(index);
		if(linkedList == null) {
			return false;
		}
		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) linkedList.search(key);
		
		if(myMapNode == null) {
			return false;
		} else {
			linkedList.remove(myMapNode);
			return (myMapNode.getKey().equals(key));
		}
	}
	
	@Override
	public String toString() {
		return "myHashMapNodes { "+myBucketArray+" }";
	}
}
