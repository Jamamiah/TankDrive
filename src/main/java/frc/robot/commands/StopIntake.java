
package frc.robot.commands;

public class StopIntake extends CommandBase{
    Intake m_Intake;
    public MoveIntake(Intake intake){
        m_Intake = intake;
    }
  
    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        m_Intake.rollerStop();
        
    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
      
    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {}
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }  

}
