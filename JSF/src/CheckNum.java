import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped

public class CheckNum {

    private int num;

    public CheckNum() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int user_num) {
        this.num = user_num;
    }

}
