package week1.day2;

public class Browser {
	public static void main(String[] args) {
		Browser obj = new Browser(); 
		obj.launchBrowser("Chrome");
		obj.loadurl();
	}
	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		
		return browserName;
	}
		
	public void loadurl() {
		  
		System.out.println("Application URL loaded successfully");
	}
}


