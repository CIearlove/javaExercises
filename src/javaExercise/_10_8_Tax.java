package javaExercise;

public class _10_8_Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SINGLE_FILER = 0;
		final int MARRIED_JOINTLY = 1;
		final int MARRIED_SEPARATELY = 2;
		final int HEAD_OF_HOUSEHOLD = 3;
		
		Tax tax1 = new Tax();
		tax1.setTaxableIncome(160000);
		System.out.println("The tax is:"+tax1.getTax());
		tax1.setFilingStatus(MARRIED_JOINTLY);
		System.out.println("The tax is:"+tax1.getTax());
		tax1.setFilingStatus(MARRIED_SEPARATELY);
		System.out.println("The tax is:"+tax1.getTax());
		tax1.setFilingStatus(HEAD_OF_HOUSEHOLD);
		System.out.println("The tax is:"+tax1.getTax());
	}

}
