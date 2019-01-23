package enumDemo;

public enum Month {
	JAN(31),FEB(28),MAR(31),JUN;
	int days; 
	Month(int days) {
		 this.days = days;
	 }
	private Month() {
		this.days = 10;
	}
	public int getPrice() {
		return days;
	}
}
