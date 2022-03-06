// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ClimbConstants;

public class ClimbSubsystem extends SubsystemBase {
  /** Creates a new ClimbSubsystem. */
  PWMVictorSPX climbMotor = new PWMVictorSPX(ClimbConstants.kClimb);
  PWMVictorSPX climbLAngleMotor = new PWMVictorSPX(ClimbConstants.kLeftAngle);
  PWMVictorSPX climbRAngleMotor = new PWMVictorSPX(ClimbConstants.kRightAngle);
  public ClimbSubsystem() {}

  public void runClimb(double speed) {
    climbMotor.set(speed);
  }

  public void runAngleClimb(double m_speed) {
    climbLAngleMotor.set(m_speed);
    climbRAngleMotor.set(m_speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
