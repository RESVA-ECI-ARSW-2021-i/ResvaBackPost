package co.escuelaing.edu.services;

import co.escuelaing.edu.entities.Schedule;
import co.escuelaing.edu.entities.User;

import java.util.List;

public interface IScheduleService {

    List<Schedule> getAllSchedule() throws ResvaException;
}
