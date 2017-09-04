package methods;

public class MethodsEg {

	public static void main(String[] args)
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		MethodsEg m=new MethodsEg();
		
		
		m.function3();
		boolean result=m.function4();
		System.out.println(result);
		
	}

	//static method without returning any value
	public static void function1()
	{
		System.out.println("This is Function1 code");
	}
	//static method with returning value
	public static String function2()
	{
		System.out.println("This is function2 code");
		return "Pass";
	}
	//Non static without returning anyvalue
	public void function3()
	{
		System.out.println("This is Function3 code");
	}
	//Non static Method with returning value
	public boolean function4()
	{
		System.out.println("This is Function4 code");
		return true;
	}
}
