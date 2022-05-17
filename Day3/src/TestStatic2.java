
public class TestStatic2 {

	public static void main(String[] args) {
		
		int x=10;
		System.out.println("x");
		
		DefineStatic.a=120;
		DefineStatic.method();
		
		DefineStatic obj=new DefineStatic();
		System.out.println("obj");
		obj.method();
		obj.a=140;
		obj.method();
		DefineStatic obj2=new DefineStatic();
		obj2.method();
		DefineStatic.method();
		// TODO Auto-generated method stub

	}

}
