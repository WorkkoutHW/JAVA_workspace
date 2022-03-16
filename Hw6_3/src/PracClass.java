class TV{
	String model;
	int made;
	int inch;
	
	public TV(String name, int made, int inch) {
		this.model = name;
		this.made = made;
		this.inch = inch;}
	
	public void show() {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV", model, made, inch);
	}	
}

public class PracClass {
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
		}
	}
