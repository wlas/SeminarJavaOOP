package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

import data.Priority;
import data.Status;
import data.TaskScheduler;
import data.TaskSchedulerList;

public class WriteImportCsvFile {
    private final BufferedWriter writer;
    private final String delimiter;

    public WriteImportCsvFile(String path, String delimiter) throws IOException {
        this.writer = new BufferedWriter(new FileWriter(path));
        this.delimiter = delimiter;
    }

    public void writeTask(TaskScheduler task) throws IOException {

        StringBuilder sb = new StringBuilder();
        sb.append(task.getTaskID());
        sb.append(delimiter);
        sb.append(task.getAuthorID());
        sb.append(delimiter);
        sb.append(task.getTaskContent());
        sb.append(delimiter);
        sb.append(task.getDateAdd());
        sb.append(delimiter);
        sb.append(task.getDateOfCompletion());
        sb.append(delimiter);
        sb.append(task.getDeadlain());
        sb.append(delimiter);
        sb.append(task.getPriority());
        sb.append(delimiter);
        sb.append(task.getStatus());
        sb.append("\n");
        final String line = sb.toString();
        writer.write(line);
    }

    public static TaskSchedulerList readTask(String path) throws IOException, ParseException {

        TaskSchedulerList arrayList = new TaskSchedulerList();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = null;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                TaskScheduler task = new TaskScheduler();
                task.setTaskID(values[0]);
                task.setAuthorID(values[1]);
                task.setTaskContent(values[2]);
                task.setDateAdd(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(values[3]));
                task.setDateOfCompletion(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(values[4]));
                task.setDeadlain(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(values[5]));
                task.setPriority(Priority.valueOf(values[6]));
                task.setStatus(Status.valueOf(values[7]));

                arrayList.addTaskSchedulerList(task);
            }

            return arrayList;
        }
    }

    public void close() throws IOException {
        writer.close();
    }
}
