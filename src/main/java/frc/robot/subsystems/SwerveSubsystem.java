// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix6.hardware.TalonFX;

public class SwerveSubsystem extends SubsystemBase {
  private final TalonFX m_frontLeftDrive;
  private final TalonFX m_frontRightDrive;
  private final TalonFX m_backLeftDrive;
  private final TalonFX m_backRightDrive;

  /** Creates a new SwerveSubsystem. */
  public SwerveSubsystem() {
    m_frontLeftDrive = new TalonFX(1);
    m_frontRightDrive = new TalonFX(2);
    m_backLeftDrive = new TalonFX(3);
    m_backRightDrive = new TalonFX(4);
  }

  /** Makes all of the swerve motors move at the specified speed.
   * 
   * @param speed The speed that the motors should move, from -1.0 to 1.0.
   */
  public void changeSpeed(double speed) {
    m_frontLeftDrive.set(speed);
    m_frontRightDrive.set(speed);
    m_backLeftDrive.set(speed);
    m_backRightDrive.set(speed);
    System.out.println("SwerveSubsystem: Swerve is moving at speed " + speed);
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
          System.out.println("Example subsystem command was run");
        });
  }

  public Command autonomousCommand() {
    return runOnce(
        () -> {
          System.out.println("Notification: Switched to Auto");
        });
  }

  public Command teleopCommand() {
    return runOnce(
        () -> {
          System.out.println("Notification: Switched to Teleop");
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a
   * digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
