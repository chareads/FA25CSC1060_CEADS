
public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time () { // default constructor for midnight 0:0:00
		this.setHour(0);
		this.setMinute(0);
		this.setSecond(0);
	}
	
	public Time(int hour, int minute, int second) { // constructor to take input
		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);
	}

	// getters and setters for hour/min/sec
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}

	public double getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}

	public Time increment(int t) { // adds ONLY seconds
		Time total = new Time();
		total.second = this.second + t;
		total.minute = this.minute + t/60;
		total.hour = this.hour + t/3600;
		
		if (total.second >= 60.0) {
			total.second -= 60.0;
			total.minute += 1;
		}
		if (total.minute >= 60) {
			total.minute -= 60;
			total.hour += 1;
		}
		if (total.hour >= 24) {
			total.hour -= 24;
		}
		return total;
		// something in here is not working. hm.
	}

	public void print(boolean military) {
		if (military) {
			System.out.printf("%02d:%02d:%02d\n", 
					this.hour, this.minute, this.second);
		}
		else if (this.hour == 0) { // turn 0:XX into 12:XX
			int assoclock = this.hour+12;
			System.out.printf("%02d:%02d:%02d", 
					assoclock, this.minute, this.second);
			System.out.println(" AM");
		}
		else if (this.hour <= 12) {
			System.out.printf("%02d:%02d:%02d", 
					this.hour, this.minute, this.second);
			System.out.println(" AM");
		}
		else if (this.hour > 12) {
			int civHour = this.hour - 12;
			System.out.printf("%02d:%02d:%02d", 
					civHour, this.minute, this.second);
			System.out.println(" PM");
			}
		}
		
	}