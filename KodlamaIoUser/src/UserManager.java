
public class UserManager {
	public void editProfile(User user) {
		System.out.println(user.geteMail()+ " d�zenlendi.");

	}
	public void cikisYap(User user) {
		System.out.println("��k�� Yap�ld�");
	}
	public void sifreDegistir(User user) {
		System.out.println("�ifreniz ba�ar�yla de�i�tirildi: "+ user.getSifre());
	}
}
