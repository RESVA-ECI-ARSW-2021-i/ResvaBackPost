package co.escuelaing.edu.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;

public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idSchedule;

    @Column(name = "day")
    private Date day;

    @Column(name = "hour")
    private Time hour;

    public Schedule(int idSchedule, Date name, Date status) {
        this.idSchedule = idSchedule;
        this.day = day;
        this.hour = hour;
    }

    public int getIdSchedule() {
        return idSchedule;
    }

    public void setIdSchedule(int idSchedule) {
        this.idSchedule = idSchedule;
    }

    public Date getName() {
        return day;
    }

    public void setName(Date day) {
        this.day = day;
    }

    public Date getStatus() {
        return hour;
    }

    public void setStatus(Time hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "idSchedule=" + idSchedule +
                ", day=" + day +
                ", hour=" + hour +
                '}';
    }
}



