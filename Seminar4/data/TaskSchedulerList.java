package data;

import java.util.ArrayList;

public class TaskSchedulerList {

    ArrayList<TaskScheduler> taskSchedulersList;

    public TaskSchedulerList() {
        taskSchedulersList = new ArrayList<>();
    }

    public ArrayList<TaskScheduler> getTaskSchedulersList() {
        return taskSchedulersList;
    }

    public void addTaskSchedulerList(TaskScheduler taskScheduler) {
        taskSchedulersList.add(taskScheduler);
    }
}
