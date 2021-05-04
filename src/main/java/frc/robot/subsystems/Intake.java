// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.PWM;
import edu.wpi.first.wpilibj.Spark;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */
  private final Spark m_intake = new Spark(3);
  public Intake() {
  }

  public void intakeOn(double power){
    m_intake.setVoltage(power);
    }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
