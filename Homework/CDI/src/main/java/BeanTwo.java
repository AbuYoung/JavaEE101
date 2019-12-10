import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;

@Named("Bean2")
@SessionScoped

public class BeanTwo implements Serializable {

	private static final long serialVersionUID = 1L;

	public BeanTwo() {}

	@Inject
	test GenName;

	private String name;

	public void CreateName(){
		this.name = GenName.GenName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
