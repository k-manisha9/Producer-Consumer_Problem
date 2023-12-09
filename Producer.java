package producer_consumer;

public class Producer extends Thread {

	Company c;

	Producer(Company c) {
		this.c = c;
	}

	@Override
	public void run() {

		int i = 1;
		while (true) {

			try {
				this.c.produce_item(i);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {

				Thread.sleep(1000);
				i++;
			} catch (Exception e) {

				System.out.println(e);
			}
		}

	}
}
