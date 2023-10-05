package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class MissionTask {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int taskId;
    
    private String description;

    @ManyToOne
    private MissionDetails missionDetails;

    // Default constructor
    public MissionTask() {}

    // Constructor with description only
    public MissionTask(String description) {
        this.description = description;
    }

    // Constructor with description and mission details
    public MissionTask(String description, MissionDetails missionDetails) {
        this.description = description;
        this.missionDetails = missionDetails;
    }

    // Getters and setters
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public MissionDetails getMissionDetails() {
        return missionDetails;
    }

    public void setMissionDetails(MissionDetails missionDetails) {
        this.missionDetails = missionDetails;
    }

    @Override
    public String toString() {
        return "MissionTask [taskId=" + taskId + ", description=" + description + "]";
    }
}