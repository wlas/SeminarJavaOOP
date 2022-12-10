package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import data.AuthorList;
import data.Priority;
import data.TaskScheduler;
import data.TaskSchedulerList;
import service.ExportImportCsvImpl;
import service.ExportImportData;
import view.LoggerTaskSchedulerList;
import view.View;

public class Controller {

    View view = new LoggerTaskSchedulerList();
    ExportImportData exData = new ExportImportCsvImpl();;

    public void execute() {

        AuthorList al = new AuthorList();
        TaskSchedulerList t1 = new TaskSchedulerList();

        al.AddAuthor("Petr", "Petrov");
        al.AddAuthor("Sasha", "Sashev");

        UUID id = al.getAuthor("Sasha", "Sashev");
        t1.addTaskSchedulerList(new TaskScheduler(id, "New task 1", new Date(), Priority.HIGH));
        t1.addTaskSchedulerList(new TaskScheduler(id, "New task 2", new Date(), Priority.MIDDLE));
        t1.addTaskSchedulerList(new TaskScheduler(id, "No important task", new Date(), Priority.LOW));

        view.showTaskScheduler(t1);

        exData.exportAs(t1.getTaskSchedulersList(), "task.csv");

        view.showTaskScheduler(exData.readFile("task.csv"));
    }
}
