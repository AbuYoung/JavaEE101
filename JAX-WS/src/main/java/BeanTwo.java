import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named("Bean2")
@SessionScoped

public class BeanTwo implements Serializable {

	private static final long serialVersionUID = 1L;

	public BeanTwo() {}

	@Inject
	test GenName;

	private String name;
	private String List;
	private int number;

	public void CreateName(){
		this.name = SaveName();
	}

	private String SaveName(){
		GenName.GenName();
		return List = GenName.list;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getList(){
		return List;
	}

	public void setList(String list){
		this.List = list;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
