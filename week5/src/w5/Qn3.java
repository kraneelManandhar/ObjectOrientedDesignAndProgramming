package w5;

interface working{
	void work();
}

interface eating{
	void eat();
}

class Human implements working,eating{
	public void work() {}
	
	public void eat() {}
}

class Robot implements working{
	public void work() {}
}