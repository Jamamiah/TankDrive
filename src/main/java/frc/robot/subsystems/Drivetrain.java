// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class Drivetrain extends SubsystemBase {
  TalonSRX m_Right = new TalonSRX(0); 
  TalonSRX m_Left = new TalonSRX(1);
  
  /** Creates a new Drivetrain. */
  public Drivetrain() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setMotors(double speed){
      m_Right.set(TalonSRXControlMode.PercentOutput, speed);
      m_Left.set(TalonSRXControlMode.PercentOutput, speed);
  }

  public void setMotorsXY(double x, double y){
    m_Right.set(TalonSRXControlMode.PercentOutput, x+y);
    m_Left.set(TalonSRXControlMode.PercentOutput, x-y);
  }
}
