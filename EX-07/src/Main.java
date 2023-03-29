import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

	public static void main(String[] args) {
		queueStuff();

	}
	public static void testShuffle() {
		ArrayList arr = new ArrayList<Integer>();
		for(int i = 0; i<10; i++)
			arr.add(i);
		shuffle(arr);
		System.out.println(arr.toString());
	}
	
	//** shuffles a list */
	public static <E> List<E> shuffle(List<E> list){
		int n = list.size() - 1;
		Random rand = new Random();
		for(int i = 0; i<= n; i++) {
			int r = rand.nextInt(i+1); //inclusive i
			swap(list, i, r);
		}
		return list;
	}
	
	/** swaps two items in a given list */
	public static <E> void swap(List<E> list, int index1, int index2){
		E item1 = list.get(index1);
		E item2 = list.get(index2);
		list.set(index1, item2);
		list.set(index2, item1);
	}
	
	public static void stackStuff() {
		Stack<Integer> s = new Stack<Integer>();
		s.push(5);
		s.push(21);
		s.pop();
		s.push(72);
		s.push(37);
		s.push(15);
		s.pop();
		
		System.out.println(s);
	}
	public static void queueStuff() {
		ArrayBlockingQueue<Integer> q = new ArrayBlockingQueue<Integer>(100);
		q.offer(5);
		q.offer(21);
		q.poll();
		q.offer(72);
		q.offer(37);
		q.offer(15);
		q.poll();
		
		System.out.println(q);
	}

}

