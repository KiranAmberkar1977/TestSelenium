package UttaraSamples;

public class MethodInnerClass {
	private int outerVar1;
	
	public MethodInnerClass(int outerVar1) {
		super();
		this.outerVar1 = outerVar1;
	}
		
	public void outerMethod() {
		
		class InnerClass {
			int innerVar1;
			
			public InnerClass(int innerVar1) {
				super();
				this.innerVar1 = innerVar1;
			}

			public void getInner() {
				System.out.println("In getInner method...Outer ka variable value is: " + outerVar1 + "and Inner var is: " + innerVar1);
			}

			public int getInnerVar1() {
				return innerVar1;
			}

			public void setInnerVar1(int innerVar1) {
				this.innerVar1 = innerVar1;
			}
				
		}
		
		InnerClass obj2 = new InnerClass(30);
		obj2.getInner();
	}
	
	//private OuterClass.InnerClass obj = new InnerClass(20);
	
	//public void getVars() {
	//	System.out.println("In getOuter... Inner var is " + obj.getInnerVar1() + "and outer var is: " + outerVar1);
	//}
}
