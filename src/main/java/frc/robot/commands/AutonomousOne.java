package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.DriveTrain;

public class AutonomousOne extends SequentialCommandGroup{
    public AutonomousOne(DriveTrain dt){
        addCommands(new DriveForwardTimed(dt));
    }
}