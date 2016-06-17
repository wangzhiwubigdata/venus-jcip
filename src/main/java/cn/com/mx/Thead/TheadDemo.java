package cn.com.mx.Thead;

public class TheadDemo extends Thread{
	
	private String name;
/*	public TheadDemo(){
		
	};*/
	public TheadDemo(String name){
		this.name=name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i < 50; i++){
			System.out.println(name + "运行:" + i);
			try {
				sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		TheadDemo demo1 =new TheadDemo("A");//线程的名字
		TheadDemo demo2 =new TheadDemo("B");
		demo1.start();
		demo2.start();
		
	}
}//end of class
