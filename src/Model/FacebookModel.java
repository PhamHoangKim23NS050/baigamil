package Model;

import java.util.ArrayList;
import java.util.List;

public class FacebookModel {

	    private List<String> activityHistory;

	    public FacebookModel() {
	        activityHistory = new ArrayList<>();
	    }

	    public void addActivity(String activity) {
	        activityHistory.add(activity);
	    }

	    public List<String> getActivityHistory() {
	        return activityHistory;
	    }
	}

