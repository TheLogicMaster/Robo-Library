package org.usfirst.frc.team2832.library;

import edu.wpi.first.wpilibj.command.Subsystem;

public abstract class CustomSubsystem extends Subsystem implements Updatable {

    public CustomSubsystem(String name, CustomRobot robot) {
        super(name);
        robot.addUpdateable(this);
    }

    public CustomSubsystem(CustomRobot robot) {
        super();
        robot.addUpdateable(this);
    }
}
