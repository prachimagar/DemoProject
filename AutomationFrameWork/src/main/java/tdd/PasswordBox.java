package tdd;

/*1.password should be between 6-18 characters long
2.there should be no spaces between characters
3.It should contain at least one special character 
4.it should  have at least one number
*/
public class PasswordBox {

	public boolean isPasswordValid(String str) {

		if (str.length() > 5 && str.length() < 19) {
			if (!str.contains(" ")) {

				return true;
			} else if (str.matches("\\w")) {
				return true;
			}

		}
		return false;

	}

}
