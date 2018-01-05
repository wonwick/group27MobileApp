package com.won.taskmodule;

/**
 * Created by Oshan Wickramaratne on 2017-10-02.
 */
import android.widget.TextView;

import com.google.firebase.database.IgnoreExtraProperties;


@IgnoreExtraProperties
public class CompletedTask {
    private String name;
    private String area;
    private String id;
    private String contactName ;
    private String contactNumber ;
    private String deadline ;
    private String description ;
    private String acceptedDate;
    private String completedDate;

    public CompletedTask(String name, String area, String id, String contactName, String contactNumber, String deadline, String description, String acceptedDate, String completedDate) {
        this.name = name;
        this.area = area;
        this.id = id;
        this.contactName = contactName;
        this.contactNumber = contactNumber;
        this.deadline = deadline;
        this.description = description;
        this.acceptedDate = acceptedDate;
        this.completedDate = completedDate;
    }

    public CompletedTask() {
    }

    public String getName() {
        return name;
    }

    public String getArea() {
        return area;
    }

    public String getId() {
        return id;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getDeadline() {
        return deadline;
    }

    public String getDescription() {
        return description;
    }

    public String getAcceptedDate() {
        return acceptedDate;
    }

    public String getCompletedDate() {
        return completedDate;
    }


}
