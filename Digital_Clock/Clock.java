package Digital_Clock;

	import java.time.LocalDateTime;
	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;

	public class Clock {

		public static void main(String[] args) {

			ExecutorService es = Executors.newFixedThreadPool(4);
			es.execute(() -> {
				
				display();

			});
			es.execute(() -> {
				display();

			});
			es.execute(() -> {
				display();

			});
			es.execute(() -> {
				display();

			});
			es.shutdown();
		}

		synchronized public static void display() {
			int i = 1;
			while (i <= 10) {
				System.out.println(LocalDateTime.now().getHour() + " : " + LocalDateTime.now().getMinute() + " : "
						+ LocalDateTime.now().getSecond());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				i++;
			}
		}

	}


