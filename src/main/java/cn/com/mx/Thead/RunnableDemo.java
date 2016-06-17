package cn.com.mx.Thead;

public class RunnableDemo implements Runnable{

	private String name;
	public RunnableDemo(String name){
		this.name = name;
	}
	
	public void run(){
		for (int i = 0; i < 50; i++) {
			System.out.println(name + "run" + i);
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Thread(new RunnableDemo("A")).start();;
		new Thread(new RunnableDemo("B")).start();;

	}
	
	
	
	
}//end of class
