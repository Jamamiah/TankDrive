package frc.robot.commands;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class Intake extends SubsystemBase {
    private TalonSRX m_MotorTop = new TalonSRX(3);
    private TalonSRX m_MotorBottom = new TalonSRX(4);
    
    public Intake() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
}
  public static void rollerForward(double speed){
    // rollers move forward and collect object
    m_MotorTop.set(TalonSRXControlMode.PercentOutput, speed)
    m_MotorBottom.set(TalonSRXControlMode.PercentOutput, -speed);
    }

    public static void rollerBackward(double speed){
    // rollers move backward and eject object
    m_Motor.set(TalonSRXControlMode.PercentOutput, -speed);
    }

    public static void rollerStop(){
    // rollers stop 
    m_Motor.set(TalonSRXControlMode.PercentOutput, 0);
    }

}
