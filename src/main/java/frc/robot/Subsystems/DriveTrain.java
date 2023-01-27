// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import frc.Commands.Drivebase.TankDrive;
import frc.robot.Constants;

/** Add your docs here. */
public class DriveTrain extends SubsystemBase {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
    private CANSparkMax motorLeft1 =  new CANSparkMax(Constants.MOTOR_LEFT_1_ID, MotorType.kBrushless);
    private CANSparkMax motorLeft2 =  new CANSparkMax(Constants.MOTOR_LEFT_2_ID, MotorType.kBrushless);
    private CANSparkMax motorLeft3 =  new CANSparkMax(Constants.MOTOR_LEFT_3_ID, MotorType.kBrushless);
    private CANSparkMax motorRight1 =  new CANSparkMax(Constants.MOTOR_RIGHT_1_ID, MotorType.kBrushless);
    private CANSparkMax motorRight2 =  new CANSparkMax(Constants.MOTOR_RIGHT_2_ID, MotorType.kBrushless);
    private CANSparkMax motorRight3 =  new CANSparkMax(Constants.MOTOR_RIGHT_3_ID, MotorType.kBrushless);

  
  public DriveTrain() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new TankDrive());
  }

  public void setLeftMotors(double speed) {
    motorLeft1.set(-speed);
    motorLeft2.set(-speed);
    motorLeft3.set(-speed);

  }

  public void setRightMotors(double speed) {
    motorRight1.set(speed);
    motorRight2.set(speed);
    motorRight3.set(speed);

  }

}
