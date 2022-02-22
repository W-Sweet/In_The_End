package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
// import frc.robot.commands.DriveForwardTimed;
import frc.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.DriveWithJoystick;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
//import frc.robot.commands.DriveToDistance;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.AutonomousOne;
import frc.robot.commands.AutonomousTwo;
import frc.robot.commands.IntakeBall;
import frc.robot.subsystems.Intake;
import edu.wpi.first.wpilibj.XboxController;
/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final DriveTrain m_DriveTrain = new DriveTrain();
  private final DriveWithJoystick driving = new DriveWithJoystick(m_DriveTrain);
  private final AutonomousOne Auto1Sec;
  private final AutonomousTwo Auto2;
  private final Intake intake = new Intake();
  public static XboxController driverJoystick;
  public static final JoystickButton buttonA = new JoystickButton(driverJoystick, 1);
  SendableChooser<Command> chooser = new SendableChooser<>();



  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
    driving.addRequirements(m_DriveTrain);
    driverJoystick = new XboxController(Constants.JoystickButton);
    m_DriveTrain.setDefaultCommand(driving);
   // driveForwardTimed = new DriveForwardTimed(m_DriveTrain);
    Auto1Sec = new AutonomousOne(m_DriveTrain);
    Auto2 = new AutonomousTwo(m_DriveTrain);
   driverJoystick = new XboxController(Constants.JoystickButton);
    chooser.setDefaultOption("Auto1", Auto1Sec);
    chooser.addOption("Auto2", Auto2);
    SmartDashboard.putData("Auto", chooser);
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
   // JoystickButton runIntake = new JoystickButton(driverJoystick, XboxController.Button.kLeftBumper.value);
   // runIntake.whileHeld(() -> intake.intakeBall(Constants.speed)).whenReleased(() -> intake.intakeBall(0));
   buttonA.whenPressed(new runIntake(speed));
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return chooser.getSelected();
  }
}