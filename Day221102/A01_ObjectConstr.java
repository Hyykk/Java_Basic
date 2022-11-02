package Day221102;

class Temp{
	public String message;
	
	public void connectMessage(String msg) {
		String str = this.message + msg;
		System.out.println(str);
	} 
	public void connectMessage(String msg, int i) {
		String str = this.message + msg + Integer.toString(i);
		System.out.println(str);
	} 
	public void connectMessage(int msg) {
		String str = this.message + Integer.toString(msg);
		System.out.println(str);
	} 
	public void connectMessage(String msg, float i, int j) {
		String str = this.message + Float.toString(i) + Integer.toString(j);
		System.out.println(str);
	} 
	
	public void setMessage(String msg) {
		this.message = msg;
	}
	public String printMessage() {
		return this.message;
	}
}

class ExtendTemp extends Temp{
	@Override
	public String printMessage() {
		System.out.println("Method overrided");
		return this.message;
	}
}

class EXXTemp extends Temp{
	@Override
	public void setMessage(String msg) {
		System.out.println("msg: " + msg);
		this.message = msg;
	}
}

public class A01_ObjectConstr {
	public static void main(String[] args) {
		EXXTemp exxtemp = new EXXTemp();
		exxtemp.setMessage("send msg");
		
		ExtendTemp et = new ExtendTemp();
		et.setMessage("Method Override");
		System.out.println(et.printMessage());
	}
}
