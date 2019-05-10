import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Random;

@Named("test")
@SessionScoped

public class test implements Serializable {

	private static final long serialVersionUID = 1L;

	public test() {

	}

	private String salutation;

	private String GenName() {
		Random newRan = new Random();
		return String.valueOf(newRan.nextInt(10));
	}

	public void CreateName() {
		this.salutation = GenName();
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
}
