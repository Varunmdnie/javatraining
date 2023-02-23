import java.time.LocalDate;
import java.time.LocalDateTime;

public class DataTypesTest {

	
		public static void main(String[] args) {
			byte districtRank =100;
			short stateRank = 10000;
			int nationalRank = 999999;
			long internationalRank =87878787878988L;
			float intrestRate = 8.56f;
			double molecularDistance = 0.0000755f; 
			char gender= 'M';
			char ascii = 65;
			boolean areYouCertified=true;
			String myName ="varun";
			String myFatherName ="divakar";
			
			
			
		   System.out.println("the district rank is  : "+districtRank);
		   System.out.println("the state rank is   "+stateRank);
		   System.out.println("the national rank is "+nationalRank);
		   System.out.println("the international rank is "+internationalRank);
		   System.out.println("the intrest rate is  "+intrestRate);
		   System.out.println("the molecular distance is  "+molecularDistance);
		   System.out.println("the gender is   "+gender);
		   System.out.println("the ascii value is "+ascii);
		   System.out.println("are you certified  "+areYouCertified);
		   System.out.println("my name is  "+myName);
		   System.out.println("my father name is  "+myFatherName);
		   
		   
		   LocalDate today =LocalDate.now();
		   LocalDateTime today1 =LocalDateTime.now();
		   System.out.println("today is   "+today);
		   System.out.println("today is  "+today1);
		   
		   
		  
		   
		
	}

}
