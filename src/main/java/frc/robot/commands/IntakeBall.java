package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Intake;
import frc.robot.commands.IntakeBall;
public class IntakeBall extends CommandBase {
    private final Intake intake;
    
    public IntakeBall(Intake i) {
        
        intake = i;
        addRequirements(intake);
    }

    @Override
    public void initialize() {}
  


@Override
public void execute(){
    intake.intakeBall(Constants.speed);
}

@Override
public void end(boolean interrupted) {}

@Override 
public boolean isFinished() {
    return false;
}
}