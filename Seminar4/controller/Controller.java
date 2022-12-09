package controller;

import java.util.Date;
import java.util.UUID;

import data.AuthorList;
import data.Priority;
import data.TaskScheduler;
import data.TaskSchedulerList;
import view.LoggerTaskSchedulerList;
import view.View;

public class Controller {

    View view = new LoggerTaskSchedulerList();

    public void execute() {

        AuthorList al = new AuthorList();
        TaskSchedulerList tl = new TaskSchedulerList();

        al.AddAuthor("Petr", "Petrov");
        al.AddAuthor("Sasha", "Sashev");

        UUID IvanIivanov = al.getAuthor("Sasha", "Sashev");
        tl.addTaskSchedulerList(new TaskScheduler(IvanIivanov, "New task 1", new Date(), Priority.HIGH));
        tl.addTaskSchedulerList(new TaskScheduler(IvanIivanov, "New task 2", new Date(), Priority.MIDDLE));
        tl.addTaskSchedulerList(new TaskScheduler(IvanIivanov, "No important task", new Date(), Priority.LOW));

        view.showTaskScheduler(tl);
    }
}
