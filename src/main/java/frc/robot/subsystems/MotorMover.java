// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.spark.SparkLowLevel.MotorType;   
import com.revrobotics.spark.SparkMax;

public class MotorMover extends SubsystemBase {

    private final SparkMax wheelmotor;
    private boolean isMoving = false;

    /** Creates a new ExampleSubsystem. */
    public MotorMover() {

        // Front right drive motor (Hopefully??????)
        wheelmotor = new SparkMax(5, MotorType.kBrushless);

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
                });
    }

    public void move() {
        isMoving = true;
        wheelmotor.set(0.1);
        System.out.println("The motor might be moving");
    }

    public void stop() {
        isMoving = false;
        wheelmotor.stopMotor();
        System.out.println("The motor might have stopped");
    }

    /**
     * An example method querying a boolean state of the subsystem (for example, a
     * digital sensor).
     *
     * @return value of some boolean subsystem state, such as a digital sensor.
     */
    public boolean isMoving() {
        // Query some boolean state, such as a digital sensor.
        return isMoving;
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
