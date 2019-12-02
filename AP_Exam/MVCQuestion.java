package AP_Exam;


public class MVCQuestion extends Question{
	public void setupQuestion() {
		int random = (int) Math.floor(Math.random()*5);
		
		switch(random){
		case 0:
			this.question = "";
			this.choiceA = "";
			this.choiceB = "";
			this.choiceC = "";
			this.choiceD = "";
			this.choiceE = "";
			break;
		case 1:
			this.question = "";
			this.choiceA = "";
			this.choiceB = "";
			this.choiceC = "";
			this.choiceD = "";
			this.choiceE = "";
			break;
		case 2:
			this.question = "";
			this.choiceA = "";
			this.choiceB = "";
			this.choiceC = "";
			this.choiceD = "";
			this.choiceE = "";
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
