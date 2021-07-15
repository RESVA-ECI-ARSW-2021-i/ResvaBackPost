/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.escuelaing.edu.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="field")
public class Field implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idField;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private String status;

    @Column(name = "requirements")
    private String requirements;

    @Column(name = "picture")
    private String picture;

    public Field(int idField, String name, String status, String requirements, String picture) {
        this.idField = idField;
        this.name = name;
        this.status = status;
        this.requirements = requirements;
        this.picture = picture;
    }

    public int getIdField() {
        return idField;
    }

    public void setIdField(int idField) {
        this.idField = idField;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getPicture() {
        return picture;
    }

    @Override
    public String toString() {
        return "Field{" +
                "idField=" + idField +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", requirements='" + requirements + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}

