package heaps;

import java.util.Arrays;

//Java program to implement Max Heap
class MaxHeap {
	private int[] heap;
	private int size;

	public MaxHeap(int n)
	{
		this.size = 0;
		heap = new int[n];
	}

	// Returning position of parent
	private int parent(int pos) { return (pos - 1) / 2; }

	// Returning left children
	private int leftChild(int pos) { return (2 * pos) + 1; }

	// Returning right children
	private int rightChild(int pos)
	{
		return (2 * pos) + 2;
	}

	// Returning true of given node is leaf
	private boolean isLeaf(int pos)
	{
		if (pos > (size / 2) && pos <= size) {
			return true;
		}
		return false;
	}

	// Swapping nodes
	private void swap(int current, int parent)
	{
		int tmp;
		tmp = heap[current];
		heap[current] = heap[parent];
		heap[parent] = tmp;
	}

	// Recursive function to max heapify given subtree
	private void maxHeapify(int pos)
	{
		if (isLeaf(pos))
			return;

		if (heap[pos] < heap[leftChild(pos)]
			|| heap[pos] < heap[rightChild(pos)]) {

			if (heap[leftChild(pos)]
				> heap[rightChild(pos)]) {
				swap(pos, leftChild(pos));
				maxHeapify(leftChild(pos));
			}
			else {
				swap(pos, rightChild(pos));
				maxHeapify(rightChild(pos));
			}
		}
	}

	// Inserts a new element to max heap
	public void insert(int element)
	{
		heap[size] = element;
		int current = size;
		while (heap[current] > heap[parent(current)]) {
			swap(current, parent(current));
			current = parent(current);
		}
		size++;
	}
	
	// To display heap
	public void print()
	{

		for (int i = 0; i < size / 2; i++) {

			System.out.print("Parent Node : " + heap[i]);
			
			if (leftChild(i) < size) 
				System.out.print(" Left Child: " + heap[leftChild(i)]);

			if (rightChild(i) < size) 
				System.out.print(" Right Child: " + heap[rightChild(i)]);

			System.out.println(); 
		}
	}

	// Remove an element from max heap
	public int deleteMax()
	{
		int popped = heap[0];
		heap[0] = heap[--size];
		maxHeapify(0);
		return popped;
	}
	
	public void kthValue(int n) {
		int[] sortedElements = heap;
		Arrays.sort(sortedElements);
		if(n > size) {
			throw new IllegalStateException();
		}
		System.out.println(n+" largest value : " + sortedElements[sortedElements.length - n]);
	}
}

public class HeapExample1 {

	public static void main(String[] args) {
		// Display message for better readability
				System.out.println("The Max Heap is ");

				MaxHeap maxHeap = new MaxHeap(5);

				maxHeap.insert(5);
				maxHeap.insert(17);
				maxHeap.insert(10);
				maxHeap.insert(84);
				maxHeap.insert(19);

				maxHeap.print();
				
				maxHeap.kthValue(3);
				maxHeap.kthValue(2);

				// Print and display the deleted maximum value in heap
				System.out.println("The deleted max val is " + maxHeap.deleteMax());

	}

}
