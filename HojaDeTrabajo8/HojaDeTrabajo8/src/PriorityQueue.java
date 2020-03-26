/**
 * @authorJavier Alejandro Cotto Argueta
 * @Carne 19324
 * @date 26/03/19
 * @see http://dept.cs.williams.edu/~bailey/JavaStructures/Book_files/JavaStructures.pdf
 * @see https://uvg.instructure.com/courses/13715/pages/priority-queue?module_item_id=195527
 **/

public interface PriorityQueue<E extends Comparable<E>>{
	public E getFirst();
	// pre: !isEmpty()
	// post: returns the minimum value in priority queue
	
	public E remove();
	// pre: !isEmpty()
	// post: returns and removes minimum value from queue
	
	public void add(E value);
	// pre: value is non-null comparable
	// post: value is added to priority queue
	
	public boolean isEmpty();
	// post: returns true iff no elements are in queue
	
	public int size();
	// post: returns number of elements within queue
	
	public void clear();
	// post: removes all elements from queue
}