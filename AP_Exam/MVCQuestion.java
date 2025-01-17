package AP_Exam;


public class MVCQuestion extends Question{
	public void setupQuestion() {
		int random = (int) Math.floor(Math.random()*5);
		
		switch(random){
		case 0:
			this.question = "What does MVC stand for?";
			this.choiceA = "Most Valuable Concept";
			this.choiceB = "Model View Concept";
			this.choiceC = "Model View Control";
			this.choiceD = "Model Vision Control";
			this.choiceE = "None of the Above";
			this.answerKey = 'C';
			break;
		case 1:
			this.question = "What does the View part of MVC contain";
			this.choiceA = "The GUI and Console IO code";
			this.choiceB = "The Logic for the program";
			this.choiceC = "A mix of all part of program";
			this.choiceD = "Data pulled from an outside source";
			this.choiceE = "A,B,C,D, but not E";
			this.answerKey = 'A';
			break;
		case 2:
			this.question = "What does the Control part of MVC contain";
			this.choiceA = "All of the above";
			this.choiceB = "There is no control is MVC";
			this.choiceC = "How the program looks but not the data";
			this.choiceD = "How the program looks and the data it uses";
			this.choiceE = "The brains of the program; logic code is here";
			this.answerKey = 'E';
			break;
		case 3:
			this.question = "What does the Model part of MVC control.";
			this.choiceA = "The \"brain\" of the program, uses data + user input to complete purpose.";
			this.choiceB = "The long-term stored information of a program. (Database)";
			this.choiceC = "The GUI; how the user interacts with the program.";
			this.choiceD = "The efficiency that the program runs at.";
			this.choiceE = "All of the above.";
			this.answerKey = 'B';
			break;
		case 4:
			this.question = "What is the purpose of MVC?";
			this.choiceA = "Make code modular so you can modify parts without breaking the entirety of the program.";
			this.choiceB = "Ensures that code is organized and purposeful.";
			this.choiceC = "Ensures the proper breakdown of a problem.";
			this.choiceD = "To make coding more confusing and difficult.";
			this.choiceE = "A, B, C, but not D";
			this.answerKey = 'E';
			break;
		default:
			System.out.print("ERROR");
		}
	}
	
	
}
