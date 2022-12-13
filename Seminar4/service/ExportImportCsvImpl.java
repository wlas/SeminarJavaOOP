package service;

import java.util.ArrayList;

import data.TaskScheduler;
import data.TaskSchedulerList;
import util.WriteImportCsvFile;

public class ExportImportCsvImpl implements ExportImportData {

    @Override
    public void exportAs(ArrayList<TaskScheduler> tasks, String path) {

        try {
            WriteImportCsvFile csvFile = new WriteImportCsvFile(path, ";");
            for (TaskScheduler taskScheduler : tasks) {
                csvFile.writeTask(taskScheduler);
            }
            csvFile.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public TaskSchedulerList readFile(String path) {

        try {
            return WriteImportCsvFile.readTask(path);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
