import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import java.util.Random;

@ApplicationScoped

public class test implements Serializable {

	private static final long serialVersionUID = 1L;

	public test() {

	}

	String GenName() {
		Random newRan = new Random();
		int ranNum = newRan.nextInt(10);
		return NameList(ranNum);
	}

	private String NameList(int ranNum) {
		String name = FirstName(ranNum+1) + LastName(ranNum+1);
		return name;
	}

	private String FirstName(int a) {
		String firstName="1";
		switch (a){
			case 1:
				firstName = "Amy ";
				break;
			case 2:
				firstName = "Bob ";
				break;
			case 3:
				firstName = "Cindy ";
				break;
			case 4:
				firstName = "Dobby ";
				break;
			case 5:
				firstName = "Elice ";
				break;
			case 6:
				firstName = "Fab ";
				break;
			case 7:
				firstName = "Gary ";
				break;
			case 8:
				firstName = "Harry ";
				break;
			case 9:
				firstName = "Ivan ";
				break;
			case 10:
				firstName = "Jack ";
				break;
		}
		return firstName;
	}

	private String LastName(int b) {
		String lastName="2";
		switch (b){
			case 1:
				lastName = "Blacksmith";
				break;
			case 2:
				lastName = "William";
				break;
			case 3:
				lastName = "Thomson";
				break;
			case 4:
				lastName = "Odinson";
				break;
			case 5:
				lastName = "Stark";
				break;
			case 6:
				lastName = "Valid";
				break;
			case 7:
				lastName = "Null";
				break;
			case 8:
				lastName = "Clear";
				break;
			case 9:
				lastName = "Abba";
				break;
			case 10:
				lastName = "Puluton";
				break;
		}
		return lastName;
	}

}
