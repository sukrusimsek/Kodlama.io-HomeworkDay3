
public class UserManager extends User{
	public void add() {
		User user = new User();
		user.name = "Şükrü Şimşek";
		System.out.println(user.name + " İsimli Kullanıcı Eklendi");
	}
	public void remove() {
		System.out.println(" Kullanıcı Silindi");
	}
	public void update() {
		System.out.println(" Kullanıcı Güncellendi");
	}
}
