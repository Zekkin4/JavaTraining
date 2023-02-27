package Counter100_7;


	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;

	public class Count100 {

		public static void main(String[] args) {
			

			ExecutorService es = Executors.newFixedThreadPool(2);
			Thread_2 t = new Thread_2();
			es.execute(() -> {
				t.number();

			}

			);
			es.execute(() -> {
				t.tenth();
			});
			es.shutdown();
		}
	}

