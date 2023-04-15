package javaprograms;

public class ConstructorCalling extends MergeAndSortArray{
	String fn;
	String ln;
	int age;
	long phno;
	public ConstructorCalling(String fn, String ln) {
		this.fn = fn;
		this.ln = ln;
	}
	public ConstructorCalling(String fn, String ln, int age, long phno) {
		this(fn,ln,age);
		this.phno = phno;
	}
	public ConstructorCalling(String fn, String ln, int age) {
		this(fn,ln);
		this.age = age;
	}
	

}
