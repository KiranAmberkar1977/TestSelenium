package UttaraSamples;

public class TestOuterClass {

	public static void main(String[] args) throws InterruptedException {
		
		// Accessing inner class method from an outer class object instance.
		System.out.println("Testing a normal nested class...");
		OuterClass obj = new OuterClass(10);
		obj.getVars();
		obj.outerMethod();
		
		// Accessing an inner class method directly from the Tester code.
		System.out.println("Testing a normal nested class...But accessing inner class method directly...");
		OuterClass.InnerClass iobj = obj.new InnerClass(60);
		iobj.getInner(); System.out.println("Inner var value is: " + iobj.getInnerVar1());
		
		// Accessing a instance method inner class method from the Tester code.
		System.out.println("Testing a instance member nested class...");
		MethodInnerClass mobj = new MethodInnerClass(50);
		mobj.outerMethod();
		
		// Accessing static inner class method from an outer class object instance.
		System.out.println("Testing a static nested class...");
		StaticInnerClass sobj = new StaticInnerClass(100);
		sobj.getVars();
		sobj.outerMethod();
		
		// Accessing an static inner class method directly from the Tester code.
		System.out.println("Testing a static nested class...But accessing inner class method directly...");
		StaticInnerClass.InnerClass siobj = new StaticInnerClass.InnerClass(200);
		siobj.getInner(); System.out.println("Inner var value is: " + siobj.getInnerVar1());

		// Accessing an anonymous Inner Class that extends a parent class from Tester code.
		System.out.println("Testing a anonymous nested class...");
		AnonInnerClass aobj = new AnonInnerClass(10){
				public void getContent () {
					System.out.println("This is Inner class getContent...and variable value is: " + AnonInnerClass.outerVar);
				}
			};
		aobj.getContent();
		
		// Accessing an anonymous Interface Inner Class that implements an Interface from Tester code.
		System.out.println("Testing a anonymous interface nested class...");
		InterfaceInnerClass aiobj = new InterfaceInnerClass(){
				public void getContent () {
					System.out.println("This is Interface Inner class getContent...and variable value is: " + InterfaceInnerClass.outerVar);
				}
			};
		aiobj.getContent();
		
		//Here we are using Anonymous Inner class that implements a interface i.e. Here Runnable interface 
        Runnable r = new Runnable() 
        { 
            public void run() 
            { 
                System.out.println("Child Thread"); 
            } 
        }; 
        Thread t1 = new Thread(r); 
        t1.start(); 
        Thread.sleep(1);
        System.out.println("Main Thread");
        
      //Here we are using Anonymous Inner class that defines a constructor argument 
        Thread t2 = new Thread(new Runnable() 
        { 
            public void run() 
            { 
                System.out.println("Child Thread"); 
            } 
        }); 
        t2.start(); 
        Thread.sleep(1);
        System.out.println("Main Thread");
	}
}
