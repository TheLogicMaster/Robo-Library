package org.usfirst.frc.team2832.library;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;

import java.util.ArrayList;
import java.util.List;

public abstract class CustomRobot extends IterativeRobot {

    List<Updatable> updatables;

    public CustomRobot() {
        super();
        updatables = new ArrayList<>();
    }

    @Override
    public void robotPeriodic() {
        for(Updatable updatable: updatables)
            updatable.update();
        Scheduler.getInstance().run();
    }

    public void addUpdateable(Updatable updatable) {
        updatables.add(updatable);
    }

    public void removeUpdatable(Updatable updatable) {
        updatables.remove(updatable);
    }
}