package greedy_algorithm.job_sequencing_problem;

public class Job implements Comparable<Job> {
    
    public Integer deadline;
    public Integer profit;
    public Job(Integer deadline, Integer profit) {
        this.deadline = deadline;
        this.profit = profit;
    }
    @Override
    public int compareTo(Job job) {

        if(this.deadline == job.deadline)
        {
            return job.profit - this.profit;
        }else {
            return this.deadline - job.deadline;
        }
    }

    

}
