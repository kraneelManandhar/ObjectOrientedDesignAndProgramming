package w5;

class Processor{
	public Processor() {
		System.out.println("This is the processor.");
	}
	
	 public void process() {
	        System.out.println("Processor is processing");
	    }
}

class Computer {
	private Processor psr;
	public Computer() {
		psr =  new Processor();
		System.out.println("Computer is created.");
	}
	
	void start() {
		psr.process();
		System.out.println("Computer Started");
	}
}

public class Qn10 {
	public static void main(String[] args) {
		Computer c = new Computer();
		c.start();
		
//		c.psr.process();     	Not available without calling it independently
	}
}