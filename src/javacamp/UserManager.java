package inheritance3;

public class UserManager {
	public void signIn(User user) {
		System.out.println(user.getFullName() + "Login in system.");
	}
	public void signOut(User user) {
		System.out.println("Exit done.");
	}
}
