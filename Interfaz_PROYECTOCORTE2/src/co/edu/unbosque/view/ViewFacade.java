package co.edu.unbosque.view;

public class ViewFacade {

	private Window window;
	
	
	public ViewFacade() {
		window = new Window();
	}


	public Window getWindow() {
		return window;
	}


	public void setWindow(Window window) {
		this.window = window;
	}
	
	
}
