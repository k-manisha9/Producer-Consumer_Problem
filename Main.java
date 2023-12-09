package producer_consumer;

public class Main {

	public static void main(String args[]) {

		Company c = new Company();
		Producer pt = new Producer(c);
		Consumer ct = new Consumer(c);

		pt.start();
		ct.start();

	}
}
