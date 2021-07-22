package co.escuelaing.edu.services.Impl;

import co.escuelaing.edu.entities.Schedule;
import co.escuelaing.edu.entities.User;
import co.escuelaing.edu.persistence.SchedulePersistence;
import co.escuelaing.edu.services.IScheduleService;
import co.escuelaing.edu.services.ResvaException;
import net.bytebuddy.description.modifier.FieldPersistence;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ScheduleService implements IScheduleService {

    @Autowired
    SchedulePersistence schedulePersistence;

    public ScheduleService() {
    }

    @Override
    public List<Schedule> getAllSchedule() throws ResvaException {
        return null;
    }

}
