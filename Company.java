package producer_consumer;

public class Company {

	int n;

	boolean f = false;

	// false then item will be produced else consumed
	// true then item will be consumed
	synchronized public void produce_item(int n) throws InterruptedException {

		this.n = n;

		if (f) {
			wait();
		}
		System.out.println("Produced item : " + n);
		f = true;
		notify();
	}

	synchronized public int consume_item() throws InterruptedException {

		if (!f) {
			wait();
		}
		System.out.println("Consumed item : " + n);
		f = false;// for producer_item()
		notify();
		return n;
	}
}
