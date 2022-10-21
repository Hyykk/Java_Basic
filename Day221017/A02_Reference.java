package Day221017;

class Other{
	public void printOther(String str) {
		System.out.println("str reference : " + str.hashCode());
	}
}

public class A02_Reference {
	public static void main(String[] args) {
		String mstr = new String("Hello Java");	//Construct "Hello Java" String
		Other ot = new Other();	// Construct Other
		
		System.out.println("mstr reference : " + mstr.hashCode());
		ot.printOther(mstr);
	}
}
