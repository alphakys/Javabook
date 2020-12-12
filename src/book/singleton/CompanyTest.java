package book.singleton;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		
		Company myCompany1 = Company.getCompanyInstance();
		
		Company myCompany2 = Company.getCompanyInstance();
		System.out.println(myCompany1==myCompany2);
		
		
		
		
		
		System.out.println(Company.getCompanyInstance());
		
		Company.getCompanyInstance();
		
	}

}
