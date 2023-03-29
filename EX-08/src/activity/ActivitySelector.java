//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071package activity;
package activity;

import java.util.ArrayList;
import java.util.Arrays;

public class ActivitySelector {

	/**
	 * Testet die Aktivitätenauswahl
	 */
	public static void main(String[] args) {
		Activity[] activities = {
				new Activity("0", 0, 0),
				new Activity("1", 5, 9), 
				new Activity("2", 8, 11), 
				new Activity("3", 6, 10), 
				new Activity("4", 2, 14), 
				new Activity("5", 3, 5), 
				new Activity("6", 0, 6), 
				new Activity("7", 5, 7),
				new Activity("8", 12, 16),
				new Activity("9", 3, 9),
				new Activity("10", 1, 4),
				new Activity("11", 8, 12) };
		
		Arrays.sort(activities);
		ArrayList<Activity> res = activitySelection(activities, 0, activities.length);
		res.sort((a,b) -> a.compareTo(b)); //to make the output more readable
		System.out.println(res);
	}

	
	/**
	 * Rekursiver Algorithmus zur Aktivitätenauswahl
	 */
	private static ArrayList<Activity> activitySelection(Activity[] activities, int k, int n) {
		//starting from the first unchecked activity
		int m = k+1;
		
		//while m is smaller than the amount of activities to check
		//and activity[m] starts before the previous activity ends
		while(m<n && activities[m].getStartTime() < activities[k].getEndTime()) {
			m++;
		}
		
		//if there exists an activity that fits, check the remaining activities and combine them
		if(m < n) {
			ArrayList<Activity> compatibleActivities = 	activitySelection(activities, m, n);
			compatibleActivities.add(activities[m]);
			return compatibleActivities;
		}
		//if not m < n then there does not exists an activity that fits in the remaining timespan
		return new ArrayList<Activity>();
	}

}
