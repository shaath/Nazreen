package methods;

public class UserregTC {

	public static void main(String[] args) 
	{
		OrgHRM om=new OrgHRM();
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+ res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.org_Userreg("Sharath Chandra", "SharathChandra123456", "SharathChandra123456", "SharathChandra123456");
		System.out.println("User Registration "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application closed successfully");


	}

}
