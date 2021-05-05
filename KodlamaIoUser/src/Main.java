
public class Main {

	public static void main(String[] args) {
		
		User user = new User()	;
		user.seteMail("esraekinci@gmail.com");
		
		UserManager userManager = new UserManager();
		userManager.editProfile(user);
		
		User sifre = new User();
		sifre.setSifre("JavaCamp21042021");
		userManager.sifreDegistir(sifre);
	}

}
