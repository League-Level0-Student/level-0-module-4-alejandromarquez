//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.
	int happy = 0;

	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store in variable
JOptionPane.showInputDialog(null, " what kind of pet you want ");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "what do you want to do to your pet", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "feed", "groom", "wash" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			System.out.println();
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	void feedpet() {
		JOptionPane.showMessageDialog(null, "pur");
		happy+=10;
}
	void wash() {
		JOptionPane.showMessageDialog(null, "thrash");
		happy+=60;
	
}
	void groom() {
		JOptionPane.showMessageDialog(null, "ahhh");
		happy+=100;
}