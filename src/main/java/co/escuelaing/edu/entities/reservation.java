package co.escuelaing.edu.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class reservation {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;
    
    @Column(name = "user")
    private int user;

    @Column(name = "field")
    private int field;

    @Column(name = "day")
    private String day;

    @Column(name = "hour")
    private String hour;

    public reservation(int id, int user, int field, String day, String hour) {
        this.id = id;
        this.user = user;
        this.field = field;
        this.day = day;
        this.hour = hour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
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
