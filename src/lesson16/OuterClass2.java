package lesson16;

public class OuterClass2 {
	private String value;
	private static int count;

	void useMemberFromTheInnerClass() {
		InnerClass ic = new InnerClass();
		System.out.println(ic.name);
	}

	class InnerClass {
		private String name;
		// compilation error
		// private static String value;

		public static final int NUMBER = 22;

		void useMembersFromTheOuterClass() {
			System.out.println(value);
			System.out.println(count);
		}
	}
}
