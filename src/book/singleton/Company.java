package book.singleton;

public class Company {
		
		String companyName;
	
	private Company() {}
	
	private static Company company = new Company();
	
	
	public static Company getCompanyInstance() {
		
		if(company==null) {
			company = new Company();
		}
		
		return company;
	}
	
	
	
	

	
	
	
	
}
