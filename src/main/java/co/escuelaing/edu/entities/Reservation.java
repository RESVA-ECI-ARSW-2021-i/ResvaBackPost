package co.escuelaing.edu.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private String id;
    
    @Column(name = "user")
    private String user;

    @Column(name = "field")
    private String field;

    @Column(name = "day")
    private String day;

    @Column(name = "hour")
    private String hour;

    public Reservation(String id, String user, String field, String day, String hour) {
        this.id = id;
        this.user = user;
        this.field = field;
        this.day = day;
        this.hour = hour;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "reservation{" +
                "id=" + id +
                ", user=" + user +
                ", field=" + field +
                ", day='" + day + '\'' +
                ", hour='" + hour + '\'' +
                '}';
    }
}
