package Controller;

import java.util.List;

import Model.FacebookModel;
import View.FacebookView;

public class FacebookController {
	
	    private FacebookModel model;
	    private FacebookView view;

	    public FacebookController(FacebookModel model, FacebookView view) {
	        this.model = model;
	        this.view = view;
	    }

	    public void addActivity(String activity) {
	        model.addActivity(activity);
	    }

	    public void displayActivityHistory() {
	        List<String> activityHistory = model.getActivityHistory();
	        view.displayActivityHistory(activityHistory);
	    }
	}

