//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071
package activity;

public class Activity implements Comparable<Activity> {
	
	// Name, Start und Endzeit dieser Aktivität
	private String name;
	private int startTime, endTime;
	
	/**
	 * Konstruiert eine neue Aktivität mit Start- und Endzeit.
	 */
	public Activity(String name, int startTime, int endTime) {
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
	}	

	/**
	 * Getter, toString und compareTo
	 */
	public int getEndTime() {
		return endTime;
	}

	public int getStartTime() {
		return startTime;
	}

	public String toString() {
		return "Aktivität [" + name + ", Start=" + startTime + ", Ende=" + endTime + "]";
	}
	
	public int compareTo(Activity o) {
		return this.endTime - o.endTime;
	}

}
