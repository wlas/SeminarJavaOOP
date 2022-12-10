package data;

import java.util.Date;
import java.util.UUID;

public class TaskScheduler {
    private String taskID;
    private String authorID;
    private String taskContent;
    private Date dateAdd;
    private Date dateOfCompletion;
    private Date deadlain;
    private Priority priority;
    private Status status;

    public TaskScheduler() {

    }

    public TaskScheduler(String taskID, String authorID, String taskContent,
            Date dateAdd, Date deadline, Date dateOfCompletion,
            Priority priority, Status status) {
        this.taskID = taskID;
        this.authorID = authorID;
        this.taskContent = taskContent;
        this.dateAdd = dateAdd;
        this.deadlain = deadline;
        this.dateOfCompletion = dateOfCompletion;
        this.priority = priority;
        this.status = status;

    }

    public TaskScheduler(UUID authorID, String taskContent, Date deadline, Priority priority) {
        this(UUID.randomUUID().toString(), authorID.toString(), taskContent, new Date(),
                deadline, null, priority, Status.AWAIT);
    }

    public String getTaskID() {
        return taskID;
    }

    public String getAuthorID() {
        return authorID;
    }

    public String getTaskContent() {
        return taskContent;
    }

    public Date getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(Date dateAdd) {
        this.dateAdd = dateAdd;
    }

    public Date getDateOfCompletion() {
        return dateOfCompletion;
    }

    public void setDateOfCompletion(Date dateOfCompletion) {
        this.dateOfCompletion = dateOfCompletion;
    }

    public Date getDeadlain() {
        return deadlain;
    }

    public void setDeadlain(Date deadlain) {
        this.deadlain = deadlain;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public void setTaskContent(String taskContent) {
        this.taskContent = taskContent;
    }
}
