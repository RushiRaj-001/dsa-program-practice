import java.util.ArrayList;
import java.util.Collections;

public class JobSeq {

    static class Job {
        int deadline;
        int profit;
        int job;

        Job(int j, int d, int p) {
            deadline = d;
            profit = p;
            job = j;
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = { { 1, 2, 20 }, { 2, 2, 15 }, { 3, 1, 10 }, { 4, 3, 5 }, { 5, 3, 1 } };

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(jobsInfo[i][0], jobsInfo[i][1], jobsInfo[i][2]));
        }

        // Sort jobs by profit in descending order
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        int maxDeadline = 0;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        boolean[] slot = new boolean[maxDeadline];
        ArrayList<Job> seq = new ArrayList<>();

        for (Job curr : jobs) {
            for (int j = Math.min(maxDeadline - 1, curr.deadline - 1); j >= 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    seq.add(curr);
                    break;
                }
            }
        }

        System.out.println("Max jobs: " + seq.size());
        int maxProfit = 0;
        for (Job job : seq) {
            maxProfit += job.profit;
        }
        System.out.println("Max profit: " + maxProfit);
        System.out.print("Job sequence: ");
        for (Job job : seq) {
            System.out.print(job.job + " ");
        }
    }
}
