
public class QuestionTest {

	public static void main(String[] args) {
		
		
		Question question1 =new Question(1,"what is oops ",9);
		Question question2 =new Question(2,"what is oops ",8);
		Question question3 =new Question(3,"what is oops ",4);
		
		
		System.out.println("question1 "+question1);
		System.out.println("question2 "+question2);
		System.out.println("question3 "+question3);
		
		
		
		
		
	}
}

class Question
{
	int questionNo;
	String questionLevel;
	float questionMarks;
	
	public Question(int questionNo, String questionLevel, float questionMarks) {
		super();
		this.questionNo = questionNo;
		this.questionLevel = questionLevel;
		this.questionMarks = questionMarks;
	}

	@Override
	public String toString() {
		return "Question [questionNo=" + questionNo + ", questionLevel=" + questionLevel + ", questionMarks="
				+ questionMarks + "]";
	}
	
	  
	
}
