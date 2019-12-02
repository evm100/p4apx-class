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
			this.question = "";
			this.choiceA = "";
			this.choiceB = "";
			this.choiceC = "";
			this.choiceD = "";
			this.choiceE = "";
			break;
		case 4:
			this.question = "";
			this.choiceA = "";
			this.choiceB = "";
			this.choiceC = "";
			this.choiceD = "";
			this.choiceE = "";
			break;
		default:
			System.out.print("ERROR");
		}
	}
	
	
}
