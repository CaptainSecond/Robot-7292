// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.robot.subsystems.FunnelSubsystem;
import frc.robot.subsystems.IntakeSubsystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class IntakeGroupCommand extends ParallelCommandGroup {
  /** Creates a new IntakeGroupCommand. */
  IntakeSubsystem intake;
  FunnelSubsystem funnel;
  public IntakeGroupCommand(IntakeSubsystem m_intake, FunnelSubsystem m_funnel, double m_speed) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(
      new IntakeCommand(m_intake, m_speed),
      new FunnelCommand(m_funnel, m_speed)
    );
  }
}
