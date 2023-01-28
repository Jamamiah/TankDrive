package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    private TalonSRX m_MotorTop = new TalonSRX(3);
    private TalonSRX m_MotorBottom = new TalonSRX(4);
    
    public Intake() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
}
  public void rollerForward(double speed){
    // rollers move forward and collect object
    m_MotorTop.set(TalonSRXControlMode.PercentOutput, speed);
    m_MotorBottom.set(TalonSRXControlMode.PercentOutput, -speed);
    }

    public void rollerStop(){
    // rollers stop 
    m_MotorTop.set(TalonSRXControlMode.PercentOutput, 0);
    m_MotorBottom.set(TalonSRXControlMode.PercentOutput, 0);
    }

}
