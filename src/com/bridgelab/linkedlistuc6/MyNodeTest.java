package com.bridgelab.linkedlistuc6;

public class MyNodeTest {
	
	public static void main(String[] args) {
		given3NumbersWhenDeletingLastElementInBetweenLinkedList();
	}

	public static void given3NumbersWhenDeletingLastElementInBetweenLinkedList() {
		Node<Integer> firstNumberNode = new Node<Integer>(56);
		Node<Integer> secondNumberNode = new Node<Integer>(30);
		Node<Integer> thirdNumberNode = new Node<Integer>(70);
		MyNode myNode = new MyNode();
		myNode.add(firstNumberNode);
		myNode.append(thirdNumberNode);
		myNode.insert(firstNumberNode, secondNumberNode);
		myNode.printNodes();
		boolean result = myNode.head.equals(firstNumberNode) && myNode.head.getNext().equals(secondNumberNode)
				&& myNode.tail.equals(thirdNumberNode);
		myNode.popLastNode();
		System.out.println("Linked List after deleting last element");
		myNode.printNodes();
		System.out.println(result);
	}

}
