//ethan

public class AddTimetable {

	public int timeableId;
	public double price;
	public String startDateTime;
	public String endDateTime;
	public String mode;

	public AddTimetable(int timeableId, double price, String startDateTime, String endDateTime, String mode) {

		this.timeableId = timeableId;
		this.price = price;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.mode = mode;
	}

	public int getTimeableId() {
		return timeableId;
	}

	public void setTimeableId(int timeableId) {
		this.timeableId = timeableId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}

	public String getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(String endDateTime) {
		this.endDateTime = endDateTime;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

}