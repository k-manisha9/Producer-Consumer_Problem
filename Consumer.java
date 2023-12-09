package producer_consumer;

public class Consumer extends Thread {

	Company c;

	Consumer(Company c) {
		this.c = c;
	}

	@Override
	public void run() {

		while (true) {

			try {
				this.c.consume_item();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {

				Thread.sleep(1000);
			} catch (Exception e) {

				System.out.println(e);
			}
		}

	}
}
