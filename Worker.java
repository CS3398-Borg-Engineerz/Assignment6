import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;


// interface segregation principle - good example
interface IWorker {
	public void work();
	public void eat();
}   

class Worker implements IWorker{
	public void work() {
		// ....working
	}

	public void eat() {
		//.... eating in launch break
	}
}

class SuperWorker implements IWorker{
	public void work() {
		//.... working much more
	}

	public void eat() {
		//.... eating in launch break
	}
}