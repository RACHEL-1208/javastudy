package datastrutcture;

public class ExQueue {

	public static void main(String[] args) {
		int queueSize = 4;
		char deletedItem;
		ArrayCQueue cQ = new ArrayCQueue (queueSize);
		
		cQ.enQueue('A');
		cQ.printQueue();
		System.out.println("++++++++++"+cQ.getCount());
		cQ.enQueue('B');
		cQ.printQueue();
		System.out.println("++++++++++"+cQ.getCount());
		deletedItem = cQ.deQueue();
		
		if(deletedItem != 0) {
			System.out.println("deleted Item  :  "+ deletedItem);
		}
		cQ.printQueue();
		System.out.println("++++++++++"+cQ.getCount());
		
		
		cQ.enQueue('C');
		cQ.printQueue();
		System.out.println("++++++++++"+cQ.getCount());
		
		
		cQ.enQueue('D');
		cQ.printQueue();
		System.out.println("++++++++++"+cQ.getCount());
		
		
		cQ.enQueue('E');
		cQ.printQueue();
		
		System.out.println("++++++++++"+cQ.getCount());
	}
}
