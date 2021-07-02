package ch09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//p420
public class _12_QueueTest {

	private static List<String> list = new ArrayList<String>();
	private int i = 0;
	
	public static void enQueue(String str) {
		list.add(str);
	}
	public static void deQueue() {
		list.remove(0);
	}
	public static void showQueueList() {
		System.out.println(list);
	}
	public static void main(String[] args) {

		String[] queueList = {
							"가가가가",
							"나나나나",
							"다다다다",
							"라라라라"
		};
		
		for(int i = 0; i < queueList.length; i++) {
			_12_QueueTest.enQueue(queueList[i]);
		}
		_12_QueueTest.showQueueList();
		_12_QueueTest.deQueue();
		_12_QueueTest.showQueueList();
		_12_QueueTest.deQueue();
		_12_QueueTest.showQueueList();
		
	}
	
}
