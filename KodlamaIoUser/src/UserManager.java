
public class UserManager {
	public void editProfile(User user) {
		System.out.println(user.geteMail()+ " düzenlendi.");

	}
	public void cikisYap(User user) {
		System.out.println("Çýkýþ Yapýldý");
	}
	public void sifreDegistir(User user) {
		System.out.println("Þifreniz baþarýyla deðiþtirildi: "+ user.getSifre());
	}
}
