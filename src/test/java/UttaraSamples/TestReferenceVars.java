package UttaraSamples;

public class TestReferenceVars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pen pen_ref1 = new Pen("Gel", 20.0);
		pen_ref1.brand = "Luxor";
		
		Rhino rhino_ref1 = new Rhino("Rhinny");
		rhino_ref1.eat(pen_ref1);
				
		System.out.println("Pen brand is: " + pen_ref1.brand );
		
	}

}
