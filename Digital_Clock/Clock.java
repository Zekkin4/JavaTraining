package Digital_Clock;

	import java.time.LocalDateTime;
	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;

	public class Clock {

		public static void main(String[] args) {

			ExecutorService es = Executors.newFixedThreadPool(1);
			es.execute(() -> {

				display();

			});
			es.execute(() -> {
				display();

			});

			es.shutdown();
		}

		static int h = LocalDateTime.now().getHour();
		static int m = LocalDateTime.now().getMinute();
		static int s = LocalDateTime.now().getSecond();

		synchronized public static void display() {

			int i = 1;
			while (i++ <= 10) {

				s++;
				if (s == 60) {
					m++;
					s = 0;
				}
				if (m == 60) {
					m = 0;
					h++;
				}
				if (h == 24) {
					h = 0;
				}
				System.out.printf("\t%02d : %02d : %02d\n", h%12, m, s);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}

		}

	}


