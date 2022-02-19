package frc.robot.subsystems;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase{
    PWMSparkMax intake;

    public Intake(){
        intake = new PWMSparkMax(Constants.intakeMotor);
        intake.setInverted(true);

    }

@Override
public void periodic(){

}

public void intakeBall(double speed){
    intake.set(speed);
}
public void stop()
{
    intake.set(0);
}
}