package h_pakage1;

public class H_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cigar = 2;
		int smokeYear = 20;
		int dailyCigarNo = 3;
		int year = 365;
		
		int oneLifeLost = cigar * dailyCigarNo;
		int smokedays = smokeYear * year;
		
		int question1 = smokedays * oneLifeLost;
		int question2 = question1 / 60;
		int question3 = question2 / 24;

		System.out.println(question1);
		System.out.println(question2);
		System.out.println(question3);
		

	}

}
