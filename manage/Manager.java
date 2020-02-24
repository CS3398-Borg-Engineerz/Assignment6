package manage;
import threesolid.Worker;
public class Manager {
	private Worker worker;
	public void Manager() {

	}
	public void setWorker(Worker w) {
		this.worker=w;
	}
	public void manage() {
		this.worker.work();
	}
}
