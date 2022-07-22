package java.Task16;

public class ThreadSum1 extends Thread implements Runnable {
	private int start;
	private int stop;
	private static int sum;
	public ThreadSum1(int start,int stop) {
		this.start = start;
		this.stop = stop;
		this.sum=0;
	}
	public static void setSum(int sum) {
		ThreadSum1.sum = sum;
	}
	public void run() {
		for(int i=start;i<=stop;i++) {
			sum+=i;
			System.out.println(i);
		}	
	}
 public static void main(String[] args) throws InterruptedException {
	ThreadSum1 t = new ThreadSum1(1,50);
	ThreadSum1 t1 = new ThreadSum1(51,100);
	t.start();
	
	synchronized (t) {
		t.wait();
		t.notify();
	}
	t1.start();
	Thread.sleep(10);
	System.out.println(t.getSum());
}
public  int getSum() {
	return sum;
}
}
