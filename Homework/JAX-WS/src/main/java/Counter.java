//import javax.enterprise.context.ApplicationScoped;
//import javax.inject.Inject;
//import java.io.Serializable;
//import java.util.Random;
//
//@ApplicationScoped
//
//public class Counter implements Serializable {
//
//	private static final long serialVersionUID = 1L;
//
//	public Counter(){}
//
//	@Inject
//	javax.ejb.TimerService timer;
//
//
//	private int[] counter = new int[10];
//
//	void GenCounter(){
//		Random newRan = new Random();
//		for(int i=0; i<10; i++){
//			counter[i] = newRan.nextInt(10);
//		}
//		timer.createTimer(1000,"hhh");
//	}
//
//
//}
