package frc.robot.commands;
import edu.wpi.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Intake;

public class IntakeBall extends CommandBase {
    Intake intake;

    public IntakeBall(Intake i) {
        intake = i;
        addRequirements(intake);
    }

@Override
public void initalize() {}


@Override
public void execute(){
    intake.IntakeBall(Constants.Speed);
}

@Override
public void end(boolean interrupted) {}

@Override 
public boolean isFinished() {
    return false;
}
}