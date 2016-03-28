package lesson16;

public class Demo {
	public static void main(String[] args) {
		OuterClass.InnerStaticClass.accessMemberFromTheOuterClass();

		OuterClass.InnerStaticClass isc = new OuterClass.InnerStaticClass();
		isc.accessMemberFromTheOuterClass2();

		// compilation error
		// OuterClass2.InnerClass ic = new OuterClass2.InnerClass();
		OuterClass2 outerclass2 = new OuterClass2();
		OuterClass2.InnerClass ic = outerclass2.new InnerClass();

		ic.useMembersFromTheOuterClass();

	}
}
