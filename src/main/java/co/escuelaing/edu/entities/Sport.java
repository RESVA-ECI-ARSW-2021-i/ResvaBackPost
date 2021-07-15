package co.escuelaing.edu.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "sport")
public class Sport {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int idSport;
    
    @Column(name = "name")
    private String name;  

    @Column(name = "status")
    private int status;

    public Sport(int idSport, String name) {
        this.idSport = idSport;
        this.name = name;
    }

    public int getIdSport() {
        return idSport;
    }

    public void setIdSport(int idSport) {
        this.idSport = idSport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "idSport=" + idSport +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
