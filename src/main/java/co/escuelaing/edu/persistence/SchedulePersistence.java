package co.escuelaing.edu.persistence;

import co.escuelaing.edu.entities.Field;
import co.escuelaing.edu.entities.Schedule;
import co.escuelaing.edu.persistence.repository.IFieldRepository;
import co.escuelaing.edu.persistence.repository.IScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SchedulePersistence {
    @Autowired
    private IScheduleRepository scheduledRepository;

    public SchedulePersistence() {}

    public static List<Schedule> getAllField() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public IScheduleRepository getscheduledRepository() {
        return scheduledRepository;
    }

    public void setscheduledRepository(IScheduleRepository scheduleddRepository) {
        this.scheduledRepository = scheduledRepository;
    }

    public SchedulePersistence(IScheduleRepository scheduleRepository) {
        this.scheduledRepository = scheduledRepository;
    }

}
