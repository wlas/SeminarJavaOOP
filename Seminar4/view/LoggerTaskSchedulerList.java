package view;

import java.util.logging.Logger;

import data.TaskScheduler;
import data.TaskSchedulerList;

public class LoggerTaskSchedulerList implements View {

    Logger logger = Logger.getAnonymousLogger();

    @Override
    public void showTaskScheduler(TaskSchedulerList taskSchedulerList) {
        if (taskSchedulerList != null) {

            StringBuilder sb = new StringBuilder();
            for (TaskScheduler task : taskSchedulerList.getTaskSchedulersList()) {
                sb.append(
                        String.format(
                                "ID Author: %s | ID Task: %s | Content: %s | Date Add: %s | Deadline: %s | Date Of Completion: %s | Priority: %s | Status task: %s.\n",
                                task.getAuthorID(), task.getTaskID(), task.getTaskContent(), task.getDateAdd(),
                                task.getDeadlain(), task.getDateOfCompletion(), task.getPriority(), task.getStatus()));
            }
            logger.info(String.format("Task list: %s:\n", sb.toString()));
        } else {
            logger.info("No task.");
        }
    }

}
