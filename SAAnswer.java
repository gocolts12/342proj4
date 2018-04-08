
package HW_4_ExamBuilder;

import java.util.Scanner;
import java.io.PrintWriter;

public class SAAnswer extends Answer{
	
	protected String wordAns;
	
	public SAAnswer(String aMsg) {
		wordAns = aMsg;
	}
	
	public SAAnswer(Scanner sc) {
		super(sc);
	}

	
	@Override
	public void print() {
		System.out.println(wordAns);
	}
	
	@Override
	public double getCredit(Answer rightAnswer) {
		SAAnswer ansObj = (SAAnswer) rightAnswer;
		if (wordAns.equalsIgnoreCase(ansObj.wordAns) ) {
			return 1.0;
		} else {
			return 0.0;
		}

	}
	
	//NEW METHOD
	@Override
	public void save(PrintWriter savedWrite) {
		
		savedWrite.println(wordAns);
		
		

	}
	
	

}
