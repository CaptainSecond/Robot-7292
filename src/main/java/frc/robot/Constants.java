// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean
 * constants. This class should not be used for any other purpose. All constants
 * should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    // Joystick
    public static final class JoystickConstants {
        public static final int F310 = 0; // Joystick
        public static final int Panel = 1; // Driver Station Button
    }

    // Drive
    public static final class DriveConstants {
        public static final int kLeftDrive = 0; // Şase Sol
        public static final int kRightDrive = 1; // Şase Sağ
    }

    // Top Çekme
    public static final class IntakeConstants {
        public static final int kIntake = 7;
    }

    // Top Bekletme
    public static final class FunnelConstants {
        public static final int kFunnel = 5;
    }

    // Top Atma
    public static final class ShooterConstants {
        public static final int kShooter = 5;
    }

    // Tırmanma
    public static final class ClimbConstants {
        public static final int kClimb = 2;
        public static final int kLeftAngle = 3;
        public static final int kRightAngle = 4;

    }
}
