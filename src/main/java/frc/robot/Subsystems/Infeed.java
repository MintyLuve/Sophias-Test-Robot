package frc.robot.Subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;

import frc.robot.Constants;

public class Infeed {
    private CANSparkMax roller;
    private Solenoid deploy;

    public Infeed() {
    
        roller = new CANSparkMax(Constants.INFEED_ROLLER, MotorType.kBrushless);
        deploy = new Solenoid(PneumaticsModuleType.CTREPCM, Constants.INFEED_DEPLOY);

    }

    public void startRoller(double speed) {
        roller.set(speed);
    }
    public void stopRoller(double speed) {
        roller.setIdleMode(IdleMode.kCoast);
    }
    public void deploy() {
        deploy.set(true);
    }
    public void retract() {
        deploy.set(false);
    }
}
