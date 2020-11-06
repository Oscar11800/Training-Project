package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.Hardware.DRIVE_LEFT_CHANNEL;
import static frc.robot.Constants.Hardware.DRIVE_RIGHT_CHANNEL;

import static frc.robot.Constants.CANBusIDs.*;

public class Drivetrain extends SubsystemBase {

    private final Talon leftwheels = new Talon(DRIVE_LEFT_CHANNEL);
    private final Talon rightwheels = new Talon(DRIVE_RIGHT_CHANNEL);

    public Drivetrain() {
        leftwheels.setInverted(true);
    }
    public void setDutyCycles(double leftDutyCycle, double righDutyCycle) {
        leftwheels.set(leftDutyCycle);
        rightwheels.set(righDutyCycle);
    }
}