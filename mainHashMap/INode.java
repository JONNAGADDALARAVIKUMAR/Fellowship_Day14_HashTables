package mainHashMap;

public interface INode<K> {
	
	INode key = null;
	K getKey();
	void setKey(K key);
	
	INode getNext();
	void setNext(INode<K> next);
}
