import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named("Switch")
@SessionScoped

public class Switch implements Serializable {

	public static final long serialVersionUID = 1L;

	private int num;
	private String url;

	public Switch() {
		num = 1;
		url = "resource/" + num + ".jpg";
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void refreshUrl(){
		num++;
		if(num == 3){
			num = 1;
		}
		url = "resource/"+ num +".jpg";
	}
}
