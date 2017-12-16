package org.usfirst.frc.team4130.robot;

import com.ctre.phoenix.MotorControl.CAN.TalonSRX;
import com.ctre.phoenix.MotorControl.ControlMode.SmartControlMode;

import edu.wpi.first.wpilibj.Joystick;

public class RobotMap{
		
	public static TalonSRX Shooter1 = new TalonSRX(5);
	public static TalonSRX Shooter2 = new TalonSRX(6);
		
	public static TalonSRX leftDrive1=new TalonSRX(1) ;
	public static TalonSRX leftDrive2=new TalonSRX(2) ;
	
	public static TalonSRX rightDrive1=new TalonSRX(3) ;
	public static TalonSRX rightDrive2=new TalonSRX(4) ;
	public static Joystick gpad = new Joystick(0);
	
	public static void init() {
		leftDrive1.setInverted(false);
		leftDrive2.setInverted(false);
		 
		rightDrive1.setInverted(true);
		rightDrive2.setInverted(true);
		
		leftDrive1.setControlMode(SmartControlMode.kPercentVbus);
		leftDrive2.setControlMode(SmartControlMode.kFollower);
		leftDrive2.set(1);
		
		rightDrive1.setControlMode(SmartControlMode.kPercentVbus);
		rightDrive2.setControlMode(SmartControlMode.kFollower);
		rightDrive2.set(3);
		
	}
}