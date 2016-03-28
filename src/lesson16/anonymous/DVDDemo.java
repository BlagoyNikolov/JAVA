package lesson16.anonymous;

public class DVDDemo {
	public static void main(String[] args) {
		Person ivan = new Person();
		ivan.watchMovie(new IDVDRemoteController() {

			@Override
			public void insertDisc() {
				System.out.println("Insert disc...");
			}

			@Override
			public void playDisc() {
				System.out.println("Play disc...");
			}

		});
	}

	// better way
	class DVDRemoteController implements IDVDRemoteController {

		@Override
		public void insertDisc() {
			System.out.println("Insert disc...");
		}

		@Override
		public void playDisc() {
			System.out.println("Play disc...");
		}

	}
}
