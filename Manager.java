import threesolid.Worker; 
class Manager {
	private Worker worker;
	public void Manager() {
		//implement manager tasks here 
	}
	public void setWorker(Worker w) {
        this.worker = w;
	}
	public void manage() {
		this.worker.work();
	}
}
