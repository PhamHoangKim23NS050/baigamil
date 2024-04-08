package View;

import java.util.List;

public class FacebookView {
	
	    public void displayActivityHistory(List<String> activityHistory) {
	        System.out.println("Facebook Activity History:");
	        activityHistory.forEach(System.out::println);
	    }
	}


