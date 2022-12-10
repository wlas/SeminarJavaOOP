package service;

import java.util.ArrayList;

import data.TaskScheduler;
import data.TaskSchedulerList;

public interface ExportImportData {

    public TaskSchedulerList readFile(String path);

    public void exportAs(ArrayList<TaskScheduler> tasks, String path);
}
