package UttaraSamples;

public class TestGenericClass<T> {	// Generics is used to impose Class type safety. It helps us in uncovering RunTime errors at compile time itself.
		private T val;
		
		public T getVal() {
			return val;
		}
		
		public void setVal(T val) {
			this.val = val;
		}
		
		
	public static void main(String[] args) {
		TestGenericClass<String> g1= new TestGenericClass<String>();
		g1.setVal("Kiran");
		
		System.out.println("Value of class state is:" + g1.getVal());
					
		TestGenericClass<Integer> g2= new TestGenericClass<Integer>();
		g2.setVal(5);
		
		System.out.println("Value of class state is:" + g2.getVal());
		
		TestGenericClass<Number> g3= new TestGenericClass<Number>();
		g3.setVal(5000L);
		
		System.out.println("Value of class state is:" + g3.getVal());
	}
}


