package frc.robot.Subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


public class Arm {
    CANSparkMax arm =  new CANSparkMax(1, MotorType.kBrushless);

    public void moveArmDown(){
        arm.set(-5);
      }

    public void moveArmUp(){
        arm.set(5);
      }
    
    public void stopArm(){
        arm.setIdleMode(IdleMode.kCoast);
      }
}
