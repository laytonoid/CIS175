package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class MissionDetails {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String missionName;
    private LocalDate missionDate;
    
    @OneToMany(mappedBy = "missionDetails", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<MissionTask> missionTasks;

    @ManyToOne
    private ForceUser forceUser;
    
    @OneToMany(cascade=CascadeType.MERGE, fetch=FetchType.EAGER)
    private List<MissionTask> listOfTasks;
    
    @OneToMany(mappedBy = "missionDetails")
    private List<MissionTask> listOfItems;
    
    // Constructors
    public MissionDetails() {
        super();
    }

    public MissionDetails(int id, String missionName, LocalDate missionDate) {
        super();
        this.id = id;
        this.missionName = missionName;
        this.missionDate = missionDate;
    }

    public int getId() {
        return id;
    }
    
    public void setForceUser(ForceUser forceUser) {
        this.forceUser = forceUser;
    }
    
    public ForceUser getForceUser() {
        return forceUser;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public LocalDate getMissionDate() {
        return missionDate;
    }

    public void setMissionDate(LocalDate missionDate) {
        this.missionDate = missionDate;
    }

    
    @Override
    public String toString() {
        return "MissionDetails [id=" + id + ", missionName=" + missionName + ", missionDate=" + missionDate +"]";
    }

    public void setListOfTasks(List<MissionTask> listOfTasks) {
        this.listOfTasks = listOfTasks;
    }
    
    public List<MissionTask> getMissionTasks() {
        return missionTasks;
    }
}