package methods;

public class TestSuite {

	public static void main(String[] args)
	{
		// Login
		OrgHRM om=new OrgHRM();
		System.out.println("Login TC Started");
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+ res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application closed successfully");

		//Empreg
		System.out.println("Empreg TC Started");
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+ res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.org_Empreg("Vignan", "Kumar");
		System.out.println("Employee Registration "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application closed successfully");

		//Userreg
		System.out.println("Userreg TC Started");
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+ res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.org_Userreg("Vignan Kumar", "VignanKumar123456", "VignanKumar123456", "VignanKumar123456");
		System.out.println("User Registration "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application closed successfully");

		//UserLogin
		System.out.println("UserLogin TC Started");
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+ res);
		
		res=om.org_Login("VignanKumar123456", "VignanKumar123456");
		System.out.println("Application Login "+res);
		
		res=om.org_Logout();
		System.out.println("Application Logout "+res);
		
		om.org_Close();
		System.out.println("Application closed successfully");



	}

}
