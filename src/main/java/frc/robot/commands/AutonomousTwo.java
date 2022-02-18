package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.DriveTrain;

public class AutonomousTwo extends SequentialCommandGroup{
    public AutonomousTwo(DriveTrain dt){
        addCommands(new DriveForwardTimed(dt));
    }
}