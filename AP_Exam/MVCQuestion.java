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
