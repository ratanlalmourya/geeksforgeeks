package greedy_algorithm.activity_selection_problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        List<Activity> activityList = new ArrayList<Activity>();
        activityList.add(new Activity(3, 4));
        activityList.add(new Activity(2, 4));
        activityList.add(new Activity(1,3));
        activityList.add(new Activity(10, 11));
        
        printMaximumPossibleActivity(activityList);
    }

    private static void printMaximumPossibleActivity(List<Activity> activityList) {
        Collections.sort(activityList,Comparator.comparingInt(Activity::getEnd));

        System.out.println("*********** All Possible Activities ************");
        for (int i = 0; i < activityList.size(); i++) {
            System.out.println(activityList.get(i).getStart() + " " + activityList.get(i).getEnd());
        }

        List<Activity> possibleActivities = new ArrayList<>();
        possibleActivities.add(activityList.get(0));

        for (int i = 1; i < activityList.size(); i++) {
            
            if(possibleActivities.get(possibleActivities.size()-1).getEnd() <= activityList.get(i).getStart())
            {
                possibleActivities.add(activityList.get(i));
            }
        }

        System.out.println("***************** Possible activities ***************");

        for (Activity activity : possibleActivities) {
            System.out.println(activity.getStart() + " " + activity.getEnd());
        }


    }
}
