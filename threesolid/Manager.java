import threesolid.Worker; 

class Manager {
	Worker worker;

	public void Manager() {

	}
	public void setWorker(IWorker w) {
		worker=w;
	}

	public void manage() {
		worker.work();
	}
}
