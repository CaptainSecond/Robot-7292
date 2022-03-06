// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.JoystickConstants;
import frc.robot.commands.AngleCommand;
import frc.robot.commands.ClimbCommand;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.IntakeGroupCommand;
import frc.robot.commands.ShooterCommand;
import frc.robot.subsystems.ClimbSubsystem;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.FunnelSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.ShooterSubsystem;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in
 * the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of
 * the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  // Joystick
  public final Joystick m_driverController = new Joystick(JoystickConstants.F310);
  public final Joystick m_operatorController = new Joystick(JoystickConstants.Panel);

  // Subsystems
  public final DriveSubsystem m_drive = new DriveSubsystem();
  public final IntakeSubsystem m_intake = new IntakeSubsystem();
  public final FunnelSubsystem m_funnel = new FunnelSubsystem();
  public final ShooterSubsystem m_shooter = new ShooterSubsystem();
  public final ClimbSubsystem m_climb = new ClimbSubsystem();
  
  /**
   * The container for the robot. Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
    m_drive.setDefaultCommand(new DriveCommand(m_drive, () -> -m_driverController.getRawAxis(1), () -> m_driverController.getRawAxis(4)));
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be
   * created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing
   * it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {

    // Top Çekme 
    new JoystickButton(m_driverController, 3).whileHeld(new IntakeGroupCommand(m_intake,m_funnel, 1));
    // Top Atma
    new JoystickButton(m_driverController, 1).whileHeld(new ShooterCommand(m_shooter,1));

    // Tırmanma
    new JoystickButton(m_operatorController, 1).whileHeld(new ClimbCommand(m_climb,1));
    new JoystickButton(m_operatorController, 3).whileHeld(new AngleCommand(m_climb,1));
    
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return null;
  }
}
