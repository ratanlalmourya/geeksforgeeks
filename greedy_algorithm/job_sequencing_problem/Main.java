package greedy_algorithm.job_sequencing_problem;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Job> jobs = new ArrayList<>();

        jobs.add(new Job(4,70));
        jobs.add(new Job(1,80));
        jobs.add(new Job(1, 30));
        jobs.add(new Job(1,100));

        
        // jobs.add(new Job(2,50));
        // jobs.add(new Job(2,60));
        // jobs.add(new Job(3, 20));
        // jobs.add(new Job(3,30));

        
        // jobs.add(new Job(2,100));
        // jobs.add(new Job(1,50));
        // jobs.add(new Job(2, 20));
        // jobs.add(new Job(1,20));
        // jobs.add(new Job(3,30));

        Collections.sort(jobs);
        for (Job job : jobs) {
            System.out.println(job.deadline + " : " + job.profit);
        }

        int n = jobs.getLast().deadline;
        Integer[] slots = new Integer[n];
        int maxProfit = 0;
        for (int i = 0; i < jobs.size(); i++) {
            if(slots[jobs.get(i).deadline-1] == null)
            {
                slots[jobs.get(i).deadline-1] = jobs.get(i).profit;
                maxProfit = maxProfit + jobs.get(i).profit;
            }
        }
        System.out.println("Maximum Profit : " + maxProfit);

    }
}
