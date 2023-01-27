// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.Commands.Drivebase;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.Constants;
import frc.robot.Subsystems.DriveTrain;

public class TankDrive extends CommandBase {
  public TankDrive() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.driveTrain);
  }

  private void requires(DriveTrain driveTrain) {
  }

  // Called just before this Command runs the first time
  @Override
  public void initialize() {}

  // Called repeatedly when this Command is scheduled to run
  @Override
  public void execute() {
    double leftStickY = Robot.m_oi.getDriverRawAxis(Constants.LEFT_STICK_Y);
    double rightStickY = Robot.m_oi.getDriverRawAxis(Constants.RIGHT_STICK_Y);

    Robot.driveTrain.setLeftMotors(leftStickY);
    Robot.driveTrain.setRightMotors(rightStickY);
    
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  public boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  public void end(boolean interuppted) {
    Robot.driveTrain.setLeftMotors(0);
    Robot.driveTrain.setRightMotors(0);

  }
}

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run

