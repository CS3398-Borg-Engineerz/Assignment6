import threesolid.Worker; 

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

class Manager {

	private Worker worker;

	public void Manager() {

	}
	public void setWorker(Worker w) {
        this.worker = w;
	}

	public void manage() {
		this.worker.work();
	}