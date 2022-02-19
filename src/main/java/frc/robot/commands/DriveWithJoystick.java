package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrain;

public class DriveWithJoystick extends CommandBase {
private final DriveTrain driveTrain;

  public DriveWithJoystick(DriveTrain dt){
    driveTrain = dt;
    addRequirements(driveTrain);
    
  }
  @Override
  public void initialize() {}

  @Override
  public void execute() {
    double trying = Constants.speed;
    driveTrain.driveWithJoystick(RobotContainer.driverJoystick, trying);
    
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished(){
    return false;
  }


}