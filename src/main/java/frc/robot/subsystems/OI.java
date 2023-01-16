// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class OI extends SubsystemBase {

  public enum AxisType
  {
    LeftTrigger, RightTrigger, LeftStickX, RightStickX, LeftStickY, RightStickY
  }

  XboxController m_Controller;

  /** Creates a new OI. */
  public OI() {
    m_Controller = new XboxController(0);  
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public double getAxis (AxisType type) {
    switch (type)
    {
      case LeftStickX:
        return m_Controller.getLeftX();
      case LeftStickY:
        return m_Controller.getLeftY();
    }

    return 0;
  }


}
