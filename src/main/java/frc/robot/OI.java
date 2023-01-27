package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

public class OI {
    
    private XboxController driverController = new XboxController(Constants.DRIVER_CONTROLLER);
    
    public double getDriverRawAxis(int axis) {
        return driverController.getRawAxis(axis);
    }

}
