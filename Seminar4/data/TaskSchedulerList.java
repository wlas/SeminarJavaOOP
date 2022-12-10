package data;

import java.util.ArrayList;
import java.util.Collection;

import service.ImportData;

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
