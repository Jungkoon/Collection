package practice;

import java.time.LocalDate;

public class Task {
	public LocalDate date;
	public String info;
	
	public Task(LocalDate date, String info) {
		this.date = date;
		this.info = info;
	}
	
	public LocalDate getDate() {
		return date;
	}
	
	public String getInfo() {
		return info;
	}
	
	public String toString() {
		return date + ":" + info;
	}
}