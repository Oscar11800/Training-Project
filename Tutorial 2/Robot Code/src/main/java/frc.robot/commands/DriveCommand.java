package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import static frc.robot.OI.leftJoyStick;
import static frc.robot.OI.rightJoyStick;
import static frc.robot.Robot.drivetrain;

public class DriveCommand extends CommandBase {

    public DriveCommand(){
        addRequirements(drivetrain);
    }

    public double getLeftJoyStickY() {
        return -LeftJoyStick.getY();
    }

    public double getRightJoyStick() {
        return -rightJoyStick.getY();
    }

    @Override
    public void execute() {
        drivetrain.setDutyCycle(getLeftJoyStickY(), getRightJoyStick());
    }

    @Override
    public boolean isFinished()
        return false;
}