public class Utility {

	public enum Comparison {
		MORE_THAN,
		LESS_THAN,
		EQUALS
	}
	public static Boolean compareQuestionValue(String questionId,String value,Comparison comparison) {
		/*
		 * Take question id to find out the value for the question's answer and then compare with 
		 * the value we have. Return boolean
		 */ 

		System.out.println("Comparing :"+questionId+" , "+value+ " , "+comparison);

		return true;

	}
	public static Boolean compareQuestionReplyOption(String questionId,String replyOption) {

		/*
		 *
		 * Take question id and find out current input. Compare with expected replyOption and find out. 
		 */
		System.out.println("Comparing :"+questionId+" , "+replyOption);

		return true;
	}

	
	public static Boolean compareScoringCategoryValue(String scoringcategoryId, String value, Comparison comparison) {


		/*
		 *
		 *Take scoring category and find out input value and compare with expected value
		 *
		 */
		System.out.println("Comparing :"+scoringcategoryId+" , "+value+ " , "+comparison);

		return true;
	}





}
