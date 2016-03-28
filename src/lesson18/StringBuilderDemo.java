package lesson18;

public class StringBuilderDemo {
	public static void main(String[] args) {
		String text = "";
		text = text + "1";
		text = text + "2";
		text = text + "3";
		text = text + "4";
		text = text + "5";
		text = text + "text";
		text = text + "!!!";

		StringBuilder builder = new StringBuilder("initial text");
		builder.append("1");
		builder.append("2");
		builder.append("3");
		builder.append("some text");
		builder.append(true);
		builder.append(1).append(2).append(true).append("new text");

		System.out.println(builder.toString());
		builder.setLength(0);
	}
}
